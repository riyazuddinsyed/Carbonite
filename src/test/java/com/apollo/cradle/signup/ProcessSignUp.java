package com.apollo.cradle.signup;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.apollo.cradle.setup.BaseDriver;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.MobileBy;

public class ProcessSignUp extends BaseDriver {
	@Test
	public void  SignUp() {
		ExtentTest test = reports.createTest("Signup");
		test.log(Status.INFO, " Signup process starts here...");
		
		//click on create account
		String account="//ion-button[text()='Create an Account']";
		WebElement accountElement = driver.findElementByXPath(account);
		accountElement.click();
		
		test.log(Status.PASS, "Verify click on create account");
		
		//enter full name
		String fullname="//*[@id=\"menu-content\"]/app-auth/ion-content/ion-grid/ion-row[2]/ion-col/ion-row/ion-col/form/ion-row/ion-col[1]/ion-item/ion-input/input";
		WebElement fullnameElement = driver.findElementByXPath(fullname);
		fullnameElement.sendKeys("madhu");
		
		test.log(Status.PASS, "Verify that user  enter correct Fullname");
		
		//enter email id 
		String email="//*[@id=\"menu-content\"]/app-auth/ion-content/ion-grid/ion-row[2]/ion-col/ion-row/ion-col/form/ion-row/ion-col[2]/ion-item/ion-input/input";
		WebElement emailElement = driver.findElementByXPath(email);
		emailElement.sendKeys("madhu.tathireddy@pivotroots.com");
		
		test.log(Status.PASS, "Verify that user  enter correct email address format");
		
		//enter mobile number 
		String number="//*[@id=\"menu-content\"]/app-auth/ion-content/ion-grid/ion-row[2]/ion-col/ion-row/ion-col/form/ion-row/ion-col[3]/ion-item/ion-input/input";
		WebElement numberElement = driver.findElementByXPath(number);
		numberElement.sendKeys("9177119462");
		
		test.log(Status.PASS, "Verify that on click on the mobile number was entered");
		
		//click on get otp button
		String otpBtn="//*[@id=\"menu-content\"]/app-auth/ion-content/ion-grid/ion-row[2]/ion-col/ion-row/ion-col/form/ion-button";
		WebElement otpBtnElement =driver.findElementByXPath(otpBtn);
		otpBtnElement.click();
		
		test.log(Status.PASS, "Verify that Get OTP button is only active after the user enters all the three fields");
		
		//Enter otp 
		String otp = "#menu-content > app-enter-otp > ion-content > form > ion-grid > ion-row > ion-col.enter-otp.md.hydrated > ion-row.input-row.md.hydrated > ion-col.hover-feild.md.hydrated > ion-row > ion-col > ion-input > input";
		WebElement otpElement = driver.findElement(MobileBy.cssSelector(otp));
		otpElement.sendKeys("123456" + "\n");
		
		test.log(Status.PASS, "Verify that on click of get OTP button user is navigated to a screen where he or she will be able to enter the OTP");
		
	
	}
}