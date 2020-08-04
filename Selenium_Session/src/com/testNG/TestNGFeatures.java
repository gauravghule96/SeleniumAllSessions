package com.testNG;

import org.testng.annotations.Test;

public class TestNGFeatures {

	@Test
	public void loginTest(){
	System.out.println("log in");
	//int i=10/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePagetest(){
	System.out.println("homePagetest");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void Registerpage(){
	System.out.println("Registerpage");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void lgoutpage(){
	System.out.println("log out");
	}
	
}
