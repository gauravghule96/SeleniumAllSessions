package com.sleniumsession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoostStrapDropBoxHandle {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();//launch chrome
	
	driver.manage().window().maximize();//maximize the window
	driver.manage().deleteAllCookies();//delete all cookies
	
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");//Enter URL
	
	driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
	
	List<WebElement> list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li//a//label"));
	System.out.println(list.size());
	
	//SELECT choose options:
	
	/*for (int i = 0; i <list.size(); i++) {
		System.out.println(list.get(i).getText());
	if (list.get(i).getText().contains("Java")) {
		list.get(i).click();
		break;
	}	
		
	}*/
	
	//selecting all checkbox/options :
	
	for (int i = 0; i <list.size(); i++) {
		System.out.println(list.get(i).getText());
		list.get(i).click();
	}
	
	
	
	
	
}
}
