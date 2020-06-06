package com.apollo.cradle.pages.plans;

import org.openqa.selenium.support.PageFactory;

import com.apollo.cradle.driver.BaseDriver;

public class PlansPage {
	public PlansPage() {
		PageFactory.initElements(BaseDriver.getInstance(), this);
	}
}
