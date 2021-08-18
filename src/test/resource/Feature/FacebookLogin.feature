Feature: Facebook Login page verification
Feature file helps to validate the Facebook login page and confirmation or error message.

Scenario: Verify user is able to Post a status
Given user launches facebook url and enters "xxxxxx" and "xxxxx"
And clicks login button 
When user post status message as "Hello world"
Then post should be successful
