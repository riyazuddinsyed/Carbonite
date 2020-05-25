package com.apollo.cradle.tests;

import org.testng.annotations.Test;

import com.apollo.cradle.pages.LandingPage;

public class LandingTest {
	LandingPage landingPage;

	public LandingTest() {
		landingPage = new LandingPage();
	}

	@Test
	public void loginBtn() {
		landingPage.clickLoginBtn();
	}
}
