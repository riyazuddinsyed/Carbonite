package com.apollo.cradle.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.apollo.cradle.setup.BaseDriver;
import com.apollo.cradle.util.ApolloUtils;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.MobileBy;

public class ProcessBookTab extends BaseDriver {

	 //@Test
	public void bookAnAppoinment() {
		ExtentTest test = reports.createTest("Book - Book An Appoinment");
		test.log(Status.INFO, "  Book An Appoinment starts here...");

		// Click on booking
		// *[@id="tab-button-book"]
		String bookingBtn = "//*[@id='tab-button-book']";
		WebElement bookingElement = driver.findElementByXPath(bookingBtn);
		bookingElement.click();
System.out.println(1);
		test.log(Status.PASS,
				"Verify that on clicking Book icon user is shown options depending on his phase for phase two there will be three options and for all other faces there will be only two options. Phase 2 will extra option of booking a bed and all phases will have an option of book an appointment and request a health check");

		// Click on book an appoinment
		// *[@id="menu-content"]/app-tabs/ion-tabs/div/ion-router-outlet/app-bookings/ion-content/ion-grid/ion-row[2]/ion-col[1]/ion-button
		String appoinmentBtn = "//*[@id=\"menu-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-bookings/ion-content/ion-grid/ion-row[2]/ion-col[1]/ion-button";
		WebElement appoinmentElement = driver.findElementByXPath(appoinmentBtn);
		appoinmentElement.click();
System.out.println(2);
		test.log(Status.PASS, "after click on book an appoinment");

		// click on name and select
		String appointmentfor = "//*[@id=\"menu-content\"]/app-appointment-tabs/ion-tabs/div/ion-router-outlet/app-new-appointment/form/ion-content/ion-grid[1]/ion-row/ion-row[1]/ion-col/ion-item/ion-select";
		WebElement appointmentElement = driver.findElementByXPath(appointmentfor);
		appointmentElement.click();

		test.log(Status.PASS, "after click on book an appoinment select name");
System.out.println(3);
		// select on radio button for name
		String name = "//button[@type='button'][2]//div[@class='alert-button-inner sc-ion-alert-md']";
		WebElement nameElement = driver.findElementByXPath(name);
		nameElement.click();
System.out.println(4);
		test.log(Status.PASS, "verify radio button");

		// click on ok button for name
		String okBtnnane = "//button[@type='button'][2]//span[@class='alert-button-inner sc-ion-alert-md']";
		WebElement okBtnnameElement = driver.findElementByXPath(okBtnnane);
		okBtnnameElement.click();
System.out.println(5);
		test.log(Status.PASS, "verify ok button");

		// Select on City
		String city = "//*[@id=\"menu-content\"]/app-appointment-tabs/ion-tabs/div/ion-router-outlet/app-new-appointment/form/ion-content/ion-grid[1]/ion-row/ion-row[2]/ion-col/ion-item/ion-select";
		WebElement cityElement = driver.findElementByXPath(city);
		cityElement.click();
System.out.println(6);
		test.log(Status.PASS, "Verify click on Branch button");

		// click on radio button
		String radioBtn = "//button[@type='button'][3]//div[@class='alert-radio-icon sc-ion-alert-md']";
		WebElement radioBtnElement = driver.findElementByXPath(radioBtn);
		radioBtnElement.click();
System.out.println(7);
		test.log(Status.PASS, "Verify click on radio button");

		// click on ok button
		String okBtn = "//button[@type='button'][2]//span[@class='alert-button-inner sc-ion-alert-md']";
		WebElement okBtnElement = driver.findElementByXPath(okBtn);
		okBtnElement.click();

		test.log(Status.PASS, "Verify click on ok button");
System.out.println(8);
		// click on branch
		String branch = "//*[@id='secondSelecet']";
		WebElement branchElement = driver.findElementByXPath(branch);
		branchElement.click();
System.out.println(9);
		// click on radio button
		String radioBts = "//button[@type='button'][3]//div[@class='alert-radio-icon sc-ion-alert-md']";
		WebElement radioBtsElement = driver.findElementByXPath(radioBts);
		radioBtsElement.click();
System.out.println(10);
		// click on ok button
		String okBtns = "//button[@type='button'][2]//span[@class='alert-button-inner sc-ion-alert-md']";
		WebElement okBtnsElement = driver.findElementByXPath(okBtns);
		okBtnsElement.click();
System.out.println(11);
		// Select on packages
		driver.findElementByXPath("//*[text()='Obstetrician & Gynecologist']").click();

		test.log(Status.PASS, "Verify packages which needs to patien");

		// select click on doctor time & date slots
		String doctor = "(//*[@id='menu-content']/app-select-doctors/ion-content/ion-grid/ion-row[4]/ion-col[2]/ion-button)";
		WebElement doctorElement = driver.findElementByXPath(doctor);
		doctorElement.click();
System.out.println(12);
		test.log(Status.PASS,
				"Verify that on click of the view date and time slots option a calendar view is opened which has all the dates for which this doctor is available along with the time slots for each days"); // select
																																																				// on
		// click on day
		String days = "(//p[text()='"+("bookAnAppoinmentDay")+"'])[2]";
		WebElement daysBtnElement = driver.findElementByXPath(days);
		daysBtnElement.click();
System.out.println(13);
		ApolloUtils.verticalScroll(driver);
		test.log(Status.PASS, "Verify date slots are available for which has available with date and time");

		// click time doctor slots
		String time = "//span[text()='"+("bookAnAppoinmentTime")+"']";
		WebElement timeElement = driver.findElementByXPath(time);
		timeElement.click();
System.out.println(14);
		test.log(Status.PASS, "Verify date slots are available for which has available with date and time");

		ApolloUtils.verticalScroll(driver);

		// click on book online button
		String onlineBtn = "//*[@id=\"menu-content\"]/app-time-slots/ion-content/ion-grid/form/ion-row[2]/ion-col/ion-button";
		WebElement onlineElement = driver.findElementByXPath(onlineBtn);
		onlineElement.click();
System.out.println(15);
		// click on done button
		String doneBtn = "";
		WebElement doneBtnElement = driver.findElementByXPath(doneBtn);
		doneBtnElement.click();
		test.log(Status.PASS, "Verify click on book online button");
System.out.println(16);
	}

