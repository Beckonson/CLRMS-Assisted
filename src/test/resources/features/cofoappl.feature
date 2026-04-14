Feature: C of O Application Initiation & Eligibility

  Background:
    Given user navigate to CLRMS portal
    When user enter a valid email and password
    And clicks on login
    Then user is successfully logged in
@smoke2
  Scenario: C of O Application by FMHUD officer for regularization allocation
    Given user is logged in to apply for new COO
    When user Select Regularisation allocation type
    And user fill all regularization details
    Then user is able to proceed to make payment