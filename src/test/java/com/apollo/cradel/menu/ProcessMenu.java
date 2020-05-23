package com.apollo.cradel.menu;

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

public class ProcessMenu extends BaseDriver {

	@Test
	public void mainMenu() throws InterruptedException {
		ExtentTest test = reports.createTest("Menu - Main Menu");
		test.log(Status.INFO, "  Main Menu starts here...");

/*		// click on calender icon
		String icon = "//*[@id='menu-content']/app-tabs/ion-tabs/div/ion-router-outlet/app-home/app-main-header/ion-header/ion-toolbar/ion-buttons/div/ion-button";
		WebElement iconElement = driver.findElementByXPath(icon);
		iconElement.click();

		test.log(Status.PASS, "Verify that the calendar icon in the top bar shows the upcoming appointments");

		// click on chat icon
		String chat = "//*[@id='menu-content']/app-notifications/app-main-header/ion-header/ion-toolbar/ion-buttons/ion-button";
		WebElement chatElement = driver.findElementByXPath(chat);
		chatElement.click();

		test.log(Status.PASS,
				"Verify that the chat icon navigates the user to the chat option where the user can chat either with their manager or the doctor");
		// click on chat back button
		driver.navigate().back();
*/
		// clikc on main menu
		String mainmenuBtn = "//ion-menu-button[@id='menuButton']";
		WebElement mainmenuElement = driver.findElementByXPath(mainmenuBtn);
		mainmenuElement.click();

		System.out.println(1);

		// click on profile
		String profile = "//*[text()='My Profile']";
		WebElement profileELementElement = driver.findElementByXPath(profile);
		profileELementElement.click();

		System.out.println(2);

		// click on profile back button
		driver.navigate().back();
		System.out.println(3);

		// click on main menu emergency
		String emergencymenu = "//*[@id='menuButton']";
		WebElement emergencymenuElement = driver.findElementByXPath(emergencymenu);
		emergencymenuElement.click();

		System.out.println(4);

		// click on emergency contact
		String contact = "//*[text()='Add/Edit Emergency Contact']";
		WebElement contactElement = driver.findElementByXPath(contact);
		contactElement.click();

		test.log(Status.PASS,
				"Verify that when the user Clicks on add or edit of emergency contact the user is able to add any emergency contact from the contact list");

		System.out.println(5);
		// click on article main menu
		String articlemenu = "//*[@id='menuButton']";
		WebElement articlemenuElement = driver.findElementByXPath(articlemenu);
		articlemenuElement.click();
		System.out.println(6);
		// click on articles ,tips and information
		String article = "//*[text()='Articles, Tips and Information']";
		WebElement articleElement = driver.findElementByXPath(article);
		articleElement.click();

		test.log(Status.PASS,
				"Verify that the articles tips and information gives all the relevant articles to the user and the articles are fetched from the CMS");
		ApolloUtils.verticalScroll(driver);
		System.out.println(7);

		driver.navigate().back();
		// click on back button
		driver.navigate().back();
		System.out.println(8);
		// click on main menu
		String clickonmenu = "//*[@id='menuButton']";
		WebElement clickonmenuElement = driver.findElementByXPath(clickonmenu);
		clickonmenuElement.click();
		System.out.println(9);
		// click About Apollo Maternity, Fertility & Child Care
		String childcare = "//*[text()='About Apollo Maternity, Fertility & Child Care']";
		WebElement childcareElement = driver.findElementByXPath(childcare);
		childcareElement.click();

		test.log(Status.PASS,
				"Verify that the about Apollo Maternity, fertility and child care opens a page which gives the details about Apollo cradle");

		// click on back button about apollo cradle
		driver.navigate().back();

		System.out.println(10);
		// click on main menu virtual tour
		String clickonmenutour = "//*[@id='menuButton']";
		WebElement clickonmenutourElement = driver.findElementByXPath(clickonmenutour);
		clickonmenutourElement.click();

		System.out.println(11);
		// click on virtual tour
		String virtualtour = "/html/body/app-root/ion-app/ion-split-pane/ion-menu/ion-content/ion-list[2]/ion-menu-toggle[2]/app-menu-item/ion-item";
		WebElement virtualtourElement = driver.findElementByXPath(virtualtour);
		virtualtourElement.click();
		System.out.println(12);

		test.log(Status.PASS,
				"Verify that the Apollo centres and Virtual tour option opens a page with give details of the branch currently selected");
		// click on back button virtual tour
		driver.navigate().back();
		System.out.println(13);

		// click on main menu faq
		String menufaq = "(//*[@id='menuButton'])";
		WebElement menufaqElement = driver.findElementByXPath(menufaq);
		menufaqElement.click();

		System.out.println(14);
		// click on faq
		String faq = "//*[text()='FAQs']";
		WebElement faqElement = driver.findElementByXPath(faq);
		faqElement.click();

		test.log(Status.PASS, "Verify that the correct FAQs are fetched from the CMS based on the phase");

		System.out.println(15);

		// click on how can i help you
		String helpyou = "//*[@id=\"menu-content\"]/app-faq/ion-content/ion-row/app-accordion[1]/ion-card/ion-card-header/ion-list/ion-item/ion-text/h6/app-accordion-header";
		WebElement helpyouElement = driver.findElementByXPath(helpyou);
		helpyouElement.click();
		System.out.println(16);

		// click on back button how can i help you
		String helpback = "//*[@id=\"menu-content\"]/app-faq/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		WebElement helpbackElement = driver.findElementByXPath(helpback);
		helpbackElement.click();
		System.out.println(17);
		// click on main menu
		String menugeneral = "//*[@id='menuButton']";
		WebElement menugeneralElement = driver.findElementByXPath(menugeneral);
		menugeneralElement.click();
		System.out.println(18);

		// click on general health
		String general = "//*[text()='General Health']";
		WebElement generalElement = driver.findElementByXPath(general);
		generalElement.click();
		System.out.println(555);
		// select on package generalhealth
		String generalhealth = "//*[text()='Common Gynecology Problems']";
		WebElement generalhealthElement = driver.findElementByXPath(generalhealth);
		generalhealthElement.click();

		test.log(Status.PASS,
				"Verify that the General Health option is only available when the user is in one of the first five phases and is not available when the user is in general phase");

		System.out.println(19);
		// click on save details
		String savedetails = "//*[text()='Save Details ']";
		WebElement savedetailsElement = driver.findElementByXPath(savedetails);
		savedetailsElement.click();
		System.out.println(20);
		// click on main menu
		String menuterms = "//*[@id='menuButton']";
		WebElement menutermsElement = driver.findElementByXPath(menuterms);
		menutermsElement.click();
		System.out.println(21);
		// click on terms & conditions
		String termsconditions = "//*[text()='Terms & Conditions']";
		WebElement termsconditionsElement = driver.findElementByXPath(termsconditions);
		termsconditionsElement.click();

		test.log(Status.PASS,
				"Verify that the Apollo links like terms and conditions and privacy policy are fetched correctly");
		System.out.println(22);
		// click on terms&conditions back
		String backterms = "//*[@id=\"menu-content\"]/app-terms-conditions/ion-header/ion-toolbar/ion-buttons/ion-back-button";
		WebElement backtermsElements = driver.findElementByXPath(backterms);
		backtermsElements.click();
		System.out.println(23);
		// click on main Privacy Policy
		String menuPrivacy = "//*[@id='menuButton']";
		WebElement menuPrivacyElement = driver.findElementByXPath(menuPrivacy);
		menuPrivacyElement.click();
		System.out.println(24);
		// click on Privacy Policy
		String Privacy = "//*[text()='Privacy Policy']";
		WebElement PrivacyElement = driver.findElementByXPath(Privacy);
		PrivacyElement.click();
		driver.navigate().back();
		System.out.println(25);
		// click main menu feedback
		String menufeedback = "//*[@id='menuButton']";
		WebElement menufeedbackElement = driver.findElementByXPath(menufeedback);
		menufeedbackElement.click();

		System.out.println(26);
		// click on feedback button
		String feedbackBtn = "//*[text()='Give Feedback']";
		WebElement feedbackBtnElement = driver.findElementByXPath(feedbackBtn);
		feedbackBtnElement.click();
		System.out.println(666);
		// click on provide your feedback
		String feedbacksend = "//*[@id=\"menu-content\"]/app-send-report/ion-content/ion-grid/form/div/ion-row[2]/ion-col/ion-item/ion-textarea/textarea";
		WebElement feedbacksendElement = driver.findElementByXPath(feedbacksend);
		feedbacksendElement.sendKeys("health is good");

		test.log(Status.PASS,
				"Verify that the give feedback option provides a loser to send a message to the administrator and on click of the send message button and email is triggered to be stakeholders");
		System.out.println(9999);

		System.out.println(27);
		// click on send message
		String msgBtn = "//*[text()='Send Message ']";
		WebElement msgBtnElement = driver.findElementByXPath(msgBtn);
		msgBtnElement.click();

		System.out.println(28);
		// click on back button provide your feedback
		driver.navigate().back();
		System.out.println(29);
		/*
		// click on main button
		String menulogout = "//*[@id='menuButton']";
		WebElement menulogoutElement = driver.findElementByXPath(menulogout);
		menulogoutElement.click();
		//ApolloUtils.verticalScroll(driver);
		//Scrollbar.sendkeys(Keys.PAGE_DOWN);
		System.out.println(30);
		
		// click on logout button
		
		String logout = "//ion-button[text()='Logout']";
		WebElement logoutElement = driver.findElementByXPath(logout);
		logoutElement.click();
		

		test.log(Status.PASS, "Verify that the click of logout button logout the user");
		System.out.println(31);
		
		//click on logout yes or now 
		String yesorno = "//*[@id=\"ion-overlay-1\"]/div/div[3]/button[2]";
		WebElement yesornoElement = driver.findElementByXPath(yesorno);
		yesornoElement.click();
		*/
	}
}
