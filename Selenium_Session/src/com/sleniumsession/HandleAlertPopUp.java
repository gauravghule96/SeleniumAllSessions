package com.sleniumsession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	driver.findElement(By.xpath("//input[@name='proceed']")).click();//click on login btn
	Thread.sleep(5000);
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	String text=alert.getText();
	if (text.equals("Please enter a valid user name")) {
		System.out.println("Correct alert msg");
	}else {
		System.out.println("incorrect alert msg ");
	}
	alert.accept();//click on ok btn
	//alert.dismiss();//click on cancel btn
	//driver.quit();
	
}
}
