package com.seleniumpoc.infy.seleniumpoc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.webui.BasePage;

public class googlePage extends BasePage {
	@FindBy(name = "q")
	WebElement searchBox;
	
	googlePage(WebDriver driver) {
		super(driver);
	}

	public void enterSerachBox(String name) {
		searchBox.sendKeys(name);
		searchBox.sendKeys(Keys.ENTER);
		
	}
	
	public void enterKeys() {
		searchBox.sendKeys(Keys.ENTER);
	}
	
}
