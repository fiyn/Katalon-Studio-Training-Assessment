@tag
Feature: Users succesfully click searched feature result

  @tag1
  Scenario Outline: Users able to navigate to the corresponding feature correctly upon clicking on one of the search results
    Given Users sucessfully login into Empxtrack
    When Users input <searchText> into 'Search Bar' at the top
    Then Users click the search result that appeared below

    Examples: 
      | searchText  |
      | Attendance |