package com.sleniumsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDetaebyJS {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();//launch chrome
	
	driver.manage().window().maximize();//maximize the windowj
	driver.manage().deleteAllCookies();//delete all cookies
	
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://www.spicejet.com/");
	
	WebElement date=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
	String dateval="18/08/2020";
	
	SelectDatebyJS(driver, date, dateval);
	
	
}

public static void SelectDatebyJS(WebDriver driver,WebElement element,String dateval){
	JavascriptExecutor js=((JavascriptExecutor) driver);
	js.executeScript("arguments[0].setAttribute('value','"+dateval+"')",element);
}


}
