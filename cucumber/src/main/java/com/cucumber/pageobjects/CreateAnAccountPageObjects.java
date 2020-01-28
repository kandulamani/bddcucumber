package com.cucumber.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.testbase.TestBase;

public class CreateAnAccountPageObjects extends TestBase {

	@FindBy(name = "id_gender")
	private WebElement mrTitle;

	@FindBy(name = "customer_firstname")
	private WebElement firstName;

	@FindBy(name = "customer_lastname")
	private WebElement lastNmae;

	/*
	 * @FindBy(name = "id_gender") private WebElement email;
	 */

	@FindBy(name = "passwd")
	private WebElement password;

	@FindBy(name = "days")
	private WebElement day;

	@FindBy(name = "months")
	private WebElement month;

	@FindBy(name = "years")
	private WebElement year;

	@FindBy(name = "firstname")
	private WebElement addressFirstName;

	@FindBy(name = "lastname")
	private WebElement addressLastName;

	@FindBy(name = "company")
	private WebElement addressCompany;

	@FindBy(name = "address1")
	private WebElement address;

	@FindBy(name = "address2")
	private WebElement addressLine2;

	@FindBy(name = "city")
	private WebElement city;

	@FindBy(name = "id_state")
	private WebElement state;

	@FindBy(name = "postcode")
	private WebElement postalCode;

	@FindBy(name = "id_country")
	private WebElement country;

	@FindBy(name = "other")
	private WebElement additionalInfo;

	@FindBy(name = "phone")
	private WebElement homePhone;

	@FindBy(name = "phone_mobile")
	private WebElement mobilePhone;

	@FindBy(name = "alias")
	private WebElement aliasAddress;

	@FindBy(name = "submitAccount")
	private WebElement registerButton;

	public WebElement getMrTitle() {
		return mrTitle;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastNmae() {
		return lastNmae;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getAddressFirstName() {
		return addressFirstName;
	}

	public WebElement getAddressLastName() {
		return addressLastName;
	}

	public WebElement getAddressCompany() {
		return addressCompany;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getAddressLine2() {
		return addressLine2;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getAdditionalInfo() {
		return additionalInfo;
	}

	public WebElement getHomePhone() {
		return homePhone;
	}

	public WebElement getMobilePhone() {
		return mobilePhone;
	}

	public WebElement getAliasAddress() {
		return aliasAddress;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

}
