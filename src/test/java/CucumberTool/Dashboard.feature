Feature: Dashboard functionality
  Scenario: Verify dashboard
    Given user is navigate to HRMS application
    When user enters username and password
    And user clicks on login button
    Then user is successfully logged in
    Then user verify dashboard page
