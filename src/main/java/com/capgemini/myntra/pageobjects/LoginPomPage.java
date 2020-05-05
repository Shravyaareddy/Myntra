package com.capgemini.myntra.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.capgemini.myntra.generics.Base;

public class LoginPomPage extends Base{
	
	@FindBy(xpath = "//input[@type = 'tel']")
	private WebElement mobileNumber;
	
	@FindBy(xpath = "//div[text() = 'CONTINUE']")
	private WebElement  continueBtn;
	
	@FindBy(xpath = "//span[text() = ' Password ']")
	private WebElement loginToPassword;

	@FindBy(id="mobileNumberPass")
	private WebElement email;
	
	@FindBy(xpath = "//input[@type= 'password']")
	private WebElement password; 
	
	@FindBy(xpath = "//button[text()='LOGIN']")
	private WebElement loginButton;
	
	public  LoginPomPage() {
		PageFactory.initElements(driver,this);
		}
	
	public void setEmail(String mail){
		email.sendKeys(mail);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickLogin() {
		loginButton.click();
	}
	
	public void enterMobileNumber(String mobileno) {
		mobileNumber.sendKeys(mobileno);
		continueBtn.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(loginToPassword));
		loginToPassword.click();
	}
}
