package com.sleniumsession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapBoxesSelect {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();//launch chrome
		
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");//Enter URL
		
		driver.findElement(By.xpath("//button[@class='btn btn-secondary dropdown-toggle' and @id='dropdownMenuButton']")).click();
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a"));
		System.out.println(list.size());
		
		//All DropDown Options print on consol:
		
		/*for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i).getText());
		}*/
		
		//Only selecting option print on consol:
		
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("Another action")) {
				list.get(i).click();
				break;
			}
		}
		
		
}
}
