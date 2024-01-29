@tag
Feature: Delete a Currency

  @tag1
  Scenario Outline:  Users successfully delete a currency
    Given Users login and navigate to Pay Grade page 
    When Users select <payGradeName> to edit
    And Users select <currency> to delete
    Then System displays the confirmation message

    Examples: 
      | payGradeName  | currency | 
      | T20 |  Euro |