package com.sleniumsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();//launch chrome
	
	driver.manage().window().maximize();//maximize the window
	driver.manage().deleteAllCookies();//delete all cookies
	
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://www.browserstack.com/users/sign_up");//Enter URL
	
	//1.isDisplayed() method:
	boolean b1= driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();
	System.out.println(b1);//true
	
	//2.isenabled() method:
	boolean b2=driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
	System.out.println(b2);//false
	
	//terms and condition in isunabled() method:
	driver.findElement(By.xpath("//input[@name='terms_and_conditions']")).click();
	boolean b3=driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
	System.out.println(b3);//true
	
	//3.isSelect() method:
	boolean b4=driver.findElement(By.xpath("//input[@name='terms_and_conditions']")).isSelected();
	System.out.println(b4);//true
	
	//is-deselected checkbox:
	driver.findElement(By.xpath("//input[@name='terms_and_conditions']")).click();
	boolean b5=	driver.findElement(By.xpath("//input[@name='terms_and_conditions']")).isSelected();
	System.out.println(b5);//false


	
	
	
}
}
