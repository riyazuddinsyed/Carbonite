package com.apollo.cradle.pages;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apollo.cradle.driver.BaseDriver;

public class LoginPage {

	@FindBy(xpath = "//*[@id=\"menu-content\"]/app-intro/ion-content/ion-grid/ion-row[1]/ion-col/ion-button")
	private WebElement loginBtn;

	public LoginPage() throws MalformedURLException {
		PageFactory.initElements(BaseDriver.getInstance(), this);
	}

	public LoginPage clickLoginBtn() throws MalformedURLException {
		BaseDriver.getInstance().context("WEBVIEW_com.apollocradle.apollocradle");
		loginBtn.click();
		return this;
	}
}
