package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	@Given("User navigate to the BookCart application")
	public void userNavigateToTheBookCartApplication() {
	    // Write code here that turns the phrase above into concrete actions
    System.out.println("userNavigateToTheBookCartApplication()");
	}

	@And("User clicks on the login button")
	public void userClicksOnTheLoginButton() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("userClicksOnTheLoginButton()");
	}

	@And("User enter the username as ortoni")
	public void userEnterTheUsernameAsOrtoni() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("userEnterTheUsernameAsOrtoni()");
	}

	@And("User enter the password as ashwin")
	public void userEnterThePasswordAsAshwin() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("userEnterThePasswordAsPass(Integer int1)");
	}

	@When("User click on the login button")
	public void userClickOnTheLoginButton() {
		 System.out.println("userClickOnTheLoginButton()");
	}

	@Then("Login should be success")
	public void loginShouldBeSuccess() {
	    // Write code here that turns the phrase above into concrete actions
	   
	    String Text ="Login should be success";
	    System.out.println(Text);
	}


}
