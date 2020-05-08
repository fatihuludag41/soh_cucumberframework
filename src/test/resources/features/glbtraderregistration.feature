@glbtraderregistration
Feature: GlbTrader registration functionality
  Scenario Outline: TC01 glbtrader registration with multiple data
    Given user is on glbtrader registration page
    And user enters email "<email>"
    And user enters name "<name>"
    And user enters mobile "<mobile>"
    And user enters password "<password>"
    And user confirms password "<password>"
    Then user clicks on signup button
    Then verify Success message

    Examples:
      | email                   | name        | mobile    | password |
      | osmanyilmaz@mydomain.net| Osman Yilmaz| 4041234567| Air1234! |
      | recepyigit@mydomain.net | Recep Yigit | 9041234567| Air1234! |
