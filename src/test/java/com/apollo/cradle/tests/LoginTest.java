package com.apollo.cradle.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.apollo.cradle.pages.LoginPage;
import com.apollo.cradle.setup.BaseDriver;

public class LoginTest extends BaseDriver {
	LoginPage loginPage;

	public LoginTest() {
		loginPage = new LoginPage();
	}

	@Test
	private void invalidMobileNumber() {
		// loginPage.mobileNumberTxtFld.sendKeys("1234567890");
		sendKeys(loginPage.mobileNumberTxtFld, "1234567890");
		String actual = "Please enter a valid mobile number.";
		String expected = loginPage.errorMsg.getAttribute("text");
		Assert.assertEquals(actual, expected);
	}

	@Test
	private void notRegisteredMobileNumber() {
		sendKeys(loginPage.mobileNumberTxtFld, "9177119461");
		String actual = "Mobile number does not exists.";
		String expected = loginPage.errorMsg.getAttribute("text");
		Assert.assertEquals(actual, expected);
	}

	@Test
	private void validMobileNumber() {
		sendKeys(loginPage.mobileNumberTxtFld, "9177119462");
		String actual = " Your account will be validated via an OTP. ";
		String expected = loginPage.getOTPBtn.getAttribute("text");
		Assert.assertEquals(actual, expected);

	}
}
