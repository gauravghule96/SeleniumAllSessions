package com.sleniumsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//dynamic wait
	driver.manage().timeouts().pageLoadTimeout(4000,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	
	driver.get("http://demo.guru99.com/test/guru99home/");
	Thread.sleep(3000);
	
	driver.switchTo().frame("a077aa5e");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("html/body/a/img")).click();
	
}
}
