package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pojo.AddressPojo;
import com.utility.BrowserUtility;

public class AddressPage extends BrowserUtility{
	private static final By COMPANY_TEXTBOX_LOCATOR = By.id("company");
	private static final By ADDRESS1_TEXTBOX_LOCATOR = By.id("address1");
	private static final By ADDRESS2_TEXTBOX_LOCATOR = By.id("address2");
	private static final By CITY_TEXTBOX_LOCATOR = By.id("city");
	private static final By POSTAL_CODE_TEXTBOX_LOCATOR = By.id("postcode");
	private static final By HOME_PHONE_TEXTBOX_LOCATOR = By.id("phone");
	private static final By MOBILE_PHONE_TEXTBOX_LOCATOR = By.id("phone_mobile");
	private static final By OTHER_INFORMATION_TEXTBOX_LOCATOR = By.id("other"); 
	private static final By ADDRESS_ALIAS_TEXTBOX_LOCATOR = By.id("alias");
	private static final By STATE_DROPDOWN_LOCATOR = By.id("id_state");
	private static final By SAVE_ADDRESS_BUTTON_LOCATOR = By.id("submitAddress");
	private static final By ADDRESS_HEADING = By.tagName("h3");
	public AddressPage(WebDriver driver) {
		super(driver);
	}
	
	public String saveAddress(AddressPojo addressPojo) {
		enterText(COMPANY_TEXTBOX_LOCATOR , addressPojo.getCompany());
		enterText(ADDRESS1_TEXTBOX_LOCATOR , addressPojo.getAddressLine1());
		enterText(ADDRESS2_TEXTBOX_LOCATOR , addressPojo.getAddressLine2());
		enterText(CITY_TEXTBOX_LOCATOR , addressPojo.getCity());
		enterText(POSTAL_CODE_TEXTBOX_LOCATOR , addressPojo.getPostalCode());
		enterText(HOME_PHONE_TEXTBOX_LOCATOR , addressPojo.getHomePhoneNumber());
		enterText(MOBILE_PHONE_TEXTBOX_LOCATOR , addressPojo.getMobileNumber());
		enterText(OTHER_INFORMATION_TEXTBOX_LOCATOR , addressPojo.getOtherInformation());
		clearText(ADDRESS_ALIAS_TEXTBOX_LOCATOR );
		enterText(ADDRESS_ALIAS_TEXTBOX_LOCATOR , addressPojo.getAddressAlias());
		selectFromDropDown(STATE_DROPDOWN_LOCATOR , addressPojo.getState());
		clickOn(SAVE_ADDRESS_BUTTON_LOCATOR);
		return getVisibleText(ADDRESS_HEADING);
	}
	
	

}
