package com.sleniumsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	
	driver.get("https://www.spicejet.com/");
	
	Actions actions=new Actions(driver);
	actions.moveToElement(driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"))).build().perform();
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("Travel Agent Login")).click();
}
}
