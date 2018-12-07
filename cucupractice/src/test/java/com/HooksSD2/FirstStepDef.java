package com.HooksSD2;

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
	
	@Before(order=1)
	public void BeforeSetup1(){
		System.out.println("Before1");
		System.setProperty("webdriver.chrome.driver", "C:\\64\\SeleniumNew\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@Before(order=2)
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

	

	@After(order=2)
	public void Aftersetup1(){
		System.out.println("After1");	
		Assert.assertTrue(true);
		driver.close();	
	}
	
	@After(order=1)
	public void Aftersetup2(){
		System.out.println("After2");
		
		
	}
}
