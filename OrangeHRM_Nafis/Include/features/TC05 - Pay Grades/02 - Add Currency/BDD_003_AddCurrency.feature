@tag
Feature: Add New Currency

  @tag1
  Scenario Outline: Users successfully add new currency
    Given Users login then navigate to Pay Grade page
    When Users choose which <payGradeName> to modify
    And Users add <currency>, <minimumSalary> and, <maximumSalary> 
    Then Users click 'Save' button and System displays the confirmation message

    Examples: 
      | payGradeName  | 	currency 												| minimumSalary		|	maximumSalary	|
    	| T20 					|     EUR - Euro 										| 3000						| 50000					|
      | T20 					|     FJD - Fiji Dollar							| 3000    				| 50000					|
      | T20 					|     AED - Utd. Arab Emir. Dirham 	| 3000    				|	50000					|
      | T20						|     ALL - Albanian Lek 						| 3000    				|	50000					|
      | T20 					|     XAU - Gold (oz.) 							| 3000    				|	50000					|