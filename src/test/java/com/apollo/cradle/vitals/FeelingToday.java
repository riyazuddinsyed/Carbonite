package com.apollo.cradle.vitals;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class FeelingToday {

	public static void init(AppiumDriver<WebElement> driver) {
		// TODO Auto-generated method stub

		// click on menu button
		String vitalBtn = "//*[@id=\"tab-button-vitals\"]";
		WebElement vitalBtnElement = driver.findElementByXPath(vitalBtn);
		vitalBtnElement.click();

		// click on how to feeling today
		String activityBtn = "#menu-content > app-tabs > ion-tabs > div > ion-router-outlet > app-vitals > ion-content > ion-grid > ion-row.calculators-wrap.md.hydrated > ion-col:nth-child(5) > ion-button";
		WebElement activityElement = driver.findElement(MobileBy.cssSelector(activityBtn));
		activityElement.click();

		String activity1 = "#menu-content > app-track-activity > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-item.ion-flex.ion-align-items-end.margin--b30.no-ripple.item.md.ion-activatable.ion-focusable.ion-untouched.ion-pristine.ion-invalid.hydrated.item-interactive.item-select.item-has-placeholder > ion-select";
		List<WebElement> activityElements = driver.findElements(MobileBy.cssSelector(activity1));
		if (activityElements.size() > 0) {
			driver.findElement(MobileBy.cssSelector(activity1)).click();
		} else {
			String addActivity = "#menu-content > app-past-activity > ion-row > ion-col > ion-button";
			driver.findElement(MobileBy.cssSelector(addActivity)).click();
		}

		// click on date
		String dateBtn = "#menu-content > app-track-activity > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-item.ion-flex.ion-align-items-end.margin--b10.item-label.item-label-floating.item.md.ion-activatable.ion-focusable.ion-untouched.ion-pristine.ion-valid.hydrated.item-interactive.item-datetime.item-has-value > ion-datetime";
		WebElement dateBtnElement = driver.findElement(MobileBy.cssSelector(dateBtn));
		dateBtnElement.click();

		// click on done button
		String doneBtn = "#ion-overlay-1 > div > div.picker-toolbar.sc-ion-picker-md > div:nth-child(2) > button";
		WebElement doneBtnElement = driver.findElement(MobileBy.cssSelector(doneBtn));
		doneBtnElement.click();

		// click on time
		String timeBtn = "#menu-content > app-track-activity > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-item.ion-flex.ion-align-items-end.margin--b30.item-label.item-label-floating.item.md.ion-activatable.ion-focusable.ion-untouched.ion-pristine.ion-invalid.hydrated.item-interactive.item-datetime.item-has-value > ion-datetime";
		WebElement timeBtnElement = driver.findElement(MobileBy.cssSelector(timeBtn));
		timeBtnElement.click();

		// click on done
		String clickDoneBtn = "#ion-overlay-2 > div > div.picker-toolbar.sc-ion-picker-md > div:nth-child(2) > button";
		WebElement clickDoneBtnElement = driver.findElement(MobileBy.cssSelector(clickDoneBtn));
		clickDoneBtnElement.click();

		// click on activity
		String addActivitys = "#menu-content > app-track-activity > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-item.ion-flex.ion-align-items-end.margin--b30.no-ripple.item.md.ion-activatable.ion-focusable.ion-untouched.ion-pristine.ion-invalid.hydrated.item-interactive.item-select.item-has-placeholder > ion-select";
		WebElement addActivitysElement = driver.findElement(MobileBy.cssSelector(addActivitys));
		addActivitysElement.click();

		// Select drop-down list selection
		String dropDown = "#menu-content > app-track-activity > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-row.theme--select.underlined.margin--b40.md.hydrated > select";
		WebElement dropDownElement = driver.findElement(MobileBy.id(dropDown));
		dropDownElement.click();

		// click on ok button
		String okBtn = "#ion-overlay-1 > div > div.alert-button-group.sc-ion-alert-md > button";
		WebElement okBtnElement = driver.findElement(MobileBy.id(okBtn));
		okBtnElement.click();

	}

}