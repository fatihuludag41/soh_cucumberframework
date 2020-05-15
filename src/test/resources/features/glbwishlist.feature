@wishlist
Feature: wishlist functionality
  Scenario: adding items to wishlist
    Given user is on glbtrader home page
    And user clicks on iPad pro image unser Todays deals
    And user clicks on add to wishlist
    Then verify error message
