package com.sleniumsession;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExeecutorConcept {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();//launch chrome
	
	driver.manage().window().maximize();//maximize the window
	driver.manage().deleteAllCookies();//delete all cookies
	
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com/");//Enter URL
	
    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gauravghule");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("18081996");
	
	
	WebElement loginbtn=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
	
	flash(loginbtn, driver);//highlight element login button
	changeColor("rgb(((0,200,0)", loginbtn, driver);
	
	drawborder(loginbtn, driver);//draw border on login button
	//take screenshot login button on red border
	File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("E:/workspace2/Selenium_Session/src/com/sleniumsession/element.pang"));
	
	//generateAlert(driver, "this is problem with login btn in login page");
	
	clickElementbyJS(loginbtn, driver);//click on any element by using 
	
	driver.navigate().refresh();//by using selenium method which refresh webpage 
	
	refreshBrowserbyJS(driver);//refresh webpage by JS 
	
	System.out.println(getTitleWebpagebyJS(driver));//get webpage title by JS
	
	System.out.println(getTitleWebpagebyJS(driver));//to get all inner text in Webpage by JS
	
	scrollPageDown(driver);//to scroll down on webpage
	
	WebElement createLink=driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]"));
	scrollIntoView(createLink, driver);
	
}
    public static void flash(WebElement element,WebDriver driver) {
    	JavascriptExecutor jse=((JavascriptExecutor) driver);
    	String bgcolor=element.getCssValue("backgroundColor");
    	for (int i = 0; i < 100; i++) {
    		changeColor("rgb(((0,200,0)",element,driver);
    		changeColor(bgcolor, element, driver);
		}
}
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor jse=((JavascriptExecutor) driver);
		jse.executeScript("arguments[0].style.backgroundColor= '" +color+"'", element);
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
	}
		
    public static void drawborder(WebElement element,WebDriver driver) {
    	JavascriptExecutor jse=((JavascriptExecutor) driver);
		jse.executeScript("arguments[0].style.border='3px solid red'", element);
}
    public static void generateAlert(WebDriver driver,String message) {
    	JavascriptExecutor jse=((JavascriptExecutor) driver);
		jse.executeScript("alert('"+message+"')");
	}
    public static void clickElementbyJS(WebElement element,WebDriver driver) {
    	JavascriptExecutor jse=((JavascriptExecutor) driver);
		jse.executeScript("arguments[0].click();", element);
	}
    public static void refreshBrowserbyJS(WebDriver driver) {
    	JavascriptExecutor jse=((JavascriptExecutor) driver);
		jse.executeScript("history.go(0)");
	}
    public static String getTitleWebpagebyJS(WebDriver driver) {
    	JavascriptExecutor jse = ((JavascriptExecutor)driver);
    	String title =  jse.executeScript("return document.title;").toString();
    	return title;
	}
    public static  String getInnerTextWebpagebyJS(WebDriver driver) {
    	JavascriptExecutor jse = ((JavascriptExecutor)driver);
    	String innertext =  jse.executeScript("return document.documentElement.innerText;").toString();
		return innertext;
	}
    public static void scrollPageDown(WebDriver driver) {
    	  JavascriptExecutor jse =( (JavascriptExecutor)driver);
    	  jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
    public static void scrollIntoView(WebElement element,WebDriver driver) {
    	 JavascriptExecutor jse =( (JavascriptExecutor)driver);
   	     jse.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
