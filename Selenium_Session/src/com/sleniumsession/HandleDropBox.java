package com.sleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {
public static void main(String[] args) {
	//8.Select Locator
	System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	 //To handle drop box
	 Select seclect=new Select(driver.findElement(By.id("month")));
	 seclect.selectByVisibleText("Aug");
}
}
