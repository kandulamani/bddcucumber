package com.cucunber.testSteps;

import org.testng.Assert;

import com.cucumber.pageobjects.LoginPageObjects;
import com.cucumber.testbase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends TestBase {
	public LoginPageObjects loginPageObjects;

	@Given("^I am on the Login page URL \"([^\"]*)\"$")
	public void iAmOnTheLoginPageURL(String arg1) throws Throwable {
		enterURL(arg1);
	}

	@When("^I enter username as \"([^\"]*)\"$")
	public void iEnterUsernameAs(String arg1) throws Throwable {
		System.out.println("userName is " + arg1);
		loginPageObjects = new LoginPageObjects();
		sendKeysOperation(loginPageObjects.getUserNameField(), arg1);
	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void iEnterPasswordAs(String arg1) throws Throwable {
		System.out.println("Password is " + arg1);
		loginPageObjects = new LoginPageObjects();
		sendKeysOperation(loginPageObjects.getPasswordField(), arg1);
	}

	@When("^click on login button$")
	public void clickOnLoginButton() throws Throwable {
		System.out.println("Click on Login Button");
		loginPageObjects = new LoginPageObjects();
		clickOperation(loginPageObjects.getLoginButton());
		
	}

	@Then("^I sould see application homepage$")
	public void iSouldSeeApplicationHomepage() throws Throwable {
		Assert.assertEquals("Login", "bbbbbb");

	}

}
