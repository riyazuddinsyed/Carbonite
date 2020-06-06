package com.apollo.cradle.setup;

import java.io.File;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.apollo.cradle.constants.ApolloConstants;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.screenrecording.BaseStartScreenRecordingOptions;

public class BaseDriver {

	public static AppiumDriver<WebElement> driver;
	public static ExtentSparkReporter reporter;
	public static ExtentReports reports;
	public static Map<String, String> map;
	public static Map<String, String> testdata;

	public static AppiumDriver<WebElement> getDriver() {
		return driver;
	}

	public static void setDriver(AppiumDriver<WebElement> driver) {
		BaseDriver.driver = driver;
	}

	@BeforeSuite
	public void setUp() throws Exception {

		File testdataFile = new File("D:\\Softwares\\testdata.json");
		ObjectMapper mapper = new ObjectMapper();
		testdata = mapper.readValue(testdataFile, new TypeReference<Map<String, String>>() {
		});
		
		System.out.println("path:"+System.getProperty("user.dir"));
		
		// Report configuration
		reporter = new ExtentSparkReporter("extent.html");
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		// readTestdata();

		File app = new File(ApolloConstants.FILE_PATH);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, ApolloConstants.PLATFORM_NAME);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ApolloConstants.DEVICE_NAME);
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		// capabilities.setCapability(AndroidMobileCapabilityType.AVD,
		// ApolloConstants.DEVICE_NAME);
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, ApolloConstants.APP_PACKAGE);
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ApolloConstants.APP_ACTIVITY);
		// capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,
		// ApolloConstants.AUTOMATION_NAME);
		capabilities.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, ApolloConstants.CHROME_DRIVER);
		capabilities.setCapability(AndroidMobileCapabilityType.UNICODE_KEYBOARD, true);
		capabilities.setCapability(AndroidMobileCapabilityType.RESET_KEYBOARD, true);
		capabilities.setCapability("screenshotWaitTimeout", 60);

		// Connection Appium
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getContext());
		File file = driver.getScreenshotAs(OutputType.FILE);
		System.out.println(file.getAbsolutePath());

		//System.out.println()
		driver.context("WEBVIEW_com.apollocradle.apollocradle");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//File file = driver.getScreenshotAs(OutputType.FILE);
		//System.out.println(file.getAbsolutePath());
	}

	@AfterSuite
	public void tearDown() throws Exception {
		if (driver != null) {
			driver.quit();
		}

		reports.flush();
	}

	public void waitForVisibility(WebElement e) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(e));
	}

	public void clear(WebElement e) {
		waitForVisibility(e);
		e.clear();
	}

	public void click(WebElement e) {
		waitForVisibility(e);
		e.click();
	}

	public void click(WebElement e, String msg) {
		waitForVisibility(e);
		e.click();
	}

	public void sendKeys(WebElement e, String txt) {
		waitForVisibility(e);
		e.sendKeys(txt);
	}

	public void sendKeys(WebElement e, String txt, String msg) {
		waitForVisibility(e);
		e.sendKeys(txt);
	}

	public String getAttribute(WebElement e, String attribute) {
		waitForVisibility(e);
		return e.getAttribute(attribute);
	}

	public String getText(WebElement e, String msg) {
		String txt = null;
		txt = getAttribute(e, "text");
		return txt;
	}
}