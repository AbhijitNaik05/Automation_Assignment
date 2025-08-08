package com.ui.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.pages.MyAccountPage;

@Listeners(com.ui.listerners.TestListener.class)
public class SearchProductTest extends TestBase {
	private MyAccountPage myAccountPage;
	private static final String SEARCH_TERM ="Printed summer dress";
    @BeforeMethod(description="Valid users logs into application")
    public void setup() {
    	myAccountPage = homePage.goToHomePage().doLoginWith("sibol25037@balincs.com", "Password");
    }
	@Test (description ="Verify if the logged in user is able to search for a product and correct product search result displayed",groups= {"e2e","sanity"})
	public void verifyProductSearchTest() {
		boolean actulResult =myAccountPage.searchForProduct(SEARCH_TERM).isSearchTermIsPresentInProductList(SEARCH_TERM);
		Assert.assertEquals(actulResult,true);
		
	}
}
