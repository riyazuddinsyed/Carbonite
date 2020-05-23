package com.apollo.cradle.vitals;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class Documents {

	public static void init(AppiumDriver<WebElement> driver) {

		String vitalBtn = "//*[@id=\"tab-button-vitals\"]";
		WebElement vitalBtnElement = driver.findElementByXPath(vitalBtn);
		vitalBtnElement.click();

		// click on document
		String document = "#menu-content > app-tabs > ion-tabs > div > ion-router-outlet > app-vitals > ion-content > ion-grid > ion-row.calculators-wrap.md.hydrated > ion-col:nth-child(3) > ion-button";
		WebElement documentElement = driver.findElement(MobileBy.cssSelector(document));
		documentElement.click();

		// click on select document
		String selectDocument = "#menu-content > app-documents-repository > ion-content > ion-grid > div > form > ion-row.margin--b40.md.hydrated > ion-col > ion-item > ion-select";
		WebElement selectDocumentElement = driver.findElement(MobileBy.cssSelector(selectDocument));
		selectDocumentElement.click();

		// select report type
		String report = "#alert-input-1-1";
		WebElement reportElemnt = driver.findElement(MobileBy.cssSelector(report));
		reportElemnt.click();

		// click on ok button
		String okBtn = "#ion-overlay-1 > div > div.alert-button-group.sc-ion-alert-md > button:nth-child(2)";
		WebElement okElement = driver.findElement(MobileBy.cssSelector(okBtn));
		okElement.click();

		// click on upload document
		String uploadDocument = "//*[@class=\"cradle cradle--upload\"]";
		WebElement uploadDocumentElement = driver.findElement(MobileBy.cssSelector(uploadDocument));
		uploadDocumentElement.click();

		WeightTracker.init(driver);
	}
}