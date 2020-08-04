package com.sleniumsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedXpathConcept {
public static void main(String[] args) {
	System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	
	driver.get("https://community.ebay.com/t5/Half-com/bd-p/21000000002");
	
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Java");
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Java");
	//driver.findElement(By.name("_nkw")).sendKeys("Java");
	
	//driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]")).sendKeys("java");
	//driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("java");
	driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("java");
	
	//dynamic id:
	//id-test_123
	//id-test_34
	
	//end-with id:
	//id-test_455
	//id-test_2434545
	//id-test_test_t_73837
	
	//start-with id:
	//id-13_test_
	//id-6889_test_t_
	//id-788_test_test_t_
	//driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("java");
	//driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("java");
	//driver.findElement(By.xpath("//input[contains(@id,'_test_')]")).sendKeys("java");
	
	//link customized path
	//all link can represented by <a> html tag
	driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();


	

	


	
}
}
