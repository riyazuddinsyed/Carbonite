package com.apollo.cradle.profile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.apollo.cradle.setup.BaseDriver;
import com.apollo.cradle.util.ApolloUtils;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.MobileBy;

public class ProcessEditProfile extends BaseDriver {

	@Test(priority = 0)

	public void basicInfo() {
		ExtentTest test = reports.createTest("EditProfile - Basic Info");
		test.log(Status.INFO, " Basic Info starts here...");

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

		// click on edit profile
		String edit = "//ion-button[text()='Edit Profile']";
		WebElement editElement = driver.findElementByXPath(edit);
		editElement.click();

		test.log(Status.PASS, "Verify on edit profile edit");

		// Enter fullname
		String fullname = "#menu-content > app-profile-edit > ion-content > ion-grid > ion-row > ion-col.edit-profile-pages.ion-padding.md.hydrated > div > app-basic-info > ion-row.profile-full-height.ion-flex-column.ion-justify-content-between.md.hydrated > form > ion-col:nth-child(1) > ion-item.margin--b15.item-label.item-label-floating.item-interactive.item-input.item.md.ion-focusable.hydrated.item-has-value.ion-untouched.ion-dirty.ion-valid > ion-input > input";
		WebElement fullnameElement = driver.findElement(MobileBy.cssSelector(fullname));
		fullnameElement.clear();
		fullnameElement.sendKeys("madhu");

		test.log(Status.PASS, "Verify the full name");

		// click on date of birth
		String day = "(//input[@class='native-input sc-ion-input-md'])[4]";
		WebElement dayElement = driver.findElementByXPath(day);
		dayElement.clear();
		dayElement.sendKeys("04");

		test.log(Status.PASS, "Verify on date of birth");

		// click on month
		String month = "(//input[@class='native-input sc-ion-input-md'])[5]";
		WebElement monthElement = driver.findElementByXPath(month);
		monthElement.clear();
		monthElement.sendKeys("04");

		// click on year
		String year = "(//input[@class='native-input sc-ion-input-md'])[6]";
		WebElement yearElement = driver.findElementByXPath(year);
		yearElement.clear();
		yearElement.sendKeys("1997");

		// Enter city
		String city = "//*[@id=\"menu-content\"]/app-profile-edit/ion-content/ion-grid/ion-row/ion-col[2]/div/app-basic-info/ion-row[2]/form/ion-col[1]/ion-item[4]/ion-row/ion-col/ion-item/ion-select";
		WebElement cityElement = driver.findElementByXPath(city);
		cityElement.click();

		test.log(Status.PASS, "Verify select the city");

		// select radio button
		String bradioBtn = "//button[@type='button'][4]//div[@class='alert-radio-icon sc-ion-alert-md']";
		WebElement bradioBtnElement = driver.findElementByXPath(bradioBtn);
		bradioBtnElement.click();

		test.log(Status.PASS, "Verify select on radion button");

		// click on ok btn
		String profileokbtn = "//*[text()='OK']";
		WebElement profileokbtnElement = driver.findElementByXPath(profileokbtn);
		profileokbtnElement.click();

		test.log(Status.PASS, "Verify ok on button");

		// Select branch
		String branch = "//*[@id=\"secondSelecet\"]";
		WebElement branchElement = driver.findElementByXPath(branch);
		branchElement.click();

		test.log(Status.PASS, "Verify select branch");

		// select branch radio button
		String branchradioBtn = "//button[@type='button'][2]//div[@class='alert-radio-icon sc-ion-alert-md']";
		WebElement branchradioBtnElement = driver.findElementByXPath(branchradioBtn);
		branchradioBtnElement.click();

		test.log(Status.PASS, "Verify branch radio button");

		// click on ok button
		String bokBtn = "//*[text()='OK']";
		WebElement bokBtnElement = driver.findElementByXPath(bokBtn);
		bokBtnElement.click();

		test.log(Status.PASS, "Verify on ok button");

		ApolloUtils.verticalScroll(driver);

		// Click on Update button
		// String updateBtn = "//*[text()='Update']";
		String bupdateBtn = "//*[text()='Update']";
		WebElement bupdateBtnElement = driver.findElementByXPath(bupdateBtn);
		bupdateBtnElement.click();

		test.log(Status.PASS, "Verify on Update button");

	}

