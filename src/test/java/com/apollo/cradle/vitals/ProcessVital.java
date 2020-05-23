package com.apollo.cradle.vitals;

import org.openqa.selenium.WebElement;

import com.apollo.cradle.util.ApolloUtils;

import io.appium.java_client.AppiumDriver;

public class ProcessVital {

	public static void init(AppiumDriver<WebElement> driver) {
		// click on vitals
		String vital = "//*[@id=\"tab-button-vitals\"]";
		WebElement vitalElement = driver.findElementByXPath(vital);
		vitalElement.click();

		bloodSugar(driver);
		bloodPressure(driver);
		documentRepositry(driver);
		weightTracker(driver);
		TrackMyActivity(driver);

	}

	private static void TrackMyActivity(AppiumDriver<WebElement> driver) {
		ApolloUtils.verticalScroll(driver);
		// click on track my activity
		String track="//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-vitals/ion-content/ion-grid/ion-row[2]/ion-col[5]/ion-button";
		WebElement trackElement= driver.findElementByXPath(track);
		trackElement.click();
		
		//click on back button
		String backBtn="//*[@id=\"menu-content\"]/app-track-activity/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		WebElement backBtnElement = driver.findElementByXPath(backBtn);
		backBtnElement.click();
	}

	private static void weightTracker(AppiumDriver<WebElement> driver) {
		ApolloUtils.verticalScroll(driver);
		
		// click on weight tracker
		String weight="//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-vitals/ion-content/ion-grid/ion-row[2]/ion-col[4]/ion-button";
		WebElement weightElement= driver.findElementByXPath(weight);
		weightElement.click();
		
		//click on back button 
		String backBtn="//*[@id=\"menu-content\"]/app-weight-tracker/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		WebElement backBtnElement = driver.findElementByXPath(backBtn);
		backBtnElement.click();
		
	}

	private static void documentRepositry(AppiumDriver<WebElement> driver) {
		// click on document
		String document = "//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-vitals/ion-content/ion-grid/ion-row[2]/ion-col[3]/ion-button";
		WebElement documentElement = driver.findElementByXPath(document);
		documentElement.click();
		
		//click on back button 
		String backBtn="//*[@id=\"menu-content\"]/app-documents-repository/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		WebElement backBtnElement = driver.findElementByXPath(backBtn);
		backBtnElement.click();
	}

	private static void bloodPressure(AppiumDriver<WebElement> driver) {
		// click on blood pressure
		String pressure = "//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-vitals/ion-content/ion-grid/ion-row[2]/ion-col[2]/ion-button";
		WebElement pressureElement = driver.findElementByXPath(pressure);
		pressureElement.click();

		// click on back button
		String backBtn = "//*[@id=\"menu-content\"]/app-blood-pressure/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		WebElement backBtnElement = driver.findElementByXPath(backBtn);
		backBtnElement.click();

	}

	private static void bloodSugar(AppiumDriver<WebElement> driver) {
		// click on blood sugar
		String blood = "//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-vitals/ion-content/ion-grid/ion-row[2]/ion-col[1]/ion-button";
		WebElement bloodElement = driver.findElementByXPath(blood);
		bloodElement.click();

		// click on back button
		String backBtn = "//*[@id=\"menu-content\"]/app-blood-sugar/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		WebElement backBtnElement = driver.findElementByXPath(backBtn);
		backBtnElement.click();

	}

}
