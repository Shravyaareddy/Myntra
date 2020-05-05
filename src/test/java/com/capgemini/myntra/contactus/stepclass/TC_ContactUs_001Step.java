package com.capgemini.myntra.contactus.stepclass;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.capgemini.myntra.generics.Base;
import com.capgemini.myntra.pageobjects.HomePomPage;
import com.capgemini.myntra.pageobjects.LoginPomPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_ContactUs_001Step extends Base{
	LoginPomPage login;
	HomePomPage home;
	Actions action;
	String path = "C:\\Users\\Admin\\Desktop\\CG AUTOMATIONSCRIPTS\\myntra\\excelsheet\\Automation.xlsx.xlsx";

	
	@Given("^User Open the Browser and enter the URL$")
	public void user_Open_the_Browser_and_enter_the_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Base.openBrowser("chrome");
	}

	@When("^User enters the Username and Password from the data given in excel$")
	public void user_enters_the_Username_and_Password_from_the_data_given_in_excel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login = new LoginPomPage();
		String email = getExcelData(path, "Sheet1", 3, 0);
		System.out.println(email);
		String password = getExcelData(path, "Sheet1", 3, 1);
		System.out.println(password);
		login.setEmail(email);
		login.setPassword(password);  
	}

	@When("^User clicks on Login Button$")
	public void user_clicks_on_Login_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login = new LoginPomPage();
		login.clickLogin();
	}

	@Then("^Validate that the user should be able to login to the Home Page$")
	public void validate_that_the_user_should_be_able_to_login_to_the_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 home = new HomePomPage();
		   String homeTitle = home.verifyHomePage();
		   System.out.println(homeTitle);
		   Assert.assertEquals(homeTitle, "Myntra", " User Succesfully login to the Home Page");
	}

	@When("^User is on Home Page hover on the profile$")
	public void user_is_on_Home_Page_hover_on_the_profile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePomPage	home1 = new HomePomPage();
		home1.placeCursorOnProfile();
	}


	@Then("^User clicks on Contact Us$")
	public void user_clicks_on_Contact_Us() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		home = new HomePomPage();
	   home.clickOnContactUs();
	   String title = home.verifycontactUsPage();
	Assert.assertEquals(title,"Help Center");
	System.out.println("ContactUs page is displaying");
	}


}
