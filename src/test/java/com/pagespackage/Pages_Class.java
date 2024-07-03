package com.pagespackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusablepackage.Reusable_Class;

public class Pages_Class extends Reusable_Class {
	public Pages_Class(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//div[@id='online-banner']//following::button")
	WebElement orderOnlineNow;
	
	@FindBy(xpath="//div[@id='__next']//input[@placeholder='Enter your delivery address']")
	WebElement deliveryAddress;
	
	@FindBy(xpath="(//div[@id='moe-push-div']//button)[1]")
	WebElement dontAllow;
	
	@FindBy(xpath="//input[@placeholder='Enter Area / Locality']")
	WebElement enterPinCode;
	
	@FindBy(xpath="//*[.='Amudham Nagar arch']")
	WebElement suggestionOne;
	
	@FindBy(xpath="//span[text()='VEG PIZZA']")
	WebElement vegPizza;
	
	@FindBy(xpath="//div[text()='RECOMMENDED']")
	WebElement ScrollDownIntoVegPizza;
	
	@FindBy(xpath="(//span[text()='Margherita']//parent::span)[1]")
	WebElement scrollDownintoMargh;
	
	@FindBy(xpath="//span[.='Margherita']//following::button[@*='addTocart']")
	WebElement margheritaPizza;
	
	@FindBy(xpath="//span[text()='NO THANKS']")
	WebElement noCheese;
	
	@FindBy(xpath="//div[@class='menu-right']//*[@*='increase']")
	WebElement increase;
	
	@FindBy(xpath="//div[@class='menu-right']//*[@*='cntr-val']")
	WebElement checkQuantity;
	
	@FindBy(xpath="(//div[@class='menu-right']//span[text()='478.00'])[1]")
	WebElement checkMargheritaAmt;
	
	@FindBy(xpath="(//div[@class='itm-wrppr']//following::span[text()='Peppy Paneer'])[1]")
	WebElement peppyPanneer;
	
	
	@FindBy(xpath="((//div[@class='itm-wrppr'])[7]//span[text()='Peppy Paneer']//following::button)[1]")
	WebElement peppyPaneerAddToCart;
	
	@FindBy(xpath="//div[@class='menu-right']//following::span[text()='Peppy Paneer']//following::div[@data-label='increase']")
	WebElement PeppypaneerQuantityIncrease;
	
	
	@FindBy(xpath="(//div[@class='menu-right']//span[@class='cntr-val'])[2]")
	WebElement PeppypaneerQuantityCheck;
	
	@FindBy(xpath="//div[@class='menu-right']//following::span[text()='Peppy Paneer']//following::span/span")
	WebElement peppypaneerAmtCheck;
	
	@FindBy(xpath = "//span[.='GOURMET PIZZA']")
	WebElement gourmatpizzaTab;
	

	
	public WebElement getOrderOnlineNow() {
		return orderOnlineNow;
	}

	public WebElement getDeliveryAddress() {  
		return deliveryAddress;
	}
	public WebElement getDontAllow() {
		return dontAllow;
	}

	public WebElement getEnterPinCode() {
		return enterPinCode;
	}

	public WebElement getSuggestionOne() {
		return suggestionOne;
	}

	public WebElement getVegPizza() {
		return vegPizza;
	}
	public WebElement getScrollDownIntoVegPizza() {
		return ScrollDownIntoVegPizza;
	}
	
	public WebElement getscrollDownintoMargh() {
		return scrollDownintoMargh;
	}
	
	
	public WebElement getMargheritaPizza() {
		return margheritaPizza;
	}
	
	public WebElement getNoCheese() {
		return noCheese;
	}
	public WebElement getIncrease() {
		return increase;
	}
	
	public WebElement getCheckQuantity() {
		return checkQuantity;
	}
	
	public WebElement getcheckMargheritaAmt() {
		return checkMargheritaAmt;
	}
	
	public WebElement getpeppyPanneer() {
		return peppyPanneer;
	}
	
	public WebElement getpeppyPaneerAddToCart() {
		return peppyPaneerAddToCart;
	}
	
	public WebElement getPeppypaneerQuantityIncrease() {
		return PeppypaneerQuantityIncrease;
	}
	
	public WebElement getPeppypaneerQuantityCheck() {
		return PeppypaneerQuantityCheck;
	}
	
	public WebElement getpeppypaneerAmtCheck() {
		return peppypaneerAmtCheck;
	}
	
	public WebElement getgourmatpizzaTab() {
		return gourmatpizzaTab;
	}
	
	
	

}
