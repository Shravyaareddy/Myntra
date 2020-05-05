Feature: Login

  Scenario: User Login to the Application
    Given User open the Browser and enter the URL
    When  User enters the username and password from the data given in excel
    And   User click on Login Button
    Then  Validate that the user should be able to enter into Home Page

