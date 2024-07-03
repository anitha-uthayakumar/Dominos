package com.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.junit.Assert;

import com.pagespackage.Pages_Class;
import com.reusablepackage.Reusable_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition_Class extends Reusable_Class {

	public Pages_Class pg;

	@Given("To open the browser for Dominos application")
	public void to_open_the_browser_for_dominos_application() {
		browserLaunch();

	}

	@When("To Click on Order Now")
	public void to_click_on_order_now() {

		pg = new Pages_Class(driver);
		onClick(pg.getOrderOnlineNow());

	}

	@When("To Select Area or Locality")
	public void to_select_area_or_locality() throws InterruptedException {
		onClick(pg.getDeliveryAddress());

		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		onClick(pg.getDontAllow());
		sendKeys(pg.getEnterPinCode(), "Amudham Nagar arch");
		Thread.sleep(5000);
		onClick(pg.getSuggestionOne());
		Thread.sleep(3000);

	}

	@When("To Go to Veg Pizza section")
	public void to_go_to_veg_pizza_section() throws InterruptedException, AWTException {
		Thread.sleep(3000);
		onClick(pg.getVegPizza());
		
	

		// Robot rob = new Robot();
  //scrollDown(pg.getScrollDownIntoVegPizza());
		scrollDown(pg.getscrollDownintoMargh());
	
	//onClick(pg.getMargheritaPizza());
		/*
		 * for(int i= 1; i<= 6;i++) {
		 * 
		 * //rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		 * //rob.keyRelease(KeyEvent.VK_PAGE_DOWN); keyBoardPageDown();
		 * 
		 * if(pg.getScrollDownIntoVegPizza().isDisplayed()) { break; }
		 * 
		 * }
		 */

	}

	@When("To select MArgherita Pizza with Quantity")
	public void to_select_m_argherita_pizza_with_quantity() throws InterruptedException {
		implicitWait();
		onClick(pg.getMargheritaPizza());
		onClick(pg.getNoCheese());
		onClick(pg.getIncrease());

	}

	@Then("To Validate margherita pizza with quantity")
	public void to_validate_margherita_pizza_with_quantity() {

		if (getText(pg.getCheckQuantity()).equals("2")) {
			Assert.assertEquals(getText(pg.getcheckMargheritaAmt()), "478.00");
		} else {
			System.out.println("quantity not added");
		}

	}

	@When("To select Peppy Panneer with Quantity")
	public void to_select_gourmet_pizza_with_quantity() {
		
		if(pg.getpeppyPanneer().isDisplayed()) {
			
			onClick(pg.getpeppyPaneerAddToCart());
			onClick(pg.getPeppypaneerQuantityIncrease());
			
		}
		
	}

	@Then("To Validate Peppy panneer with Quantity")
	public void to_validate_gourmet_pizza_with_quantity() {
		
		if(getText(pg.getPeppypaneerQuantityCheck()).equals("2")) {
			Assert.assertEquals(getText(pg.getpeppypaneerAmtCheck()), "918.00");
			
		}
	}

	@When("To Select Gourmet Pizza with Quantity")
	public void to_select_peppy_paneer_with_quantity() {
		
		onClick(pg.getgourmatpizzaTab());
		
	}
	
	@Then("To Validate Goument Pizza with Quantity")
	public void to_validate_goument_pizza_with_quantity() {
	   
	}

	@Then("To Check SubTotal value of Pizzas")
	public void to_check_sub_total_value_of_pizzas() {
	}

}
