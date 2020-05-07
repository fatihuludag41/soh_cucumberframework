@datatable3
Feature: scenario outline example
  Scenario: testing the data tables web page
    Given user is on the datatables
    And user clicks on new button
    And user enters firstname
    And user enters lastname
    And user enters position
    And user enters office
    And user enters extension
    And user enters startdate
    And user enters salary
    And clicks create button
    And user enters firstname to the searchbox
    Then verify that user see the first name in the searchbox


