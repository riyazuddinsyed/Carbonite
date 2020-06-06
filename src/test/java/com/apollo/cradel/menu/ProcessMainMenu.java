package com.apollo.cradel.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.apollo.cradle.setup.BaseDriver;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ProcessMainMenu extends BaseDriver {

	@Test(priority = 1)
	public void mainMenu() {
		ExtentTest test = reports.createTest("mainMenu");
		test.log(Status.INFO, "mainMenu starts here...");

		// click on main menu
		String mainmenu = "//*[@id=\"menuButton\"]";
		WebElement mainmenuElement = driver.findElementByXPath(mainmenu);
		mainmenuElement.click();

		// click on my prifile
		String profile = "//*[text()='My Profile']";
		WebElement profileElement = driver.findElementByXPath(profile);
		profileElement.click();

		// click on back button
		driver.navigate().back();
		
		// click on main menu
		String menu = "//*[@id=\"menuButton\"]";
		WebElement menuElement = driver.findElementByXPath(menu);
		menuElement.click();

		// click on add emergency contact
		String contact = "//*[text()='Add/Edit Emergency Contact']";
		WebElement contactElement = driver.findElementByXPath(contact);
		contactElement.click();

		// click on main menu
		String menuarticle = "//*[@id=\"menuButton\"]";
		WebElement menuarticleElement = driver.findElementByXPath(menuarticle);
		menuarticleElement.click();

		// click on article
		String article = "//*[text()='Articles, Tips and Information']";
		WebElement articleElement = driver.findElementByXPath(article);
		articleElement.click();

		// click on back button article
		driver.navigate().back();
		
		// click on main menu
		String menuapollo = "//*[@id=\"menuButton\"]";
		WebElement menuapolloElement = driver.findElementByXPath(menuapollo);
		menuapolloElement.click();

		// click on about hospital
		String abouthospital = "//*[text()='About Apollo Maternity, Fertility & Child Care']";
		WebElement abouthospitalElement = driver.findElementByXPath(abouthospital);
		abouthospitalElement.click();

		// click on back button about hospital
		driver.navigate().back();
		
		// click on main menu
		String menuapollocenter = "//*[@id=\"menuButton\"]";
		WebElement menuapollocenterElement = driver.findElementByXPath(menuapollocenter);
		menuapollocenterElement.click();

		// click on apollo center
		String apollocenter = "//*[text()='Apollo Centres / Virtual Tour']";
		WebElement apollocenterElement = driver.findElementByXPath(apollocenter);
		apollocenterElement.click();

		// click on back
		driver.navigate().back();
		
		// click on main menu
		String menufaq = "//*[@id=\"menuButton\"]";
		WebElement menufaqElement = driver.findElementByXPath(menufaq);
		menufaqElement.click();
		
		// click on faq
		String faqs = "//*[text()='FAQs']";
		WebElement faqsElement = driver.findElementByXPath(faqs);
		faqsElement.click();

		// click on back faqs
		driver.navigate().back();
		
		// click on main menu
		String genmenu = "//*[@id=\"menuButton\"]";
		WebElement genmenuElement = driver.findElementByXPath(genmenu);
		genmenuElement.click();

		//click on general health
		String general="//*[text()='General Health']";
		WebElement generalElement= driver.findElementByXPath(general);
		generalElement.click();

		//click on general health medical condition
		String condition="//*[text()='Common Gynecology Problems']";
		WebElement conditionElement = driver.findElementByXPath(condition);
		conditionElement.click();
		
		//click on save button
		String saveBtn="//*[text()='Save Details ']";
		WebElement saveBtnElement = driver.findElementByXPath(saveBtn);
		saveBtnElement.click();
	
		//click on main menu
		String termsmenu = "//*[@id=\"menuButton\"]";
		WebElement termsmenuElement = driver.findElementByXPath(termsmenu);
		termsmenuElement.click();

		//click on terms & conditions
		String terms="//*[text()='Terms & Conditions']";
		WebElement termsElements = driver.findElementByXPath(terms);
		termsElements.click();

		//click on back button terms & conditions
		driver.navigate().back();
		
		//click on menu privacy
		String privacymenu = "//*[@id=\"menuButton\"]";
		WebElement privacymenuElement = driver.findElementByXPath(privacymenu);
		privacymenuElement.click();

		//click on privacy & conditions
		String privacy="//*[text()='Privacy Policy']";
		WebElement privacyElement= driver.findElementByXPath(privacy);
		privacyElement.click();
		
		//click on back privacy policy
		driver.navigate().back();
		
		//click on main menu feedback
		String mainfeedback= "//*[@id=\"menuButton\"]";
		WebElement mainfeedbackElement=driver.findElementByXPath(mainfeedback);
		mainfeedbackElement.click();
		
		//click on feedback button		
		driver.navigate().back();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//*[text()='Logout']"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		System.out.println("==="+driver.getContext());
		
		//click on logout
		/*String logout="//ion-button[text()='Logout']";
		WebElement logoutElement = driver.findElementByXPath(logout);
		logoutElement.click();
			*/
		//click on ok button logout
		driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-menu/ion-content/ion-list[4]")).click();
		
		//click on yes button for logout
		String yesBtn="//span[text()='Yes']";
		WebElement yesBtnElement = driver.findElementByXPath(yesBtn);
		yesBtnElement.click();
		
	}
}