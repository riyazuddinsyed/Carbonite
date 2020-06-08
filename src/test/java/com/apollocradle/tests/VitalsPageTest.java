package com.apollocradle.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.apollo.cradle.setup.BaseDriver;
import com.apollo.cradle.util.ApolloUtils;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.MobileBy;

public class VitalsPageTest extends BaseDriver {
	@Test(priority = 41)
	public void bloodSugar() {
		ExtentTest test = reports.createTest("vitals - Blood Sugar");
		test.log(Status.INFO, " Blood Sugar starts here...");

		// Click on vitals button
		String blood_vitalBtn = "//*[@id='tab-button-vitals']";
		WebElement blood_vitalBtnElement = driver.findElementByXPath(blood_vitalBtn);
		blood_vitalBtnElement.click();

		test.log(Status.PASS, "Verify the vitals button");

		// Click on Bloodsugar
		String bloodSugar = "#menu-content > app-tabs > ion-tabs > div > ion-router-outlet > app-vitals > ion-content > ion-grid > ion-row.calculators-wrap.md.hydrated > ion-col:nth-child(1) > ion-button";
		WebElement bloodSugarBtnElement = driver.findElement(MobileBy.cssSelector(bloodSugar));
		bloodSugarBtnElement.click();

		// click on your blood sugar
		String historyBtn = "//*[text()='Log your Blood Sugar']";
		List<WebElement> btns = driver.findElementsByXPath(historyBtn);
		if (btns.size() == 1) {
			btns.get(0).click();
			bloodSugarPage(test);
		} else {
			bloodSugarPage(test);
		}
		test.log(Status.PASS, "Verify blood sugar tab");

		// click on back button for blood sugar
		driver.navigate().back();

		// click on blood sugar back tab
		driver.navigate().back();

		// click on history tab back button
		driver.navigate().back();

	}

	private void bloodSugarPage(ExtentTest test) {
		// click on date
		// button[@type='button'][2]//div[@class='alert-button-inner sc-ion-alert-md']"}

		String bloodSugarBtn = "//*[@id='menu-content']/app-blood-sugar/ion-content/ion-grid/form/div/ion-row/ion-col[2]/ion-item[1]/ion-datetime";
		WebElement bloodSugarElement = driver.findElementByXPath(bloodSugarBtn);
		bloodSugarElement.click();

		// click on day
		String days = "//button[text()='" + testdata.get("bloodSugarDay") + "']";
		WebElement daysBtnElement = driver.findElementByXPath(days);
		daysBtnElement.click();

		// click on month
		String month = "//button[text()='" + testdata.get("bloodSugarMonth") + "']";
		WebElement monthBtnElement = driver.findElementByXPath(month);
		monthBtnElement.click();

		// click on year
		String year = "//button[text()='2020']";
		WebElement yearBtnElement = driver.findElementByXPath(year);
		yearBtnElement.click();

		test.log(Status.PASS, "Verify that log your blood sugar opens a form for the user which contains date.");

		// click on done button
		driver.findElement(By.xpath("//button[text()='Done']")).click();

		// click on time button
		String time = "#menu-content > app-blood-sugar > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-item:nth-child(2) > ion-datetime";
		WebElement timeElement = driver.findElement(MobileBy.cssSelector(time));
		timeElement.click();

		test.log(Status.PASS, "Verify that log your blood sugar opens a form for the user which contains time.");

		// click on done button
		String timeclickBtn = "//*[text()='Done']";
		WebElement timeclickBtnElement = driver.findElementByXPath(timeclickBtn);
		timeclickBtnElement.click();

		test.log(Status.PASS, "Verify click on done button ");

		// Enter beforemeal
		String beforeMeal = "#menu-content > app-blood-sugar > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-row.ion-align-items-end.margin--b20.md.hydrated > ion-col:nth-child(2) > ion-item > ion-input > input";
		WebElement beforeMealElement = driver.findElement(MobileBy.cssSelector(beforeMeal));
		beforeMealElement.clear();
		beforeMealElement.sendKeys("120");

		test.log(Status.PASS,
				"Verify that log your blood sugar opens a form for the user which contains date,time and before Meal.");

		// Enter aftermeal
		String afterMeal = "#menu-content > app-blood-sugar > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-row.ion-align-items-end.margin--b40.md.hydrated > ion-col:nth-child(2) > ion-item > ion-input > input";
		WebElement afterMealElement = driver.findElement(MobileBy.cssSelector(afterMeal));
		afterMealElement.clear();
		afterMealElement.sendKeys("135");

		test.log(Status.PASS,
				"Verify that log your blood sugar opens a form for the user which contains date,time then before Meal and afterMeal.");

		// click on savedata
		String savedataBtn = "//*[text()='Save ']";
		WebElement savedataElement = driver.findElementByXPath(savedataBtn);
		savedataElement.click();

		test.log(Status.PASS, "Verify click on savedata button ");

	}

