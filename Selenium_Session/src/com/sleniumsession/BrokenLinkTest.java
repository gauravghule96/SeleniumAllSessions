package com.sleniumsession;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {
public static void main(String[] args) throws MalformedURLException, IOException {
	System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	//dynamic wait
	driver.manage().timeouts().pageLoadTimeout(4000,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com/");
	
	//link==>//a href<http.test.com>
	//image==>//img href<http.test.com>
	
	//450
	List<WebElement> linkist=driver.findElements(By.tagName("a"));
	linkist.addAll(driver.findElements(By.tagName("img")));
	
	//full size of link ad image:
	System.out.println("size of full link and images==>"+linkist.size());
	
	List<WebElement> activelink=new ArrayList<WebElement>();
	
	
	//iterate linklist:exclude all link amd img:does not have any href attributes=450
	for (int i = 0; i < linkist.size(); i++) {
		System.out.println(linkist.get(i).getAttribute("href"));
	if (linkist.get(i).getAttribute("href") !=null && (! linkist.get(i).getAttribute("href").contains("javascript"))) {
	
		activelink.add(activelink.get(i));
	}
	}
	
	//get the size of active links:
	System.out.println("size of active links and image==>"+activelink.size());
	
	//check href url:get httpconnetion api:
	//200=ok
	//404=page not found
	//500=internal error
	//400=bad request
	
	for (int j = 0; j < activelink.size(); j++) {
		
	HttpURLConnection connection=(HttpURLConnection) new URL(activelink.get(j).getAttribute("href")).openConnection();
	
	connection.connect();
	String Responsemsg=connection.getResponseMessage();//ok,page not found,bad request etc.
	connection.disconnect();
	System.out.println(activelink.get(j).getAttribute("href")+"==>"+Responsemsg);
	
	}
	
}
}
