package com.saucedemoqa.stepdefs;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.saucedemoqa.base.BaseClassSwag;
import com.saucedemoqa.elements.ElementPageSwag;
import com.saucedemoqa.utilities.ToolsSwag;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef extends BaseClassSwag{
	
	ElementPageSwag pf = PageFactory.initElements(driver, ElementPageSwag.class);
	
	@Given("User open the browser")
	public void user_open_the_browser() {
	   
	  
	}

	@Given("User navigate  to {string}")
	public void user_navigate_to(String string) {
	 
	  
	}

	@When("User enter valid email")
	public void user_enter_valid_email() {
		ToolsSwag.getHighLighter(pf.getUsername());
	pf.getUsername().sendKeys("standard_user"); 
	  
	}

	
	@When("User enter valid password User")
	public void user_enter_valid_password_user() throws IOException {
		pf.getPassword().sendKeys("secret_sauce"); 
		ToolsSwag.takeScreenShot();	
	}

	@When("User click on the login button")
	public void user_click_on_the_login_button() {
		ToolsSwag.getExplicitWait(pf.getLoginBtn(), 5);
		pf.getLoginBtn().submit();
	}

	@Then("User is succefully log in on the product page")
	public void user_is_succefully_log_in_on_the_product_page() {
	   
		
		String expectedTitle = "PRODUCTS";
		String actualTitle =pf.getProductPgTitle().getText(); //driver.findElement(By.xpath("//*[@class='title']")).getText();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	

}
