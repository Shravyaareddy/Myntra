package com.capgemini.myntra.contactus.stepclass;

import org.testng.Assert;

import com.capgemini.myntra.generics.Base;
import com.capgemini.myntra.pageobjects.ContactUsPomPage;

import cucumber.api.java.en.Then;

public class TC_ContactUs_006Step extends Base {

	ContactUsPomPage contact;

	@Then("^User clicks on navigation arrow beside the select a query$")
	public void user_clicks_on_navigation_arrow_beside_the_select_a_query() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		contact = new ContactUsPomPage();
		contact.clickOnNavigationArrow();
		
		boolean queryInformationDisplay = contact.queryInformation.isDisplayed();
		 Assert.assertTrue(queryInformationDisplay);
	}
}