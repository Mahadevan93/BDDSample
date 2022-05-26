@PhaseTwo
Feature: Deals Functions
User can create a Deals, edit/ view/ delete a contact

@RegressionTest @SmokeTest
Scenario: Create a Deals
Given User must have logged in
When User create a new contact

Scenario: View Deals
Given User must have logged in
When User view a contact details

@RegressionTest
Scenario: Edit a Deals
Given User must have logged in
When User edit a contact details

@SmokeTest
Scenario: Delete a Deals
Given User must have logged in
When User delete a Contact

