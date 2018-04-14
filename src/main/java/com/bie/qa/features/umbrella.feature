Feature: BIE Login Feature

#Without Examples keyword

#Scenario: BIE Login Test Scenario

#Given User is already on Login Page
#When Title of Login page is Farmers Network
#Then User enters "Neill899" and "test11"
#Then User clicks on Login Button
#Then User is on UmbServiceMyCustomerPage


#With Examples keyword

#Scenario Outline: Login with valid credentials
#
#Given User is already on Login Page
#When Title of Login page is Farmers Network
#Then User enters "<username>" and "<password>"
#Then User clicks on Login Button
#Then User is on ServiceMyCustomerPage
#Then Close the Browser
#Examples: 
#	|	username	|	password	|
#	|	Neil899		|	test11		|
#	|	Nelm843		|	Admin2016	|
	
Scenario Outline: Launch Browser and create an Umbrella policy

Given User launches Browser and opens BIE login Page
Then logs in entering "<state>" Agent credentials
Then selects Create Quote
Then selects Umbrella and inputs "<effective date>"
Then enters Insured details
Then enters Business information
Then inputs Underlying policy information
Then submits the quote for pricing
Then closes the Browser
Examples:
|	state	|	effective date	|
|	AZ		|	06-01-2018		|