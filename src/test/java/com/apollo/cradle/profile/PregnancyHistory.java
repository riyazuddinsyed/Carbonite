package com.apollo.cradle.profile;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class PregnancyHistory {
	public static void init(AppiumDriver<WebElement> driver) {
		
		String slides = "#menu-content > app-profile-edit > ion-content > ion-grid > ion-row > ion-col:nth-child(1) > ion-slides > div > ion-slide";
		List<WebElement> slideElements = driver.findElements(MobileBy.cssSelector(slides));
		WebElement medicalSlideElement = slideElements.get(3);
		medicalSlideElement.click();

		// Click on Add more pregnancy
		String addMorePregnancyBtnSelector = "#menu-content > app-profile-edit > ion-content > ion-grid > ion-row > ion-col.edit-profile-pages.ion-padding.md.hydrated > div > app-pregnancy-history > ion-row.profile-full-height.ion-flex-column.ion-justify-content-between.md.hydrated > ion-col:nth-child(2) > ion-button";
		WebElement addMorePregnancyBtnElement = driver.findElement(MobileBy.cssSelector(addMorePregnancyBtnSelector));
		addMorePregnancyBtnElement.click();

		// click birth outcome button
		String tabSelector = "#menu-content > app-profile-edit > ion-content > ion-grid > ion-row > ion-col:nth-child(1) > ion-slides > div > ion-slide:nth-child(4)";
		WebElement tabElement = driver.findElement(MobileBy.cssSelector(tabSelector));
		tabElement.click();

		// Select bithoutcome choose one
		String birth = "#menu-content > app-add-pregnancy-history > ion-content > ion-grid > form > ion-row.margin--b20.md.hydrated > ion-col > ion-item:nth-child(1) > ion-row > select";
		WebElement birthElement = driver.findElement(MobileBy.cssSelector(birth));
		Select birthSelect = new Select(birthElement);
		birthSelect.selectByValue("Miscarriage");

		// click on conception and select natural
		String conception = "#menu-content > app-add-pregnancy-history > ion-content > ion-grid > form > ion-row.margin--b20.md.hydrated > ion-col > ion-item:nth-child(2) > ion-row > select";
		WebElement conceptionElement = driver.findElement(MobileBy.cssSelector(conception));
		Select conceptionSelect = new Select(conceptionElement);
		conceptionSelect.selectByValue("Natural");

		// click on delivey and select C-section
		String delivery = "#menu-content > app-add-pregnancy-history > ion-content > ion-grid > form > ion-row.margin--b20.md.hydrated > ion-col > ion-item:nth-child(3) > ion-row > select";
		WebElement delive = driver.findElement(MobileBy.cssSelector(delivery));
		Select deliveSelect = new Select(delive);
		deliveSelect.selectByValue("C-Section");

		// click on baby gestation age(in months)
		String gestation = "#menu-content > app-add-pregnancy-history > ion-content > ion-grid > form > ion-row.margin--b20.md.hydrated > ion-col > ion-item:nth-child(4) > ion-input > input";
		WebElement gentationElement = driver.findElement(MobileBy.cssSelector(gestation));
		gentationElement.clear();
		gentationElement.sendKeys("7");

		// click on baby weight(in kgs)
		String babyWeight = "#menu-content > app-add-pregnancy-history > ion-content > ion-grid > form > ion-row.margin--b20.md.hydrated > ion-col > ion-item:nth-child(5) > ion-input > input";
		WebElement babyWeightElement = driver.findElement(MobileBy.cssSelector(babyWeight));
		babyWeightElement.sendKeys("3");

		// click on baby age(in years)
		String babyYears = "#menu-content > app-add-pregnancy-history > ion-content > ion-grid > form > ion-row.margin--b20.md.hydrated > ion-col > ion-item:nth-child(6) > ion-input > input";
		WebElement babyYearsElements = driver.findElement(MobileBy.cssSelector(babyYears));
		babyYearsElements.sendKeys("1");

		// Click on comments in baby health
		String comments = "#menu-content > app-add-pregnancy-history > ion-content > ion-grid > form > ion-row.margin--b20.md.hydrated > ion-col > ion-item.margin--b15.item-label.item-label-floating.item-interactive.item-input.item.md.ion-focusable.hydrated.ion-pristine.ion-valid.ion-touched > ion-input";
		WebElement commentsElemet = driver.findElement(MobileBy.cssSelector(comments));
		commentsElemet.clear();
		commentsElemet.sendKeys("good healty");

		// Click on Add history
		String addHistory = "#menu-content > app-add-pregnancy-history > ion-content > ion-grid > form > ion-row:nth-child(2) > ion-col > ion-button";
		WebElement addHistoryElement = driver.findElement(MobileBy.cssSelector(addHistory));
		addHistoryElement.click();
	}
}
