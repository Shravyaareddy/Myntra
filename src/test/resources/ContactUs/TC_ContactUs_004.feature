
Feature: Contact Us
 

  @tag1
  Scenario: User Selecting Order Related Issue Item
    Given User Open the Browser and enter the URL
    When  User enters the Username and Password from the data given in excel
    And   User clicks on Login Button
    Then  Validate that the user should be able to login to the Home Page
		When  User is on Home Page hover on the profile
		And   User clicks on Contact Us 
		Then  User selects the Order Related Issue Item 
  
