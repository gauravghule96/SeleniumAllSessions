 package com.sleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Concept {
public static void main(String[] args) {
	System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///E:/JBK/Selenium/Offline%20Website/index.html");
	//1.xpath---2
	//Absolute xpath shold not used----eg./html/body/div/div[1]
	//Relative xpath should be used---eg.//input[@id='email']
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
	driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();
	
	//2.id----1
	/*driver.findElement(By.id("name")).sendKeys("Gaurav Ghule");
	driver.findElement(By.id("mobile")).sendKeys("3655897u090");
	
	*///3.name---3
    /*driver.findElement(By.name("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.name("password")).sendKeys("123456");
	driver.findElement(By.name("Sing In")).click();*/
	
	//4.link Text:only use to link 
	//driver.findElement(By.linkText("I already have a membership")).click();
	
    //5.partial link text:not useful
	//driver.findElement(By.partialLinkText("")).click();
	
	//6.CSSselector---2
	//driver.findElement(By.cssSelector("#password")).sendKeys("275889126");
	
	//7.classname:not useful----4
	//If id is there---#{id}
	//If class is there---.{class}
	//driver.findElement(By.className("btn btn-primary btn-block btn-flat")).click();
	
	
	
}
}
