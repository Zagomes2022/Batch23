Feature: User able to login with Valid Username and password

Scenario: User Login with valid username and verify the page title

Given User able to open any browser
Given User able to enter the URL

When User able to click on signin Button
When User able to enter Username
And User able to enter Password
And User able to click on Submit Button

Then User able to login his account
And User able to verify his name

	