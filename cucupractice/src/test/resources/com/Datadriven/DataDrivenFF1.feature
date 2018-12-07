Feature: Facebook4 login validation with Example keyword1


Scenario Outline: validate fb login page1
Given the user is on facebook login Page
When he enters "<user>" as user name
And he enters "<pwd>" as password
Then check username is present in textbox
Examples:
		| user 			 | pwd |
    | testuser_1 | Test@153 |
    | testuser_2 | Test@153 |