@tag
Feature: Users search invalid feature

  @tag1
  Scenario Outline:  Users enter invalid feature and no results displayed
    Given Users get to login into the system
    When Users enter invalid feature <searchText> in search bar
    Then System displays no results

    Examples: 
      | searchText  |
      | Add Job Title |