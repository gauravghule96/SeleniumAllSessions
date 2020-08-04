package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
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
	
	@Test(priority=1,groups="tilte")
	public void getgoogletitle(){
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=3,groups="logo")
	public void googlelogo(){
		boolean b=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
	}
	
	@Test(priority=2,groups="linkedtext()")
	public void gmaillink(){
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
	}

	@Test(priority=4,groups="Tests")
	public void test1(){
		System.out.println("test1");
	}
	

	@Test(priority=5,groups="Tests")
	public void test2(){
		System.out.println("test2");
		}
	

	@Test(priority=6,groups="Tests")
	public void test3(){
		System.out.println("test3");
		}
	
	@AfterMethod
	public void tearDown(){
	 driver.quit();
	}
}
