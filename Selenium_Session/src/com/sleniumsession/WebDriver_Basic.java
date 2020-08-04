package com.sleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_Basic {
	public static void main(String[] args) {
		/*System.setProperty("webdriver.geckodriver.driver", "geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");*/
		
		System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		String title=driver.getTitle();//get title
		System.out.println(title);
		
		if (title.equals("Google")) {
			System.out.println("Correct title");
		}else {
			System.out.println("InCorrect title");
		}
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//driver.close();
		driver.quit();
	}
 
}
