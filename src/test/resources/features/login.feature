Feature: Login functionality

  @smoke
  Scenario: valid login
    Given user navigate to CLRMS portal
    When user enter a valid email and password
    And clicks on login
    Then user is successfully logged in
