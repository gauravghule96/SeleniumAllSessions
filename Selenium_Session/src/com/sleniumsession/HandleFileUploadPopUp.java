package com.sleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {
public static void main(String[] args) {
	System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://filebin.net/");
	
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\vaibh");
	
}
}
