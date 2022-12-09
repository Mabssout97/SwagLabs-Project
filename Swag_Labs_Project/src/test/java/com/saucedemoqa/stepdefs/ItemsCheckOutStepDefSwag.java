package com.saucedemoqa.stepdefs;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.saucedemoqa.base.BaseClassSwag;
import com.saucedemoqa.elements.ElementPageSwag;
import com.saucedemoqa.utilities.ToolsSwag;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ItemsCheckOutStepDefSwag extends BaseClassSwag{
	
	
	ElementPageSwag pf = PageFactory.initElements(driver, ElementPageSwag.class);
	
	
	
	@Given("User click on  the first item")
	public void user_click_on_the_first_item() {
		ToolsSwag.getExplicitWait(pf.getProduct(), 7);
		ToolsSwag.clickDynamicElement(driver.findElements(By.xpath("//*[@class='inventory_item_name']")), 0);
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Given("User click on add to cart button")
	public void user_click_on_add_to_cart_button()  {
	   pf.getAddToCart1().click();
	  
	}
	@Given("User click on Back to product button")
	public void user_click_on_back_to_product_button()  {
		
		//pf.getBkToProduct1().submit();
	  driver.navigate().back();
	
	}

	@When("User click on  second item")
	public void user_click_on_second_item()  {
		ToolsSwag.clickDynamicElement(driver.findElements(By.xpath("//*[@class='inventory_item_name']")), 1);	
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	@When("User click on add to cart button again")
	public void user_click_on_add_to_cart_button_again() {
	   pf.getAddToCart2().click();
	    
	}
	
	@When("User click on Back to product button again")
	public void user_click_on_back_to_product_button_again() {
		  driver.navigate().back();
	}

	@When("User  click on the last item")
	public void user_click_on_the_last_item() throws InterruptedException {
	   
		ToolsSwag.clickDynamicElement(driver.findElements(By.xpath("//*[@class='inventory_item_name']")), 5);	
		  
	}

	@When("User click on add to cart button once again")
	public void user_click_on_add_to_cart_button_once_again() {
		 pf.getAddToCart3().click();
		 driver.navigate().back();
	}

	@When("User click on the cart button")
	public void user_click_on_the_cart_button() {
	pf.getCart().click();
	    
	}
	
	@When("user click on check out button")
	public void user_click_on_check_out_button() throws InterruptedException {
	 ToolsSwag.scrollToBottomPage();
	Thread.sleep(3000);
    pf.getCheckOutBtn().click();
    Thread.sleep(3000);
	}
	
	
	@When("User enter first name")
	public void user_enter_first_name() {
	   driver.findElement(By.xpath("//*[@id='first-name']")).sendKeys("Online");
	    
	}

	@When("User enter last  name")
	public void user_enter_last_name() {
		driver.findElement(By.xpath("//*[@id='last-name']")).sendKeys("User"); 
	    
	}

	@When("user enter zip code")
	public void user_enter_zip_code() {
		driver.findElement(By.xpath("//*[@id='postal-code']")).sendKeys("12345"); 
	    
	}

	@When("User click on continue button")
	public void user_click_on_continue_button() {
		driver.findElement(By.xpath("//*[@id='continue']")).click();
	    
	}

	@When("User scroll down on button page")
	public void user_scroll_down_on_button_page() {
	   ToolsSwag.scrollToBottomPage();
	    
	}

	@When("User click on finish button")
	public void user_click_on_finish_button() {
	   
	    driver.findElement(By.xpath("//*[@id='finish']")).click();
	    ToolsSwag.takeScreenShot();
	}

	@Then("User get thanks for order massage")
	public void user_get_thanks_for_order_massage() {
		String expectedMessage = "THANK YOU FOR YOUR ORDER";
		String actualMessage = driver.findElement(By.xpath("//*[@class='complete-header']")).getText();
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	

}
