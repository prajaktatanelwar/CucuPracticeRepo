package com.Datadriven;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features={"src/test/resources/com/Datadriven/"},
                  glue={"com/Datadriven/"},
                  monochrome= true,
                  dryRun= false,
                  plugin={"pretty",
                		  "html:target/cucumber-htmlreport",
                		  "json:target/cucumber-report.json1",
                		  "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"}
		
		
		)
public class DataDrivenRunnerTest {

}
