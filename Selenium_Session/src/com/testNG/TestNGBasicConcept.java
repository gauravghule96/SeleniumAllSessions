package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasicConcept {
	
	//Preconditions:
	@BeforeSuite
	public void SetUp(){
	System.out.println("Setup system property for chrome");
	}
	
	@BeforeTest
	public void LaunchBrowser(){
	System.out.println("LaunchBrowser");
	}
	
	
	@BeforeClass
	public void login(){
	System.out.println("login to applaunch chrome browser");
	}
	
	
	@BeforeMethod
	public void EnetrURL(){
	System.out.println("Enetr URL");
	}
	
	//test cases:
	@Test
	public void getTitle(){
	System.out.println("Get google title");
	}
	
	@Test
	public void Search(){
	System.out.println("Searching");
	}
	
	@Test
	public void Nextpage(){
	System.out.println("open next page");
	}
	
	//Post conditions:
	@AfterMethod
	public void Logout(){
	System.out.println("logout to app");
	}
	
	@AfterClass
	public void deleteallcookies(){
	System.out.println("deleteallcookies");
	}
	
	
	@AfterTest
	public void closeBrowser(){
	System.out.println("close the Browser");
	}
	
	@AfterSuite
	public void generateTestReport(){
	System.out.println("generate Test Report");
	}
	
	
	
	
	
	
	
	
}
