package com.capgemini.myntra.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.capgemini.myntra.generics.Base;


public class HomePomPage extends Base{
	Actions action;
	
	 
//	@FindBy(xpath = "//span[text = 'Profile']")
	@FindBy(className = "desktop-userTitle")
	private WebElement profile;
	
	@FindBy(xpath = "//a[@data-track = 'login']")
	private WebElement login;
	
//	@FindBy(xpath = "//div[text() = 'Edit Profile']")
	@FindBy(xpath = "//div[@class = 'desktop-accInfoSection']")
	private  WebElement edit;
	
	@FindBy(xpath = "(//a)[@class = 'desktop-main'][2]")
	//@FindBy(xpath = "//a[text() = 'Women']")
	private WebElement women;
	
	
	@FindBy(xpath = "//a[text() ='Essentials']")
	private WebElement essentials;
	
	@FindBy(xpath = "//a[text() = 'Haircare']")
	private WebElement haircare;
	
	
	@FindBy(xpath = "//div[text() = 'Contact Us']")
	private  WebElement contactUs;
	
	@FindBy(xpath = "//div[text() =' Logout ']")
	private WebElement logout;
	
	@FindBy(xpath = "//span[text() = 'Bag']")
	private WebElement bag;

	public HomePomPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePage() {
		String title =driver.getTitle();
		return title;
	}
	
	public void placeCursorOnProfile() throws InterruptedException  {
		action = new Actions(driver);
		Thread.sleep(1000);
		action.moveToElement(profile).perform();
		
	}

	public void clickEditProfile() {
		edit.click();
	}
	
	public WebElement placeCursorOnWomen() {
		return women;
	}
	
	public void placeCursorOnEssentials() throws InterruptedException {
		action = new Actions(driver);
		Thread.sleep(5000);
		action.moveToElement(essentials).perform();
	}
	
	public void clickHairCare() {
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.elementToBeClickable(haircare));
		haircare.click();
	}
	
	public void clickOnBag() {
		bag.click();
	}
	
	public void clickLogOutBtn() {
		logout.click();
	}

	public void clickOnContactUs() {
		contactUs.click();
		
	}
	public String verifycontactUsPage() {
		String title =driver.getTitle();
		return title;
	}
	
	public void clickLogin() {
		login.click();
	}
	

}
	


