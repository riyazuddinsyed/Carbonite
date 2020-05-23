package com.apollo.cradle.booking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class RequestHealthCheck {
	public static void init(AppiumDriver<WebElement> driver) {

		// Click on booking //#tab-button-book
		String bookingBtn = "#tab-button-book";
		WebElement bookingElement = driver.findElement(MobileBy.cssSelector(bookingBtn));
		bookingElement.click();

		// click on request a health check
		String healthCheck = "#menu-content > app-tabs > ion-tabs > div > ion-router-outlet > app-bookings > ion-content > ion-grid > ion-row.booking-wrap.md.hydrated > ion-col:nth-child(3) > ion-button";
		WebElement healthCheckElement = driver.findElement(MobileBy.cssSelector(healthCheck));
		healthCheckElement.click();

		// Select for appoinment
		String appoinment = "#menu-content > app-health-check-tabs > ion-tabs > div > ion-router-outlet > app-new-health-check > ion-content > app-forms > form > ion-grid > ion-row > ion-row:nth-child(1) > select";
		WebElement appoinmentElement = driver.findElement(MobileBy.cssSelector(appoinment));
		Select selectappoinment = new Select(appoinmentElement);
		selectappoinment.selectByVisibleText("madhu");

	}
}