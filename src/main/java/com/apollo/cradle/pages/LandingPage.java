package com.apollo.cradle.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apollo.cradle.driver.BaseDriver;

public class LandingPage {

	@FindBy(xpath = "//*[@id=\"menu-content\"]/app-intro/ion-content/ion-grid/ion-row[1]/ion-col/ion-button")
	private WebElement loginBtn;

	public LandingPage()  {
		PageFactory.initElements(BaseDriver.getInstance(), this);
	}

	public LandingPage clickLoginBtn() {
		loginBtn.click();
		return this;
	}
}
