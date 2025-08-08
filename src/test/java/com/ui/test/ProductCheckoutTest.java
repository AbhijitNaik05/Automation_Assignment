package com.ui.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.constants.Size.*;
import com.ui.pages.SearchResultPage;

public class ProductCheckoutTest extends TestBase{
	private static final String SEARCH_TERM ="Printed summer dress";
	private SearchResultPage searchResultPage;
	@BeforeMethod (description ="User logs into application and seraches for a product")
	public void setup() {
		searchResultPage = homePage.goToHomePage().doLoginWith("sibol25037@balincs.com", "Password").searchForProduct(SEARCH_TERM);
	}
	
	@Test (description ="verify if the logged user is able to buy provide", groups= {"e2e","smoke","Sanity"})
	public void checkOutTest() {
	String result =	searchResultPage.clickOnProductIndexAt(0).changeSize(M).addProductToCart().proceedToCheckout().goToConfirmAddressPage().goToShippmentPage().goToPaymentPage().makePaymentByWire();
	Assert.assertTrue(result.contains("complete"));
	}

}
