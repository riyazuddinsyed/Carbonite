package com.apollo.cradle.pages.tools;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apollo.cradle.driver.BaseDriver;

public class ToolsPage {
	@FindBy(xpath = "//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-calculators/ion-content/ion-grid/ion-row[2]/ion-col[1]/ion-button")
	public WebElement bmiBtn;
	
	@FindBy(xpath = "//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-calculators/ion-content/ion-grid/ion-row[2]/ion-col[2]/ion-button")
	public WebElement ovulationBtn;
	
	@FindBy(xpath = "//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-calculators/ion-content/ion-grid/ion-row[2]/ion-col[3]/ion-button")
	public WebElement duedateBtn;
	
	@FindBy(xpath = "//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-calculators/ion-content/ion-grid/ion-row[2]/ion-col[4]/ion-button")
	public WebElement kickBtn;
	
	@FindBy(xpath = "//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-calculators/ion-content/ion-grid/ion-row[2]/ion-col[5]/ion-button")
	public WebElement contractionBtn;
	
	public ToolsPage() {
		PageFactory.initElements(BaseDriver.getInstance(), this);
	}
	
	public BMICalculatorPage clickBMICalculator() {
		bmiBtn.click();
		return new BMICalculatorPage();
	}
	
	public OvulationCalculatorPage clickOvulationCalculator() {
		ovulationBtn.click();
		return new OvulationCalculatorPage();
	}
	
	public DueDateCalculatorPage clickDueDateCalculator() {
		duedateBtn.click();
		return new DueDateCalculatorPage();
	}
	
	public KickCounterPage clickKickCounter() {
		kickBtn.click();
		return new KickCounterPage();
	}
	
	public ContractionTimerPage clickContractionTimer() {
		contractionBtn.click();
		return new ContractionTimerPage();
	}
	
}
