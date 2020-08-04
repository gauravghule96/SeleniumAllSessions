package com.sleniumsession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {
public static void main(String[] args) {
	System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();//launch chrome
	
	driver.manage().window().maximize();//maximize the window
	driver.manage().deleteAllCookies();//delete all cookies
	
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com/");//Enter URL
	
	//1.get the total linked count on the page
	//2.get text of each linked on the page
	
	//all links represented by <a> html tag
	List <WebElement> linkedlist=driver.findElements(By.tagName("a"));
	
	//size of linkedlist:
	System.out.println(linkedlist.size());//1.result
	
	for (int i = 0; i < linkedlist.size(); i++) {
		String linktext=linkedlist.get(i).getText();
		 System.out.println(linktext);//2.result
		
	}
	
	
	
	
}
}
