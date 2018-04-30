Feature: Mail Login

	Scenario: Successful Login with Valid Credentials
	Given Browser initiated and user is on Sign In Page
	When User Click on Sign In button
	Then User enters UserName
		And User Click on Next button
	Then User enters Password
		And User clicks on Next button
		And Message displayed Login Successfully
	Then Click on Google app icon	
	    And Click on Gmail icon in popUp menu
	
	
