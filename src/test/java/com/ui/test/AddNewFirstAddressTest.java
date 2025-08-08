package com.ui.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pojo.AddressPojo;
import com.ui.pages.AddressPage;
import com.ui.pages.MyAccountPage;
import com.utility.FakeAddressUtility;

public class AddNewFirstAddressTest  extends TestBase{
	private MyAccountPage myAccountPage;
	private AddressPage addressPage;
	private AddressPojo address;
	@BeforeMethod (description ="valid first time user login into application")
	public void setup() {
		myAccountPage = homePage.goToHomePage().doLoginWith("sibol25037@balincs.com", "Password");
		address = FakeAddressUtility.getFakeAddress();
	}
	
	@Test
	public void addNewAddress() throws InterruptedException {
		Thread.sleep(2000);
		String newAddress= myAccountPage.goToAddAddressPage().saveAddress(address);
		Assert.assertEquals(newAddress, address.getAddressAlias().toUpperCase());
		
	}

}
