package stepDefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserAddwithMap {
	
	WebDriver driver;
	
	@Given("^login page areday login$")
	public void login_page_areday_login() throws Throwable {
		System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		driver=new ChromeDriver();//launch chrome
		driver.get("file:///E:/JBK/Selenium/Offline%20Website/index.html");
	}

	@When("^user enter username and password and click on loginbtn$")
	public void user_enter_username_and_password_and_click_on_loginbtn(DataTable credentials) throws Throwable {
		for (Map<String,String> data :credentials.asMaps(String.class,String.class)) {
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(data.get("username"));
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(data.get("password"));
			driver.findElement(By.xpath("//button[@type='submit']")).click();

		}
	    
	}

	@Then("^user on homepage click on user link$")
	public void user_on_homepage_click_on_user_link() throws Throwable {
		driver.findElement(By.linkText("Users")).click();
	   	}

	@Then("^user click on Add User button$")
	public void user_click_on_Add_User_button() throws Throwable {
		driver.findElement(By.xpath("//button[text()='Add User']")).click();
	}

	@Then("^enter add user page details and click on submit bt$")
	public void enter_add_user_page_details_and_click_on_submit_bt(DataTable addusers) throws Throwable {
		for (Map<String, String> data : addusers.asMaps(String.class, String.class)) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(data.get("usernames"));
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys(data.get("email"));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(data.get(" mobile"));
		driver.findElement(By.xpath("//input[@id='course']")).sendKeys(data.get("courses"));
		
		WebElement maleradiobtn=driver.findElement(By.xpath("//input[@id='Male']"));
		Boolean b=maleradiobtn.isDisplayed();
		
		Select select=new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		select.selectByVisibleText("Delhi");
		
		driver.findElement(By.id("password")).sendKeys("passwords");
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		}

		
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	}



}
