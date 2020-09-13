package com.base.webui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.webDriver.factory.BrowserFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	protected static ThreadLocal<WebDriver> seleniumDriver = new ThreadLocal<WebDriver>();
	
	@Parameters ({"browserType", "appURL", "runLocation"})
	@BeforeMethod
	public void setUp (@Optional String browserType, @Optional String appURL, @Optional String runLocation) {
		new BrowserFactory();		
		runLocation = "local";
		WebDriver driver = BrowserFactory.createInstance(browserType, runLocation);		
		setWebDriver(driver);	
		System.out.println("the browser is "+browserType);
	}
	
	
		
	
	@AfterMethod
	public void tearDown() {
		//getWebDriver().quit();
	}
	
	
	public  void setWebDriver(WebDriver driver) {
		seleniumDriver.set(driver);
	}
	
	public  WebDriver getWebDriver() {
		return seleniumDriver.get();
	}

}
