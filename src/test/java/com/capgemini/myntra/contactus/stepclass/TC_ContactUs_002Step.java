package com.capgemini.myntra.contactus.stepclass;

import org.testng.Assert;

import com.capgemini.myntra.generics.Base;
import com.capgemini.myntra.pageobjects.ContactUsPomPage;

import cucumber.api.java.en.Then;

public class TC_ContactUs_002Step extends Base {

	ContactUsPomPage contact;

	@Then("^User clicks on Orders button$")
	public void user_clicks_on_Orders_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		contact = new ContactUsPomPage();
		contact.clickOnOrders();
		boolean orders = contact.orderRelatedQueries.isDisplayed();
	Assert.assertTrue(orders);
	System.out.println("Orders page is displaying with all the orders");
	}

}
