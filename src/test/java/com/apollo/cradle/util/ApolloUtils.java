package com.apollo.cradle.util;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ApolloUtils {
	public static void verticalScroll(AppiumDriver<WebElement> driver) {
		Dimension dimension = driver.manage().window().getSize();
		Double startHeight = dimension.getHeight() * 0.5;
		int scrollStart = startHeight.intValue();

		Double endHeight = dimension.getHeight() * 0.2;
		int scrollEnd = endHeight.intValue();

		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(0, scrollStart)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(0, scrollEnd)).release().perform();
	}
	public static void verticalScrollup(AppiumDriver<WebElement> driver) {
		Dimension dimension = driver.manage().window().getSize();
		Double startHeight = dimension.getHeight() * -0.2;
		int scrollStart = startHeight.intValue();

		Double endHeight = dimension.getHeight() * 0.5;
		int scrollEnd = endHeight.intValue();

		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(0, scrollStart)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(0, scrollEnd)).release().perform();
	}
		
	

}
