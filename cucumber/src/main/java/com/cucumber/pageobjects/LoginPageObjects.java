package com.cucumber.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.testbase.TestBase;

public class LoginPageObjects extends TestBase {

	@FindBy(name = "email")
	private WebElement userNameField;

	@FindBy(name = "pass")
	private WebElement passwordField;

	@FindBy(id = "loginbutton")
	private WebElement loginButton;

	public WebElement getUserNameField() {
		return userNameField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
