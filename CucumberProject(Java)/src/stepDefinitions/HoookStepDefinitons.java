package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HoookStepDefinitons {
	
	@Before
	public void setUp(){
		System.out.println("launch the browser");
		System.out.println("Enter URL");
	}
	
	@After
	public void tearDown(){
		System.out.println("Close the Browsers");
	}
	


@Given("^user use on friends page$")
public void user_use_on_friends_page() throws Throwable {
	System.out.println("^user use on friends page$");

}

@When("^user watch friend on page$")
public void user_watch_friend_on_page() throws Throwable {
	System.out.println("^user watch friend on page$");

}

@Then("^suggection the friend$")
public void suggection_the_friend() throws Throwable {
	System.out.println("^suggection the friend$");

}

@Given("^user create own video$")
public void user_create_own_video() throws Throwable {
	System.out.println("^user create own video$");

}

@When("^user use on features in video page$")
public void user_use_on_features_in_video_page() throws Throwable {
	System.out.println("^user use on features in video page$");

}

@Then("^upload creatindg the video$")
public void upload_creatindg_the_video() throws Throwable {
	System.out.println("^upload creatindg the video$");

}

@Given("^user use on profile page$")
public void user_use_on_profile_page() throws Throwable {
	System.out.println("^user use on profile page$");

}

@When("^user fill the information in data$")
public void user_fill_the_information_in_data() throws Throwable {
	System.out.println("^user fill the information in data$");

}

@Then("^prifile created$")
public void prifile_created() throws Throwable {
	System.out.println("^prifile created$");

}



	
}
