package stepdefinition;

import java.io.IOException;

import io.cucumber.java.en.*;
import pageobjects.LoginPage;
import screenshot.ScreenShot;

public class Loginstepdefintion extends ScreenShot{
	LoginPage lp = new LoginPage();
	
	@Given("User enters the URL")
	public void user_enters_the_url() {
		System.out.println("Login page");	
	}

	@Then("User lands on login page of saucelabs")
	public void user_lands_on_login_page_of_saucelabs() throws IOException {
		System.out.println("Login page");
		takeScreenshotOnSuccess("Landign Page - Login page");
	}

	@When("User Enters username {string}")
	public void user_enters_username(String string) throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		takeScreenshotOnSuccess("UN text box");
		lp.enterUN(string);
		takeScreenshotOnSuccess("UN entered");
		System.out.println("Username");
	}

	@When("User Enters password {string}")
	public void user_enters_password(String string) throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		takeScreenshotOnSuccess("PW text box");
		lp.enterPW(string);
		takeScreenshotOnSuccess("PW entered");
		System.out.println("Password");
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() throws InterruptedException, IOException {
		takeScreenshotOnSuccess("Clicking On Login Button");
		lp.clickLoginBtn();
		takeScreenshotOnSuccess("Clicked On Login Button");
		System.out.println("Login button");
	}

	@Then("User should land on home page of saucelabs")
	public void user_should_land_on_home_page_of_saucelabs() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		takeScreenshotOnSuccess("Logged in to Home Page");
	}

	@Then("Validate correct error message should come for UN")
	public void validate_correct_error_message_should_come_for_un() {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("Validate correct error message should come for PW")
	public void validate_correct_error_message_should_come_for_pw() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Then("Validate correct error message should come")
	public void validate_correct_error_message_should_come() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("User clicks on close button")
	public void user_clicks_on_close_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("error message should disappear")
	public void error_message_should_disappear() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

}
