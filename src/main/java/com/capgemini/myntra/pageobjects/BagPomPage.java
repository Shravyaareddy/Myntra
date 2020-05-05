package com.capgemini.myntra.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.myntra.generics.Base;

public class BagPomPage extends Base{
	
	@FindBy(xpath = "//div[@class= 'button-base-button ']")
	private WebElement placeOrder;
	
	public BagPomPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnPlaceOrder() {
		placeOrder.click();
	}

}
