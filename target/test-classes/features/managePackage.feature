Feature: Manage Package
  Background: User Logged in as Admin
    Given User is on the login page
    When User submit valid credentials
    Then User should be redirected to the dashboard

  Scenario: Create new package
    Given a web browser is at list package page
    When the user click Tambah Paket button
    And enter valid data new package
    Then user save valid new package

  Scenario: Update new package
    Given a web browser is at list package page
    When the user click edit package button
    And the user update package
    Then user save updated package

  Scenario: Delete package
    Given a web browser is at list package page
    When the user click delete package button
    Then user delete package