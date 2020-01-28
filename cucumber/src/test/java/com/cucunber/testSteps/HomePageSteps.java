package com.cucunber.testSteps;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;

import com.cucumber.helperclasses.ElementHelper;
import com.cucumber.pageobjects.HomePageObjects;
import com.cucumber.testbase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends TestBase {

	public HomePageObjects homePageObjects;
	public ElementHelper elementHelper;

	@Given("^I launch application with \"([^\"]*)\"$")
	public void iLaunchApplicationWith(String arg1) throws Throwable {
		enterURL(arg1);

	}

	@When("^I click on sign in link$")
	public void iClickOnSignInLink() throws Throwable {
		homePageObjects = new HomePageObjects();
		clickOperation(homePageObjects.getSignInLink());
	}

	@Then("^I verify create an account page is displayed$")
	public void iVerifyCreateAnAccountPageIsDisplayed() throws Throwable {
		homePageObjects = new HomePageObjects();
		elementHelper = new ElementHelper();
		Assert.assertTrue(elementHelper.elementIsDisplayed(homePageObjects.getCreateAnAccountText()));

	}

	@Then("^I enter new email address$")
	public void iEnterNewEmailAddress() throws Throwable {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		homePageObjects = new HomePageObjects();
		sendKeysOperation(homePageObjects.getCreateAnAccountEmailField(), generatedString + "@gmail.com");

	}

}
