package com.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.constants.Browser;

public abstract class BrowserUtility {
	Logger logger = LoggerUtilty.getLogger(this.getClass());
//	private static WebDriver driver;
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	public WebDriver getDriver() {
		return driver.get();
	}

	public BrowserUtility(WebDriver driver) {
		super();
		this.driver.set(driver);;
	}
	
	public BrowserUtility(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			driver.set(new ChromeDriver());
		}
		else if (browserName.equalsIgnoreCase("edge")) {
			driver.set(new EdgeDriver());
		}
		else {
			System.err.println("Invalid Browser Name ....Please select chrome or edge browser");
			
		}
	}
	public BrowserUtility(Browser browserName) {
		if(browserName==Browser.CHROME) {
			driver.set(new ChromeDriver());
		}
		else if (browserName==Browser.EDGE) {
			driver.set(new EdgeDriver());
		}
	}
	public BrowserUtility(Browser browserName,boolean isHeadless) {
		if(browserName==Browser.CHROME) {
			if (isHeadless) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless=new");
			options.addArguments("--window-size=1920,1080");
			options.addArguments("--disable-gpu");
			options.addArguments("--no-sandbox");
			options.addArguments("--remote-allow-origins=*");
			driver.set(new ChromeDriver(options));
			}
			else {
				driver.set(new ChromeDriver());
			}
		}
		else if (browserName==Browser.EDGE) {
			if(isHeadless) {
				EdgeOptions edgeOptions = new EdgeOptions();
				edgeOptions.addArguments("--headless=old");
				edgeOptions.addArguments("--disable-gpu");
			driver.set(new EdgeDriver(edgeOptions));
			}
			else {
				driver.set(new EdgeDriver());
			}
		}
	}
	public void goToWebsite(String url) {
		logger.info("Visiting the website "+url);
		driver.get().get(url);
	}
    
	public void maximizeWindow() {
		logger.info("Maximizing the window");
		driver.get().manage().window().maximize();
	}
	
	public void clickOn(By locator) {
		logger.info("Finding the element with locator "+locator);
		WebElement element = driver.get().findElement(locator);
		logger.info("Performing click opertaion on the element "+element);
		element.click();
	}
	
	public void enterText(By locator , String textToEnter) {
		logger.info("Finding the element with locator "+locator);
		WebElement element = driver.get().findElement(locator);
		logger.info("Element is found and sendind text "+element);
		element.sendKeys(textToEnter);
	}
	
	public String getVisibleText(By locator) {
		logger.info("Finding the element with locator "+ locator);
		WebElement element = driver.get().findElement(locator);
		logger.info("Element found and returning the text "+ element.getText());
		return element.getText();
	}
	
	public String takeScreenShot(String name) {
	    
	    TakesScreenshot screenshot = (TakesScreenshot) driver.get();
	    File screenshotData = screenshot.getScreenshotAs(OutputType.FILE);

	    Date date = new Date();
	    SimpleDateFormat format = new SimpleDateFormat("HH-mm-ss");
	    String timeStamp = format.format(date);

	    String path = System.getProperty("user.dir") + "/screenshots/" + name + " - " + timeStamp + ".png"; // ⬅️ Use forward slash
	    File screenshotFile = new File(path);

	    try {
	        FileUtils.copyFile(screenshotData, screenshotFile);
	    } catch (IOException e) {
	        logger.error("Failed to save screenshot", e);
	    }

	    return path;
	}

}

