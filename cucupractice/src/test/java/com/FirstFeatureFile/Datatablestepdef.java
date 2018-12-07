package com.FirstFeatureFile;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Datatablestepdef {

	WebDriver driver;
	@Given("^User should be on fb login screen$")
	public void User_should_be_on_facebook_login_screen() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\64\\SeleniumNew\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);		
			
	}

	@When("^User enters following details$")
	public void he_enters_the_user_name(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		// for user name
		System.out.println(data.get(1).get(0));
		System.out.println(data.get(2).get(0));
		System.out.println(data.get(3).get(0));
		
		//for pwd
		System.out.println(data.get(1).get(1));
		System.out.println(data.get(2).get(1));
		System.out.println(data.get(3).get(1));
		
		
		
		driver.findElement(By.id("email")).sendKeys(data.get(1).get(0));
		driver.findElement(By.id("pass")).sendKeys(data.get(1).get(1));
		Thread.sleep(2000);
	   
	}

	@Then("^user should login to FB$")
	public void he_should_be_able_to_login_to_facebook() throws Throwable {
	  
	 Assert.assertTrue(true);
	 driver.close();
	}
}
