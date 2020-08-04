package com.sleniumsession;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglesearrchTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();//launch chrome
		
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");//Enter URL
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		
		System.out.println("total number of suggestions in chekbox :" +list.size());
		
		for (int i=1;i<=10;i++) {
		System.out.println(list.get(i).getText());
		if (list.get(i).getText().contains("javascript tutorial")) {
			list.get(i).click();
			break;
		}	
		}
		
	}

}
