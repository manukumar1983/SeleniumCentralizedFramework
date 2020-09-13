package com.base.webui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	private WebDriver driver;	
    long TIMEOUT = 5000;
    private WebDriverWait wait;
    
    
    
	public BasePage(WebDriver driver) {
		this.driver=driver;
		wait = new WebDriverWait(driver,TIMEOUT);
		PageFactory.initElements(driver, this);
	}    
	
    protected WebElement waitforElementVisibility(WebElement element) {
    	WebElement waitElement = wait.until(ExpectedConditions.visibilityOf(element));
    	wait.withMessage("Waiting for element to be visible");
    	return waitElement;
    }
    
    protected WebElement waitforElementtoBeclickable(WebElement element) {
    	WebElement waitElement = wait.until(ExpectedConditions.elementToBeClickable(element));
    	wait.withMessage("Waiting for element to be clicable");
    	return waitElement;
    }
    
    protected void waitforElemenToDisappear(WebElement element) {
    	wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOf(element)));
    	wait.withMessage("Waiting for element to disappear");
    }
     
    protected void waitforTextToDisappear(WebElement element, String text) {
    	wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(element, text)));
    	wait.withMessage("Waiting for string to disappear");
    	
    }
    
    
    
    
    
}
