package com.apollo.cradle.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apollo.cradle.driver.BaseDriver;

public class LandingPage {

	@FindBy(xpath = "//*[@id=\"menu-content\"]/app-intro/ion-content/ion-grid/ion-row[1]/ion-col/ion-button")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//ion-button[text()='Create an Account']")
	private WebElement signUpBtn;

	public LandingPage()  {
		PageFactory.initElements(BaseDriver.getInstance(), this);
	}

	public LoginPage clickLoginBtn() {
		loginBtn.click();
		return new LoginPage();
	}
}
