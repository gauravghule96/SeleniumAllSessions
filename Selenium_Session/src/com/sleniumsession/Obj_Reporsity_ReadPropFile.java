package com.sleniumsession;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Obj_Reporsity_ReadPropFile {
	static WebDriver driver;
public static void main(String[] args) throws IOException {
	Properties pro=new Properties();
	
	FileInputStream fis=new FileInputStream("E:\\workspace2\\Selenium_Session\\src\\com\\sleniumsession\\config.properties");
	pro.load(fis);
	
	System.out.println(pro.getProperty("name"));
	System.out.println(pro.getProperty("age"));
	
	String url=pro.getProperty("URL");
	System.out.println(url);
	
	String browsernmae=pro.getProperty("browser");
	System.out.println(browsernmae);
	
	if (browsernmae.equals("chromee")) {
		System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		 driver=new ChromeDriver();
	}else if (browsernmae.equals("FF")) {
		System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		 driver=new FirefoxDriver();
	}else if (browsernmae.equals("IE")) {
		System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		 driver=new InternetExplorerDriver();
	}
	driver.get(url);
	
	driver.findElement(By.xpath(pro.getProperty("firstame_xpath_id"))).sendKeys(pro.getProperty("firstname"));
	
	driver.findElement(By.xpath(pro.getProperty("username_xpath_id"))).sendKeys(pro.getProperty("lastname"));
	
	
	
	
	
}
}
