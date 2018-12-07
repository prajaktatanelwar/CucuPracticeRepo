package com.ShareDataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ShareObject {
	
WebDriver driver;
	
	@Before
	public WebDriver Setup(){
		if(driver==null){
		System.setProperty("webdriver.chrome.driver", "C:\\64\\SeleniumNew\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();	
	}
		return driver;
	}
	
	@After
	public void tearDown(){
		driver.close();
		driver= null;
	}

}
