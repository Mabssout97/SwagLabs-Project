package com.saucedemoqa.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.saucedemoqa.base.BaseClassSwag;
import com.saucedemoqa.elements.ElementPageSwag;
import com.saucedemoqa.utilities.ToolsSwag;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegativeLogStepdef extends BaseClassSwag {
	
	ElementPageSwag pf = PageFactory.initElements(driver, ElementPageSwag.class);
	
	
	@Given("User open the Browser")
	public void user_open_the_browser() {
	
	}

	@When("User Navigate  to {string}")
	public void user_navigate_to(String string) {
	   
	}
 
	  
	
	@When("User enter invalid {string} and {string}")
	public void user_enter_invalid_and(String username, String password) {
		
	 pf.getUsername().sendKeys(username);
	 pf.getPassword().sendKeys(password);
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		ToolsSwag.getExplicitWait(pf.getLoginBtn(), 5);
		pf.getLoginBtn().submit();
	
	}

	@Then("User gets an error message")
	public void user_gets_an_error_message() {
		String expectedError = "Epic sadface: Username and password do not match any user in this service";
		String actualError =driver.findElement(By.xpath("//*[@data-test='error']")).getText();
		Assert.assertEquals(actualError, expectedError);
	}
}
