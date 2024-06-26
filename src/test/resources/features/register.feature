Feature: User Register

  Scenario: Successful register with valid credentials
    Given User is on the register page
    When User submit valid credentials for register
    Then User should see a success message

  Scenario: Unsuccessful register when user already exists
    Given User is on the register page
    When User submit existing credentials for register
    Then User should see an error message

  Scenario: Unsuccessful register with invalid credentials
    Given User is on the register page
    When User submit invalid credentials for register
    Then User should see an error message