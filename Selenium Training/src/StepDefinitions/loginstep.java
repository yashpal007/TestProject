package StepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginstep {

	@Given("^I give gmail URL$")
	public void i_give_gmail_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Hello");
	}

	@When("^I enter username and password$")
	public void i_enter_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Yashpal");
	}

	@Then("^I should login successful$")
	public void i_should_login_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Jillela");
	}
	
}
