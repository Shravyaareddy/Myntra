package com.capgemini.myntra.contactus.stepclass;



import org.testng.Assert;

import com.capgemini.myntra.generics.Base;
import com.capgemini.myntra.pageobjects.ContactUsPomPage;

import cucumber.api.java.en.Then;

public class TC_ContactUs_004Step extends Base {
	ContactUsPomPage contact;
	
	@Then("^User selects the Order Related Issue Item$")
	public void user_selects_the_Order_Related_Issue_Item() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		contact = new ContactUsPomPage();
		contact.clickOnOrderRelatedQueriesIssueItem();
		
		boolean display = contact.selectaqueryDisplay.isDisplayed();
		Assert.assertTrue(display);
		System.out.println("Select a query and order details of selected item is displaying ");
		
	    
	}

}
