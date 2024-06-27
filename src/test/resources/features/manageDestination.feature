Feature: Manage Destination
  Background: User Logged in as Admin
    Given User is on the login page
    When User submit valid credentials
    Then User should be redirected to the dashboard

  Scenario: Create new destination
    Given a web browser is at list destination page
    When the user click "Tambah Destinasi" button
    And enter valid data new destination
    And user save valid new destination
    Then user see create success alert

  Scenario: Update destination
    Given a web browser is at destination detail page
    When the user click edit destiantion button
    And the user update destiantion
    And user save updated destination
    Then user see update success alert

  Scenario: Delete destination
    Given the user opens the destination details page
    When the user click hapus destinasi button
    Then the user hapus destiansi
