package com.capgemini.myntra.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.myntra.generics.Base;

public class AddressPomPage extends Base{
	
	@FindBy(id ="placeOrderButton")
	private WebElement continueButton;
	
	public AddressPomPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnContinue() {
		continueButton.click();
	}

}
