@tag
Feature: Add Pay Grade

	@tag1
	Scenario Outline: Users successfully add new pay grade
		Given Users at Pay Grade page and click 'Add' button
		When Users enter Pay Grade <payGradeName> into input box
		And Users click 'Save' button
		Then System displays the new 'Pay Grade' message as confirmation
		
		Examples:
	   |payGradeName|
	   |T20|
	   |B40|