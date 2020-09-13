package com.seleniumpoc.infy.seleniumpoc;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.webui.BaseTest;
import com.webDriver.factory.AppConfigurationReader;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.nashorn.internal.runtime.Context;

public class NewTest extends BaseTest {
	public WebDriver driver;
  
    @Test
	public void test1() {
	  getWebDriver().get("http://google.com");
	  googlePage gp = new googlePage(getWebDriver());	 
	  gp.enterSerachBox("manu");
	  System.out.println("entering manu");
	 
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
  }
  
  @Test
  public void test2() {
	  getWebDriver().get("http://google.com");
	  googlePage gp = new googlePage(getWebDriver());	
	  gp.enterSerachBox("Dhruvitha");
	  System.out.println("entering dhruvitha");
	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
  }
	
	  
  
  
}
