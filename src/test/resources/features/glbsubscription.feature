@subscription
Feature: newsletter subscription
  Scenario Outline: subscription for "<email>"
    Given user is on glbtrader home page
    And user inputs "<email>" in subscription textbox
    And user clicks on Subscribe button
    Then verify subscription success message

    Examples:
      | email             |
      | test123@gmail.com |
      | test124@gmail.com |
      | test125@gmail.com |
      | test126@gmail.com |
      | test127@gmail.com |
