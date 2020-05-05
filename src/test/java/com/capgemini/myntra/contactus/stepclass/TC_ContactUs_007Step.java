package com.capgemini.myntra.contactus.stepclass;

import com.capgemini.myntra.generics.Base;
import com.capgemini.myntra.pageobjects.ContactUsPomPage;

import cucumber.api.java.en.Then;

public class TC_ContactUs_007Step extends Base {

	ContactUsPomPage contact;

	@Then("^User clicks on Email Us$")
	public void user_clicks_on_Email_Us() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		contact = new ContactUsPomPage();
		contact.clickEmailUs();
	}

}
