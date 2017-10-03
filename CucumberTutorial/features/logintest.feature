#Keywords Explanation:

#Feature: Defines what feature you will be testing in the tests
#Given:Pre condition of the test
#When: Defines the action performed
#And: Any additional conditions
#Then: It is expected result of the test, outcome of the test

Feature: Login
#Descriptin: This feature will test Login functionality


Scenario: Successful Login with valid credentials
Given User is on Home Page
When User enters UserName and Password
And clicks Go button
Then He can visit the practice page
And A message is displayed

