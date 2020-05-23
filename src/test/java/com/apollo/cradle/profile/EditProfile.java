package com.apollo.cradle.profile;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class EditProfile {
	public static void init(AppiumDriver<WebElement> driver) {
		// click Menu
		driver.findElement(MobileBy.cssSelector("#menuButton")).click();

		// Click on My profile
		driver.findElement(MobileBy
				.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-menu/ion-content/ion-list[1]/ion-menu-toggle[1]/ion-item/ion-label"))
				.click();

		// Click on Edit Profile
		driver.findElement(MobileBy.cssSelector(
				"#menu-content > app-profile > ion-content > ion-grid > ion-row.patch--primary.ion-padding.padding--b40.md.hydrated > ion-col.profile--details.ion-flex.ion-flex-column.ion-justify-content-start.md.hydrated > ion-row:nth-child(4) > ion-col > ion-button"))
				.click();

		

	}
}
