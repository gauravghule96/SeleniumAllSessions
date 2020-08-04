package com.sleniumsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
	//WebDriver driver=new ChromeDriver();//launch chrome
	
	HtmlUnitDriver driver=new HtmlUnitDriver();
	
	driver.manage().window().maximize();//maximize the window
	driver.manage().deleteAllCookies();//delete all cookies
	
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com/?stype=lo&jlou=Afd_L_ZN9TQ2gV6vTNLRlTZZYEk2YbYZqXAMJrPLcSZkFXlrr-yRK-jqzec3mvQaDyKxd8x579WAe4l-MTsujbnxI4jHIF_VeIbYvRff_Z_fhw&smuh=4805&lh=Ac_Yscvcei_5hASi");
	
	System.out.println("Before login page title"+driver.getTitle());
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gaurav96ghule@gmail.com");
	
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("18081996");
	
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	
	Thread.sleep(2000);
	
	System.out.println("after login page title"+driver.getTitle());

	
	
}
}
