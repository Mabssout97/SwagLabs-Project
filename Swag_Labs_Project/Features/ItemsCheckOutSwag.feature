Feature: Items checkout functionality
 
Background: Login to the application
Given User open the browser
And User navigate  to "https://www.saucedemo.com/"
When User enter valid email 
And User enter valid password User 
And User click on the login button
Then User is succefully log in on the product page
  
Scenario: User should be able to add 3 or more items to the cart and proceed to checkout.
Description: This scenario test if user can checkout after add 3 or more items to cart
Given User click on  the first item
And User click on add to cart button 
And User click on Back to product button
When User click on  second item
And User click on add to cart button again
And User click on Back to product button again
And User  click on the last item
And User click on add to cart button once again
When User click on the cart button 
And user click on check out button
And User enter first name
And User enter last  name
And user enter zip code
And User click on continue button
And User scroll down on button page 
And User click on finish button
Then User get thanks for order massage
