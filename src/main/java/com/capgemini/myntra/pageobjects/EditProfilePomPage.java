package com.capgemini.myntra.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.myntra.generics.Base;

public class EditProfilePomPage extends Base{
	
	
	@FindBy(xpath = "(//input[@type = 'text'])")
	private WebElement fullName;
	
	@FindBy(xpath ="(//input[@type = 'text'])[2]")
	private WebElement email;
	
	@FindBy(xpath = "(//input[@type = 'text'])[3]")
	private WebElement location;
	
	@FindBy(xpath = "(//input[@type = 'text'])[4]")
	private WebElement nickname;
	
	@FindBy(xpath = "(//input[@type = 'tel'])[1]")
	private WebElement dateOfBirth;
	
	@FindBy(xpath = "(//input[@type = 'tel'])[2])")
	private WebElement alternateMobileNo;
	
	@FindBy(xpath = "(//button[text() = 'Update'])")
	private WebElement updateButton;
	
	@FindBy(xpath ="//input[@type ='tel']")
	private WebElement mobileNo;
	
	@FindBy(xpath = "(//button[text() = 'Continue'])")
	private WebElement continueButton;
	
	@FindBy(id = "MALE")
	private WebElement maleButton;
	
	@FindBy(id ="FEMALE")
	private WebElement femaleButton;
	
	@FindBy(xpath = "(//input[@type = 'password'])[1]")
	private WebElement oldPassword;
	
	@FindBy(xpath ="(//input[@type = 'password'])[2]")
	private WebElement newPassword;
	
	@FindBy(xpath ="(//input[@type = 'password'])[3]")
	private WebElement confirmNewPassword;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	private WebElement changeButton;
	
	@FindBy(xpath = "//button[text()= 'Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//button[text()= 'Change Password']")
	private WebElement changePasswordButton;
	
	@FindBy(xpath = "//button[text()= 'Save Details']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//div[text() = 'Change Password']")
	private WebElement changePassword;
	
	public EditProfilePomPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void editFullName(String fname) {
		fullName.clear();
		fullName.sendKeys(fname);	
	}
	
	public void editEmail(String mail) {
		email.clear();
		email.sendKeys(mail);
	}
	
	public void editDateOfBirth(String dob) {
		dateOfBirth.clear();
		dateOfBirth.sendKeys(dob);
	}
	
	public void editLocation(String loc) {
		location.clear();
		location.sendKeys(loc);
	}
	
	public void editAlternateMobileNumber(String mobile) {
		alternateMobileNo.clear();
		alternateMobileNo.sendKeys(mobile);
	}
	
	public void clickOnMaleButton() {
		maleButton.click();
	}
	
	public void clickOnFemaleButton() {
		femaleButton.click();
	}
	
	public void editNickname(String name) {
		nickname.clear();
		nickname.sendKeys(name);	
	}
	
	public void clickOnSaveButton() {
		saveButton.click();
	}
	
	public void ChangePassword() {
		changePasswordButton.click();	
	}
	
	public void changePassword(String oldpassword, String newpassword, String confirmpassword) {
		oldPassword.sendKeys(oldpassword);
		newPassword.sendKeys(newpassword);
		confirmNewPassword.sendKeys(confirmpassword);
	}
	
	public void changeButton() {
		changeButton.click();
		
	}
	
	public String verifyEditProfilePage() {
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyChangePasswordPopup() {
		 boolean title = changePassword.isDisplayed();
		 return title;
	}
}
	

	

