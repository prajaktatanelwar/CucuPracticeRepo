Feature: Login to facebook3


Background: Common login steps
Given User should be on facebook login screen

Scenario: As User I should be able to facebook3
When He enters the user name "Prajakta"
And user password "Test"
Then He should be able to login to facebook

Scenario: User wants to create new account in FB
When User enters first name as "Radical"
And User enters last name as "Tech"
Then User should be able to create account
