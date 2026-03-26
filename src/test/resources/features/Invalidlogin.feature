Feature: Invalid login functionality



  Scenario Outline: validating invalid login
    Then user enters "<email>" and "<password>" and verify the "<errorMessage>"
    Examples:
      |    email       |      password     |      errorMessage |
      | officer.fmhud@clrms.gov.ng |   | Password is required |
      |                    |  passsss11   | Email is required |
      | officer.fmhud@clrms.gov.ng |passsss11   | Incorrect login credentials |
      | admxyz@gmail.com  |Admin@123  |Incorrect login credentials|
