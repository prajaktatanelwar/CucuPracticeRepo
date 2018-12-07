Feature: Login to FB2
Scenario: Login to FB with Diff users2

Given User should be on fb login screen
When User enters following details
|username|password|
|prajakta|test|
|Radical|testing|
|Cucu1|user1|
Then user should login to FB