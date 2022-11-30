
Feature: Testing Login functionality to the application

Scenario Outline: User should be not  able to login witn invalid username and invalid password
Description:This test the negative login to the app with invalid username and password

Given User open the Browser
When User Navigate  to "https://www.saucedemo.com/"
And User enter invalid "<username>" and "<password>"
And User click on login button 
Then User gets an error message
     
Examples:
| username         |              | password        |
| standard_user    |              | secret_sauce1234|
| standard_user12  |              | secret_sauce123 |
| standard_user123 |              | secret_sauce12  |
| standard_user1234|              | secret_sauce1   |
| standard_user1234|              | secret_sauce    |