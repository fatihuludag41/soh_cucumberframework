@datatable5
Feature: scenario outline example
  Scenario Outline: testing the data tables web page
    Given user is on the datatables
    And user clicks on new button
    And user enters firstname "<first>"
    And user enters lastname "<last>"
    And user enters position "<position>"
    And user enters office "<office>"
    And user enters extension "<extension>"
    And user enters startdate "<startdate>"
    And user enters salary "<salary>"
    And clicks create button
    And user enters firstname "<first>" to the searchbox
    Then verify that user see the first name "<first>" in the searchbox

    Examples: test data for the datatables
    |first|last|position|office|extension|startdate |salary|
    |john |walk|teacher |NJ    |331      |2020-05-08|45000 |
    |marry|key |consutant|TX   |677      |2020-05-06|50000 |
    |sam  |CJ  |Berber   |CA   |68891    |2020-06-06|80000 |
    |marry|key |consutant|TX   |677      |2020-05-06|50000 |