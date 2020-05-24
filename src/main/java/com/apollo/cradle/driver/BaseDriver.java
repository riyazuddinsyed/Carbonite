package com.apollo.cradle.driver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.apollo.cradle.constants.ApolloConstants;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseDriver {
	public static AppiumDriver<WebElement> driver;

	private BaseDriver() {
	}

	public static AppiumDriver<WebElement> getInstance() {
		if (driver == null) {
			synchronized (BaseDriver.class) {
				if (driver == null) {
					File app = new File(ApolloConstants.FILE_PATH);
					DesiredCapabilities capabilities = new DesiredCapabilities();
					capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, ApolloConstants.PLATFORM_NAME);
					capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ApolloConstants.DEVICE_NAME);
					capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
					capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, ApolloConstants.APP_PACKAGE);
					capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ApolloConstants.APP_ACTIVITY);
					capabilities.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,
							ApolloConstants.CHROME_DRIVER);
					capabilities.setCapability(AndroidMobileCapabilityType.UNICODE_KEYBOARD, true);
					capabilities.setCapability(AndroidMobileCapabilityType.RESET_KEYBOARD, true);
					capabilities.setCapability("screenshotWaitTimeout", 60);
					try {
						driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
						driver.context("WEBVIEW_com.apollocradle.apollocradle");
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					} catch (MalformedURLException e) {
						e.printStackTrace();
					}
				}

			}
		}
		return driver;
	}
}
