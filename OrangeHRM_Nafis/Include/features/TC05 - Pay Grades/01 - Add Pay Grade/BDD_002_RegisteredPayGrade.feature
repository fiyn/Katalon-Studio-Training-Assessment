@tag
Feature: Add Pay Grade

	@tag1
	Scenario Outline:  Users enter registered pay grade
		Given Users navigate to Pay Grade page and click 'Add' button
		When Users enter registered Pay Grade <payGradeName> into input box
		And Users click the 'Save' button
		Then System displays an error message 'Name Already Exists'
		
		Examples:
	   |payGradeName|
	   |T20|
	   |B40|