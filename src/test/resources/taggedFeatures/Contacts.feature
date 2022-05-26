@PhaseOne
Feature: Contact Functions
User can create a Contact, edit/ view/ delete a contact

Background: Login into app
Given User must have logged in

@RegressionTest @SmokeTest
Scenario: Create a contact
When User create a new contact

Scenario: View Contact
When User view a contact details

@RegressionTest
Scenario: Edit a Contact
When User edit a contact details

@SmokeTest
Scenario: Delete a Contact
When User delete a Contact

