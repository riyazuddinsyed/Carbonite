package com.apollo.cradle.vitals;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class BloodPressure {
	public static void init(AppiumDriver<WebElement> driver) {

		// click on menu button
		String vitalBtn = "#menu-content > app-tabs > ion-tabs > div > ion-router-outlet > app-vitals > ion-content > ion-grid > ion-row.calculators-wrap.md.hydrated > ion-col:nth-child(1) > ion-button";
		WebElement vitalBtnElement = driver.findElement(MobileBy.cssSelector(vitalBtn));
		vitalBtnElement.click();

		// click on bloodpressure
		String calculateBloodBtn = "#menu-content > app-tabs > ion-tabs > div > ion-router-outlet > app-vitals > ion-content > ion-grid > ion-row.calculators-wrap.md.hydrated > ion-col:nth-child(2) > ion-button";
		WebElement calculateBloodElement = driver.findElement(MobileBy.cssSelector(calculateBloodBtn));
		calculateBloodElement.click();

		// click on add bloodpressure
		String bloodPressure = "#menu-content > app-past-blood-pressure > ion-row > ion-col > ion-button";
		WebElement bloodPressureElement = driver.findElement(MobileBy.cssSelector(bloodPressure));
		bloodPressureElement.click();
		// click on date
		//
		String dateBtn = "#menu-content > app-blood-pressure > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-item:nth-child(1) > ion-datetime";
		WebElement dateElement = driver.findElement(MobileBy.cssSelector(dateBtn));
		dateElement.click();

		// click on date done button
		String doneBtn = "#ion-overlay-1 > div > div.picker-toolbar.sc-ion-picker-md > div:nth-child(2) > button";
		WebElement dateDoneElement = driver.findElement(MobileBy.cssSelector(doneBtn));
		dateDoneElement.click();

		// click on time
		String timeBtn = "#menu-content > app-blood-pressure > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-item:nth-child(2) > ion-datetime";
		WebElement timeElement = driver.findElement(MobileBy.cssSelector(timeBtn));
		timeElement.click();

		// click on time done button
		String clickBtn = "#ion-overlay-2 > div > div.picker-toolbar.sc-ion-picker-md > div:nth-child(2) > button";
		WebElement clickElement = driver.findElement(MobileBy.cssSelector(clickBtn));
		clickElement.click();

		// systolic upper
		String systolicUpper = "#menu-content > app-blood-pressure > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-row.ion-align-items-end.margin--b20.md.hydrated > ion-col:nth-child(2) > ion-item > ion-input > input";
		WebElement systoliElement = driver.findElement(MobileBy.cssSelector(systolicUpper));
		systoliElement.clear();
		systoliElement.sendKeys("125");

		// disatolic lower
		String diastolic = "#menu-content > app-blood-pressure > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-row.ion-align-items-end.margin--b40.md.hydrated > ion-col:nth-child(2) > ion-item > ion-input > input";
		WebElement diastolicElement = driver.findElement(MobileBy.cssSelector(diastolic));
		diastolicElement.clear();
		diastolicElement.sendKeys("145");

		// click on save data
		String saveBtn = "#menu-content > app-blood-pressure > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-row:nth-child(5) > ion-col > ion-button";
		WebElement saveElement = driver.findElement(MobileBy.cssSelector(saveBtn));
		saveElement.click();

		Documents.init(driver);

	}
}
