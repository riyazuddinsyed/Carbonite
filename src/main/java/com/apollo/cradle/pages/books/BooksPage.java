package com.apollo.cradle.pages.books;

import org.openqa.selenium.support.PageFactory;

import com.apollo.cradle.driver.BaseDriver;

public class BooksPage {

	public BooksPage() {
		PageFactory.initElements(BaseDriver.getInstance(), this);
	}
}
