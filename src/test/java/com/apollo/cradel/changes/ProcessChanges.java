package com.apollo.cradel.changes;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.apollo.cradle.setup.BaseDriver;
import com.apollo.cradle.util.ApolloUtils;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ProcessChanges extends BaseDriver {

	 @Test(priority=1)
	public void ProcessChanges() {
		ExtentTest test = reports.createTest("Changes - Planning to Start Family");
		test.log(Status.INFO, "   Planning to Start Family starts here...");

		// click on main menu button
		String main = "//*[@id='menuButton']";
		WebElement mainElement = driver.findElementByXPath(main);
		mainElement.click();

		test.log(Status.PASS, "Verify on main menu button");

		// click on Myprofile
		String profile = "//ion-label[text()='My Profile']";
		WebElement profileElement = driver.findElementByXPath(profile);
		profileElement.click();

		test.log(Status.PASS, "Verify on Myprofile tab");

		// click on changes
		String changes = "//*[text()='Change']";
		WebElement changesElement = driver.findElementByXPath(changes);
		changesElement.click();

		test.log(Status.PASS, "Verify click on changes");

		// click on planning to start family
		String planning = "//span[text()='Planning to Start Family']";
		WebElement planningElement = driver.findElementByXPath(planning);
		planningElement.click();

		test.log(Status.PASS, "Verify click on planning to start family");

		// click on Natural Conception

		driver.findElementByXPath("//*[text()='Natural Conception']").click();

		test.log(Status.PASS, "Verify  click on Natural Conception");

		// click on first period date
		String firstperiod = "//*[@id=\"menu-content\"]/app-planning-family-phase/ion-content/ion-grid/ion-row[3]/ion-col/app-accordion[1]/ion-card/ion-card-content/ion-row/ion-col/app-accordion-body/form/ion-row[1]/ion-col/ion-item";
		WebElement firstperiodElement = driver.findElementByXPath(firstperiod);
		firstperiodElement.click();

		test.log(Status.PASS, "Verify click on first period date");

		// click on day
		String days = "//button[text()='19']";
		WebElement daysBtnElement = driver.findElementByXPath(days);
		daysBtnElement.click();

		test.log(Status.PASS, "Verify click on day");

		// click on month
		String month = "//button[text()='May']";
		WebElement monthBtnElement = driver.findElementByXPath(month);
		monthBtnElement.click();

		test.log(Status.PASS, "Verify  click on month");

		// click on year
		String year = "//button[text()='2020']";
		WebElement yearBtnElement = driver.findElementByXPath(year);
		yearBtnElement.click();

		test.log(Status.PASS, "Verify  click on year");

		// Click on date done button
		String DateDone = "//*[text()='Done']";
		WebElement DateDoneElement = driver.findElementByXPath(DateDone);
		DateDoneElement.click();

		test.log(Status.PASS, "Verify Click on date done button");

		// click on save details
		String savedetails = "(//*[text()='Save Details '])[1]";
		WebElement savedetailsElement = driver.findElementByXPath(savedetails);
		savedetailsElement.click();

		test.log(Status.PASS, "Verify click on save details ");
	}

	 @Test(priority=2)
	public void iamPregnant() {
		ExtentTest test = reports.createTest("Changes - IamPregnant");
		test.log(Status.INFO, " IamPregnant starts here...");

		// click on main menu button
		String main = "//*[@id='menuButton']";
		WebElement mainElement = driver.findElementByXPath(main);
		mainElement.click();

		test.log(Status.PASS, "Verify on main menu button");

		// click on Myprofile
		String profile = "//ion-label[text()='My Profile']";
		WebElement profileElement = driver.findElementByXPath(profile);
		profileElement.click();

		test.log(Status.PASS, "Verify on Myprofile tab");

		// click on changes
		String changes = "//*[text()='Change']";
		WebElement changesElement = driver.findElementByXPath(changes);
		changesElement.click();

		test.log(Status.PASS, "Verify click on changes");

		// click on iam pregnant
		String pregnant = "//span[text()='I am ' or text()=' Pregnant']";
		WebElement pregnantElement = driver.findElementByXPath(pregnant);
		pregnantElement.click();

		test.log(Status.PASS, "Verify click on iam pregnant");

		// click on Conceived Naturally
		String ConceivedNaturally = "//*[text()='Conceived Naturally']";
		WebElement ConceivedNaturallyElement = driver.findElementByXPath(ConceivedNaturally);
		ConceivedNaturallyElement.click();

		test.log(Status.PASS, "Verify click on Conceived Naturally");

		// click on First day of yout last period
		String lastperiod = "//*[@id=\"menu-content\"]/app-pregnant-phase/ion-content/ion-grid/ion-row[3]/ion-col/app-accordion[1]/ion-card/ion-card-content/ion-row/ion-col/app-accordion-body/form/ion-row[1]/ion-col[1]/ion-item/ion-datetime";
		WebElement lastperiodElement = driver.findElementByXPath(lastperiod);
		lastperiodElement.click();

		// click on day
		String days = "//button[text()='19']";
		WebElement daysBtnElement = driver.findElementByXPath(days);
		daysBtnElement.click();

		test.log(Status.PASS, "Verify click on day");

		// click on month
		String month = "//button[text()='Apr']";
		WebElement monthBtnElement = driver.findElementByXPath(month);
		monthBtnElement.click();

		test.log(Status.PASS, "Verify  click on month");

		// click on year
		String year = "//button[text()='2020']";
		WebElement yearBtnElement = driver.findElementByXPath(year);
		yearBtnElement.click();

		test.log(Status.PASS, "Verify  click on year");

		// Click on date done button
		String DateDone = "//*[text()='Done']";
		WebElement DateDoneElement = driver.findElementByXPath(DateDone);
		DateDoneElement.click();

		test.log(Status.PASS, "Verify Click on date done button");

		// click on save details
		String duesavedetails = "//*[text()='Save Details ']";
		WebElement duesavedetailsElement = driver.findElementByXPath(duesavedetails);
		duesavedetailsElement.click();

		test.log(Status.PASS, "Verify click on save details ");

	}

	@Test(priority=3)
	public void postDelivery() {
		ExtentTest test = reports.createTest("Changes - PostDelivery");
		test.log(Status.INFO, " PostDelivery starts here...");

		// click on main menu button
		String pmain = "//*[@id='menuButton']";
		WebElement pmainElement = driver.findElementByXPath(pmain);
		pmainElement.click();

		test.log(Status.PASS, "Verify on main menu button");

		// click on Myprofile
		String pprofile = "//ion-label[text()='My Profile']";
		WebElement pprofileElement = driver.findElementByXPath(pprofile);
		pprofileElement.click();

		test.log(Status.PASS, "Verify on Myprofile tab");

		// click on changes
		String pchanges = "//*[text()='Change']";
		WebElement pchangesElement = driver.findElementByXPath(pchanges);
		pchangesElement.click();

		test.log(Status.PASS, "Verify click on changes");

		// click on Post my delivery
		String post = "//*[@id=\"menu-content\"]/app-change-phase/ion-content/ion-grid/ion-row/app-phase-boxes/ion-row/ion-col[2]/ion-row/ion-col[3]";
		WebElement postElement = driver.findElementByXPath(post);
		postElement.click();

		test.log(Status.PASS, "Verify click on Post my delivery");

		// click on infant name
		String infant = "//*[@id=\"menu-content\"]/app-post-delivery-phase/ion-content/ion-grid/form/div/ion-row[1]/ion-col/ion-item/ion-input/input";
		WebElement infantElement = driver.findElementByXPath(infant);
		infantElement.sendKeys("kiran");

		test.log(Status.PASS, "Verify click on infant name");

		// click on infant date of birth
		String infantbirth = "//*[@id=\"menu-content\"]/app-post-delivery-phase/ion-content/ion-grid/form/div/ion-row[2]/ion-col/ion-item/ion-datetime";
		WebElement infantbirthElement = driver.findElementByXPath(infantbirth);
		infantbirthElement.click();

		// click on day
		String days = "//button[text()='19']";
		WebElement daysBtnElement = driver.findElementByXPath(days);
		daysBtnElement.click();

		test.log(Status.PASS, "Verify click on day");

		// click on month
		String month = "//button[text()='Apr']";
		WebElement monthBtnElement = driver.findElementByXPath(month);
		monthBtnElement.click();

		test.log(Status.PASS, "Verify  click on month");

		// click on year
		String year = "//button[text()='2020']";
		WebElement yearBtnElement = driver.findElementByXPath(year);
		yearBtnElement.click();

		test.log(Status.PASS, "Verify  click on year");

		// Click on date done button
		String DateDone = "//*[text()='Done']";
		WebElement DateDoneElement = driver.findElementByXPath(DateDone);
		DateDoneElement.click();

		test.log(Status.PASS, "Verify Click on date done button");

		// click on delivery type
		String delivery = "//*[text()='Normal Delivery']";
		WebElement deliveryElement = driver.findElementByXPath(delivery);
		deliveryElement.click();

		test.log(Status.PASS, "Verify click on delivery type");

		// click on baby's gender
		String gender = "//*[text()='Male']";
		WebElement genderElement = driver.findElementByXPath(gender);
		genderElement.click();

		test.log(Status.PASS, "Verify click on baby's gender");

		// enter height of the baby cm
		String height = "//*[@id=\"menu-content\"]/app-post-delivery-phase/ion-content/ion-grid/form/div/ion-row[6]/ion-col[2]/ion-item/ion-input/input";
		WebElement heightElement = driver.findElementByXPath(height);
		heightElement.sendKeys("130");

		test.log(Status.PASS, "Verify enter height of the baby cm");

		ApolloUtils.verticalScroll(driver);

		// enter weight of the baby kgs
		String weight = "//*[@id='menu-content']/app-post-delivery-phase/ion-content/ion-grid/form/div/ion-row[7]/ion-col[2]/ion-item/ion-input/input";
		WebElement weightElement = driver.findElementByXPath(weight);
		weightElement.sendKeys("60");

		test.log(Status.PASS, "Verify enter  weight of the baby kgs");

		// enter head of the baby cm
		String head = "//*[@id='menu-content']/app-post-delivery-phase/ion-content/ion-grid/form/div/ion-row[8]/ion-col[2]/ion-item/ion-input/input";
		WebElement headElement = driver.findElementByXPath(head);
		headElement.sendKeys("40");

		test.log(Status.PASS, "Verify enter head of the baby cm");

		ApolloUtils.verticalScroll(driver);

		// click on save details
		String saveBtn = "//*[text()='Save Details ']";
		WebElement saveBtnElement = driver.findElementByXPath(saveBtn);
		saveBtnElement.click();

		test.log(Status.PASS, "Verify click on save details");

	}

	 @Test(priority=4)
	public void raisingChild() {
		ExtentTest test = reports.createTest("Changes - RaisingChild");
		test.log(Status.INFO, " RaisingChild starts here...");

		// click on main menu button
		String pmain = "//*[@id='menuButton']";
		WebElement pmainElement = driver.findElementByXPath(pmain);
		pmainElement.click();

		test.log(Status.PASS, "Verify on main menu button");

		// click on Myprofile
		String pprofile = "//ion-label[text()='My Profile']";
		WebElement pprofileElement = driver.findElementByXPath(pprofile);
		pprofileElement.click();

		test.log(Status.PASS, "Verify on Myprofile tab");

		// click on changes
		String pchanges = "//*[text()='Change']";
		WebElement pchangesElement = driver.findElementByXPath(pchanges);
		pchangesElement.click();

		test.log(Status.PASS, "Verify click on changes");

		// click on Raising a child
		String raisingchild = "//*[@id=\"menu-content\"]/app-change-phase/ion-content/ion-grid/ion-row/app-phase-boxes/ion-row/ion-col[2]/ion-row/ion-col[4]";
		WebElement raisingchildElement = driver.findElementByXPath(raisingchild);
		raisingchildElement.click();

		test.log(Status.PASS, "Verify click on Raising a child");

		// click on child,s name
		String child = "//*[@id=\"menu-content\"]/app-raising-toddler-phase/ion-content/ion-grid/form/div/ion-row[1]/ion-col/ion-item/ion-input/input";
		WebElement childElement = driver.findElementByXPath(child);
		childElement.sendKeys("kiran");

		test.log(Status.PASS, "Verify click on child's name");

		// click on child,s date of birth
		String childbirth = "//*[@id=\"menu-content\"]/app-raising-toddler-phase/ion-content/ion-grid/form/div/ion-row[2]/ion-col[1]/ion-item/ion-datetime";
		WebElement childbirthElement = driver.findElementByXPath(childbirth);
		childbirthElement.click();

		// click on day
		String day = "//button[text()='19']";
		WebElement dayBtnElement = driver.findElementByXPath(day);
		dayBtnElement.click();

		test.log(Status.PASS, "Verify click on day");

		// click on month
		String months = "//button[text()='Apr']";
		WebElement monthsBtnElement = driver.findElementByXPath(months);
		monthsBtnElement.click();

		test.log(Status.PASS, "Verify  click on months");

		// click on year
		String years = "//button[text()='2017']";
		WebElement yearsBtnElement = driver.findElementByXPath(years);
		yearsBtnElement.click();

		test.log(Status.PASS, "Verify  click on year");

		// Click on date done button
		String DateDoneBtn = "//*[text()='Done']";
		WebElement DateDoneBtnElement = driver.findElementByXPath(DateDoneBtn);
		DateDoneBtnElement.click();

		test.log(Status.PASS, "Verify Click on date done button");

		// click on baby's gender
		String babygender = "//*[text()='Male']";
		WebElement babygenderElement = driver.findElementByXPath(babygender);
		babygenderElement.click();

		ApolloUtils.verticalScroll(driver);

		// enter height of the baby cm
		String height = "//*[@id=\"menu-content\"]/app-raising-toddler-phase/ion-content/ion-grid/form/div/ion-row[4]/ion-col[2]/ion-item/ion-input/input";
		WebElement heightElement = driver.findElementByXPath(height);
		heightElement.sendKeys("130");

		// enter weight of the baby kgs
		String babyweight = "//*[@id='menu-content']/app-raising-toddler-phase/ion-content/ion-grid/form/div/ion-row[5]/ion-col[2]/ion-item/ion-input/input";
		WebElement babyweightElement = driver.findElementByXPath(babyweight);
		babyweightElement.sendKeys("65");

		test.log(Status.PASS, "Verify enter  weight of the baby kgs");

		// enter head of the baby cm
		String babyhead = "//*[@id='menu-content']/app-raising-toddler-phase/ion-content/ion-grid/form/div/ion-row[6]/ion-col[2]/ion-item/ion-input/input";
		WebElement babyheadElement = driver.findElementByXPath(babyhead);
		babyheadElement.sendKeys("40");

		test.log(Status.PASS, "Verify enter head of the baby cm");

		ApolloUtils.verticalScroll(driver);

		// click on save details
		String savedetailsBtn = "//*[text()='Save Details ']";
		WebElement savedetailsBtnElement = driver.findElementByXPath(savedetailsBtn);
		savedetailsBtnElement.click();

		test.log(Status.PASS, "Verify click on save details");

	}

	@Test(priority=5)
	public void planningForNextBaby() {
		ExtentTest test = reports.createTest("Changes - PlanningForNextBaby");
		test.log(Status.INFO, " PlanningForNextBaby starts here...");

		// click on main menu button
		String pmain = "//*[@id='menuButton']";
		WebElement pmainElement = driver.findElementByXPath(pmain);
		pmainElement.click();

		test.log(Status.PASS, "Verify on main menu button");

		// click on Myprofile
		String pprofile = "//ion-label[text()='My Profile']";
		WebElement pprofileElement = driver.findElementByXPath(pprofile);
		pprofileElement.click();

		test.log(Status.PASS, "Verify on Myprofile tab");

		// click on changes
		String pchanges = "//*[text()='Change']";
		WebElement pchangesElement = driver.findElementByXPath(pchanges);
		pchangesElement.click();

		test.log(Status.PASS, "Verify click on changes");

		// click on planning for next baby
		String nextbaby = "//*[@id=\"menu-content\"]/app-change-phase/ion-content/ion-grid/ion-row/app-phase-boxes/ion-row/ion-col[2]/ion-row/ion-col[5]";
		WebElement nextbabyElement = driver.findElementByXPath(nextbaby);
		nextbabyElement.click();

		test.log(Status.PASS, "Verify click on planning for next baby");

		// click on first day of your last period
		String lastperiod = "(//*[text()='First day of your last period'])[1]";
		WebElement lastperiodElement = driver.findElementByXPath(lastperiod);
		lastperiodElement.click();

		test.log(Status.PASS, "Verify click on first day of your last period");
		
		// click on calendar
		String calendar = "//*[@id=\"menu-content\"]/app-planning-next-baby-phase/ion-content/ion-grid/ion-row[3]/ion-col/app-accordion/ion-card/ion-card-content/ion-row/ion-col/app-accordion-body/form/ion-row[1]/ion-col/ion-item/ion-datetime";
		WebElement calendarElement = driver.findElementByXPath(calendar);
		calendarElement.click();

		// click on day
		String cday = "//button[text()='19']";
		WebElement cdayBtnElement = driver.findElementByXPath(cday);
		cdayBtnElement.click();

		test.log(Status.PASS, "Verify click on day");

		// click on month
		String cmonths = "//button[text()='Apr']";
		WebElement cmonthsBtnElement = driver.findElementByXPath(cmonths);
		cmonthsBtnElement.click();

		test.log(Status.PASS, "Verify  click on months");

		// click on year
		String cyears = "//button[text()='2020']";
		WebElement cyearsBtnElement = driver.findElementByXPath(cyears);
		cyearsBtnElement.click();

		test.log(Status.PASS, "Verify  click on year");

		// Click on date done button
		String cDateDoneBtn = "//*[text()='Done']";
		WebElement cDateDoneBtnElement = driver.findElementByXPath(cDateDoneBtn);
		cDateDoneBtnElement.click();

		test.log(Status.PASS, "Verify Click on date done button");

		// click on save details
		String savedetailsBtn = "//*[text()='Save Details ']";
		WebElement savedetailsBtnElement = driver.findElementByXPath(savedetailsBtn);
		savedetailsBtnElement.click();

		test.log(Status.PASS, "Verify click on save details");

	}
}