Feature: Verification of objectives

	Background:
	Given Open Chrome browser
	And Enter url "https://www.exercise1.com/values"
	When the user is on home page
	
	Scenario: Need to verify the right count of values appear on the screen
	Then count of values on the screen are correct
	
	Scenario: Need to verify the values on the screen are greater than 0
	Then values on the screen are greater than 0
	
        Scenario: Need to verify the values are formatted as currencies
	Then values are formatted same as currencies
	
        Scenario: Need to verify the total balance matches the sum of the values
	Then total balance matches with the sum of values
