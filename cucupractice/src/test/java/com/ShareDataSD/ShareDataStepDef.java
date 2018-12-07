package com.ShareDataSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShareDataStepDef {
	
    WebDriver driver;
	
	public ShareDataStepDef(ShareObject share) {
		driver= share.Setup();
	}
		
	
	@When("^user password \"([^\"]*)\"$")
	public void user_password(String pwd) throws Throwable {
		driver.findElement(By.id("pass")).sendKeys(pwd);
		Thread.sleep(2000);
	   
	}

	@Then("^He should be able to login to facebook$")
	public void he_should_be_able_to_login_to_facebook() throws Throwable {
	  
	 Assert.assertTrue(true);
	 
	}
	

}
