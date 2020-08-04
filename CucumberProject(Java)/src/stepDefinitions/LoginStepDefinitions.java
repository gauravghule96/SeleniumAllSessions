package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions {
	
WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page(){
		
		System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		driver=new ChromeDriver();//launch chrome
		driver.get("file:///E:/JBK/Selenium/Offline%20Website/index.html");
	}

	@When("^title of login page JavaByKiran$")
	public void title_of_login_page_JavaByKiran() throws Throwable{
		String title=driver.getTitle();
		Assert.assertEquals("JavaByKiran | Log in", title);
	
	}
	
	/*Regural Expressions:
	1. \"(.*)\" 
	2. \"([^\"])\"
*/
	
	
	@Then("^user enter \"(.*)\" and \"(.*)\"$")
	public void user_enter_username_and_password(String username,String password) throws Throwable{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	}
	
	@Then("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();

	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		
		driver.findElement(By.xpath("//span[@class='logo-lg']")).click();

		
		
	}


	
	

}