	@Test(priority = 42)
	private void bloodPressure() {
		ExtentTest test = reports.createTest("vitals - BloodPressure");
		test.log(Status.INFO, "BloodPressure starts here...");

		// click on menu button
		String vitalbloodBtn = "//*[@id='tab-button-vitals']";
		WebElement vitalbloodBtnBtnElement = driver.findElementByXPath(vitalbloodBtn);
		vitalbloodBtnBtnElement.click();

		test.log(Status.PASS, "Verify click on menu for vitals button ");

		// click on blood pressure
		String calculateBloodBtn = "//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-vitals/ion-content/ion-grid/ion-row[2]/ion-col[2]/ion-button";
		WebElement calculateBloodElement = driver.findElementByXPath(calculateBloodBtn);
		calculateBloodElement.click();

		// click on your blood pressure history button
		String historyBtn = "//*[text()='Log Blood Pressure']";
		List<WebElement> btns = driver.findElementsByXPath(historyBtn);
		if (btns.size() == 1) {
			btns.get(0).click();
			bloodPressurePage(test);

		} else {
			bloodPressurePage(test);
		}

		test.log(Status.PASS,
				"Verify that there is a log your blood sugar button at the bottom of the screen which can be used to log another set of data");

		/*
		 * String backBtn =
		 * "//*[@id=\"menu-content\"]/app-past-blood-pressure/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		 * WebElement backBtnElement = driver.findElementByXPath(backBtn);
		 * backBtnElement.click();
		 */
		// click on back button to history page
		driver.navigate().back();

		/*
		 * String backpressure =
		 * "//*[@id='menu-content']/app-blood-pressure/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		 * WebElement backpressureElement = driver.findElementByXPath(backpressure);
		 * backpressureElement.click();
		 */

		// click on blood pressure back button
		driver.navigate().back();
		driver.navigate().back();

	}

	private void bloodPressurePage(ExtentTest test) {
		// click on date
		String dateBtn = "//*[@id=\"menu-content\"]/app-blood-pressure/ion-content/ion-grid/form/div/ion-row/ion-col[2]/ion-item[1]/ion-datetime";
		WebElement dateElement = driver.findElementByXPath(dateBtn);
		dateElement.click();

		test.log(Status.PASS, "Verify that log your blood pressure opens a form which contains date.");

		// click on day
		String days = "//button[text()='" + testdata.get("bloodPressureDay") + "']";
		WebElement daysBtnElement = driver.findElementByXPath(days);
		daysBtnElement.click();

		// click on month
		String month = "//button[text()='" + testdata.get("bloodPressureMonth") + "']";
		WebElement monthBtnElement = driver.findElementByXPath(month);
		monthBtnElement.click();

		// click on year
		String year = "//button[text()='2020']";
		WebElement yearBtnElement = driver.findElementByXPath(year);
		yearBtnElement.click();

		// click on date done button
		driver.findElement(By.xpath("//button[text()='Done']")).click();

		test.log(Status.PASS, "Verify click on Done button ");

		// click on time
		String timeBtn = "#menu-content > app-blood-pressure > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-item:nth-child(2) > ion-datetime";
		WebElement timeElement = driver.findElement(MobileBy.cssSelector(timeBtn));
		timeElement.click();

		test.log(Status.PASS, "Verify that log your blood pressure opens a form which contains time.");

		// click on time done button
		String clickBtn = "//*[text()='Done']";
		WebElement clickElement = driver.findElementByXPath(clickBtn);
		clickElement.click();

		test.log(Status.PASS, "Verify click on Done button ");

		// systolic upper
		String systolicUpper = "#menu-content > app-blood-pressure > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-row.ion-align-items-end.margin--b20.md.hydrated > ion-col:nth-child(2) > ion-item > ion-input > input";
		WebElement systoliElement = driver.findElement(MobileBy.cssSelector(systolicUpper));
		systoliElement.clear();
		systoliElement.sendKeys("125");

		test.log(Status.PASS, "Verify that log your blood pressure opens a form which contains systolicUpper.");

		// disatolic lower
		String diastolic = "#menu-content > app-blood-pressure > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-row.ion-align-items-end.margin--b40.md.hydrated > ion-col:nth-child(2) > ion-item > ion-input > input";
		WebElement diastolicElement = driver.findElement(MobileBy.cssSelector(diastolic));
		diastolicElement.clear();
		diastolicElement.sendKeys("145");

		test.log(Status.PASS, "Verify that log your blood pressure opens a form which contains disatolic lower.");

		// click on save data
		String saveBtn = "#menu-content > app-blood-pressure > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-row:nth-child(5) > ion-col > ion-button";
		WebElement saveElement = driver.findElement(MobileBy.cssSelector(saveBtn));
		saveElement.click();

		test.log(Status.PASS, "Verify save data button");

	}

