package com.apollo.cradle.util;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ApolloUtils<ScrollAmount> {
	//this method works on scrollup(means scroll upwards to downwards)	
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

	public static void verticalScrollMenu(AppiumDriver<WebElement> driver) {
		Dimension dimension = driver.manage().window().getSize();
		Double startHeight = dimension.getHeight() * 0.5;
		int scrollStart = startHeight.intValue();

		Double endHeight = dimension.getHeight() * 0.2;
		int scrollEnd = endHeight.intValue();

		Double width=dimension.width*0.75;
		int widthE=width.intValue();
		
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(widthE, scrollStart)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(widthE, scrollEnd)).release().perform();
	}
//this method works on scrollup(means scroll downwards to upwards)	
	public static void verticalScrollup(AppiumDriver<WebElement> driver) {
		Dimension dimension = driver.manage().window().getSize();
		Double startHeight = dimension.getHeight() * 0.3;
		int scrollStart = startHeight.intValue();

		Double endHeight = (dimension.getHeight() * 0.9) - startHeight;
		int scrollEnd = endHeight.intValue();
		System.out.println("scrollStart:" + scrollStart);
		System.out.println("endHeight:" + endHeight);
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(0, scrollStart)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(0, scrollEnd)).release().perform();
	}
	
	@SuppressWarnings("hiding")
	public class ApolloUtilswidth<ScrollAmount> {
		public void verticalScrollwidth(AppiumDriver<WebElement> driver) {
			Dimension dimension = driver.manage().window().getSize();
			Double startwidth = dimension.getWidth() * 0.5;
			int scrollStart = startwidth.intValue();

			Double endwidth = dimension.getWidth() * 0.2;
			int scrollEnd = endwidth.intValue();

			TouchAction action = new TouchAction(driver);
			action.press(PointOption.point(0, scrollStart)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
					.moveTo(PointOption.point(0, scrollEnd)).release().perform();
		}
	}
}
