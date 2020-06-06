package com.apollo.cradle.pages.tools;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apollo.cradle.driver.BaseDriver;

public class ViewHistoryPage {
	
	@FindBy(xpath = "(//*[@class='buttons-first-slot sc-ion-buttons-md-h sc-ion-buttons-md-s md hydrated'])[3]")
	public WebElement viewHistoryBackBtn;
	
	//@FindBy(xpath = "(//*[@class='buttons-first-slot sc-ion-buttons-md-h sc-ion-buttons-md-s md hydrated'])[3]")
	//public WebElement bodyIndexBackBtn;
	
	@FindBy(xpath = "(//*[@class='buttons-first-slot sc-ion-buttons-md-h sc-ion-buttons-md-s md hydrated'])[3]")
	public WebElement bodyIndexBackBtn;
	
	public void ViewHistory() {
		PageFactory.initElements(BaseDriver.getInstance(), this);
	}
	public ViewHistoryPage clickviewHistoryBackBtn() {
		viewHistoryBackBtn.click();
		return this;
	}
	public BodyMassIndexPage clickbodyIndexBackBtn() {
		bodyIndexBackBtn.click();
		return new BodyMassIndexPage();
	}
	
}