	@Test(priority = 43)
	private void documents() {
		ExtentTest test = reports.createTest("vitals - Documents");
		test.log(Status.INFO, "Documents starts here...");

		String doc_vitalBtn = "//*[@id='tab-button-vitals']";
		WebElement doc_vitalBtnElement = driver.findElementByXPath(doc_vitalBtn);
		doc_vitalBtnElement.click();

		// click on document
		String document = "#menu-content > app-tabs > ion-tabs > div > ion-router-outlet > app-vitals > ion-content > ion-grid > ion-row.calculators-wrap.md.hydrated > ion-col:nth-child(3) > ion-button";
		WebElement documentElement = driver.findElement(MobileBy.cssSelector(document));
		documentElement.click();

		// click on select document
		String selectDocument = "#menu-content > app-documents-repository > ion-content > ion-grid > div > form > ion-row.margin--b40.md.hydrated > ion-col > ion-item > ion-select";
		WebElement selectDocumentElement = driver.findElement(MobileBy.cssSelector(selectDocument));
		selectDocumentElement.click();

		// select report type
		String report = "#alert-input-1-1";
		WebElement reportElemnt = driver.findElement(MobileBy.cssSelector(report));
		reportElemnt.click();

		// click on ok button
		String okBtn = "#ion-overlay-1 > div > div.alert-button-group.sc-ion-alert-md > button:nth-child(2)";
		WebElement okElement = driver.findElement(MobileBy.cssSelector(okBtn));
		okElement.click();

		// click on upload file document
		String uploadDocument = "//*[@class=\"cradle cradle--upload\"]";
		WebElement uploadDocumentElement = driver.findElementByXPath(uploadDocument);
		uploadDocumentElement.click();

		test.log(Status.PASS, "Verify on upload file document");

		// click on camera upload a image
		String image = "//*[text()='Use Camera']";
		WebElement imageElement = driver.findElementByXPath(image);
		imageElement.click();

		// click on allow
		String allow = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]";
		WebElement allowElement = driver.findElementByXPath(allow);
		allowElement.click();

		test.log(Status.PASS, "Verify on upload image ");

		// click on upload button
		String uploadBtn = "//*[@class=\"cradle cradle--upload\"]";
		WebElement uploadBtnElement = driver.findElementByXPath(uploadBtn);
		uploadBtnElement.click();

		// click on upload Document
		String uploaddocument = "//*[@id=\"menu-content\"]/app-documents-repository/ion-content/ion-grid/div/form/ion-row[2]/ion-col[3]/ion-button";
		WebElement uploaddocumentElement = driver.findElementByXPath(uploaddocument);
		uploaddocumentElement.click();

