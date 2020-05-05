package com.capgemini.myntra.contactus.stepclass;

import org.testng.Assert;

import com.capgemini.myntra.generics.Base;
import com.capgemini.myntra.pageobjects.ContactUsPomPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_ContactUs_008Step extends Base {

	ContactUsPomPage contact;
	String path = "C:\\Users\\Admin\\Desktop\\CG AUTOMATIONSCRIPTS\\myntra\\excelsheet\\Automation.xlsx.xlsx";

	@When("^User is on Email Us pop up describe the query from the data in excel$")
	public void user_is_on_Email_Us_pop_up_describe_the_query_from_the_data_in_excel() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		contact = new ContactUsPomPage();
		
		String query = getExcelData(path,"Sheet1", 1, 12);
		contact.query(query);
	}

	@Then("^User sends an email$")
	public void user_sends_an_email() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		contact = new ContactUsPomPage();
		contact.sendEmail();
		boolean name = contact.senderName.isDisplayed();
		Assert.assertTrue(name);
	}

}
