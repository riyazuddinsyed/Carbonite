package com.apollo.cradle.pages.tools;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apollo.cradle.driver.BaseDriver;

public class BMICalculatorPage {

	@FindBy(xpath = "//*[text()='Female']")
	public WebElement genderBtn;

	@FindBy(xpath = "//*[@id=\"menu-content\"]/app-bmi/ion-content/ion-grid/div/ion-row[3]/ion-col[2]/ion-item/ion-input/input")
	public WebElement headTxtFld;

	@FindBy(xpath = "//*[@id=\"menu-content\"]/app-bmi/ion-content/ion-grid/div/ion-row[4]/ion-col[2]/ion-item/ion-input/input")
	public WebElement weightTxtFld;

	@FindBy(xpath = "//*[@id=\"menu-content\"]/app-bmi/ion-content/ion-grid/ion-row/ion-col/ion-button")
	public WebElement calculateYourBmiBtn;

	public BMICalculatorPage() {
		PageFactory.initElements(BaseDriver.getInstance(), this);
	}

	public BMICalculatorPage clickGenderBtn() {
		genderBtn.click();
		return this;
	}

	public BMICalculatorPage clickHeadTxtFld() {
		headTxtFld.click();
		return this;
	}

	public BMICalculatorPage clickWeightTxtFld() {
		weightTxtFld.click();
		return this;
	}

	public BMIScorePage clickCalculateYourBmi() {
		calculateYourBmiBtn.click();
		return new BMIScorePage();
	}
}
