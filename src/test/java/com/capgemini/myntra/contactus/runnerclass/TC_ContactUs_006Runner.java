package com.capgemini.myntra.contactus.runnerclass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

	@CucumberOptions(features = "classpath:ContactUs/TC_ContactUs_006.feature", glue = {"com.capgemini.myntra.contactus.stepclass"},
			plugin= {"html:target/cucumber-html-report", "json:target/cucumber.json", 
					"pretty:target/cucumber-pretty.txt",
					"usage:target/cucumber-usage.json", "junit:target/cucumber2-results.xml"},
			dryRun = false)

	public class TC_ContactUs_006Runner extends AbstractTestNGCucumberTests {

}
