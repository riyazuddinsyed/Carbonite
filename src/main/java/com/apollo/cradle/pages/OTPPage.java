package com.apollo.cradle.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apollo.cradle.driver.BaseDriver;

public class OTPPage {
	
	@FindBy(xpath = "//*[@id=\"menu-content\"]/app-enter-otp/ion-content/form/ion-grid/ion-row/ion-col[3]/ion-row[1]/ion-col[7]/ion-row/ion-col/ion-input/input")
	public WebElement otpTxtFld;
	
	public OTPPage() {
		PageFactory.initElements(BaseDriver.getInstance(), this);
	}
	
	public HomePage enterOTP(String otp) {
		otpTxtFld.sendKeys(otp);
		return new HomePage();
	}
	
}
