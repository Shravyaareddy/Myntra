
Feature: Contact Us
 

  @tag1
  Scenario: User Opening Contact Us page
    Given User Open the Browser and enter the URL
    When  User enters the Username and Password from the data given in excel
    And   User clicks on Login Button
    Then  Validate that the user should be able to login to the Home Page
		When  User is on Home Page hover on the profile
		Then   User clicks on Contact Us   
  
  