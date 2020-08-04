package com.sleniumsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();//launch chrome
	
	driver.manage().window().maximize();//maximize the window
	driver.manage().deleteAllCookies();//delete all cookies
	
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("file:///E:/JBK/Selenium/Offline%20Website/index.html");//Enter URL
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	driver.findElement(By.linkText("Users")).click();
	Thread.sleep(2000);
	
	// /html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[2]
	// /html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[2]
	// /html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[4]/td[2]
	// /html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[5]/td[2]
	
	String before_xpath="/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[";
	String after_xpath="]/td[2]";
	
	//To table print:
	/*String text=driver.findElement(By.xpath("//div[@class='box-body table-responsive no-padding']")).getText();
	System.out.println(text);*/
		
	//method 1;
	for (int i=2; i<=5; i++) {
	String text=driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
	System.out.println(text);
	if (text.contains("1")) {
		// /html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[4]/td[1]
		driver.findElement(By.xpath(" /html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+i+"]/td[1]")).click();
	}
	}
	//method-2:checkbox,radio button on click
	/*driver.findElement(By.xpath("//a[contains(text(),'_test_te_')]/parent::td//preceding-sibling::td//input[@id=contact_a]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'ui_uiui')]/parent::td//preceding-sibling::td//input[@id=contact_a]")).click();
	*/
	
}
}
