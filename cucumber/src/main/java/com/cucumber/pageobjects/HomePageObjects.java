package com.cucumber.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.testbase.TestBase;

public class HomePageObjects extends TestBase {

	@FindBy(xpath = "//a[@class='login']")
	private WebElement signInLink;

	@FindBy(xpath = "//*[contains(text(),'Create an account')]")
	private WebElement createAnAccountText;
	
	@FindBy(id="email_create")
	private WebElement createAnAccountEmailField;
	
	
	@FindBy(xpath = "//*[@class='icon-user left']")
	private WebElement createAnAccountButton;

	public WebElement getSignInLink() {
		return signInLink;
	}

	public WebElement getCreateAnAccountText() {
		return createAnAccountText;
	}

	public WebElement getCreateAnAccountEmailField() {
		return createAnAccountEmailField;
	}

	public WebElement getCreateAnAccountButton() {
		return createAnAccountButton;
	}
}
