package com.apollo.cradle.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apollo.cradle.driver.BaseDriver;

public class LoginPage {

	@FindBy(css = "#menu-content > app-auth > ion-content > ion-grid > ion-row.create--login-wrap.md.hydrated > ion-col > ion-row > ion-col > form > ion-row:nth-child(1) > ion-col:nth-child(1) > ion-item > ion-input > input")
	public WebElement mobileNumberTxtFld;

	@FindBy(xpath = "//*[@id=\"menu-content\"]/app-auth/ion-content/ion-grid/ion-row[2]/ion-col/ion-row/ion-col/form/ion-row[2]/ion-col/ion-button")
	public WebElement otpBtn;

	public LoginPage() {
		PageFactory.initElements(BaseDriver.getInstance(), this);
	}

	public LoginPage enterMobileNumber(String mobileNo) {
		mobileNumberTxtFld.sendKeys(mobileNo);
		return this;
	}
	
	public OTPPage clickOTPBtn() {
		otpBtn.click();
		return new OTPPage();
	}
}
