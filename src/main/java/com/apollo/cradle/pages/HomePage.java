package com.apollo.cradle.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apollo.cradle.driver.BaseDriver;
import com.apollo.cradle.pages.books.BooksPage;
import com.apollo.cradle.pages.plans.PlansPage;
import com.apollo.cradle.pages.tools.ToolsPage;
import com.apollo.cradle.pages.vitals.VitalsPage;

public class HomePage {

	@FindBy(xpath = "//*[@id='tab-button-home'])")
	public WebElement homeTabBtn;

	@FindBy(xpath = "//*[@id=\"tab-button-calculator\"])")
	public WebElement toolsTabBtn;

	@FindBy(xpath = "//*[@id='tab-button-book'])")
	public WebElement bookTabBtn;

	@FindBy(xpath = "//*[@id='tab-button-vitals'])")
	public WebElement vitalsTabBtn;

	@FindBy(xpath = "//*[@id=\"tab-button-care-plan\"])")
	public WebElement plansTabBtn;

	public HomePage() {
		PageFactory.initElements(BaseDriver.getInstance(), this);
	}
	
	public ToolsPage clickToolsTabBtn() {
		toolsTabBtn.click();
		return new ToolsPage();
	}
	
	public BooksPage clickBooksTabBtn() {
		bookTabBtn.click();
		return new BooksPage();
	}

	public VitalsPage clickVitalsTabBtn() {
		vitalsTabBtn.click();
		return new VitalsPage();
	}
	
	public PlansPage clickPlanTabBtn() {
		plansTabBtn.click();
		return new PlansPage();
	}
	
}
