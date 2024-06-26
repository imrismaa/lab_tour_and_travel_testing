Feature: User Login

  Scenario: Successful login with valid credentials
    Given User is on the login page
    When User submit valid credentials
    Then User should be redirected to the dashboard

  Scenario: Unsuccessful login with invalid credentials
    Given User is on the login page
    When User submit invalid credentials
    Then User should be redirected to the login page

  Scenario: User public successful login with valid credentials
    Given User is on the login page
    When User public submit valid credentials
    Then User should be redirected to the home page