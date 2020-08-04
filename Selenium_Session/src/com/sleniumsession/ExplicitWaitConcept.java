package com.sleniumsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
public static void main(String[] args) {
	System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();//launch chrome
	
	driver.manage().window().maximize();//maximize the window
	driver.manage().deleteAllCookies();//delete all cookies
	
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("http://www.facebook.com");//Enter URL
	
	clickon(driver, driver.findElement(By.xpath("//input[@value='Log In']")), 15);
	
	clickon(driver, driver.findElement(By.xpath("//a[@class='_8esh']")), 10);
	
}

    public static void clickon(WebDriver driver,WebElement locator,int timeout) {
	new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
    locator.click();	
    	
    }  	
    	
    	
    	
    	
    	
}
