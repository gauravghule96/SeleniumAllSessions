package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignupStepDefinitions {

	WebDriver driver;
	
	@Given("^user is setup page$")
	public void user_is_setup_page() throws Throwable {
			
			System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
			driver=new ChromeDriver();//launch chrome
			driver.get("file:///E:/JBK/Selenium/Offline%20Website/index.html");
	}

	@When("^user click on Register a new membership link$")
	public void user_click_on_Register_a_new_membership_link() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Register a new membership']")).click();
	}

	

	@Then("^user enter register details \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enter_register_details(String name,String mobile,String gmail,String password) throws Throwable {
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys(mobile);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(gmail);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
	}
	
	@Then("user click on signin button")
	public void user_click_on_signin_button(){
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	}

	
}
