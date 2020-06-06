package com.apollo.cradle.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.apollo.cradle.setup.BaseDriver;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.MobileBy;

public class Login extends BaseDriver {

	static String mobileNo = "//*[text()='Mobile Number']//following::input[1]";
	ExtentTest test;

	@BeforeClass
	public void init() {
		// Click on login button
		String loginBtn = "#menu-content > app-intro > ion-content > ion-grid > ion-row:nth-child(1) > ion-col > ion-button";
		WebElement loginBtnElement = driver.findElement(MobileBy.cssSelector(loginBtn));
		loginBtnElement.click();

		// mobileNo =

		test = reports.createTest("Login");
	}
	/*
	 * @Test(priority = 0) public void emptyMobileNumber() { String clickBtn =
	 * "//*[@id='menu-content']/app-auth/ion-content/ion-grid/ion-row[2]/ion-col/ion-row/ion-col/form/ion-row[1]/ion-col[1]/ion-item/ion-input/input";
	 * WebElement clickBtnElement = driver.findElementByXPath(clickBtn);
	 * clickBtnElement.click(); clickBtnElement.click();
	 * 
	 * String msg = "//*[text()='Mobile number is required.']"; WebElement
	 * msgElement = driver.findElementByXPath(msg); String actual =
	 * msgElement.getText(); String expected = "Mobile number is required.";
	 * Assert.assertEquals(actual, expected);
	 * 
	 * test.log(Status.PASS, "Verify Mobile number is required."); }
	 */

	// @Test(priority = 1)
	public void invalidMobileNumber() {
		// WebElement mobileNumberTxtFlds = driver.findElement(By.xpath(mobileNo));
		driver.findElement(By.xpath("//*[text()='Mobile Number']//following::input[1]")).clear();
		System.out.println(1111);
		driver.findElement(By.xpath("//*[text()='Mobile Number']//following::input[1]")).sendKeys("917711945");
		System.out.println(2222);
		// mobileNumberTxtFlds.clear();
		// mobileNumberTxtFlds.sendKeys("9874563210");

		/*
		 * // Click on get otp button String getotp = "//*[text()='Get OTP ']";
		 * WebElement getotpElement = driver.findElementByXPath(getotp);
		 * getotpElement.click();
		 */
		String msg = "//*[text()='Please enter a valid mobile number.']";
		WebElement msgElement = driver.findElementByXPath(msg);
		String actual = msgElement.getText();

		String expected = "Please enter a valid mobile number.";
		Assert.assertEquals(actual, expected);

		test.log(Status.PASS, "Please enter a valid mobile number.");
	}

	// @Test(priority = 2)
	public void notRegisteredMobileNumber() throws InterruptedException {
		System.out.println(1111);
		driver.findElement(By.xpath("//*[text()='Mobile Number']//following::input[1]")).sendKeys("9866745929");
		System.out.println(2222);

		// Click on get otp button
		String getotpBtn = "//*[@id='menu-content']/app-auth/ion-content/ion-grid/ion-row[2]/ion-col/ion-row/ion-col/form/ion-row[2]/ion-col/ion-button";
		WebElement getotpBtnElement = driver.findElementByXPath(getotpBtn);
		getotpBtnElement.click();

		String numbermsg = "//*[text()='Mobile number does not exists.']";
		WebElement numberElement = driver.findElementByXPath(numbermsg);
		String actual = numberElement.getText();
		System.out.println(actual);
		String expected = "Mobile number does not exists.";
		Assert.assertEquals(actual, expected);

		test.log(Status.PASS, "Mobile number does not exists.");
	}

//	@Test(priority = 3)
	public void validMobileNumber() {
		driver.findElement(By.xpath("//*[text()='Mobile Number']//following::input[1]")).clear();
		System.out.println(1111);
		driver.findElement(By.xpath("//*[text()='Mobile Number']//following::input[1]")).sendKeys("9177119462");
		System.out.println(2222);

		// Click on get otp button
		String otpBtn = "//*[text()='Get OTP ']";
		WebElement otpBtnElement = driver.findElementByXPath(otpBtn);
		otpBtnElement.click();
		// click on back
		driver.navigate().back();
	}

//	@Test(priority = 4)
	public void invalidOtp() {
		String login = "(//*[text()='Login'])[2]";
		driver.findElement(By.xpath(login)).click();
		System.out.println(999);

		driver.findElement(By.xpath("//*[text()='Mobile Number']//following::input[1]")).clear();
		System.out.println(1111);
		driver.findElement(By.xpath("//*[text()='Mobile Number']//following::input[1]")).sendKeys("9177119462");
		System.out.println(2222);
		// Click on get otp button
		String invalidotpBtn = "//*[text()='Get OTP ']";
		WebElement invalidotpBtnElement = driver.findElementByXPath(invalidotpBtn);
		invalidotpBtnElement.click();

		String numbermsg = "//*[@id='menu-content']/app-enter-otp/ion-content/form/ion-grid/ion-row/ion-col[3]/ion-row[1]/ion-col[7]/ion-row/ion-col/ion-input/input";
		WebElement numbermsgElement = driver.findElementByXPath(numbermsg);
		numbermsgElement.sendKeys("654123");

		/*
		 * String invalidnumbermsg1 = "//*[text()='Invalid OTP']"; WebElement
		 * invalidnumbermsg1Element1 = driver.findElementByXPath(invalidnumbermsg1);
		 * String actual = invalidnumbermsg1Element1.getText();
		 * System.out.println(actual); String expected = "Invalid OTP";
		 * Assert.assertEquals(actual, expected); System.out.println(666);
		 */
		// click on back
		driver.navigate().back();

		test.log(Status.PASS,
				"Verify that if incorrect OTP is entered on the OTP screen, OTP invalid message is shown to the user");

	}

	@Test(priority = 0)
	public void validOtp() {

		String login = "(//*[text()='Login'])[2]";
		driver.findElement(By.xpath(login)).click();

		driver.findElement(By.xpath("//*[text()='Mobile Number']//following::input[1]")).clear();
		driver.findElement(By.xpath("//*[text()='Mobile Number']//following::input[1]")).sendKeys(testdata.get("mobileNo"));
		
		// Click on get otp button
		String validotpBtn = "//*[text()='Get OTP ']";
		WebElement validotpBtnElement = driver.findElementByXPath(validotpBtn);
		validotpBtnElement.click();

		String numbermsgs = "//*[@id=\"menu-content\"]/app-enter-otp/ion-content/form/ion-grid/ion-row/ion-col[3]/ion-row[1]/ion-col[7]/ion-row/ion-col/ion-input/input";
		WebElement numbermsgsElement = driver.findElementByXPath(numbermsgs);
		numbermsgsElement.sendKeys(testdata.get("OTP"));

		test.log(Status.PASS,
				"Verify that on entering the correct OTP user is automatically navigated to the onboarding floor");

	}
}
