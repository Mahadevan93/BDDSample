Feature: Login Function



Scenario: Valid Login
Given User is On Login Page
When User enters "tomsmith" and "SuperSecretPassword!" credentials
Then User should be navigated to Home Page

Scenario: Invalid Login
Given User is On Login Page
When User enters "tomsmith" and "Super-SecretPassword!" credentials
Then User should be navigated to Home Page