package com.capgemini.myntra.stepclass;

import org.testng.Assert;
import com.capgemini.myntra.generics.Base;
import com.capgemini.myntra.pageobjects.EditProfilePomPage;
import com.capgemini.myntra.pageobjects.HomePomPage;
import com.capgemini.myntra.pageobjects.LoginPomPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChangePasswordEndToEndStep extends Base{
	EditProfilePomPage edit;
	HomePomPage home;
	LoginPomPage login;
	String path = "C:\\Users\\Admin\\Desktop\\CG AUTOMATIONSCRIPTS\\myntra\\excelsheet\\Automation.xlsx.xlsx";
	

	@When("^User click on Edit Profile which is under the profile$")
	public void user_click_on_Edit_Profile_which_is_under_the_profile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		home = new HomePomPage();
		home.placeCursorOnProfile();
		home.clickEditProfile();
	   
	}

	@Then("^Validate that the User should be able to open the Edit Profile Page$")
	public void validate_that_the_User_should_be_able_to_open_the_Edit_Profile_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		edit = new EditProfilePomPage();
		String title = edit.verifyEditProfilePage();
		System.out.println(title);
		Assert.assertEquals(title, "Profile");    
	}

	@When("^User clicks on Change Password Button$")
	public void user_clicks_on_Change_Password_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		edit = new EditProfilePomPage();
	    edit.ChangePassword();
	}

	@Then("^Validate that the user should be able to open the popup$")
	public void validate_that_the_user_should_be_able_to_open_the_popup() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		edit = new EditProfilePomPage();
		boolean title = edit.verifyChangePasswordPopup();
		Assert.assertTrue(title, "Change Password Popup is displayed");
	}

	@When("^User changes  his password with the new password from the data given in excel$")
	public void user_changes_his_password_with_the_new_password_from_the_data_given_in_excel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		edit = new EditProfilePomPage();
	    
	    String oldpassword = getExcelData(path,"Sheet1", 1, 2);
	    String newpassword = getExcelData(path,"Sheet1", 1, 3);
	    String confirmpassword = getExcelData(path,"Sheet1", 1, 4);
	    edit.changePassword(oldpassword, newpassword, confirmpassword);
	    
	    
	}

	@When("^User click on Change Button$")
	public void user_click_on_Change_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   edit = new EditProfilePomPage();
	   edit.changeButton();
	}
	
	@Then("^Validate that the User should change his password$")
	public void validate_that_the_User_should_change_his_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		home = new HomePomPage();
		home.placeCursorOnProfile();
		home.clickLogOutBtn();
		home.placeCursorOnProfile();
		home.clickLogin();
		login = new LoginPomPage();
		String mobileno = getExcelData(path,"Sheet1", 1 ,11);
		login.enterMobileNumber(mobileno);
		String email = getExcelData(path, "Sheet1", 2, 0);
		   System.out.println(email);
		   String password = getExcelData(path, "Sheet1", 2, 1);
		   System.out.println(password);
		   login.setEmail(email);
		   login.setPassword(password);
		   login.clickLogin();
		
	}
	
	

}
