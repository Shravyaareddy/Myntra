package com.capgemini.myntra.runnerclass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "classpath:Login/Login.feature", glue = {"com.capgemini.myntra.stepclass"},
plugin= {"html:target/cucumber-html-report", "json:target/cucumber.json", 
		"pretty:target/cucumber-pretty.txt",
		"usage:target/cucumber-usage.json", "junit:target/cucumber2-results.xml"},
dryRun = false)

public class LoginRunner extends AbstractTestNGCucumberTests{
	
	
	
	

}
