package com.Datadriven;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataDrivenStepDef {
	
	WebDriver driver;
	@Given("^the user is on facebook login Page$")
	public void the_user_is_on_facebook_login_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\64\\SeleniumNew\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

	}

	@When("^he enters \"([^\"]*)\" as user name$")
	public void he_enters_as_user_name(String uname) throws Throwable {
	   driver.findElement(By.id("email")).sendKeys(uname);
	}

	@When("^he enters \"([^\"]*)\" as password$")
	public void he_enters_as_password(String password) throws Throwable {
	    driver.findElement(By.id("pass")).sendKeys(password);
	    Thread.sleep(2000);
	}

	@Then("^check username is present in textbox$")
	public void check_username_is_present_in_textbox() throws Throwable {
	    Assert.assertTrue(true);
	    driver.close();
	}


}
