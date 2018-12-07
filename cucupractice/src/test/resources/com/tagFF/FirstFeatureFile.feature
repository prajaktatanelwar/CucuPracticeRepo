Feature: Login to facebook7


Background: Common login steps
Given User should be on facebook login screen

@Smoke
Scenario: As User I should be able to facebook1
When He enters the user name "Prajakta"
And user password "Test"
Then He should be able to login to facebook

@Regression
Scenario: User wants to create new account in FB2
When User enters first name as "Radical"
And User enters last name as "Tech"
Then User should be able to create account

@Smoke @Regression
Scenario: As User I should be able to facebook3
When He enters the user name "Prajakta"
And user password "Test"
Then He should be able to login to facebook

@Smoke
Scenario: User wants to create new account in FB4
When User enters first name as "Radical"
And User enters last name as "Tech"
Then User should be able to create account
