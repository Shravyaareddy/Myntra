Feature: Login

  Scenario: User Login to the Application
    Given User open the Browser and enter the URL
    When  User enters the username and password from the data given in excel 
    And   User click on Login Button
    Then  Validate that the user should be able to enter into Home Page
    When  User click on Edit Profile which is under the profile
    Then  Validate that the User should be able to open the Edit Profile Page
    When  User clicks on Change Password Button
    Then  Validate that the user should be able to open the popup
    When  User changes  his password with the new password from the data given in excel 
    And   User click on Change Button
    Then  Validate that the User should change his password
   
