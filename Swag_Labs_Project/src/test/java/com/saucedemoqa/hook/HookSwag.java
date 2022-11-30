package com.saucedemoqa.hook;

import com.saucedemoqa.base.BaseClassSwag;

import io.cucumber.java.After;
import io.cucumber.java.Before;


	public class HookSwag extends BaseClassSwag {
		
		@Before
		public static void initialize() {
			BaseClassSwag.setUp();	
		}
		
		
		@After
		public static void tearDown() {
			driver.quit();
			
		}


}
