package com.capgemini.myntra.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.myntra.generics.Base;

public class PaymentsPomPage extends Base{
	
	@FindBy(xpath = "//span[text()='PHONEPE/GOOGLE PAY/BHIM UPI']")
	private WebElement paymentMode;
	
	@FindBy(xpath = "//span[text()='PhonePe']")
	private WebElement phonepe;
	
	@FindBy(xpath = "//button[@type= 'submit']")
	private WebElement paynowButton;
	
	public PaymentsPomPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectPaymentmode() {
		paymentMode.click();
		phonepe.click();	
	}
	
	public void clickOnPayNow() {
		paynowButton.click();
	}

}
