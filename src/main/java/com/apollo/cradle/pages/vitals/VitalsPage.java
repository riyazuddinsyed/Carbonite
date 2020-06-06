package com.apollo.cradle.pages.vitals;

import org.openqa.selenium.support.PageFactory;

import com.apollo.cradle.driver.BaseDriver;

public class VitalsPage {
	
	public VitalsPage() {
		PageFactory.initElements(BaseDriver.getInstance(), this);
	}
}