	@Test(priority = 1)
	public void medicalHistory() {
		ExtentTest test = reports.createTest("EditProfile - MedicalHistory");
		test.log(Status.INFO, " MedicalHistory starts here...");

		// Click on medicalHistory
		String medicalBtn = "//*[@id=\"menu-content\"]/app-profile-edit/ion-content/ion-grid/ion-row/ion-col[1]/ion-slides/div/ion-slide[2]";
		WebElement medicalElement = driver.findElementByXPath(medicalBtn);
		medicalElement.click();

		// click on Blood group
		String bloodgroup = "//*[@id=\"menu-content\"]/app-profile-edit/ion-content/ion-grid/ion-row/ion-col[2]/div/app-medical-history/ion-row[2]/form/ion-col[1]/ion-item/ion-row/ion-select";
		WebElement bloodgroupElement = driver.findElementByXPath(bloodgroup);
		bloodgroupElement.click();

		// selecting radio button
		String bloodradioBtn = "//button[@type='button'][2]//div[@class='alert-radio-icon sc-ion-alert-md']";
		WebElement bloodradioBtnElement = driver.findElementByXPath(bloodradioBtn);
		bloodradioBtnElement.click();

		// click on ok button
		String bloodokBtn = "//*[text()='OK']";
		WebElement bloodokBtnElement = driver.findElementByXPath(bloodokBtn);
		bloodokBtnElement.click();

		// Click on height
		String height = "#menu-content > app-profile-edit > ion-content > ion-grid > ion-row > ion-col.edit-profile-pages.ion-padding.md.hydrated > div > app-medical-history > ion-row.profile-full-height.ion-flex-column.ion-justify-content-between.md.hydrated > form > ion-col:nth-child(1) > ion-row.ion-justify-content-between.margin--b30.md.hydrated > ion-col:nth-child(1) > ion-item > ion-input > input";
		WebElement heightElement = driver.findElement(MobileBy.cssSelector(height));
		heightElement.clear();
		heightElement.sendKeys("50");

		// Click on weight
		String weight = "#menu-content > app-profile-edit > ion-content > ion-grid > ion-row > ion-col.edit-profile-pages.ion-padding.md.hydrated > div > app-medical-history > ion-row.profile-full-height.ion-flex-column.ion-justify-content-between.md.hydrated > form > ion-col:nth-child(1) > ion-row.ion-justify-content-between.margin--b30.md.hydrated > ion-col:nth-child(2) > ion-item > ion-input > input";
		WebElement weightElement = driver.findElement(MobileBy.cssSelector(weight));
		weightElement.clear();
		weightElement.sendKeys("80");

		ApolloUtils.verticalScroll(driver);

		// select on Checkboxs
		driver.findElementByXPath("//*[text()='Common Gynecology Problems']").click();
		ApolloUtils.verticalScroll(driver);
		ApolloUtils.verticalScroll(driver);

		// Click on Update Button
		String mupdateBtn = "//ion-button[text()='Update ']";
		WebElement mupdateBtnElement = driver.findElementByXPath(mupdateBtn);
		mupdateBtnElement.click();

	}

	@Test(priority = 2)

	public void familyHistory() {

		ExtentTest test = reports.createTest("EditProfile - FamilyHistory");
		test.log(Status.INFO, " FamilyHistory starts here...");

		ApolloUtils.verticalScrollup(driver);
		ApolloUtils.verticalScrollup(driver);
		ApolloUtils.verticalScrollup(driver);

		// click on Family history
		// String familyslides = "//*[text()='Family History']";
		// WebElement slideElement = driver.findElementByXPath(slides);
		// slideElement.click();
		driver.findElement(By.xpath(
				"//*[@id='menu-content']/app-profile-edit/ion-content/ion-grid/ion-row/ion-col[1]/ion-slides/div/ion-slide[3]"))
				.click();

		// Click on check box selector
		String checkboxSelector = "//*[text()='Common Gynecology Problems']";
		WebElement checkboxElement = driver.findElementByXPath(checkboxSelector);
		checkboxElement.click();

		// Click on update Button
		String familyupdateBtn = "//ion-button[text()='Update ']";
		WebElement familyupdateBtnElement = driver.findElementByXPath(familyupdateBtn);
		familyupdateBtnElement.click();

	}

