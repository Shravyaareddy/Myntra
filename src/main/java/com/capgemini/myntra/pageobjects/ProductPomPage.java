package com.capgemini.myntra.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.capgemini.myntra.generics.Base;

public class ProductPomPage extends Base{
	Actions action;
	
	@FindBy(xpath = "//label[text()='Women']")
	private WebElement womenOption;
	
		
	@FindBy(xpath = "//input[@value = 'Face Moisturisers']")
	private WebElement faceMoistureCategory;
	
	@FindBy(xpath = "//input[@value = 'LOreal']")
	private WebElement lorealBrand;
	
	@FindBy(xpath = "(//label[@class = 'common-customCheckbox vertical-filters-label'])[9]")
	private WebElement price;
			
	@FindBy(xpath = "//label[@class = 'common-customCheckbox']")
	private WebElement whiteColor;
	
	@FindBy(xpath = "(//input[@name = 'discount-product'])[2]")
	private WebElement discount;
	
	@FindBy(xpath = "//label[text()= 'Popularity']")
	private WebElement popularity;
	
	@FindBy(xpath = "//span[text() = 'Recommended']")
	private WebElement recommended;
	
	@FindBy(xpath = "//div[@class='product-sliderContainer']")
	private WebElement product;
	
	@FindBy(xpath = "//span[text() = 'Add to bag']")
	private WebElement addToBagButton;
	
	@FindBy(xpath = "//button[@class= 'product-sizeButton']")
//	@FindBy(xpath = "//button[text() ='Onesize']")
	private WebElement size;
	
	
	public  ProductPomPage() {
		PageFactory.initElements(driver,this);
		}
	
	public void selectGender() {
		womenOption.click();
	}
	
//	public void selectCategory() {
//		faceMoistureCategory.click();
//	}
	
//	public void selectBrand() {
//		lorealBrand.click();
//	}
//	
//	public void selectPrice() {
//		price.click();
//	}
//	
//	public void selectDiscount() {
//		discount.click();
//	}
	
	public void placeCursorOnSortby() throws InterruptedException {
		action = new Actions(driver);
		Thread.sleep(1000);
		action.moveToElement(recommended).perform();
	}
	
	public void selectPopularity() {
		popularity.click();
	}
	
	public void addToBag()  {
	addToBagButton.click();
	}
	
	public void selectSize() {
	WebDriverWait wait = new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.elementToBeClickable(size));
	size.click();
	
	
	}
	
	public void selectProduct() throws InterruptedException {
		action = new Actions(driver);
		Thread.sleep(1000);
		action.moveToElement(product).perform();
		
	}
	

}
