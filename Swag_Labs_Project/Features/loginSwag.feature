
Feature: Login to the App
 

 
Scenario: user should be able to login witn  valid username and valid password
Given User open the browser
And User navigate  to "https://www.saucedemo.com/"
When User enter valid email 
And User enter valid password User 
And User click on the login button
Then User is succefully log in on the product page