package com.sleniumsession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.webkitURL;

public class CalenderSelectTest {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();//launch chrome
	
	driver.manage().window().maximize();//maximize the windowj
	driver.manage().deleteAllCookies();//delete all cookies
	
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
	
    driver.findElement(By.xpath("//span[@class='k-icon k-i-calendar']")).click();;
    
    
	String date="31-September-2020";
	String[] dateArr=date.split("-");
	String day=dateArr[0];
	String month=dateArr[1];
	String year=dateArr[2];
	
	Select select=new Select(driver.findElement(By.xpath("//input[@name='bdaytime']")));
	select.selectByVisibleText(month);
	 
	 Select select1=new Select(driver.findElement(By.xpath("//input[@name='bdaytime']")));
	 select1.selectByVisibleText(year);
	 
	// /html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[2]
	// /html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[4]
	// /html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[7]
	 
	String beforexpath="/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[";
    String afterxpath="]/td[";
    
    final int totaldys=7;
    
	 boolean flag=false;
	 String dayval=null;
	 
    for(int rowNum=2;rowNum<=7;rowNum++){
    	
     for(int colNum=1;colNum<=totaldys;colNum++){
    
    try{	 
    dayval=driver.findElement(By.xpath(beforexpath+rowNum+afterxpath+colNum+"]")).getText();
    }catch(NoSuchElementException e){
    	System.out.println("Please enter the correct value");
    	flag=false;
    	break;
    }
    System.out.println(dayval);
    if (dayval.equals(day)) {
    	driver.findElement(By.xpath(beforexpath+rowNum+afterxpath+colNum+"]")).click();
    	flag=true;
    	break;
	}
   	}
     if (flag) {
		break;
	}
    	
    }
	 
 
	
	
}
}
