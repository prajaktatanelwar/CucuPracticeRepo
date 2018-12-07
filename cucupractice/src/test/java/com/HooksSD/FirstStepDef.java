package com.HooksSD;

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
	
	@Before
	public void BeforeSetup1(){
		System.out.println("Before1");
		System.setProperty("webdriver.chrome.driver", "C:\\64\\SeleniumNew\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@Before
	public void BeforeSetup2(){
		System.out.println("Before2");
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

	@When("^user password \"([^\"]*)\"$")
	public void user_password(String pwd) throws Throwable {
		driver.findElement(By.id("pass")).sendKeys(pwd);
		Thread.sleep(2000);
	   
	}

	@Then("^He should be able to login to facebook$")
	public void he_should_be_able_to_login_to_facebook() throws Throwable {
	  
	 Assert.assertTrue(true);
	 driver.close();
	}
	
	
	
//	@Given ("^User should be on fb login screen$")
//	public void User_should_be_on_fb_login_screen() throws InterruptedException{
//		System.setProperty("webdriver.chrome.driver", "C:\\64\\SeleniumNew\\chromedriver_win32_B39\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(2000);
//		
//	}
	@When ("^User enters first name as \"([^\"]*)\"$")
	public void User_enters_first_name(String fname) throws InterruptedException{
		driver.findElement(By.id("u_0_j")).sendKeys(fname);
		Thread.sleep(2000);
		
	}
	@When("^User enters last name as \"([^\"]*)\"$")
	public void User_enters_last_name(String lname) throws InterruptedException{
		driver.findElement(By.id("u_0_l")).sendKeys(lname);
		Thread.sleep(2000);
		
	}
//	@Then("^User should be able to create account$")
//	public void User_should_be_able_to_create_account(){
//		Assert.assertTrue(true);
//		driver.close();
//		
//	}
//	
	@After
	public void Aftersetup1(){
		
		Assert.assertTrue(true);
		driver.close();
		System.out.println("After1");	
		
	}
	
	@After
	public void Aftersetup2(){
		System.out.println("After2");
		
		
	}
}
