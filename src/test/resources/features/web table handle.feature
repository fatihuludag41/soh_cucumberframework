@alltableexercises
Feature: Web Table Handle
  Background:
    Given user is on web table page
  @getcellvalue
  Scenario: get cell value
    Then user prints the Company and Current Price(Rs) of the first row

  @numberofrowsandcols
  Scenario: number of rows and columns
    Then user prints the number of rows and columns

  @getmax
  Scenario: maximum Current Price(Rs)
    Then user prints the maximum Current Price(Rs)

  @searchtable
  Scenario: search functionality on web table
    Then user verifies that the table has "Quess Corp"