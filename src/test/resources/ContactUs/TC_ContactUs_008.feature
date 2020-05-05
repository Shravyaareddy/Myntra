Feature: Contact Us
 

  @tag1
  Scenario: User Contact through Email for an  Order Related Issue
    Given User Open the Browser and enter the URL
    When  User enters the Username and Password from the data given in excel
    And   User clicks on Login Button
    Then  Validate that the user should be able to login to the Home Page
		When  User is on Home Page hover on the profile
		And   User clicks on Contact Us 
		Then  User selects the Order Related Issue Item 
		Then  User clicks on navigation arrow beside the select a query
		Then  User clicks on Email Us
		When  User is on Email Us pop up describe the query from the data in excel 
		Then  User sends an email