package com.HooksSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features={"src/test/resources/com/HooksFF/"},
		         glue={"com/HooksSD/"},
		         monochrome=true,
		         //dryRun=true,
		         plugin={"pretty",
		        		 "html:target/cucumber-htmlreport",
		        		 "json:target/cucumber-report.json4",
		        		 "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"}
	
		
		
		)
public class FirstRunnerTest {

}
