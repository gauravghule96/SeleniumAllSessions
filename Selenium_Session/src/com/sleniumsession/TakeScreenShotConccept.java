package com.sleniumsession;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotConccept {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();//launch chrome
	
	driver.manage().window().maximize();//maximize the window
	driver.manage().deleteAllCookies();//delete all cookies
	
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("http://www.google.com");//Enter URL
	
	//take a screenshot and store file format
	File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//copy to screenshot desired location by using
	FileUtils.copyFile(src, new File("E:\\workspace2\\Selenium_Session\\src\\com\\sleniumsession\\google1.png"));
}
}
