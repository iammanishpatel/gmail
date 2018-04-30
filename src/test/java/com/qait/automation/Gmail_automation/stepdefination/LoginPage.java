package com.qait.automation.Gmail_automation.stepdefination;

import com.qait.automation.Gmail_automation.DriverFactory.PageObject;
import com.qait.automation.Gmail_automation.PageObjectRepository.LoginPageResource;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage extends PageObject{
	
	@Given("^Browser initiated and user is on Sign In Page$")
	public void browser_initiated_and_user_is_on_Sign_In_Page(){
		initDriver();
	}

	@When("^User Click on Sign In button$")
	public void user_Click_on_Sign_In_button(){
		clickByXpath(LoginPageResource.signIn);
	}

	@Then("^User enters UserName$")
	public void user_enters_UserName() throws InterruptedException{
		Thread.sleep(1000);
		sendKeysByXpath(LoginPageResource.usernamePath,LoginPageResource.username);
	}

	@Then("^User Click on Next button$")
	public void user_Click_on_Next_button(){
		clickByXpath(LoginPageResource.next);
		
	}

	@Then("^User enters Password$")
	public void user_enters_Password() throws InterruptedException{	
		Thread.sleep(1000);
		sendKeysByXpath(LoginPageResource.passwordPath,LoginPageResource.password);
	}

	@Then("^User clicks on Next button$")
	public void user_clicks_on_Login_button() throws InterruptedException{
		Thread.sleep(1000);
		clickByXpath(LoginPageResource.next);
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully(){
	}
	
	@Then("^Click on Google app icon$")
	public void click_on_Google_app_icon() throws InterruptedException{
		Thread.sleep(1000);
		clickByXpath(LoginPageResource.googleAppIcon);
		logMessage("Clicked on google icon");
	}
	
	@Then("^Click on Gmail icon in popUp menu$")
	public void Click_on_Gmail_icon_in_popUp_menu() throws InterruptedException{
		Thread.sleep(1000);
		clickByXpath(LoginPageResource.gmailIcon);
		logMessage("Gmail option selected");
	}

}
