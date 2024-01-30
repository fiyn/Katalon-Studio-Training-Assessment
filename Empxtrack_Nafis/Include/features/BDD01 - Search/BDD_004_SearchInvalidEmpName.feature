@tag
Feature: Users search invalid prefix/employee name

  @tag1
  Scenario Outline:  Users enter invalid employee name and no results displayed
    Given Users login into the system with success
    When Users input invalid prefix <searchPrefix> in search bar
    Then The system displays any result not found

    Examples: 
      | searchPrefix  |
      | @employee |