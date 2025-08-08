package com.ui.test;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.utility.LoggerUtilty;
@Listeners(com.ui.listerners.TestListener.class)
public class InvalidCredLoginTest extends TestBase {
	Logger logger = LoggerUtilty.getLogger(this.getClass());
    private static final String INVALID_EMAIL_ADDRESS ="xyz@gmail.com";
    private static final String INVALID_PASSWORD ="password";
    @Test ( description ="Verifiy if the proper error message is displayed when user enters invalid credentails", groups = {"e2e","sanity"})
	public void loginTest() {
		assertEquals(homePage.goToHomePage().doLoginWithInvalidCredentials(INVALID_EMAIL_ADDRESS, INVALID_PASSWORD).getErrorMessage(),"Authentication failed.");
	}
    
    

}
