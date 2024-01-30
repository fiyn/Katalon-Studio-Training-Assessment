@tag
Feature: Users succesfully click searched prefix result

  @tag1
  Scenario Outline:  Users able to navigate to the corresponding employee correctly upon clicking on one of the search results
    Given Users login to Empxtrack succesfully
    When Users enter <searchPrefix> into 'Search Bar' at the top
    Then Users click the desired prefix searched result appeared below

    Examples: 
      | searchPrefix  | 
      | @emp |