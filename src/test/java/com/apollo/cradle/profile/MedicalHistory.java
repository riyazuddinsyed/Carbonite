package com.apollo.cradle.profile;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class MedicalHistory {
	public static void init(AppiumDriver<WebElement> driver) {

		// Click on medicalHistory
		String medicalBtn = "#menu-content > app-profile-edit > ion-content > ion-grid > ion-row > ion-col:nth-child(1) > ion-slides > div > ion-slide.md.swiper-slide.swiper-zoom-container.hydrated.swiper-slide-next";
		WebElement medicalElement = driver.findElement(MobileBy.cssSelector(medicalBtn));
		medicalElement.click();

		// Click on Height
		String height = "#menu-content > app-profile-edit > ion-content > ion-grid > ion-row > ion-col.edit-profile-pages.ion-padding.md.hydrated > div > app-medical-history > ion-row.profile-full-height.ion-flex-column.ion-justify-content-between.md.hydrated > form > ion-col:nth-child(1) > ion-row.ion-justify-content-between.margin--b30.md.hydrated > ion-col:nth-child(1) > ion-item > ion-input > input";
		WebElement heightElement = driver.findElement(MobileBy.cssSelector(height));
		heightElement.clear();
		heightElement.sendKeys("50");

		// Click on weight
		String weight = "#menu-content > app-profile-edit > ion-content > ion-grid > ion-row > ion-col.edit-profile-pages.ion-padding.md.hydrated > div > app-medical-history > ion-row.profile-full-height.ion-flex-column.ion-justify-content-between.md.hydrated > form > ion-col:nth-child(1) > ion-row.ion-justify-content-between.margin--b30.md.hydrated > ion-col:nth-child(2) > ion-item > ion-input > input";
		WebElement weightElement = driver.findElement(MobileBy.cssSelector(weight));
		weightElement.clear();
		weightElement.sendKeys("80");

		// select on Checkboxs
		String pregnancyCheckbox = "#menu-content > app-profile-edit > ion-content > ion-grid > ion-row > ion-col.edit-profile-pages.ion-padding.md.hydrated > div > app-medical-history > ion-row.profile-full-height.ion-flex-column.ion-justify-content-between.md.hydrated > form > ion-col:nth-child(1) > ion-row.custom--checkbox-group.margin--t20.md.hydrated > ion-col:nth-child(1)";
		WebElement pregnancyCheckboxElement = driver.findElement(MobileBy.cssSelector(pregnancyCheckbox));
		pregnancyCheckboxElement.click();

		// Click on Update Button
		String updateBtn = "#menu-content > app-profile-edit > ion-content > ion-grid > ion-row > ion-col.edit-profile-pages.ion-padding.md.hydrated > div > app-medical-history > ion-row.profile-full-height.ion-flex-column.ion-justify-content-between.md.hydrated > form > ion-col:nth-child(2) > ion-button";
		WebElement updateBtnElement = driver.findElement(MobileBy.cssSelector(updateBtn));
		updateBtnElement.click();

		FamilyHistory.init(driver);
	}
}
