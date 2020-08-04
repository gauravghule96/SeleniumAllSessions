package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExceptionTimOutTest {

	/*@Test(timeOut=1000)
	public void infiniteloopTest(){
		int i=1;
		while (i==1) {
			System.out.println(i);
			
		}
	}*/
	
	 @Test(expectedExceptions = ArithmeticException.class)
	 public void testException() {
	   System.out.println("Facebook.com");
	   int i = 1 / 0;
	 }
	 
	
	/*@Test(expectedExceptions=NumberFormatException.class)
	   public void test1(){
		String str="10A";
		Integer.parseInt(str);
		}*/
	
	
	
	
	
}
