package com.sleniumsession;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleToWindowsPopUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();//launch chrome
	
	driver.manage().window().maximize();//maximize the window
	driver.manage().deleteAllCookies();//delete all cookies
	
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("http://www.popuptest.com/goodpopups.html");//Enter URL
	
	driver.findElement(By.xpath("//a[@class='black']")).click();
	
	Thread.sleep(2000);
	
	Set<String> handler=driver.getWindowHandles();
	
	Iterator<String> itr=handler.iterator();
	
	String parentwindowid=itr.next();
	System.out.println("parent window id"+parentwindowid);
	
	String childwindowid=itr.next();
	System.out.println("child window id"+childwindowid);
	
	driver.switchTo().window(childwindowid);
	
	Thread.sleep(2000);
	
	System.out.println("child window title"+driver.getTitle());
	
	driver.close();
	
	driver.switchTo().window(parentwindowid);
	
	Thread.sleep(2000);
	
	System.out.println("parent window title"+driver.getTitle());
	
	
	
	
	
	
	
}
}
