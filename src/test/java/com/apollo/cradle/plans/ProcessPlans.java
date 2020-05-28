package com.apollo.cradle.plans;

import java.awt.Scrollbar;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.apollo.cradle.setup.BaseDriver;
import com.apollo.cradle.util.ApolloUtils;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ProcessPlans extends BaseDriver {

	@Test
	public void mainMenu() throws InterruptedException {
		ExtentTest test = reports.createTest("Plans");
		test.log(Status.INFO, " Plans starts here...");

		// click on plans
		String plan = "//*[@id='tab-button-care-plan']";
		WebElement planElement = driver.findElementByXPath(plan);
		planElement.click();

		// click on plus symbol
		String symbol = "//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-care-plan/ion-fab/ion-fab-button";
		WebElement symbolElement = driver.findElementByXPath(symbol);
		symbolElement.click();

		// click on select activity
		String activity = "//*[@id=\"menu-content\"]/app-add-care-plan/ion-content/ion-grid/div/form/ion-item[1]/ion-select";
		WebElement activityElement = driver.findElementByXPath(activity);
		activityElement.click();

		// select on radio button
		String radioBtn = "(//div[@class='alert-radio-icon sc-ion-alert-md'])[2]";
		WebElement radioBtnElement = driver.findElementByXPath(radioBtn);
		radioBtnElement.click();

		// click on ok button
		String okBtn = "//*[text()='OK']";
		WebElement okBtnElement = driver.findElementByXPath(okBtn);
		okBtnElement.click();

		// click on date
		String date = "//*[@id=\"menu-content\"]/app-add-care-plan/ion-content/ion-grid/div/form/ion-item[2]/ion-datetime";
		WebElement dateElement = driver.findElementByXPath(date);
		dateElement.click();

		// click on day
		String days = "//button[text()='29']";
		WebElement daysBtnElement = driver.findElementByXPath(days);
		daysBtnElement.click();

		// click on month
		String month = "//button[text()='Jun']";
		WebElement monthBtnElement = driver.findElementByXPath(month);
		monthBtnElement.click();

		// click on year
		String year = "//button[text()='2020']";
		WebElement yearBtnElement = driver.findElementByXPath(year);
		yearBtnElement.click();

		// click on done button
		String doneBtn = "//*[text()='Done']";
		WebElement doneBtnElement = driver.findElementByXPath(doneBtn);
		doneBtnElement.click();

		//click on Activity time
		String activitytime="//*[@id=\"menu-content\"]/app-add-care-plan/ion-content/ion-grid/div/form/ion-item[3]/ion-datetime";
		WebElement activitytimeElement = driver.findElementByXPath(activitytime);
		activitytimeElement.click();
		
		//click on Done button
		String timedone="//*[text()='Done']";
		WebElement timedoneElement = driver.findElementByXPath(timedone);
		timedoneElement.click();
		
		//click on activity name
		String activityname = "//*[@id=\"menu-content\"]/app-add-care-plan/ion-content/ion-grid/div/form/ion-row[2]/ion-col/ion-item/ion-input/input";
		WebElement activitynameElement = driver.findElementByXPath(activityname);
		activitynameElement.sendKeys("walking");
		
		
		
		
		
		// click on back button
		String back = "//*[@id=\"menu-content\"]/app-add-care-plan/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		WebElement backElement = driver.findElementByXPath(back);
		backElement.click();
		
		
	}
}
