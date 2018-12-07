package com.tagSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features={"src/test/resources/com/tagFF/"},
		         glue={"com/tagSD/"},
		         monochrome=true,
		         //dryRun=true,
		         //tags={"@Smoke"},
		         //tags={"@Regression","@Smoke"},// AND condition, scenario will be executed where this condition is mentioned in feature file.
		         tags={"@Regression,@Smoke"},//OR condition
		         plugin={"pretty",
		        		 "html:target/cucumber-htmlreport",
		        		 "json:target/cucumber-report.json7",
		        		 "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport7.html"}
	
		
		
		)
public class FirstRunnerTest {

}
