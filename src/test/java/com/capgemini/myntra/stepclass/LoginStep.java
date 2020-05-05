package com.capgemini.myntra.stepclass;

import org.testng.Assert;
import com.capgemini.myntra.generics.Base;
import com.capgemini.myntra.pageobjects.HomePomPage;
import com.capgemini.myntra.pageobjects.LoginPomPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep extends Base {
	LoginPomPage login;
	HomePomPage home;
	String path = "C:\\Users\\Admin\\Desktop\\CG AUTOMATIONSCRIPTS\\myntra\\excelsheet\\Automation.xlsx.xlsx";

	@Given("^User open the Browser and enter the URL$")
	public void user_open_the_browser_and_enter_the_URL() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Base.openBrowser("chrome");
	}

	@When("^User enters the username and password from the data given in excel$")
	public void user_enters_the_username_and_password_from_the_data_given_in_excel() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		login = new LoginPomPage();
		String email = getExcelData(path, "Sheet1", 1, 0);
		System.out.println(email);
		String password = getExcelData(path, "Sheet1", 1, 1);
		System.out.println(password);
		login.setEmail(email);
		login.setPassword(password);

	}

	@And("^User click on Login Button$")
	public void user_click_on_Login_Button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		login = new LoginPomPage();
		login.clickLogin();

	}

	@Then("^Validate that the user should be able to enter into Home Page$")
	public void validate_that_the_user_should_be_able_to_enter_into_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   home = new HomePomPage();
	   String homeTitle = home.verifyHomePage();
	   System.out.println(homeTitle);
	   Assert.assertEquals(homeTitle, "Myntra", " User Succesfully login to the Home Page");

	}

}
