package com.apollo.cradle.booking;

import org.openqa.selenium.WebElement;

import com.apollo.cradle.util.ApolloUtils;

import io.appium.java_client.AppiumDriver;

public class ProcessBookNav {
	public static void init(AppiumDriver<WebElement> driver) {
		String book = "//*[@id=\"tab-button-book\"]";
		System.out.println(book);
		WebElement bookElement = driver.findElementByXPath(book);
		bookElement.click();

		bookAppoinment(driver);
		bookDelivery(driver);
		requestHealthCheack(driver);

	}

	private static void bookAppoinment(AppiumDriver<WebElement> driver) {
		// click on book appointment
		String book = "//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-bookings/ion-content/ion-grid/ion-row[2]/ion-col[1]/ion-button";
		WebElement bookElement = driver.findElementByXPath(book);
		bookElement.click();

		// click on back button
		String back = "//*[@id=\"menu-content\"]/app-appointment-tabs/ion-tabs/div/ion-router-outlet/app-new-appointment/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		WebElement backElement = driver.findElementByXPath(back);
		backElement.click();
	}

	private static void bookDelivery(AppiumDriver<WebElement> driver) {
		// click on book delivery
		String delivery = "//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-bookings/ion-content/ion-grid/ion-row[2]/ion-col[2]/ion-button";
		WebElement deleveryElement = driver.findElementByXPath(delivery);
		deleveryElement.click();

		// click on back button
		String backBtn = "//*[@id=\"menu-content\"]/app-bed-booking/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		WebElement backBtnElement = driver.findElementByXPath(backBtn);
		backBtnElement.click();

		// click on book button
		String book = "//*[@id=\"tab-button-book\"]";
		System.out.println(book);
		WebElement bookElement = driver.findElementByXPath(book);
		bookElement.click();
	}

	private static void requestHealthCheack(AppiumDriver<WebElement> driver) {
		ApolloUtils.verticalScroll(driver);

		// click on requestHealthCheack
		String request = "//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-bookings/ion-content/ion-grid/ion-row[2]/ion-col[3]/ion-button";
		WebElement requestElement = driver.findElementByXPath(request);
		requestElement.click();

		// click on back button
		String backBtn = "//*[@id=\"menu-content\"]/app-new-health-check/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		WebElement backBtnElement = driver.findElementByXPath(backBtn);
		backBtnElement.click();

	}
}
