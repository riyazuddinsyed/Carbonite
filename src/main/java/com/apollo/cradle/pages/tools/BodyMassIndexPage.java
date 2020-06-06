package com.apollo.cradle.pages.tools;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apollo.cradle.driver.BaseDriver;

public class BodyMassIndexPage {
	
	@FindBy(xpath = "//*[@id=\"menu-content\"]/app-bmii-modal/ion-header/ion-toolbar/ion-buttons/ion-back-button")
	public WebElement bodyMassBackBtn;
	
	@FindBy(xpath = "//*[@id=\"menu-content\"]/app-bmi-result/ion-row/ion-col/ion-button")
	public WebElement ViewHistoryBtn;
	
	public BodyMassIndexPage() {
		PageFactory.initElements(BaseDriver.getInstance(), this);
	}
	public BodyMassIndexPage clickbodyMassBackBtn() {
		bodyMassBackBtn.click();
		return this;
	}
	
	
	public ViewHistoryPage clickViewHistoryBtn() {
		ViewHistoryBtn.click();
		return new ViewHistoryPage();
	}
	
	
}
