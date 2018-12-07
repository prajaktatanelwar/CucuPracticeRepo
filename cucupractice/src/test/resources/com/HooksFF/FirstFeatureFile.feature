Feature: Login to facebook4


Scenario: As User I should be able to facebook4
Given User should be on facebook login screen
When He enters the user name "Prajakta"
And user password "Test"
#Then He should be able to login to facebook


Scenario: User wants to create new account in FB
Given User should be on facebook login screen
When User enters first name as "Radical"
And User enters last name as "Tech"
#Then User should be able to create account
