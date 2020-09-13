package com.webDriver.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	static WebDriver driver=null;	 
   public static WebDriver createInstance(String BrowserType, String location) {
	     
	  
		   switch(BrowserType.toLowerCase()) {
		   case "chrome":
			   WebDriverManager.chromedriver().setup();			  
			   driver = new ChromeDriver();
			   //driver = new ChromeDriver(OptionsManager.getChromeOptions());
		   break;
		   
		   case "ie":
			   WebDriverManager.iedriver().setup();
			   //driver = new InternetExplorerDriver();
			   driver=new InternetExplorerDriver(OptionsManager.getIEOptions());
		   break;
		   
		   case "edge":
			   WebDriverManager.edgedriver().setup();
		   
		   case "firefox":
			   WebDriverManager.firefoxdriver().setup();
			   driver = new FirefoxDriver();
		   default:
			   driver=new InternetExplorerDriver(OptionsManager.getIEOptions());
		   }
		   
		   return driver;
	   } 
	  
   
   

   
   public static void implicitlyWait(int timeInSeconds) {
	   driver.manage().timeouts().implicitlyWait(timeInSeconds , TimeUnit.SECONDS);
   }
   
   public static void setMaxpageLoadTime(int timeInSeconds) {
	   driver.manage().timeouts().pageLoadTimeout(timeInSeconds, TimeUnit.SECONDS);
   }
   
   
}
