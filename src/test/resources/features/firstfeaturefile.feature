Feature:Google search
  Scenario: User searches iphone on google
    Given user is on the google page
    And user searches for iphone
    Then verify the result has iphone