	// @Test
	private void bookDelivery() {
		ExtentTest test = reports.createTest("Book - Book Delivery");
		test.log(Status.INFO, " Book Delivery starts here...");

		// Click on booking //#tab-button-book
		String bookingBtn = "#tab-button-book";
		WebElement bookingElement = driver.findElement(MobileBy.cssSelector(bookingBtn));
		bookingElement.click();

		// Click on book Delivery
		String bookDeliveryBtn = "#menu-content > app-tabs > ion-tabs > div > ion-router-outlet > app-bookings > ion-content > ion-grid > ion-row.booking-wrap.md.hydrated > ion-col:nth-child(2) > ion-button";
		WebElement bookDeliveryElement = driver.findElement(MobileBy.cssSelector(bookDeliveryBtn));
		bookDeliveryElement.click();

		// Click on admission & assist
		String admissionAssistBtn = "#menu-content > app-bed-booking > ion-footer > ion-toolbar > ion-button";
		WebElement admissionAssistElement = driver.findElement(MobileBy.cssSelector(admissionAssistBtn));
		admissionAssistElement.click();

		// Select for City
		String city = "#menu-content > app-bed-booking-form > ion-content > ion-grid > div > form > ion-row:nth-child(2) > ion-col > ion-item > ion-select";
		WebElement cityElement = driver.findElement(MobileBy.cssSelector(city));
		cityElement.click();

		test.log(Status.PASS, "Verify that the user is able to select a different city");

		// Click on ok Button
		String okbtn = "#ion-overlay-2 > div > div.alert-button-group.sc-ion-alert-md > button:nth-child(1)";
		WebElement okbtnElement = driver.findElement(MobileBy.cssSelector(okbtn));
		okbtnElement.click();

		// Select for Branch
		String branch = "#secondSelecet";
		WebElement branchElement = driver.findElement(MobileBy.cssSelector(branch));
		branchElement.click();

		test.log(Status.PASS, "Verify that the user is able to select different branch");

		// Click on ok Button for branch
		String okBtn = "#ion-overlay-3 > div > div.alert-button-group.sc-ion-alert-md > button:nth-child(2)";
		WebElement okBtnElement = driver.findElement(MobileBy.cssSelector(okBtn));
		okBtnElement.click();

		// Select for Roomtype
		String roomtype = "//*[@id=\"menu-content\"]/app-bed-booking-form/ion-content/ion-grid/div/form/ion-row[4]/ion-col/ion-item/ion-select";
		WebElement roomtypeElement = driver.findElementByXPath(roomtype);
		roomtypeElement.click();

		// Click on ok radio button roomtype
		String roomtypeBtn = "//button[@type='button'][3]//div[@class='alert-radio-icon sc-ion-alert-md']";
		WebElement roomtypeBtnElement = driver.findElementByXPath(roomtypeBtn);
		roomtypeBtnElement.click();

		// click on ok button roomtype
		String roomBtn = "//span[text()='OK']";
		WebElement roomBtnElement = driver.findElementByXPath(roomBtn);
		roomBtnElement.click();

		// Click on BookingDetails
		String BookingDetails = "#menu-content > app-bed-booking-form > ion-content > ion-grid > div > form > ion-row:nth-child(13) > ion-col > ion-button";
		WebElement BookingDetailsElement = driver.findElement(MobileBy.cssSelector(BookingDetails));
		BookingDetailsElement.click();

		// Personal Details
		String Name = "//*[@id=\"menu-content\"]/app-personal-details/ion-content/ion-grid/div/form/ion-row[2]/ion-col[1]/ion-item/ion-input/input";
		WebElement NameElement = driver.findElementByXPath(Name);
		NameElement.clear();
		NameElement.sendKeys("madhu");

		// Click on date
		String Date = "#menu-content > app-personal-details > ion-content > ion-grid > div > form > ion-row:nth-child(2) > ion-col:nth-child(2) > ion-item > ion-datetime";
		WebElement DateElement = driver.findElement(MobileBy.cssSelector(Date));
		DateElement.click();

		// click on day
		String beddays = "//button[text()='26']";
		WebElement beddaysBtnElement = driver.findElementByXPath(beddays);
		beddaysBtnElement.click();

		// click on month
		String bedmonth = "//button[text()='Nov']";
		WebElement bedmonthBtnElement = driver.findElementByXPath(bedmonth);
		bedmonthBtnElement.click();

		// click on year
		String bedyear = "//button[text()='2020']";
		WebElement bedyearBtnElement = driver.findElementByXPath(bedyear);
		bedyearBtnElement.click();

		test.log(Status.PASS, "Verify date slots are available for which has available with date and time");

		// Click on date done button
		String DateDone = "//*[text()='Done']";
		WebElement DateDoneElement = driver.findElementByXPath(DateDone);
		DateDoneElement.click();

		// Enter husband name
		String name = "//*[@id=\"menu-content\"]/app-personal-details/ion-content/ion-grid/div/form/ion-row[2]/ion-col[3]/ion-item/ion-input/input";
		WebElement nameElement = driver.findElementByXPath(name);
		nameElement.sendKeys("kumar");

		// Enter husband's occupation
		String occupation = "#menu-content > app-personal-details > ion-content > ion-grid > div > form > ion-row:nth-child(2) > ion-col:nth-child(4) > ion-item > ion-input > input";
		WebElement occupationElement = driver.findElement(MobileBy.cssSelector(occupation));
		occupationElement.sendKeys("business");

		// Enter name Employee
		String employee = "#menu-content > app-personal-details > ion-content > ion-grid > div > form > ion-row:nth-child(2) > ion-col:nth-child(5) > ion-item > ion-input > input";
		WebElement employeeElement = driver.findElement(MobileBy.cssSelector(employee));
		employeeElement.sendKeys("Bhaskar");

		ApolloUtils.verticalScroll(driver);

		// Enter doctor name
		String doctor = "#menu-content > app-personal-details > ion-content > ion-grid > div > form > ion-row:nth-child(2) > ion-col.margin--b40.md.hydrated > ion-item > ion-input > input";
		WebElement doctorElement = driver.findElement(MobileBy.cssSelector(doctor));
		doctorElement.sendKeys("Balu");

		// Click on the cash button
		// String cash = "//*[@id='cash']";
		// WebElement cashElement = driver.findElementByXPath(cash);
		// cashElement.click();
		driver.findElementByXPath("//*[text()='Cash']").click();

		// click on Book A Delivery At rs9999
		String book = "#menu-content > app-personal-details > ion-content > ion-grid > div > form > ion-row:nth-child(3) > ion-col > ion-button";
		WebElement bookElement = driver.findElement(MobileBy.cssSelector(book));
		bookElement.click();

		// visible to summary page below pay button clik
		String summarypay = "//*[text()='Pay Now']";
		WebElement summarypayElement = driver.findElementByXPath(summarypay);
		summarypayElement.click();

		// Enter the coupon code
		String coupon = "//*[@id='coupenCode']";
		WebElement couponElement = driver.findElementByXPath(coupon);
		couponElement.sendKeys("564123");

		// Enter billing name
		String billing = "//input[@placeholder='Billing Name']";
		WebElement billingElement = driver.findElementByXPath(billing);
		billingElement.sendKeys("45612");

		// Enter your address
		String address = "//input[@placeholder='Address']";
		WebElement addressElement = driver.findElementByXPath(address);
		addressElement.sendKeys("mumbai");

		// Enter your zip code
		String zipcode = "(//*[text()='Zip Code'])[1]";
		WebElement zipcodeElement = driver.findElementByXPath(zipcode);
		zipcodeElement.sendKeys("460078");

		// Enter your city name
		String cityname = "(//*[text()='City'])[1]";
		WebElement citynameElement = driver.findElementByXPath(cityname);
		citynameElement.sendKeys("navimumbai");

		// Enter your state
		String state = "(//*[text()='State'])[1]";
		WebElement stateElement = driver.findElementByXPath(state);
		stateElement.sendKeys("mumbai");

		// select your country
		String country = "(//*[text()='Country'])[1]";
		WebElement countryElement = driver.findElementByXPath(country);
		countryElement.click();

		// select radio button
		String radioBtn = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]\r\n"+ "";
		WebElement radioBtnElement = driver.findElementByXPath(radioBtn);
		radioBtnElement.click();

	}

	//@Test
	private void requestHealthCheck() {
		ExtentTest test = reports.createTest("Book - Request Health Check");
		test.log(Status.INFO, "Request Health Check starts here...");

		// Click on booking 
		String bookingBtn = "//*[@id='tab-button-book']";
		WebElement bookingElement = driver.findElementByXPath(bookingBtn);
		bookingElement.click();

		test.log(Status.PASS, "Verify on the book tab");

		// click on request a health check
		String healthCheck = "#menu-content > app-tabs > ion-tabs > div > ion-router-outlet > app-bookings > ion-content > ion-grid > ion-row.booking-wrap.md.hydrated > ion-col:nth-child(3) > ion-button";
		WebElement healthCheckElement = driver.findElement(MobileBy.cssSelector(healthCheck));
		healthCheckElement.click();

		test.log(Status.PASS, "Verify on request a health check");

		// click on name and select
		String appointmentfor = "//*[@id=\"menu-content\"]/app-new-health-check/ion-content/form/ion-grid[1]/ion-row/ion-row[1]/ion-col/ion-item/ion-select";
		WebElement appointmentElement = driver.findElementByXPath(appointmentfor);
		appointmentElement.click();

		test.log(Status.PASS, "after click on request health check select name");

		// select on radio button for name
		String name = "//button[@type='button'][2]//div[@class=\'alert-radio-icon sc-ion-alert-md\']";
		WebElement nameElement = driver.findElementByXPath(name);
		nameElement.click();

		test.log(Status.PASS, "verify radio button");

		// click on ok button for name
		String okBtnnane = "//button[@type='button'][2]//span[@class='alert-button-inner sc-ion-alert-md']";
		WebElement okBtnnameElement = driver.findElementByXPath(okBtnnane);
		okBtnnameElement.click();

		test.log(Status.PASS, "verify ok button");

		// Select on city
		String city = "//*[@id='menu-content']/app-new-health-check/ion-content/form/ion-grid[1]/ion-row/ion-row[2]/ion-col/ion-item/ion-select";
		WebElement cityElement = driver.findElementByXPath(city);
		cityElement.click();

		test.log(Status.PASS, "verify branch button");

		// click on radio button
		String radioBtn = "//button[@type='button'][4]//div[@class='alert-radio-icon sc-ion-alert-md']";
		WebElement radioBtnElement = driver.findElementByXPath(radioBtn);
		radioBtnElement.click();
		
		// click on ok button
		String okBtn = "//button[@type='button'][2]//span[@class='alert-button-inner sc-ion-alert-md']";
		WebElement okBtnElement = driver.findElementByXPath(okBtn);
		okBtnElement.click();
		
		// Select on branch
		String branch = "//*[@id='secondSelecet']";
		WebElement branchElement = driver.findElementByXPath(branch);
		branchElement.click();

		test.log(Status.PASS, "verify branch button");

		// click on radio button
		String radioBtns = "//button[@type='button'][3]//div[@class='alert-radio-label sc-ion-alert-md']";
		WebElement radioBtnsElement = driver.findElementByXPath(radioBtns);
		radioBtnsElement.click();
		
		test.log(Status.PASS, "verify radio button");

		// click on ok button
		String okBtns = "//button[@type='button'][2]//span[@class='alert-button-inner sc-ion-alert-md']";
		WebElement okBtnsElement = driver.findElementByXPath(okBtns);
		okBtnsElement.click();

		test.log(Status.PASS, "verify ok button");
		
		ApolloUtils.verticalScroll(driver);
		
		// Select your package
		String pack = "//span[text()='Women - Teens']";
		WebElement packElement = driver.findElementByXPath(pack);
		packElement.click();
		
		test.log(Status.PASS, "verify select your package ");

		// Click on health check button
		String checkbutton = "//*[@id=\"menu-content\"]/app-new-health-check/ion-content/form/ion-grid[2]/ion-button";
		WebElement checkbuttonElement = driver.findElementByXPath(checkbutton);
		checkbuttonElement.click();

		test.log(Status.PASS, "verify  health check button ");

		// click on done button
		driver.findElement(By.xpath("//ion-text[text()='Done']")).click();

		test.log(Status.PASS, "verify  done button ");

	}

}
