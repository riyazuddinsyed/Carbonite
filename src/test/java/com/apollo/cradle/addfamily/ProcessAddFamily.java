package com.apollo.cradle.addfamily;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.apollo.cradle.setup.BaseDriver;
import com.apollo.cradle.util.ApolloUtils;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ProcessAddFamily extends BaseDriver {

	 @Test(priority=1)
	public void PlanningtoStartFamily() {
		ExtentTest test = reports.createTest("AddFamily - Planning to Start Family");
		test.log(Status.INFO, "   Planning to Start Family starts here...");

		// click on main menu button
		String pmain = "//ion-menu-button[@id='menuButton']";
		WebElement pmainElement = driver.findElementByXPath(pmain);
		pmainElement.click();

		test.log(Status.PASS, "Verify on main menu button");

		// click on My profile
		String pprofile = "//*[text()='My Profile']";
		WebElement pprofileElement = driver.findElementByXPath(pprofile);
		pprofileElement.click();

		test.log(Status.PASS, "Verify on Myprofile tab");

		// click on plus symbol
		String plus = "//*[@id=\"menu-content\"]/app-profile/ion-content/ion-grid/ion-row[2]/ion-col[1]/ion-row/ion-col[2]/ion-button";
		WebElement plusElement = driver.findElementByXPath(plus);
		plusElement.click();

		test.log(Status.PASS, "Verify click on plus symbol");

		// click on select location
		//*[@id="storeProfileInfo"]/ion-row[1]/ion-col/ion-item/ion-select
		String location = "//*[@id=\"storeProfileInfo\"]/ion-row[1]/ion-col/ion-item/ion-select";
		WebElement locationElement = driver.findElementByXPath(location);
		locationElement.click();

		// select on location radio button location
		String radioBtn = "//button[@type='button'][3]//div[@class='alert-radio-icon sc-ion-alert-md']";
		WebElement radioBtnElement = driver.findElementByXPath(radioBtn);
		radioBtnElement.click();

		// click on ok button
		String okBtn = "//*[text()='OK']";
		WebElement okBtnElement = driver.findElementByXPath(okBtn);
		okBtnElement.click();

		// select on branch
		String branch = "//*[@id='secondSelecet']";
		WebElement branchElement = driver.findElementByXPath(branch);
		branchElement.click();

		// select on location radio button location
		String branchradioBtn = "//button[@type='button'][3]//div[@class='alert-radio-icon sc-ion-alert-md']";
		WebElement branchradioBtnElement = driver.findElementByXPath(branchradioBtn);
		branchradioBtnElement.click();

		// click on ok button
		String branchokBtn = "//*[text()='OK']";
		WebElement branchokBtnElement = driver.findElementByXPath(branchokBtn);
		branchokBtnElement.click();

		// enter the name
		String name = "//*[@id=\"storeProfileInfo\"]/ion-row[3]/ion-col/ion-item/ion-input/input";
		WebElement nameElement = driver.findElementByXPath(name);
		nameElement.sendKeys("reddy");

		// select your are gender
		String gender = "//span[text()='Male']";
		WebElement genderElement = driver.findElementByXPath(gender);
		genderElement.click();

		// Enter your date of birth
		String dofbirth = "//*[@id=\"storeProfileInfo\"]/ion-row[5]/ion-col[2]/ion-row/ion-col[1]/ion-item/ion-input/input";
		WebElement dofbirthElement = driver.findElementByXPath(dofbirth);
		dofbirthElement.click();
		dofbirthElement.sendKeys("26");

		// Enter your month
		String month = "//*[@id=\"storeProfileInfo\"]/ion-row[5]/ion-col[2]/ion-row/ion-col[1]/ion-item/ion-input/input";
		WebElement monthElement = driver.findElementByXPath(month);
		monthElement.click();
		monthElement.sendKeys("02");

		// Enter your year
		String year = "//*[@id=\"storeProfileInfo\"]/ion-row[5]/ion-col[2]/ion-row/ion-col[3]/ion-item/ion-input/input";
		WebElement yearElement = driver.findElementByXPath(year);
		yearElement.click();
		yearElement.sendKeys("1996");

		ApolloUtils.verticalScroll(driver);

		// Select on phases
		String phases = "//span[text()='Planning to Start Family']";
		WebElement phasesElement = driver.findElementByXPath(phases);
		phasesElement.click();

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
		String days = "//button[text()='"+testdata.get("PlanningStartFamilyDay")+"']";
		WebElement daysBtnElement = driver.findElementByXPath(days);
		daysBtnElement.click();

		test.log(Status.PASS, "Verify click on day");

		// click on month
		String months = "//button[text()='"+testdata.get("PlanningStartFamilyMonth")+"']";
		WebElement monthsBtnElement = driver.findElementByXPath(months);
		monthsBtnElement.click();

		test.log(Status.PASS, "Verify  click on month");

		// click on year
		String years = "//button[text()='2020']";
		WebElement yearsBtnElement = driver.findElementByXPath(years);
		yearsBtnElement.click();

		test.log(Status.PASS, "Verify  click on year");

		// Click on date done button
		String DateDone = "//*[text()='Done']";
		WebElement DateDoneElement = driver.findElementByXPath(DateDone);
		DateDoneElement.click();

		test.log(Status.PASS, "Verify Click on date done button");

		// click on save details
		String savedetails = "//*[text()='Save Details ']";
		WebElement savedetailsElement = driver.findElementByXPath(savedetails);
		savedetailsElement.click();

		test.log(Status.PASS, "Verify click on save details ");

	}

	 @Test(priority=2)
	public void iamPregnant() {
		ExtentTest test = reports.createTest("AddFamily - I am Pregnant");
		test.log(Status.INFO, " I am Pregnant starts here...");

		/*
		 * // click on main menu button String imain = "//*[@id=\"menuButton\"]";
		 * WebElement imainElement = driver.findElementByXPath(imain);
		 * imainElement.click();
		 * 
		 * test.log(Status.PASS, "Verify on main menu button");
		 * 
		 * // click on My profile String iprofile = "//ion-label[text()='My Profile']";
		 * WebElement iprofileElement = driver.findElementByXPath(iprofile);
		 * iprofileElement.click();
		 * 
		 * test.log(Status.PASS, "Verify on Myprofile tab");
		 */
		// click on plus symbol
		String iplus = "//*[@id=\"menu-content\"]/app-profile/ion-content/ion-grid/ion-row[2]/ion-col[1]/ion-row/ion-col[2]/ion-button";
		WebElement iplusElement = driver.findElementByXPath(iplus);
		iplusElement.click();
		test.log(Status.PASS, "Verify click on plus symbol");

		// click on select location
		String slocation = "//*[@id=\"storeProfileInfo\"]/ion-row[1]/ion-col/ion-item/ion-select";
		WebElement slocationElement = driver.findElementByXPath(slocation);
		slocationElement.click();

		// select on location radio button location
		String lradioBtn = "//button[@type='button'][3]//div[@class='alert-radio-icon sc-ion-alert-md']";
		WebElement lradioBtnElement = driver.findElementByXPath(lradioBtn);
		lradioBtnElement.click();

		// click on ok button
		String cokBtn = "//*[text()='OK']";
		WebElement cokBtnElement = driver.findElementByXPath(cokBtn);
		cokBtnElement.click();

		// select on branch
		String sbranch = "//*[@id='secondSelecet']";
		WebElement sbranchElement = driver.findElementByXPath(sbranch);
		sbranchElement.click();

		// select on location radio button location
		String sbranchradioBtn = "//button[@type='button'][3]//div[@class='alert-radio-icon sc-ion-alert-md']";
		WebElement sbranchradioBtnElement = driver.findElementByXPath(sbranchradioBtn);
		sbranchradioBtnElement.click();

		// click on ok button
		String cbranchokBtn = "//*[text()='OK']";
		WebElement cbranchokBtnElement = driver.findElementByXPath(cbranchokBtn);
		cbranchokBtnElement.click();

		// enter the name
		String diname = "//ion-label[text()='Name']";
		WebElement dinameElement = driver.findElementByXPath(diname);
		dinameElement.sendKeys("madhu");
		// driver.findElement(By.xpath("//*[text()='Name']")).sendKeys("madhureddy");

		// select your are gender
		String sgender = "//span[text()='Male']";
		WebElement sgenderElement = driver.findElementByXPath(sgender);
		sgenderElement.click();

		// Enter your date of birth
		String edofbirth = "//*[@id=\"storeProfileInfo\"]/ion-row[5]/ion-col[2]/ion-row/ion-col[1]/ion-item/ion-input/input";
		WebElement edofbirthElement = driver.findElementByXPath(edofbirth);
		edofbirthElement.click();
		edofbirthElement.sendKeys("14");

		// Enter your month
		String emonth = "//*[@id=\"storeProfileInfo\"]/ion-row[5]/ion-col[2]/ion-row/ion-col[1]/ion-item/ion-input/input";
		WebElement emonthElement = driver.findElementByXPath(emonth);
		emonthElement.click();
		emonthElement.sendKeys("02");

		// Enter your year
		String eyear = "//*[@id=\"storeProfileInfo\"]/ion-row[5]/ion-col[2]/ion-row/ion-col[3]/ion-item/ion-input/input";
		WebElement eyearElement = driver.findElementByXPath(eyear);
		eyearElement.click();
		eyearElement.sendKeys("1996");
		ApolloUtils.verticalScroll(driver);

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
		String days = "//button[text()='"+testdata.get("PregnantDay")+"']";
		WebElement daysBtnElement = driver.findElementByXPath(days);
		daysBtnElement.click();

		test.log(Status.PASS, "Verify click on day");

		// click on month
		String month = "//button[text()='"+testdata.get("PregnantMonth")+"']";
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
		ExtentTest test = reports.createTest("AddFamily - postDelivery");
		test.log(Status.INFO, " postDelivery starts here...");

		/*
		 * // click on main menu button String postmain = "//*[@id=\"menuButton\"]";
		 * WebElement postmainmainElement = driver.findElementByXPath(postmain);
		 * postmainmainElement.click();
		 * 
		 * test.log(Status.PASS, "Verify on main menu button");
		 * 
		 * // click on My profile String postprofile =
		 * "//ion-label[text()='My Profile']"; WebElement postprofileElement =
		 * driver.findElementByXPath(postprofile); postprofileElement.click();
		 * 
		 * test.log(Status.PASS, "Verify on Myprofile tab");
		 */
		// click on plus symbol
		String dplus = "//*[@id=\"menu-content\"]/app-profile/ion-content/ion-grid/ion-row[2]/ion-col[1]/ion-row/ion-col[2]/ion-button";
		WebElement dplusElement = driver.findElementByXPath(dplus);
		dplusElement.click();

		test.log(Status.PASS, "Verify click on plus symbol");

		// click on select location
		String dlocation = "//*[@id=\"storeProfileInfo\"]/ion-row[1]/ion-col/ion-item/ion-select";
		WebElement dlocationElement = driver.findElementByXPath(dlocation);
		dlocationElement.click();

		test.log(Status.PASS, "Verify click on select location");

		// select on location radio button location
		String dradioBtn = "//button[@type='button'][3]//div[@class='alert-radio-icon sc-ion-alert-md']";
		WebElement dradioBtnElement = driver.findElementByXPath(dradioBtn);
		dradioBtnElement.click();

		// click on ok button
		String dokBtn = "//*[text()='OK']";
		WebElement dokBtnElement = driver.findElementByXPath(dokBtn);
		dokBtnElement.click();

		test.log(Status.PASS, "Verify click on select location");

		// select on branch
		String dbranch = "//*[@id='secondSelecet']";
		WebElement dbranchElement = driver.findElementByXPath(dbranch);
		dbranchElement.click();

		// select on location radio button location
		String dbranchradioBtn = "//button[@type='button'][3]//div[@class='alert-radio-icon sc-ion-alert-md']";
		WebElement dbranchradioBtnElement = driver.findElementByXPath(dbranchradioBtn);
		dbranchradioBtnElement.click();

		// click on ok button
		String bbranchokBtn = "//*[text()='OK']";
		WebElement bbranchokBtnElement = driver.findElementByXPath(bbranchokBtn);
		bbranchokBtnElement.click();

		test.log(Status.PASS, "Verify select on branch");

		// enter the name
		String dname = "//*[@id=\"storeProfileInfo\"]/ion-row[3]/ion-col/ion-item/ion-input/input";
		WebElement dnameElement = driver.findElementByXPath(dname);
		dnameElement.sendKeys("madhu");

		test.log(Status.PASS, "Verify enter the name");

		// select your are gender
		String ggender = "//span[text()='Male']";
		WebElement ggenderElement = driver.findElementByXPath(ggender);
		ggenderElement.click();

		test.log(Status.PASS, "Verify select your are gender");

		// Enter your date of birth
		String ydofbirth = "//*[@id=\"storeProfileInfo\"]/ion-row[5]/ion-col[2]/ion-row/ion-col[1]/ion-item/ion-input/input";
		WebElement ydofbirthElement = driver.findElementByXPath(ydofbirth);
		ydofbirthElement.click();
		ydofbirthElement.sendKeys("27");

		// Enter your month
		String ymonth = "//*[@id=\"storeProfileInfo\"]/ion-row[5]/ion-col[2]/ion-row/ion-col[1]/ion-item/ion-input/input";
		WebElement ymonthElement = driver.findElementByXPath(ymonth);
		ymonthElement.click();
		ymonthElement.sendKeys("02");

		// Enter your year
		String yyear = "//*[@id=\"storeProfileInfo\"]/ion-row[5]/ion-col[2]/ion-row/ion-col[3]/ion-item/ion-input/input";
		WebElement yyearElement = driver.findElementByXPath(yyear);
		yyearElement.click();
		yyearElement.sendKeys("1996");

		test.log(Status.PASS, "Verify Enter your date of birth");

		ApolloUtils.verticalScroll(driver);
		ApolloUtils.verticalScroll(driver);

		// click on Post Delivery
		String post = "//*[text()='Post Delivery / New-born Care (0-1yr)']";
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
		String days = "//button[text()='"+testdata.get("postDeliveryDays")+"']";
		WebElement daysBtnElement = driver.findElementByXPath(days);
		daysBtnElement.click();

		test.log(Status.PASS, "Verify click on day");

		// click on month
		String month = "//button[text()='"+testdata.get("postDeliveryMonths")+"']";
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
		String gender = "(//span[text()='Male'])[2]";
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
		String weight = "//*[@id=\"menu-content\"]/app-post-delivery-phase/ion-content/ion-grid/form/div/ion-row[7]/ion-col[2]/ion-item/ion-input/input";
		WebElement weightElement = driver.findElementByXPath(weight);
		weightElement.sendKeys("3");

		test.log(Status.PASS, "Verify enter  weight of the baby kgs");

		// enter head of the baby cm
		String head = "//*[@id=\"menu-content\"]/app-post-delivery-phase/ion-content/ion-grid/form/div/ion-row[8]/ion-col[2]/ion-item/ion-input/input";
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
		ExtentTest test = reports.createTest("AddFamily - RaisingChild");
		test.log(Status.INFO, " RaisingChild starts here...");

		// click on plus symbol
		String rplus = "//*[@id=\"menu-content\"]/app-profile/ion-content/ion-grid/ion-row[2]/ion-col[1]/ion-row/ion-col[2]/ion-button";
		WebElement rplusElement = driver.findElementByXPath(rplus);
		rplusElement.click();

		test.log(Status.PASS, "Verify click on plus symbol");

		// click on select location
		String rlocation = "//*[@id=\"storeProfileInfo\"]/ion-row[1]/ion-col/ion-item/ion-select";
		WebElement rlocationElement = driver.findElementByXPath(rlocation);
		rlocationElement.click();

		test.log(Status.PASS, "Verify click on select location");

		// select on location radio button location
		String rradioBtn = "//button[@type='button'][3]//div[@class='alert-radio-icon sc-ion-alert-md']";
		WebElement rradioBtnElement = driver.findElementByXPath(rradioBtn);
		rradioBtnElement.click();

		// click on ok button
		String rokBtn = "//*[text()='OK']";
		WebElement rokBtnElement = driver.findElementByXPath(rokBtn);
		rokBtnElement.click();

		test.log(Status.PASS, "Verify click on select location");

		// select on branch
		String rbranch = "//*[@id='secondSelecet']";
		WebElement rbranchElement = driver.findElementByXPath(rbranch);
		rbranchElement.click();

		// select on location radio button location
		String rbranchradioBtn = "//button[@type='button'][3]//div[@class='alert-radio-icon sc-ion-alert-md']";
		WebElement rbranchradioBtnElement = driver.findElementByXPath(rbranchradioBtn);
		rbranchradioBtnElement.click();

		// click on ok button
		String rbranchokBtn = "//*[text()='OK']";
		WebElement rbranchokBtnElement = driver.findElementByXPath(rbranchokBtn);
		rbranchokBtnElement.click();

		test.log(Status.PASS, "Verify select on branch");

		// enter the name
		String rname = "//*[@id=\"storeProfileInfo\"]/ion-row[3]/ion-col/ion-item/ion-input/input";
		WebElement rnameElement = driver.findElementByXPath(rname);
		rnameElement.sendKeys("madhukumar");

		test.log(Status.PASS, "Verify enter the name");

		// select your are gender
		String rgender = "//span[text()='Male']";
		WebElement rgenderElement = driver.findElementByXPath(rgender);
		rgenderElement.click();

		test.log(Status.PASS, "Verify select your are gender");

		// Enter your date of birth
		String rdofbirth = "//*[@id=\"storeProfileInfo\"]/ion-row[5]/ion-col[2]/ion-row/ion-col[1]/ion-item/ion-input/input";
		WebElement rdofbirthElement = driver.findElementByXPath(rdofbirth);
		rdofbirthElement.click();
		rdofbirthElement.sendKeys("14");

		// Enter your month
		String rmonth = "//*[@id=\"storeProfileInfo\"]/ion-row[5]/ion-col[2]/ion-row/ion-col[1]/ion-item/ion-input/input";
		WebElement rmonthElement = driver.findElementByXPath(rmonth);
		rmonthElement.click();
		rmonthElement.sendKeys("02");

		// Enter your year
		String ryear = "//*[@id=\"storeProfileInfo\"]/ion-row[5]/ion-col[2]/ion-row/ion-col[3]/ion-item/ion-input/input";
		WebElement ryearElement = driver.findElementByXPath(ryear);
		ryearElement.click();
		ryearElement.sendKeys("1996");

		test.log(Status.PASS, "Verify Enter your date of birth");

		ApolloUtils.verticalScroll(driver);
		ApolloUtils.verticalScroll(driver);

		// click on Raising a child
		String raisingchild = "//*[@id=\"menu-content\"]/app-add-family-member/ion-content/ion-row/ion-col/ion-row[2]/app-phase-boxes/ion-row/ion-col[2]/ion-row/ion-col[4]";
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
		String day = "//button[text()='"+testdata.get("RaisingChildDay")+"']";
		WebElement dayBtnElement = driver.findElementByXPath(day);
		dayBtnElement.click();

		test.log(Status.PASS, "Verify click on day");

		// click on month
		String months = "//button[text()='"+testdata.get("RaisingChildMonth")+"']";
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
		String babygender = "(//span[text()='Male'])[2]";
		WebElement babygenderElement = driver.findElementByXPath(babygender);
		babygenderElement.click();

		ApolloUtils.verticalScroll(driver);

		// enter height of the baby cm
		String height = "//*[@id=\"menu-content\"]/app-raising-toddler-phase/ion-content/ion-grid/form/div/ion-row[4]/ion-col[2]/ion-item/ion-input/input";
		WebElement heightElement = driver.findElementByXPath(height);
		heightElement.sendKeys("130");

		// enter weight of the baby kgs
		String babyweight = "//*[@id=\"menu-content\"]/app-raising-toddler-phase/ion-content/ion-grid/form/div/ion-row[5]/ion-col[2]/ion-item/ion-input/input";
		WebElement babyweightElement = driver.findElementByXPath(babyweight);
		babyweightElement.sendKeys("3");

		test.log(Status.PASS, "Verify enter  weight of the baby kgs");

		// enter head of the baby cm
		String babyhead = "//*[@id=\"menu-content\"]/app-raising-toddler-phase/ion-content/ion-grid/form/div/ion-row[6]/ion-col[2]/ion-item/ion-input/input";
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

	 @Test(priority = 5)
	public void planningForNextBaby() {
		ExtentTest test = reports.createTest("AddFamily - PlanningForNextBaby");
		test.log(Status.INFO, " PlanningForNextBaby starts here...");

		// click on plus symbol
		String nplus = "//*[@id=\"menu-content\"]/app-profile/ion-content/ion-grid/ion-row[2]/ion-col[1]/ion-row/ion-col[2]/ion-button";
		WebElement nplusElement = driver.findElementByXPath(nplus);
		nplusElement.click();

		test.log(Status.PASS, "Verify click on plus symbol");

		// click on select location
		String nlocation = "//*[@id=\"storeProfileInfo\"]/ion-row[1]/ion-col/ion-item/ion-select";
		WebElement nlocationElement = driver.findElementByXPath(nlocation);
		nlocationElement.click();

		test.log(Status.PASS, "Verify click on select location");

		// select on location radio button location
		String nradioBtn = "//button[@type='button'][3]//div[@class='alert-radio-icon sc-ion-alert-md']";
		WebElement nradioBtnElement = driver.findElementByXPath(nradioBtn);
		nradioBtnElement.click();

		// click on ok button
		String nokBtn = "//*[text()='OK']";
		WebElement nokBtnElement = driver.findElementByXPath(nokBtn);
		nokBtnElement.click();

		test.log(Status.PASS, "Verify click on select location");

		// select on branch
		String nbranch = "//*[@id='secondSelecet']";
		WebElement nbranchElement = driver.findElementByXPath(nbranch);
		nbranchElement.click();

		// select on location radio button location
		String nbranchradioBtn = "//button[@type='button'][3]//div[@class='alert-radio-icon sc-ion-alert-md']";
		WebElement nbranchradioBtnElement = driver.findElementByXPath(nbranchradioBtn);
		nbranchradioBtnElement.click();

		// click on ok button
		String nbranchokBtn = "//*[text()='OK']";
		WebElement nbranchokBtnElement = driver.findElementByXPath(nbranchokBtn);
		nbranchokBtnElement.click();

		test.log(Status.PASS, "Verify select on branch");

		// enter the name
		String nname = "//*[@id=\"storeProfileInfo\"]/ion-row[3]/ion-col/ion-item/ion-input/input";
		WebElement nnameElement = driver.findElementByXPath(nname);
		nnameElement.sendKeys("madhu");

		test.log(Status.PASS, "Verify enter the name");

		// select your are gender
		String ngender = "//span[text()='Male']";
		WebElement ngenderElement = driver.findElementByXPath(ngender);
		ngenderElement.click();

		test.log(Status.PASS, "Verify select your are gender");

		// Enter your date of birth
		String ndofbirth = "//*[@id=\"storeProfileInfo\"]/ion-row[5]/ion-col[2]/ion-row/ion-col[1]/ion-item/ion-input/input";
		WebElement ndofbirthElement = driver.findElementByXPath(ndofbirth);
		ndofbirthElement.click();
		ndofbirthElement.sendKeys("14");

		// Enter your month
		String nmonth = "//*[@id=\"storeProfileInfo\"]/ion-row[5]/ion-col[2]/ion-row/ion-col[1]/ion-item/ion-input/input";
		WebElement nmonthElement = driver.findElementByXPath(nmonth);
		nmonthElement.click();
		nmonthElement.sendKeys("02");

		// Enter your year
		String nyear = "//*[@id=\"storeProfileInfo\"]/ion-row[5]/ion-col[2]/ion-row/ion-col[3]/ion-item/ion-input/input";
		WebElement nyearElement = driver.findElementByXPath(nyear);
		nyearElement.click();
		nyearElement.sendKeys("1996");

		test.log(Status.PASS, "Verify Enter your date of birth");

		ApolloUtils.verticalScroll(driver);
		ApolloUtils.verticalScroll(driver);
		ApolloUtils.verticalScroll(driver);

		// click on planning for next baby
		String nextbaby = "//span[text()='Planning for my next Baby']";
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
		String cday = "//button[text()='"+testdata.get("PlanningForNextBabyDay")+"']";
		WebElement cdayBtnElement = driver.findElementByXPath(cday);
		cdayBtnElement.click();

		test.log(Status.PASS, "Verify click on day");

		// click on month
		String cmonths = "//button[text()='"+testdata.get("PlanningForNextBabyMonth")+"']";
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

		test.log(Status.PASS,
				"Verify that on planning for next baby the user is asked for the first date of the last period");

		// click on save details
		String savedetailsBtn = "//*[text()='Save Details ']";
		WebElement savedetailsBtnElement = driver.findElementByXPath(savedetailsBtn);
		savedetailsBtnElement.click();

		test.log(Status.PASS,
				"Verify that upon selecting the date user is able to save the data and then the user is navigated to the home screen");

		// click on back button
		String back = "//*[@id=\"menu-content\"]/app-profile/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		WebElement backElement = driver.findElementByXPath(back);
		backElement.click();

	}

	//@Test(priority = 6)
	public void generalHealth() {
		ExtentTest test = reports.createTest("AddFamily -GeneralHealth");
		test.log(Status.INFO, " GeneralHealth starts here...");

/*		// click on main menu button
		String pmain = "//*[@id=\"menuButton\"]";
		WebElement pmainElement = driver.findElementByXPath(pmain);
		pmainElement.click();

		test.log(Status.PASS, "Verify on main menu button");

		// click on My profile
		String pprofile = "//ion-label[text()='My Profile']";
		WebElement pprofileElement = driver.findElementByXPath(pprofile);
		pprofileElement.click();
*/
		// click on plus symbol
		String nplus = "//*[@id=\"menu-content\"]/app-profile/ion-content/ion-grid/ion-row[2]/ion-col[1]/ion-row/ion-col[2]/ion-button";
		WebElement nplusElement = driver.findElementByXPath(nplus);
		nplusElement.click();

		test.log(Status.PASS, "Verify click on plus symbol");

		// click on select location
		String nlocation = "//*[@id=\"storeProfileInfo\"]/ion-row[1]/ion-col/ion-item/ion-select";
		WebElement nlocationElement = driver.findElementByXPath(nlocation);
		nlocationElement.click();

		test.log(Status.PASS, "Verify click on select location");

		// select on location radio button location
		String nradioBtn = "//button[@type='button'][3]//div[@class='alert-radio-icon sc-ion-alert-md']";
		WebElement nradioBtnElement = driver.findElementByXPath(nradioBtn);
		nradioBtnElement.click();

		// click on ok button
		String nokBtn = "//*[text()='OK']";
		WebElement nokBtnElement = driver.findElementByXPath(nokBtn);
		nokBtnElement.click();

		test.log(Status.PASS, "Verify click on select location");

		// select on branch
		String nbranch = "//*[@id='secondSelecet']";
		WebElement nbranchElement = driver.findElementByXPath(nbranch);
		nbranchElement.click();

		// select on location radio button location
		String nbranchradioBtn = "//button[@type='button'][3]//div[@class='alert-radio-icon sc-ion-alert-md']";
		WebElement nbranchradioBtnElement = driver.findElementByXPath(nbranchradioBtn);
		nbranchradioBtnElement.click();

		// click on ok button
		String nbranchokBtn = "//*[text()='OK']";
		WebElement nbranchokBtnElement = driver.findElementByXPath(nbranchokBtn);
		nbranchokBtnElement.click();

		test.log(Status.PASS, "Verify select on branch");

		// enter the name
		String nname = "//*[@id=\"storeProfileInfo\"]/ion-row[3]/ion-col/ion-item/ion-input/input";
		WebElement nnameElement = driver.findElementByXPath(nname);
		nnameElement.sendKeys("madhu");

		test.log(Status.PASS, "Verify enter the name");

		// select your are gender
		String ngender = "//span[text()='Male']";
		WebElement ngenderElement = driver.findElementByXPath(ngender);
		ngenderElement.click();

		test.log(Status.PASS, "Verify select your are gender");

		// Enter your date of birth
		String ndofbirth = "//*[@id=\"storeProfileInfo\"]/ion-row[5]/ion-col[2]/ion-row/ion-col[1]/ion-item/ion-input/input";
		WebElement ndofbirthElement = driver.findElementByXPath(ndofbirth);
		ndofbirthElement.click();
		ndofbirthElement.sendKeys("14");

		// Enter your month
		String nmonth = "//*[@id=\"storeProfileInfo\"]/ion-row[5]/ion-col[2]/ion-row/ion-col[1]/ion-item/ion-input/input";
		WebElement nmonthElement = driver.findElementByXPath(nmonth);
		nmonthElement.click();
		nmonthElement.sendKeys("02");

		// Enter your year
		String nyear = "//*[@id=\"storeProfileInfo\"]/ion-row[5]/ion-col[2]/ion-row/ion-col[3]/ion-item/ion-input/input";
		WebElement nyearElement = driver.findElementByXPath(nyear);
		nyearElement.click();
		nyearElement.sendKeys("1996");

		test.log(Status.PASS, "Verify Enter your date of birth");

	
		ApolloUtils.verticalScroll(driver);
		ApolloUtils.verticalScroll(driver);
		ApolloUtils.verticalScroll(driver);

		// click on general health
		String general = "//span[text()='General Women Health']";
		WebElement generalElement = driver.findElementByXPath(general);
		generalElement.click();

		test.log(Status.PASS, "Verify click on general health");

		// click on know medical condition
		String condition = "//*[text()='Common Gynecology Problems']";
		WebElement conditionElement = driver.findElementByXPath(condition);
		conditionElement.click();

		test.log(Status.PASS, "Verify click on know medical condition");

		ApolloUtils.verticalScroll(driver);

		// click on save details
		String saveDetails = "//*[text()='Save Details ']";
		WebElement saveDetailsElement = driver.findElementByXPath(saveDetails);
		saveDetailsElement.click();

		test.log(Status.PASS, "Verify that the save button gets enabled the moment one of the tags is selected");
	}

}