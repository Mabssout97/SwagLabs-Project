package com.saucedemoqa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassSwag {

	public static WebDriver driver;	
	
	public static void setUp(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");	
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		BaseClassSwag.setUp();
	}
	
	
	
}
