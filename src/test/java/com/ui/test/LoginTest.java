package com.ui.test;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pojo.User;
import com.utility.LoggerUtilty;
@Listeners(com.ui.listerners.TestListener.class)
public class LoginTest extends TestBase {
	Logger logger = LoggerUtilty.getLogger(this.getClass());

	
    @Test ( description ="Verifies with the valid user is able to login into application", groups = {"e2e","sanity"}, dataProviderClass =com.ui.dataproviders.LoginDataProvider.class , dataProvider = "LoginTestDataProvider",retryAnalyzer=com.ui.listerners.MyRetryAnalyzer.class)
	public void loginTest(User user) {
		assertEquals(homePage.goToHomePage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName() , "Abhijit Naik");
	}
    
    @Test ( description ="Verifies with the valid user is able to login into application", groups = {"e2e","sanity"}, dataProviderClass =com.ui.dataproviders.LoginDataProvider.class , dataProvider = "LoginTestCSVDataProvider",retryAnalyzer=com.ui.listerners.MyRetryAnalyzer.class)
	public void loginCSVTest(User user) {
		assertEquals(homePage.goToHomePage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName() , "Abhijit Naik");
	}
    
    @Test ( description ="Verifies with the valid user is able to login into application", groups = {"e2e","sanity"}, dataProviderClass =com.ui.dataproviders.LoginDataProvider.class , dataProvider = "LoginTestExcelDataProvider",retryAnalyzer=com.ui.listerners.MyRetryAnalyzer.class)
	public void loginExcelTest(User user) {
		assertEquals(homePage.goToHomePage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName() , "Abhijit Naik");
	}

}
