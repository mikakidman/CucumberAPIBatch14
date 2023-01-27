Feature: Dashboard functionality

  @sprint2 @regression @tc1106
  Scenario: Verify dashboard
    #Given user is navigate to HRMS application
    When user enters username and password
    And user clicks on login button
    Then user is successfully logged in
    Then user verify dashboard page
    Then user verify all the dashboard tabs
    |Admin|PIM|Leave|Time|Recruitment|Performance|Dashboard|Directory|
