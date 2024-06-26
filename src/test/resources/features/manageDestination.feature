Feature: Manage Destination
  Background: User Logged in as Admin
    Given User is on the login page
    When User submit valid credentials
    Then User should be redirected to the dashboard

  Scenario: Create new destination
    Given a web browser is at list destination page
    When the user click "Tambah Destinasi" button
    And enter valid data new destination
    Then user save valid new destination

  Scenario: Update new destination
    Given a web browser is at destination detail page
    When the user click edit destiantion button
    And the user update destiantion
    Then user save updated destination