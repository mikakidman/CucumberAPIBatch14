Feature: Add Employee

  Background:
     #Given user is navigate to HRMS application
    When user enters username and password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on Add Employee button

  @sprint3 @regression
  Scenario: Adding one employee
    And user enter firstname and lastname
    And user clicks on save button
    Then employee added successfully

    @test1
    Scenario: Adding one employee using feature file
      #When user enters username and password
      #And user clicks on login button
      #Then user is successfully logged in
     # When user clicks on PIM option
      #And user clicks on Add Employee button
      And user enters "batyr"and "issa"
      And user clicks on save button
      Then employee added successfully

      @outline
      Scenario Outline: Adding multiple employees using feature file
        And user enters "<firstName>"and "<lastName>"
        And user clicks on save button
        Then employee added successfully
        Examples:
          | firstName | lastName |
        |Mia          | Almaty |
        |Deni         |Taraz   |
        |Aya          |Kyzylorda |


        @datatable
        Scenario: Adding multiple employees using data table
          When user adds multiple employee and verify they are added successfully
          |firstName | middleName| lastName|
          |Mikki     | MK        |Astana   |
          |Mikol     |MK         |Orda     |
          |Mikosh    |MK         |Aktau    |


          @excel
          Scenario: Adding multiple employees using excel file
            When user adds multiple employee from excel using "EmployeeData" and verify it

            @db @regression
  Scenario: Adding employee and verifying it is stored in database
              And user enters "Meruka"and "Kitman"
              And user captures employee id
              And user clicks on save button
              And added employee is displayed in database





