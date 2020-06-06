package com.apollo.cradle.pages.tools;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apollo.cradle.driver.BaseDriver;

public class BMIScorePage {
	
	@FindBy(xpath = "//*[@id=\"menu-content\"]/app-bmi-result/ion-content/ion-grid/ion-row[2]/ion-col/ion-button")
	public WebElement bmiScoreBtn;
	
	public BMIScorePage() {
		PageFactory.initElements(BaseDriver.getInstance(), this);
	}
	
	public BodyMassIndexPage clickbmiScorePage() {
		bmiScoreBtn.click();
		return new BodyMassIndexPage();
	}
	
	
}
