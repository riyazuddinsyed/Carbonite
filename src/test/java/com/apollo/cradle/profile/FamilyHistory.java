package com.apollo.cradle.profile;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class FamilyHistory {
	public static void init(AppiumDriver<WebElement> driver) {
		String slides = "#menu-content > app-profile-edit > ion-content > ion-grid > ion-row > ion-col:nth-child(1) > ion-slides > div > ion-slide";

		List<WebElement> slideElements = driver.findElements(MobileBy.cssSelector(slides));

		WebElement medicalSlideElement = slideElements.get(2);
		medicalSlideElement.click();

		// Click on checkbox selector
		String checkboxSelector = "#menu-content > app-profile-edit > ion-content > ion-grid > ion-row > ion-col.edit-profile-pages.ion-padding.md.hydrated > div > app-family-history > ion-row.profile-full-height.ion-flex-column.ion-justify-content-between.md.hydrated > form > ion-col:nth-child(1) > ion-row > ion-col:nth-child(1)";
		WebElement checkboxElement = driver.findElement(MobileBy.cssSelector(checkboxSelector));
		checkboxElement.click();

		// Click on update Button
		String updateBtnSelector = "#menu-content > app-profile-edit > ion-content > ion-grid > ion-row > ion-col.edit-profile-pages.ion-padding.md.hydrated > div > app-family-history > ion-row.profile-full-height.ion-flex-column.ion-justify-content-between.md.hydrated > form > ion-col:nth-child(2) > ion-button";
		WebElement updateBtnElement = driver.findElement(MobileBy.cssSelector(updateBtnSelector));
		updateBtnElement.click();

		PregnancyHistory.init(driver);
	}
}
