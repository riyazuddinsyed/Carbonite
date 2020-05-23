package com.apollo.cradle.vitals;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class WeightTracker {
	public static void init(AppiumDriver<WebElement> driver) {
		// click on vitals
		String vitalBtn = "//*[@id=\"tab-button-vitals\"]";
		WebElement vitalBtnElement = driver.findElementByXPath(vitalBtn);
		vitalBtnElement.click();

		// Click on weightTracker Button
		String weightTrackerBtn = "#menu-content > app-tabs > ion-tabs > div > ion-router-outlet > app-vitals > ion-content > ion-grid > ion-row.calculators-wrap.md.hydrated > ion-col:nth-child(4) > ion-button";
		WebElement weightTrackerElement = driver.findElement(MobileBy.cssSelector(weightTrackerBtn));
		weightTrackerElement.click();

		// click on Add your weight
		String weightBtn = "#menu-content > app-past-weight-tracker > ion-row > ion-col > ion-button";
		WebElement weightElement = driver.findElement(MobileBy.cssSelector(weightBtn));
		weightElement.click();

		// click on select date
		String selectDate = "#menu-content > app-weight-tracker > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-item:nth-child(1) > ion-datetime";
		WebElement selectDateElement = driver.findElement(MobileBy.cssSelector(selectDate));
		selectDateElement.click();

		// click on done dutton
		String doneBtn = "#ion-overlay-1 > div > div.picker-toolbar.sc-ion-picker-md > div:nth-child(2) > button";
		WebElement doneBtnElement = driver.findElement(MobileBy.cssSelector(doneBtn));
		doneBtnElement.click();

		// click on select time
		String timeBtn = "#menu-content > app-weight-tracker > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-item:nth-child(2) > ion-datetime";
		WebElement timeBtnElement = driver.findElement(MobileBy.cssSelector(timeBtn));
		timeBtnElement.click();

		// click on done button
		String clickDoneBtn = "#ion-overlay-2 > div > div.picker-toolbar.sc-ion-picker-md > div:nth-child(2) > button";
		WebElement clickDoneElement = driver.findElement(MobileBy.cssSelector(clickDoneBtn));
		clickDoneElement.click();

		// enter the weight
		String yourweight = "#menu-content > app-weight-tracker > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-row.ion-align-items-end.margin--b40.md.hydrated > ion-col:nth-child(2) > ion-item > ion-input > input";
		WebElement yourweightElement = driver.findElement(MobileBy.cssSelector(yourweight));
		yourweightElement.clear();
		yourweightElement.sendKeys("60");

		// click on save button
		String saveBtn = "#menu-content > app-weight-tracker > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-row:nth-child(4) > ion-col > ion-button";
		WebElement saveBtnElement = driver.findElement(MobileBy.cssSelector(saveBtn));
		saveBtnElement.click();

		FeelingToday.init(driver);

	}
}