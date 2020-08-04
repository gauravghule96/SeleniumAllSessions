package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TagHooks_StepDef {

//Global Hooks:	
	@Before(order=0)
	public void setUp(){
		System.out.println("launch the browser");
		System.out.println("Enter URL");
	}
	
	@After(order=0)
	public void tearDown(){
		System.out.println("Close the Browsers");
	}
	
	
	@Before(order=1)
	public void setUp1(){
		System.out.println("launch the browser");
		System.out.println("Enter URL");
	}
	
	@After(order=1)
	public void tearDown1(){
		System.out.println("Close the Browsers");
	}
	
	
	//Local Hooks:only for first scenario
	@Before("@First")
	public void beforefirst(){
		System.out.println("befor only first scenario");
	}
	
	//Local Hooks:only for second scenario
	@After("@First")
	public void afterfirst(){
		System.out.println("after only first scenario");
	}
	
	@Before("@Second")
	public void beforesecond(){
		System.out.println("befor only second scenario");
	}
	
	@After("@Second")
	public void aftersecond(){
		System.out.println("after only second scenario");
	}
	
	@Before("@Third")
	public void beforethird(){
		System.out.println("befor only third scenario");
	}
	
	@After("@Third")
	public void afterthird(){
		System.out.println("after only third scenario");
	}
	
	@Given("^this is first step$")
	public void this_is_first_step() throws Throwable {
	}

	@When("^this is second step$")
	public void this_is_second_step() throws Throwable {
	}

	@Then("^this is third step$")
	public void this_is_third_step() throws Throwable {
	}

	
	
	
	
	
}