		test.log(Status.PASS,
				"Verify that on click of the document repository user is taken to a screen where he can select the document type, select the document and upload it");

	}

	@Test(priority = 44)
	private void weightTracker() {
		ExtentTest test = reports.createTest("vitals - WeightTracker");
		test.log(Status.INFO, "WeightTracker starts here...");

		ApolloUtils.verticalScroll(driver);

		// click on vitals
		String weighvitalBtn = "//*[@id='tab-button-vitals']";
		WebElement weighvitalBtnElement = driver.findElementByXPath(weighvitalBtn);
		weighvitalBtnElement.click();

		test.log(Status.PASS, "Verify click on vitals ");

		// Click on weightTracker Button
		String weightTrackerBtn = "//span[text()='Weight ']";
		WebElement weightTrackerElement = driver.findElementByXPath(weightTrackerBtn);
		weightTrackerElement.click();

		// click on your history
		String historyBtn = "//*[text()='Record your weight']";
		List<WebElement> btns = driver.findElementsByXPath(historyBtn);
		if (btns.size() == 1) {
			btns.get(0).click();
			weightTrackerPage(test);

		} else {
			weightTrackerPage(test);
		}

		test.log(Status.PASS, "Verify click on weight tracker tab");

		// click on back button
		driver.navigate().back();

		// click on weight tracker back button
		driver.navigate().back();
	}

	private void weightTrackerPage(ExtentTest test) {
		// click on select date
		String selectDate = "//*[@id=\"menu-content\"]/app-weight-tracker/ion-content/ion-grid/form/div/ion-row/ion-col[2]/ion-item[1]/ion-datetime";
		WebElement selectDateElement = driver.findElementByXPath(selectDate);
		selectDateElement.click();

		// click on day
		String days = "//button[text()='" + testdata.get("weightTrackerDay") + "']";
		WebElement daysBtnElement = driver.findElementByXPath(days);
		daysBtnElement.click();

		// click on month
		String month = "//button[text()='" + testdata.get("weightTrackerMonth") + "']";
		WebElement monthBtnElement = driver.findElementByXPath(month);
		monthBtnElement.click();

		// click on year
		String year = "//button[text()='2020']";
		WebElement yearBtnElement = driver.findElementByXPath(year);
		yearBtnElement.click();

		// click on done dutton
		String doneBtn = "//*[text()='Done']";
		WebElement doneBtnElement = driver.findElementByXPath(doneBtn);
		doneBtnElement.click();

		test.log(Status.PASS,
				"Verify that on click of track my activity user is navigated to a screen where we can enter a date.");

		// click on select time
		String timeBtn = "//*[@id='menu-content']/app-weight-tracker/ion-content/ion-grid/form/div/ion-row/ion-col[2]/ion-item[2]/ion-datetime";
		WebElement timeBtnElement = driver.findElementByXPath(timeBtn);
		timeBtnElement.click();

		test.log(Status.PASS,
				"Verify that on click of track my activity user is navigated to a screen where we can enter a time.");

		// click on done button
		String clickDoneBtn = "//*[text()='Done']";
		WebElement clickDoneElement = driver.findElementByXPath(clickDoneBtn);
		clickDoneElement.click();

		test.log(Status.PASS, "Verify click on ok button");

		// enter the weight
		String yourweight = "#menu-content > app-weight-tracker > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-row.ion-align-items-end.margin--b40.md.hydrated > ion-col:nth-child(2) > ion-item > ion-input > input";
		WebElement yourweightElement = driver.findElement(MobileBy.cssSelector(yourweight));
		yourweightElement.clear();
		yourweightElement.sendKeys("60");

		test.log(Status.PASS,
				"Verify that on click of track my activity user is navigated to a screen where we can enter a weight.");

		// click on save button
		String saveBtn = "#menu-content > app-weight-tracker > ion-content > ion-grid > form > div > ion-row > ion-col:nth-child(2) > ion-row:nth-child(4) > ion-col > ion-button";
		WebElement saveBtnElement = driver.findElement(MobileBy.cssSelector(saveBtn));
		saveBtnElement.click();

		test.log(Status.PASS, "Verify ckic on save button");
		// click on your back button
		driver.navigate().back();

	}

	@Test(priority = 45)
	private void trackMyActivity() {

		ExtentTest test = reports.createTest("vitals - TrackMyActivity");
		test.log(Status.INFO, "TrackMyActivity starts here...");

		ApolloUtils.verticalScroll(driver);

		// click on menu button
		String t_vitalBtn = "//*[@id='tab-button-vitals']";
		WebElement t_vitalBtnElement = driver.findElementByXPath(t_vitalBtn);
		t_vitalBtnElement.click();

		test.log(Status.PASS, "Verify click on menu button");

		// click on track my Activity
		String track = "//span[text()='Track My ' and text()='Activity']";
		WebElement trackBtnElement = driver.findElementByXPath(track);
		trackBtnElement.click();

		// click on your history
		String historyBtn = "//*[text()='Add new Activity']";
		List<WebElement> btn = driver.findElementsByXPath(historyBtn);
		if (btn.size() == 1) {
			btn.get(0).click();
			trackactivityPage(test);
		} else {
			trackactivityPage(test);
		}
		test.log(Status.PASS, "Verify click on track my Activity");

		// click on history page back button
		String pastactivityBtn = "//*[@id=\"menu-content\"]/app-past-activity/ion-header/ion-toolbar/ion-buttons/ion-back-button/button";
		WebElement pastactivityBtnElement = driver.findElementByXPath(pastactivityBtn);
		pastactivityBtnElement.click();

		// click on form page back button
		String trackactivityBtn = "//*[@id=\"menu-content\"]/app-track-activity/ion-header/ion-toolbar/ion-buttons/ion-back-button/button";
		WebElement trackactivityBtnElement = driver.findElementByXPath(trackactivityBtn);
		trackactivityBtnElement.click();

	}

	private void trackactivityPage(ExtentTest test) {
		// click on date button
		String d_date = "//*[@id=\"menu-content\"]/app-track-activity/ion-content/ion-grid/form/div/ion-row/ion-col[2]/ion-item[1]/ion-datetime";
		driver.findElement(By.xpath(d_date)).click();

		test.log(Status.PASS, "Verify click on date button");

		// click on day
		String days = "//button[text()='" + testdata.get("trackMyActivityDay") + "']";
		WebElement daysBtnElement = driver.findElementByXPath(days);
		daysBtnElement.click();

		test.log(Status.PASS, "Verify click on day");

		// click on month
		String month = "//button[text()='" + testdata.get("trackMyActivityMonth") + "']";
		WebElement monthBtnElement = driver.findElementByXPath(month);
		monthBtnElement.click();

		test.log(Status.PASS, "Verify click on month");

		// click on year
		String year = "//button[text()='2020']";
		WebElement yearBtnElement = driver.findElementByXPath(year);
		yearBtnElement.click();

		test.log(Status.PASS,
				"Verify that on click of track my activity user is navigated to a screen where we can enter a date");

		// click on done button
		String ddoneBtn = "//div[@class='picker-toolbar-button sc-ion-picker-md']//button";
		driver.findElement(By.xpath(ddoneBtn)).click();

		test.log(Status.PASS, "Verify click on done button for date");

		// click on time button
		String trackcat_timeBtn = "//*[@id=\"menu-content\"]/app-track-activity/ion-content/ion-grid/form/div/ion-row/ion-col[2]/ion-item[2]/ion-datetime";
		WebElement trackcat_timeBtnElement = driver.findElementByXPath(trackcat_timeBtn);
		trackcat_timeBtnElement.click();

		test.log(Status.PASS, "Verify click on time button");

		// click on done button time
		String clicktrackcat_DoneBtn = "//*[text()='Done']";
		driver.findElement(By.xpath(clicktrackcat_DoneBtn)).click();

		test.log(Status.PASS, "Verify click on done button for time");

		// click on activity
		String addActivitys = "//*[@id=\"menu-content\"]/app-track-activity/ion-content/ion-grid/form/div/ion-row/ion-col[2]/ion-item[3]/ion-select";
		WebElement addActivitysElement = driver.findElementByXPath(addActivitys);
		addActivitysElement.click();

		test.log(Status.PASS, "Verify click on Activity");

		// click on radio button
		String name = "//button[@type='button'][2]//div[@class='alert-button-inner sc-ion-alert-md']";
		WebElement nameElement = driver.findElementByXPath(name);
		nameElement.click();

		test.log(Status.PASS, "Verify click on Activity on radio button");
		// click on done button
		String active_done = "//*[text()='OK']";
		driver.findElement(By.xpath(active_done)).click();

		test.log(Status.PASS,
				"The type of activity being performed and can initiate a timer which will record the time for which the activity was performed");

		// click on start your activity timer
		String start_timer = "//*[@id=\"menu-content\"]/app-track-activity/ion-content/ion-grid/form/div/ion-row/ion-col[2]/ion-row[2]/ion-button";
		WebElement start_timerElement = driver.findElementByXPath(start_timer);
		start_timerElement.click();
		start_timerElement.click();

		test.log(Status.PASS, "Verify click on start your activity timer");

		ApolloUtils.verticalScroll(driver);

		// click on save button
		String saveBtn = "//*[@id=\"menu-content\"]/app-track-activity/ion-content/ion-grid/form/div/ion-row/ion-col[2]/ion-row[3]/ion-col/ion-button";
		WebElement saveBtnElement = driver.findElementByXPath(saveBtn);
		saveBtnElement.click();

		test.log(Status.PASS, "Verify click on save button for activity");

	}

}