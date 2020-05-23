package com.apollo.cradle;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apollo.cradle.setup.BaseDriver;

import io.appium.java_client.AppiumDriver;

public class LoginPage extends BaseDriver{
	
	@FindBy(css = "#menu-content > app-intro > ion-content > ion-grid > ion-row:nth-child(1) > ion-col > ion-button")
	public WebElement loginBtn;
	
	@FindBy(css = "#menu-content > app-auth > ion-content > ion-grid > ion-row.create--login-wrap.md.hydrated > ion-col > ion-row > ion-col > form > ion-row:nth-child(1) > ion-col:nth-child(1) > ion-item > ion-input > input")
	public WebElement mobileNumberTxtFld;
	
	@FindBy(xpath = "//*[@id=\"menu-content\"]/app-auth/ion-content/ion-grid/ion-row[2]/ion-col/ion-row/ion-col/form/ion-row[2]/ion-col/ion-button")
	public WebElement getOTPBtn;
	
	@FindBy(xpath = "//*[@id=\"menu-content\"]/app-auth/ion-content/ion-grid/ion-row[2]/ion-col/ion-row/ion-col/form/ion-row[1]/ion-col[1]/div/div")
	public WebElement errorMsg;

	public LoginPage clickLogin() {
		click(loginBtn);
		return this;
	}
}
