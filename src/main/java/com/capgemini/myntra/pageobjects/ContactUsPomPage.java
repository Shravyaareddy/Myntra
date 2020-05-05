package com.capgemini.myntra.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.myntra.generics.Base;


public class ContactUsPomPage extends Base{

	@FindBy(xpath = "//div[text() = 'Order Related Queries']")
	public WebElement orderRelatedQueries;

	@FindBy(xpath = "//button[@class='dheader-orderButton']")
	private WebElement ordersBtn;

//	@FindBy(xpath = "//div[text() = 'There are no recent orders to show.']")
//	public WebElement ordersDisplay;

	@FindBy(className = "itemCard-dBox")
	private WebElement orderRelatedIssueItem;
	
	@FindBy(xpath = "//div[text() = 'Non-order Related Issues']")
	private WebElement nonOrderRelatedQueries;
	
	@FindBy(xpath = "//span[@class= 'query-nextButton']")
	private WebElement nonOrderRelatedQuery;

	@FindBy(className = "oneLinerDesktop-infoAllText")
	public WebElement selectaqueryDisplay;

	@FindBy(xpath = "//div[text() = 'Order Details']")
	private WebElement orderDetailsLink;

	@FindBy(className = "orderInfo-order-details")
	public WebElement orderDetails;

	@FindBy(className = "segment-activeLink segment-link")
	public WebElement ordersAndReturns;

	@FindBy(className = "query-nextButton")
	private WebElement NavigationArrow;

	@FindBy(className = "helpcenter-cInfoWrapper")
	public WebElement queryInformation;

	@FindBy(xpath = "//div[@class='option-text ']")
	private WebElement emailUs;

	@FindBy(id="textValidation")
	private WebElement describeYourQuery;

	@FindBy(xpath = "//div[text() = 'Upload Image']")
	private WebElement uploadAnImage;
			
//	@FindBy(xpath = "//button[@class 'emailUs-submitButton emailUs-isBrowser']")
	@FindBy(xpath = "//input[@value= 'SUBMIT']")
	private WebElement sendEmailBtn;

	@FindBy(id = "notesError")
	public WebElement errorMsg;
	
	@FindBy(className ="chatPage-senderName")
	public WebElement senderName;

	public ContactUsPomPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnOrders() {
		ordersBtn.click();

	}

	public void clickOnOrderRelatedQueries() {
		orderRelatedQueries.click();
	}

	public void clickOnOrderRelatedQueriesIssueItem() {
		orderRelatedIssueItem.click();
	}

	public void clickOnOrderDetailsLink() {
		orderDetailsLink.click();
	}

	public void clickOnNavigationArrow() {
		NavigationArrow.click();
	}

	public void clickEmailUs() {
		emailUs.click();
	}
	
	public void query(String msg) {
		describeYourQuery.sendKeys(msg);
	}

	public void sendEmail() {
		sendEmailBtn.click();
	}
	
	public void uploadAnImage(String path) {
		uploadAnImage.sendKeys(path);
	}
	
	public void clickOnnonOrderRelatedQueries() {
		nonOrderRelatedQueries.click();
	}
	public void clickOnNonOrderRelatedQuery() {
		nonOrderRelatedQuery.click();
	}

}
