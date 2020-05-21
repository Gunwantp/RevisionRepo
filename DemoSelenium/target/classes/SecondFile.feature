Feature: Login
Scenario: Positive Login
Given user is on login page
When User enters incorrect uname and password
And User clicks on login button
Then User gets an error message