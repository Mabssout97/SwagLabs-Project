package com.saucedemoqa.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucedemoqa.base.BaseClassSwag;

public class ElementPageSwag extends BaseClassSwag{

	public ElementPageSwag(){
		PageFactory.initElements(driver, this);	
	}	
	
	

	@FindBy(xpath = "//*[@id='user-name']")
	@CacheLookup
	private WebElement Username;

	public WebElement getUsername() {
		return  Username;
	}
	
	@FindBy(xpath = "//*[@id='password']")
	@CacheLookup
	private WebElement Password;

	public WebElement getPassword() {
		return Password;
	}
	
	
	@FindBy(xpath = "//*[@type='submit']")
	@CacheLookup
	private WebElement LoginBtn;

	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
	
	@FindBy(xpath = "//*[@class='title']")
	@CacheLookup
	private WebElement ProductPgTitle;

	public WebElement getProductPgTitle() {
		return ProductPgTitle;
	}
	
	
	
	
	
	
}
