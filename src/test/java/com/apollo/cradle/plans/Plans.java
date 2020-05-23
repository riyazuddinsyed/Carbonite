package com.apollo.cradle.plans;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class Plans {

	public static void init(AppiumDriver<WebElement> driver) {
		// click on plans
		String plan = "//*[@id=\"tab-button-care-plan\"]";
		WebElement planElement = driver.findElementByXPath(plan);
		planElement.click();

		// click on plus symbol
		String symbol = "//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-care-plan/ion-fab/ion-fab-button";
		WebElement symbolElement = driver.findElementByXPath(symbol);
		symbolElement.click();

		// click on back button
		String back = "//*[@id=\"menu-content\"]/app-add-care-plan/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		WebElement backElement = driver.findElementByXPath(back);
		backElement.click();
	}

}
