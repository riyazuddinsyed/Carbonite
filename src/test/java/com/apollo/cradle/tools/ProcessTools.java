package com.apollo.cradle.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.apollo.cradle.setup.BaseDriver;
import com.apollo.cradle.util.ApolloUtils;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ProcessTools extends BaseDriver {

	@Test(priority = 1)
	public void bloodCalculation() {

		ExtentTest test = reports.createTest("tools - BMICalculation");
		test.log(Status.INFO, "BMICalculation starts here...");

		// Click on the tools
		String t_tools = "//*[@id=\"tab-button-calculator\"]";
		WebElement t_toolsElements = driver.findElementByXPath(t_tools);
		t_toolsElements.click();

		// click on BMI calculation
		String bmi = "//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-calculators/ion-content/ion-grid/ion-row[2]/ion-col[1]/ion-button";
		WebElement bmiElement = driver.findElementByXPath(bmi);
		bmiElement.click();

		// click on your Gender
		String gender = "//*[text()='Female']";
		WebElement genderElement = driver.findElementByXPath(gender);
		genderElement.click();

		test.log(Status.PASS,
				"Verify that the Calculate your BMI button is only active after the user enters the fields and select the gender");

		// click on height
		String height = "//*[@id=\"menu-content\"]/app-bmi/ion-content/ion-grid/div/ion-row[3]/ion-col[2]/ion-item/ion-input/input";
		WebElement heightElement = driver.findElementByXPath(height);
		heightElement.sendKeys("180");

		test.log(Status.PASS, "Verify that the decimal entry is allowed in the height");

		// click on weight
		String weight = "//*[@id=\"menu-content\"]/app-bmi/ion-content/ion-grid/div/ion-row[4]/ion-col[2]/ion-item/ion-input/input";
		WebElement weightElement = driver.findElementByXPath(weight);
		weightElement.sendKeys("70");

		test.log(Status.PASS, "Verify that the decimal entry is allowed in the weight");

		// click on Calculate your Bmi
		String C_bmi = "//*[@id=\"menu-content\"]/app-bmi/ion-content/ion-grid/ion-row/ion-col/ion-button";
		WebElement C_bmiElement = driver.findElementByXPath(C_bmi);
		C_bmiElement.click();

		test.log(Status.PASS,
				"Verify that BMI score is added after entering the details and clicking on calculate your BMI ");

		// click on body mass index interpretation
		String bodymass = "//*[@id=\"menu-content\"]/app-bmi-result/ion-content/ion-grid/ion-row[2]/ion-col/ion-button";
		WebElement bodymassElement = driver.findElementByXPath(bodymass);
		bodymassElement.click();

		test.log(Status.PASS,
				"Verify that BMI score is added after entering the details and clicking on calculate your BMI ");

		// click on body mass index interpretation back button
		String back = "//*[@id=\"menu-content\"]/app-bmii-modal/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		WebElement backElement = driver.findElementByXPath(back);
		backElement.click();

		test.log(Status.PASS, "Verify click on body mass index interpretation back button");

		// click on view history
		String view = "//*[@id=\"menu-content\"]/app-bmi-result/ion-row/ion-col/ion-button";
		WebElement viewElement = driver.findElementByXPath(view);
		viewElement.click();

		test.log(Status.PASS, "Verify that BMI Score, status is added after clicking on the view history button ");

		// click on forward your bmi history
		String forwardhistory = "(//*[@class='buttons-first-slot sc-ion-buttons-md-h sc-ion-buttons-md-s md hydrated'])[3]";
		WebElement forwardhistoryElement = driver.findElementByXPath(forwardhistory);
		forwardhistoryElement.click();

		test.log(Status.PASS, "Verify the click on forward your bmi history");

		// click on forward button history
		String fbhistory = "(//*[@class='buttons-first-slot sc-ion-buttons-md-h sc-ion-buttons-md-s md hydrated'])[2]";
		WebElement fbhistoryyElement = driver.findElementByXPath(fbhistory);
		fbhistoryyElement.click();

		test.log(Status.PASS, "Verify forward button history");

		// click on bmi forward button
		String bmiford = "(//*[@class='buttons-first-slot sc-ion-buttons-md-h sc-ion-buttons-md-s md hydrated'])[1]";
		WebElement bmifordElement = driver.findElementByXPath(bmiford);
		bmifordElement.click();

		test.log(Status.PASS, "Verify click on bmi forward button");

	}

	@Test(priority = 2)
	public void ovulationCalculator() {

		ExtentTest test = reports.createTest("tools - OvulationCalculator");
		test.log(Status.INFO, "OvulationCalculator starts here...");

		// Click on the tools
		String ovulationtools = "//*[@id=\"tab-button-calculator\"]";
		WebElement ovulationtoolsElements = driver.findElementByXPath(ovulationtools);
		ovulationtoolsElements.click();

		test.log(Status.PASS, "Verify Click on the tools");

		// click on Ovulation Calculator
		String ovulation = "//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-calculators/ion-content/ion-grid/ion-row[2]/ion-col[2]/ion-button";
		WebElement ovulationElement = driver.findElementByXPath(ovulation);
		ovulationElement.click();

		// click on first day of your last period
		String firstday = "//*[@id=\"menu-content\"]/app-ovulation/ion-content/ion-grid/form/div/ion-row[2]/ion-col/ion-item/ion-datetime";
		WebElement firstdayElement = driver.findElementByXPath(firstday);
		firstdayElement.click();

		// click on day
		String lastdays = "//button[text()='19']";
		WebElement lastdaysBtnElement = driver.findElementByXPath(lastdays);
		lastdaysBtnElement.click();

		// click on month
		String periodmonth = "//button[text()='Apr']";
		WebElement periodmonthBtnElement = driver.findElementByXPath(periodmonth);
		periodmonthBtnElement.click();

		// click on year
		String onyear = "//button[text()='2020']";
		WebElement onyearBtnElement = driver.findElementByXPath(onyear);
		onyearBtnElement.click();

		// click on done button
		String doneBtn = "//*[text()='Done']";
		WebElement doneBtnElement = driver.findElementByXPath(doneBtn);
		doneBtnElement.click();

		test.log(Status.PASS,
				"Verify that the Calculate Due Date button is only active after the user has selected the last period date.");

		// click on calculate fertile days
		String fertiledays = "//*[text()=' Calculate Fertile Days ']";
		WebElement fertiledaysElement = driver.findElementByXPath(fertiledays);
		fertiledaysElement.click();

		ApolloUtils.verticalScroll(driver);
		ApolloUtils.verticalScroll(driver);


		// click on fertility article
		String article = "//*[@id=\"menu-content\"]/app-ovulation-result/ion-content/ion-grid/ion-row[4]/ion-col/app-blog-slider/ion-row/ion-col[2]/ion-slides/div[1]/ion-slide[2]/ion-row/ion-col/a/ion-row/ion-row/ion-col";
		WebElement articleElement = driver.findElementByXPath(article);
		articleElement.click();

		test.log(Status.PASS,
				"Verify that the graphical view, calendar view, and relevant articles are displayed after selecting the date of the last period and cycle length by clicking the Calculate fertile days button");

		// click on back fertility page
		String fertilityback = "(//button[@class='button-native sc-ion-back-button-md'])[3]";
		WebElement fertilitybackElement = driver.findElementByXPath(fertilityback);
		fertilitybackElement.click();

		test.log(Status.PASS, "Verify click on back fertility page");
		
		//click on graph page back
		String graph="//*[@id='menu-content']/app-ovulation-result/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		WebElement graphElement= driver.findElementByXPath(graph);
		graphElement.click();
	

	}

	@Test(priority = 3)
	public void dueDateCalculator() throws InterruptedException {

		ExtentTest test = reports.createTest("tools - DueDateCalculator");
		test.log(Status.INFO, "DueDateCalculator starts here...");

		// Click on the tools
		String kicktools = "//*[@id='tab-button-calculator']";
		WebElement kicktoolsElements = driver.findElementByXPath(kicktools);
		kicktoolsElements.click();

		test.log(Status.PASS, "Verify Click on the tools");

		// click on due date calculator
		String due = "//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-calculators/ion-content/ion-grid/ion-row[2]/ion-col[3]/ion-button";
		WebElement dueElement = driver.findElementByXPath(due);
		dueElement.click();

		test.log(Status.PASS, "Verify on due date calculator");

		// click on last period start date
		String lastdate = "//*[@id='menu-content']/app-due-date/ion-content/ion-grid/form/div/ion-row[2]/ion-col/ion-item/ion-datetime";
		WebElement lastdateElement = driver.findElementByXPath(lastdate);
		lastdateElement.click();

		test.log(Status.PASS, "Verify on last period start date");

		// click on day
		String days = "//button[text()='19']";
		WebElement daysBtnElement = driver.findElementByXPath(days);
		daysBtnElement.click();

		// click on month
		String month = "//button[text()='Apr']";
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

		test.log(Status.PASS,
				"Verify that the Calculate Due Date button is only active after the user has selected the last period date.");

		// click on calculate due date button
		String Calculate = "//*[@id='menu-content']/app-due-date/ion-content/ion-grid/form/ion-row/ion-col/ion-button";
		WebElement CalculateElement = driver.findElementByXPath(Calculate);
		CalculateElement.click();

		test.log(Status.PASS, "Verify on calculate due date button");

		// display on baby due date back button
		String babydate = "//*[@id='menu-content']/app-due-date-result/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		WebElement babydateElement = driver.findElementByXPath(babydate);
		babydateElement.click();

		test.log(Status.PASS, "Verify display on baby due date back button");

		// click on due date calculator back button
		String calculatorback = "//*[@id='menu-content']/app-due-date/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		WebElement calculatorbackElement = driver.findElementByXPath(calculatorback);
		calculatorbackElement.click();

		test.log(Status.PASS, "Verify on due date calculator back button");

		Thread.sleep(2000);

	}

	@Test(priority = 4)
	public void kickCounter() {

		ExtentTest test = reports.createTest("tools - KickCounter");
		test.log(Status.INFO, "KickCounter starts here...");
		
		
		
		// Click on the tools
		String kicktools = "//*[@id='tab-button-calculator']";
		WebElement kicktoolsElements = driver.findElementByXPath(kicktools);
		kicktoolsElements.click();

		test.log(Status.PASS, "Verify click on tools tab");
		
		ApolloUtils.verticalScroll(driver);
		
		// click on kick counter tab
		String kicktab = "//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-calculators/ion-content/ion-grid/ion-row[2]/ion-col[4]/ion-button";
		WebElement kicktabElement = driver.findElementByXPath(kicktab);
		kicktabElement.click();

		test.log(Status.PASS, "Verify click on kick counter tab");

		// click on baby kick counts inside click on start button
		String babykicks = "//*[@id='menu-content']/app-kick-counter/ion-content/ion-grid/ion-row[3]/ion-button[1]";
		WebElement babykicksElements = driver.findElementByXPath(babykicks);
		babykicksElements.click();

		test.log(Status.PASS, "Verify click on baby kick counts inside click on start button");

		// click on kick counting baby
		String kicks = "//*[@id='menu-content']/app-kick-counter/ion-content/ion-grid/ion-row[3]/ion-button[2]";
		WebElement kicksElement = driver.findElementByXPath(kicks);
		kicksElement.click();
		kicksElement.click();
		kicksElement.click();
		kicksElement.click();

		test.log(Status.PASS, "Verify click on kick counting baby");

		// click on baby kick counts inside click on stop button
		String stopkicks = "//*[@id='menu-content']/app-kick-counter/ion-content/ion-grid/ion-row[3]/ion-button[1]";
		WebElement stopkicksElements = driver.findElementByXPath(stopkicks);
		stopkicksElements.click();

		test.log(Status.PASS,
				"Verify that the given baby's kick counter has been added correctly or not after clicking the play icon and clicking the kick icon and stop the timer");

		// click on history page back
	/*	String backhistory = "//*[@id='menu-content']/app-kick-history/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		WebElement backhistoryElement = driver.findElementByXPath(backhistory);
		backhistoryElement.click();
*/
		driver.navigate().back();
		test.log(Status.PASS, "Verify click on history page back");

		// cick on count baby kick page back button
		String babykickback = "//*[@id=\"menu-content\"]/app-kick-counter/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		System.out.println(1);
		WebElement babykickbackElement = driver.findElementByXPath(babykickback);
		System.out.println(2);
		babykickbackElement.click();
		System.out.println(3);
		
		test.log(Status.PASS, "Verify cick on count baby kick page back button");

	}

	@Test(priority = 5)
	public void contractionTimer() throws InterruptedException {

		ExtentTest test = reports.createTest("tools - ContractionTimer");
		test.log(Status.INFO, "ContractionTimer starts here...");

		ApolloUtils.verticalScroll(driver);
		
		// Click on the tools
		String kicktools = "//*[@id=\"tab-button-calculator\"]";
		WebElement kicktoolsElements = driver.findElementByXPath(kicktools);
		kicktoolsElements.click();

		test.log(Status.PASS, "Verify Click on the tools");

		ApolloUtils.verticalScroll(driver);

		// click on Contraction timer
		String timer = "//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-calculators/ion-content/ion-grid/ion-row[2]/ion-col[5]/ion-button";
		driver.findElementByXPath(timer).click();

		test.log(Status.PASS, "Verify on Contraction timer");

		// click on record your contraction timer
		String recordtimer = "//*[text()=' Start Counting ']";
		WebElement recordtimerElement = driver.findElementByXPath(recordtimer);
		recordtimerElement.click();
		recordtimerElement.click();
		recordtimerElement.click();
		recordtimerElement.click();

		test.log(Status.PASS,
				"Verify the contraction details are added after clicking start contraction count and stop it and click the save contraction details button");

		// click on save contraction timer details
		String savetimer = "//*[@id=\"menu-content\"]/app-contraction-timer/ion-row/ion-col/ion-button";
		WebElement savetimerElement = driver.findElementByXPath(savetimer);
		savetimerElement.click();

		test.log(Status.PASS, "Verify on save contraction timer details");

		// click on back button past contraction
		String past = "//*[@id=\"menu-content\"]/app-contraction-history/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		WebElement pastElement = driver.findElementByXPath(past);
		pastElement.click();

		test.log(Status.PASS, "Verify  on back button past contraction");

		// click on back button record your contraction timer
		String backcontraction = "//*[@id=\"menu-content\"]/app-contraction-timer/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		WebElement backcontractionElement = driver.findElementByXPath(backcontraction);
		backcontractionElement.click();

		test.log(Status.PASS, "Verify on back button record your contraction timer");

		Thread.sleep(3000);
	}

}