import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentRoptSCRShot {
	
	public WebDriver driver;
	public ExtentReports extent;
	public ExtentTest extenttest;
	
	@BeforeTest
	public void setExtent(){
		extent=new ExtentReports(System.getProperty("user.dir")+"\\test-output\\Extent.html",true);
		extent.addSystemInfo("Host Name","DESKTOP-39UJIFT");
		extent.addSystemInfo("User Name","vaibh");
		extent.addSystemInfo("Environment","QA");
	}
	
	
	@AfterTest
	public void endReport(){
		extent.flush();
		extent.close();
	}
	

	public static String getScreenShot(WebDriver driver,String screenshotName) throws IOException{
		String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot) driver;
		File sourc=ts.getScreenshotAs(OutputType.FILE);
		String destinations=System.getProperty("user.dir")+"\\test-output\\Extent.html"+screenshotName+
				dateName+".pang";
		File finaldestinatin=new File(destinations);
	
		FileUtils.copyFile(sourc, finaldestinatin);
		
		return destinations;
		
	}
	
	
	
	
	
	
	@BeforeMethod
	public void SetUp(){
		System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		driver=new ChromeDriver();//launch chrome
		
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("file:///E:/JBK/Selenium/Offline%20Website/index.html");
		
	}
	
	
	@Test
	public void getTitlteTest(){
	extenttest=extent.startTest("getTitlteTest");
	String title=driver.getTitle();
	Assert.assertEquals(title,"safJavaByKiran | Log in");
	}
	
	@Test
	public void dashBoardlogoTest(){
	extenttest=extent.startTest("dashBoardlogoTest");
	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	boolean b=driver.findElement(By.xpath("//section[@class='content-header']")).isDisplayed();
	Assert.assertTrue(b);
	}
	
	
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException{
		
		if (result.getStatus()==ITestResult.FAILURE) {
			extenttest.log(LogStatus.FAIL,"Test Case FAILED Is "+result.getName());
			extenttest.log(LogStatus.FAIL,"Test Case FAILED Is "+result.getThrowable());
			
			String screenshotpath=ExtentRoptSCRShot.getScreenShot(driver, result.getName());
			extenttest.log(LogStatus.FAIL,extenttest.addScreenCapture(screenshotpath));
		//	extenttest.log(LogStatus.FAIL,extenttest.addScreencast(screenshotpath));
			
		} else if(result.getStatus()==ITestResult.SKIP) {
			
			extenttest.log(LogStatus.SKIP,"Test Case SKIPED Is "+result.getName());
			
			extenttest.log(LogStatus.SKIP,"Test Case SKIPED Is "+result.getName());
			extenttest.log(LogStatus.SKIP,"Test Case SKIPED Is "+result.getThrowable());
			
			String screenshotpath=ExtentRoptSCRShot.getScreenShot(driver, result.getName());
			extenttest.log(LogStatus.SKIP,extenttest.addScreenCapture(screenshotpath));
		//	extenttest.log(LogStatus.FAIL,extenttest.addScreencast(screenshotpath));
			
		}  else if(result.getStatus()==ITestResult.SUCCESS) {
			
			extenttest.log(LogStatus.PASS,"Test Case PASSED Is"+result.getName());
			
			extenttest.log(LogStatus.PASS,"Test Case PASSED Is "+result.getName());
			extenttest.log(LogStatus.PASS,"Test Case PASSED Is "+result.getThrowable());
			
			String screenshotpath=ExtentRoptSCRShot.getScreenShot(driver, result.getName());
			extenttest.log(LogStatus.PASS,extenttest.addScreenCapture(screenshotpath));
		//	extenttest.log(LogStatus.FAIL,extenttest.addScreencast(screenshotpath));
		}
		
		
	 extent.endTest(extenttest);
	 driver.quit();
	}
	

}
