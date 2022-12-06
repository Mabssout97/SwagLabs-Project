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
	
	

	@FindBy(xpath = "//*[@class='inventory_item_name']")
	@CacheLookup
	private WebElement product;

	public WebElement getProduct() {
		return product;
	}
	



	@FindBy(xpath = "//*[@ id ='add-to-cart-sauce-labs-backpack']")
	@CacheLookup
	private WebElement AddToCart1;

	public WebElement getAddToCart1() {
		return AddToCart1;
	}
	
	@FindBy(xpath = "//*[@ id ='add-to-cart-sauce-labs-bike-light']")
	@CacheLookup
	private WebElement AddToCart2;

	public WebElement getAddToCart2() {
		return AddToCart2;
	}
	@FindBy(xpath = "//*[@ id ='add-to-cart-test.allthethings()-t-shirt-(red)']")
	@CacheLookup
	private WebElement AddToCart3;

	public WebElement getAddToCart3() {
		return AddToCart3;
	}
	
	

	@FindBy(xpath = "//*[@id='back-to-products']")
	@CacheLookup
	private WebElement BkToProduct1;

	public WebElement getBkToProduct1() {
		return BkToProduct1;
	}
	
	//*[@class ='shopping_cart_link']
	
	@FindBy(xpath = "//*[@class ='shopping_cart_link']")
	@CacheLookup
	private WebElement Cart;

	public WebElement getCart() {
		return Cart;
		}
	//*[@id ='checkout']
	
	@FindBy(xpath = "//*[@id ='checkout']")
	@CacheLookup
	private WebElement CheckOutBtn;

	public WebElement getCheckOutBtn() {
		return CheckOutBtn;
	}
	
	
	
	
	
	
	
	
	
	
	
}
