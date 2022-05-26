Feature: Tasks Functions
User can create a Task, edit/ view/ delete a contact

Scenario: Create a Task
Given User must have logged in
When User create a new contact

@RegressionTest
Scenario: View Task
Given User must have logged in
When User view a contact details

@SmokeTest
Scenario: Edit a Task
Given User must have logged in
When User edit a contact details

@RegressionTest @SmokeTest
Scenario: Delete a Task
Given User must have logged in
When User delete a Contact

