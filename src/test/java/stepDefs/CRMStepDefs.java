package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDefs {
	
	@Before (value = "@RegressionTest", order=1)
	public void readFromPropFile() {
		System.out.println("Read from property file");
	}
	@Before (value = "@RegressionTest", order=2)
	public void initializeBrowser() {
		System.out.println("Initialize the Browser");
		System.out.println("Browser Initialized");
		System.out.println("Updated by other tester from Remote repository");
		System.out.println("Updated new details from local");
		
	}
	
	@Before (value = "@SmokeTest", order=1)
	public void initializeDB() {
		System.out.println("Initialize the DB");
	}
	
	@Before (value ="@RegressionTest", order=3)
	public void initialize() {
		System.out.println("Chrome Browser launched");
	}

	@Before (value = "@SmokeTest", order =2)
	public void teardown() {
		System.out.println("Firefox Browser launched");
	}
	
	@Given("User must have logged in")
	public void user_must_have_logged_in() {
	   
	}
	
	@When("User create a new contact")
	public void user_create_a_new_contact() {
	   
	}

	@When("User view a contact details")
	public void user_view_a_contact_details() {
	   
	}

	@When("User edit a contact details")
	public void user_edit_a_contact_details() {
	}

	@When("User delete a Contact")
	public void user_delete_a_contact() {
	    
	}

	@When("User create a new deals")
	public void user_create_a_new_deals() {
	   
	}

	@When("User view a deals details")
	public void user_view_a_deals_details() {
	   
	}

	@When("User edit a deals details")
	public void user_edit_a_deals_details() {
	}

	@When("User delete a deals")
	public void user_delete_a_deals() {
	    
	}

	@When("User create a new Task")
	public void user_create_a_new_Task() {
	   
	}

	@When("User view a Task details")
	public void user_view_a_Task_details() {
	   
	}

	@When("User edit a Task details")
	public void user_edit_a_Task_details() {
	}

	@When("User delete a Task")
	public void user_delete_a_Task() {
	    
	}

}
