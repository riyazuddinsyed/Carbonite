package com.apollo.cradle.pages.tools;

import org.openqa.selenium.support.PageFactory;

import com.apollo.cradle.driver.BaseDriver;

public class ContractionTimerPage {
	public ContractionTimerPage() {
		PageFactory.initElements(BaseDriver.getInstance(), this);
	}
}