	@Test(priority = 3)
	public void pregnancyHistory() throws InterruptedException {
		ExtentTest test = reports.createTest("EditProfile - PregnancyHistory");
		test.log(Status.INFO, " PregnancyHistory starts here...");

		// click on pregnancy history
		String pregnancyslides = "//*[@id='menu-content']/app-profile-edit/ion-content/ion-grid/ion-row/ion-col[1]/ion-slides/div/ion-slide[4]";
		WebElement pregnancyslidesElements = driver.findElementByXPath(pregnancyslides);
		pregnancyslidesElements.click();

		// click birth outcome button
		String tabSelector = "//*[@id='menu-content']/app-add-pregnancy-history/ion-content/ion-grid/form/ion-row[1]/ion-col/ion-item[1]/ion-select";
		WebElement tabElement = driver.findElementByXPath(tabSelector);
		tabElement.click();

		// click on baby out came radio button
		String outcame = "//div[text()='Live Birth']";
		WebElement outcameElement = driver.findElementByXPath(outcame);
		outcameElement.click();

		// click on ok button
		String okBtn = "//span[text()='OK']";
		WebElement okBtnElement = driver.findElementByXPath(okBtn);
		okBtnElement.click();

		// click on conception and select natural
		String conception = "//*[@id=\"menu-content\"]/app-add-pregnancy-history/ion-content/ion-grid/form/ion-row[1]/ion-col/ion-item[2]/ion-select";
		WebElement conceptionElement = driver.findElementByXPath(conception);
		conceptionElement.click();

		// click on conception radio button
		String radioBtn = "(//div[text()='Natural'])";
		WebElement radioBtnElement = driver.findElementByXPath(radioBtn);
		radioBtnElement.click();

		// click on conception ok Button
		String conceptionokBtn = "//span[text()='OK']";
		WebElement conceptionokBtnElement = driver.findElementByXPath(conceptionokBtn);
		conceptionokBtnElement.click();
		
		// click on delivey and select C-section
		String delivery = "//*[@id=\"menu-content\"]/app-add-pregnancy-history/ion-content/ion-grid/form/ion-row[1]/ion-col/ion-item[3]/ion-select";
		WebElement deliveryElement = driver.findElementByXPath(delivery);
		deliveryElement.click();

		// click on delivery radio button
		String deliveryradioBtn = "(//div[text()='Normal'])";
		WebElement deliveryradioBtnradioBtnElement = driver.findElementByXPath(deliveryradioBtn);
		deliveryradioBtnradioBtnElement.click();

		// click on delivery ok Button
		String deliveryokBtn = "//span[text()='OK']";
		WebElement deliveryokBtnElement = driver.findElementByXPath(deliveryokBtn);
		deliveryokBtnElement.click();

		// click on baby gestation age(in months)
		String gestation = "#menu-content > app-add-pregnancy-history > ion-content > ion-grid > form > ion-row.margin--b20.md.hydrated > ion-col > ion-item:nth-child(4) > ion-input > input";
		WebElement gentationElement = driver.findElement(MobileBy.cssSelector(gestation));
		gentationElement.clear();
		gentationElement.sendKeys("7");

		// click on baby weight(in kgs)
		String babyWeight = "#menu-content > app-add-pregnancy-history > ion-content > ion-grid > form > ion-row.margin--b20.md.hydrated > ion-col > ion-item:nth-child(5) > ion-input > input";
		WebElement babyWeightElement = driver.findElement(MobileBy.cssSelector(babyWeight));
		babyWeightElement.sendKeys("3");

		// click on baby age(in years)
		String babyYears = "#menu-content > app-add-pregnancy-history > ion-content > ion-grid > form > ion-row.margin--b20.md.hydrated > ion-col > ion-item:nth-child(6) > ion-input > input";
		WebElement babyYearsElements = driver.findElement(MobileBy.cssSelector(babyYears));
		babyYearsElements.sendKeys("1");

		// Click on comments in baby health
		String comments = "//*[@id=\"menu-content\"]/app-add-pregnancy-history/ion-content/ion-grid/form/ion-row[1]/ion-col/ion-item[7]/ion-input/input";
		WebElement commentsElemet = driver.findElementByXPath(comments);
		commentsElemet.clear();
		commentsElemet.sendKeys("good healty");
		
		ApolloUtils.verticalScroll(driver);
		
		// Click on Add history
		String addHistory = "//*[text()='Add History ']";
		WebElement addHistoryElement = driver.findElementByXPath(addHistory);
		addHistoryElement.click();

	}
}
