package com.capgemini.myntra.stepclass;

import com.capgemini.myntra.generics.Base;
import com.capgemini.myntra.pageobjects.AddressPomPage;
import com.capgemini.myntra.pageobjects.BagPomPage;
import com.capgemini.myntra.pageobjects.HomePomPage;
import com.capgemini.myntra.pageobjects.PaymentsPomPage;
import com.capgemini.myntra.pageobjects.ProductPomPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuyingProductEndToEndStep extends Base{
	HomePomPage home;
	ProductPomPage product;
	BagPomPage bag;
	AddressPomPage address;
	PaymentsPomPage payments;
	
	@When("^User place the cursor on Essentials$")
	public void user_place_the_cursor_on_Essentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		home = new HomePomPage();
		home.placeCursorOnEssentials();
	}

	@And("^User select the category$")
	public void user_select_the_category() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		home = new HomePomPage();
		home.clickHairCare();
	}

	@When("^User place the cursor on Sort by$")
	public void user_place_the_cursor_on_sort_by() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		product = new ProductPomPage();
		product.selectGender();
		product.placeCursorOnSortby();
		
		
	}
	
	@And("^User click on the Popularity under Sort by$")
	public void user_click_on_the_Better_Discount_under_sort_by() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		product = new ProductPomPage();
		product.selectPopularity();
	}

	@And("^User select the product$")
	public void user_select_the_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		product = new ProductPomPage();
		product.selectProduct();
	}
	
	@When("^User click on Add to Bag and select size$")
	public void user_click_on_Add_to_Bag_and_select_size() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		product = new ProductPomPage();
		product.addToBag();
		product.selectSize();
	}
	
	@When("^User click on Bag which is on the Navigation Bar$")
	public void user_click_on_Bag_which_is_on_the_Navigation_Bar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    home = new HomePomPage();
	    home.clickOnBag();
	}

	@And("^User click on Place Order Button$")
	public void user_click_on_Place_Order_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    bag = new BagPomPage();
	    bag.clickOnPlaceOrder();
	}

	@And("^User click on Continue$")
	public void user_click_on_Continue() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    address = new AddressPomPage();
	    address.clickOnContinue();
	    
	}

	@And("^User selects the Payment mode and click on Phonepe$")
	public void user_selects_the_Payment_mode_and_click_on_Phonepe() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 payments = new PaymentsPomPage();
		 payments.selectPaymentmode();
	    
	}

	@Then("^User click on Paynow and order the product$")
	public void user_click_on_Paynow_and_order_the_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payments = new PaymentsPomPage();
		payments.clickOnPayNow();
	   
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Base.closeBrowser();
	}
	
}
