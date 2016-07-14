package cucumber.features;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefenitions2 {
	
	@Given("^I navigated to the zoo website$")
	public void shouldNavigateToZoo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("executed the navigate too zoo method");

	}
		
	
	@When("^I click on the about link$")
	public void shouldClickOnAbout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("executed the click to about link method");
	}

}
