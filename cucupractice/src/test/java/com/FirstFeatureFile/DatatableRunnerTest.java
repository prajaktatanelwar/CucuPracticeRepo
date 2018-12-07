package com.FirstFeatureFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/com/FirstFeatureFileFF/"},
                  glue={"com/FirstFeatureFile/"},
                  monochrome=true,
                  dryRun=false,
                  plugin={"pretty",
                		  "html:target/cucumber-htmlreport",
                		  "json:target/cucumber-report.json",
                  "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
                		  
                  }
		
		
		)

public class DatatableRunnerTest {

}
