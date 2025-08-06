package com.ui.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import static com.constants.Env.*;
import com.utility.BrowserUtility;
import com.utility.JsonUtility;
import com.utility.LoggerUtilty;


public final class HomePage extends BrowserUtility {
	Logger logger = LoggerUtilty.getLogger(this.getClass());
	public HomePage(Browser browserName,boolean isHeadless) {
		super(browserName,isHeadless);
		goToWebsite(JsonUtility.readJson(QA).getUrl());

	}

	public HomePage(WebDriver driver) {
		super(driver);
	}

	private static final By SIGNIN_LINK_LOCATOR = By.xpath("//a[contains(text(),'Sign in')]");
   public LoginPage goToHomePage() {
	   logger.info("Trying to perform click on go to sign in page");
	   clickOn(SIGNIN_LINK_LOCATOR);
	   LoginPage loginpage = new LoginPage(getDriver());
	   return loginpage;
   }
}