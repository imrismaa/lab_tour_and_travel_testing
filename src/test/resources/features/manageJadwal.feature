Feature: Manage Jadwal
  Background: User Logged in as Admin
    Given User is on the login page
    When User submit valid credentials
    Then User should be redirected to the dashboard

  Scenario: Create new jadwal destinasi
    Given a web browser is at admin jadwal destinati page
    When the user click "Tambah Jadwal Destinasi" button
    And enter valid data new jadwal destination
    Then user save valid new jadwal destination

  Scenario: Update jadwal destinasi at jarak tempuh
    Given a web browser is at admin jadwal destinati page
    When the user click edit angka jarak tempuh
    And the user update jarak tempuh
    Then user save updated jarak tempuh

  Scenario: Update jadwal destinasi at waktu tempuh
    Given a web browser is at admin jadwal destinati page
    When the user click edit angka waktu tempuh
    And the user update waktu tempuh
    Then user save updated waktu tempuh

  Scenario: Update jadwal destinasi at tujuan destinasi
    Given a web browser is at admin jadwal destinati page
    When the user click edit tujuan destinasi
    And the user update tujuan destinasi
    Then user save updated tujuan destinasi

  Scenario: Update jadwal destinasi at jam mulai destinasi
    Given a web browser is at admin jadwal destinati page
    When the user click edit jam mulai
    And the user update jam mulai
    Then user save updated jam mulai

  Scenario: Update jadwal destinasi at jam selesai destinasi
    Given a web browser is at admin jadwal destinati page
    When the user click edit jam selesai
    And the user update jam selesai
    Then user save updated jam selesai

  Scenario: Delete jadwal destinasi
    Given a web browser is at admin jadwal destinati page
    When the user click trash icon delete jadwal
    Then user accept confirm to deleted jadwal