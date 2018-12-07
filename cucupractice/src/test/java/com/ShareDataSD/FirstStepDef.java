package com.ShareDataSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FirstStepDef {
	
	WebDriver driver;
	
	public FirstStepDef(ShareObject share) {
		driver= share.Setup();
	}
		
	
	
	@Given ("^User should be on facebook login screen$")
	public void User_should_be_on_facebook_login_screen() throws InterruptedException{
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);		
			
	}

	@When("^He enters the user name \"([^\"]*)\"$")
	public void he_enters_the_user_name( String username) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(2000);
	   
	}

	

}
