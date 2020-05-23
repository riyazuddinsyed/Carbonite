package com.apollo.cradle.tools;

import org.openqa.selenium.WebElement;

import com.apollo.cradle.util.ApolloUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class Tools {

	public static void init(AppiumDriver<WebElement> driver) {
		// click on tools icon
		//
		String tools = "#tab-button-calculator";
		WebElement toolsElement = driver.findElement(MobileBy.cssSelector(tools));
		toolsElement.click();

		bmiCalculator(driver);
		kickCounter(driver);
		dueDateCalculator(driver);
		contractionTimer(driver);
	}

	private static void dueDateCalculator(AppiumDriver<WebElement> driver) {
		// click on due date calculator
		String duedate = "#menu-content > app-tabs > ion-tabs > div > ion-router-outlet > app-calculators > ion-content > ion-grid > ion-row.calculators-wrap.md.hydrated.pregnant-phase > ion-col:nth-child(2) > ion-button";
		WebElement duedateElement = driver.findElement(MobileBy.cssSelector(duedate));
		duedateElement.click();

		// click on duedate back button
		String dueBtn = "#menu-content > app-due-date > ion-header > ion-toolbar > ion-buttons > ion-back-button";
		WebElement dueBtnElement = driver.findElement(MobileBy.cssSelector(dueBtn));
		dueBtnElement.click();
	}

	private static void kickCounter(AppiumDriver<WebElement> driver) {
		// click on kick counter
		String kick = "#menu-content > app-tabs > ion-tabs > div > ion-router-outlet > app-calculators > ion-content > ion-grid > ion-row.calculators-wrap.md.hydrated.pregnant-phase > ion-col:nth-child(3) > ion-button";
		WebElement kickElement = driver.findElement(MobileBy.cssSelector(kick));
		kickElement.click();

		// click on back button
		String back = "#menu-content > app-kick-counter > ion-header > ion-toolbar > ion-buttons > ion-back-button";
		WebElement backBtnElement = driver.findElement(MobileBy.cssSelector(back));
		backBtnElement.click();
	}

	private static void bmiCalculator(AppiumDriver<WebElement> driver) {
		String bmi = "#menu-content > app-tabs > ion-tabs > div > ion-router-outlet > app-calculators > ion-content > ion-grid > ion-row.calculators-wrap.md.hydrated.pregnant-phase > ion-col:nth-child(1) > ion-button";
		WebElement bmiElement = driver.findElement(MobileBy.cssSelector(bmi));
		bmiElement.click();

		// Click on Bmi back button
		String backbmi = "#menu-content > app-bmi > ion-header > ion-toolbar > ion-buttons > ion-back-button";
		WebElement backbmiElement = driver.findElement(MobileBy.cssSelector(backbmi));
		backbmiElement.click();
	}

	private static void contractionTimer(AppiumDriver<WebElement> driver) {
		ApolloUtils.verticalScroll(driver);

		// click on contraction timer
		String time = "//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-calculators/ion-content/ion-grid/ion-row[2]/ion-col[4]/ion-button";
		WebElement timeElement = driver.findElementByXPath(time);
		timeElement.click();

		// click on back button
		String backBtn = "//*[@id=\"menu-content\"]/app-contraction-timer/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		WebElement backBtnElement = driver.findElementByXPath(backBtn);
		backBtnElement.click();
	}

}
