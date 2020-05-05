Feature: Essentials

Scenario: User ordering a product which is popular
    Given User open the Browser and enter the URL
    When  User enters the username and password from the data given in excel 
    And   User click on Login Button
    Then  Validate that the user should be able to enter into Home Page
    When  User place the cursor on Essentials
    And   User select the category
    When  User place the cursor on Sort by
    And   User click on the Popularity under Sort by
    And   User select the product 
		When  User click on Add to Bag and select size
		When   User click on Bag which is on the Navigation Bar
		And   User click on Place Order Button
		And   User click on Continue
		And   User selects the Payment mode and click on Phonepe
		And   User click on Paynow and order the product
		Then  close the browser
     