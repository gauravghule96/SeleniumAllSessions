package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertTestConcept {

	WebDriver driver;

	@BeforeMethod
	public void SetUp(){
		System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		driver=new ChromeDriver();//launch chrome
		
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
	}
	
	@Test()
	public void getgoogletitle(){
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google","title noy matched");
	}
	
	@Test()
	public void googlelogo(){
		boolean b=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		Assert.assertTrue(b);
		Assert.assertEquals(b, true);
	}
	
	@AfterMethod
	public void tearDown(){
	 driver.quit();
	}
}
