package com.saucedemoqa.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = {"Features/"},
		glue = {"com.saucedemoqa.stepdefs", "com.saucedemoqa.hook"}, 
		plugin = {"pretty","json:target/cucumber.json"},
		dryRun = false,
		monochrome = true
		
		)
		
public class RunnerSwag extends AbstractTestNGCucumberTests{

}
