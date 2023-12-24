package caraccessoriescompany_test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import caraccessoriescompany_main.MyCarApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class UserSignup {
	
	MyCarApplication app;
	
	
	public UserSignup(MyCarApplication obj) {
		super();
		this.app = obj;
	}
	
	
	@Given("User in the sign-up page")
	public void userInTheSignUpPage() {
	   assertFalse(app.getIsSignedup());
	}

	@When("The user their valid email address {string} and password {string}")
	public void theUserTheirValidEmailAddressAndPassword(String string, String string2) {
	    app.userSignUp("NewUser@gmail.com", "NewUser123","NewUser","059-1102030");
	}

	@Then("The user signs up success")
	public void theUserSignsUpSuccess() {
	   assertTrue(app.getIsSignedup());
	}
	//h

	@When("The user enters an existing email address {string}")
	public void theUserEntersAnExistingEmailAddressAndPassword(String string) {
		app.existEmail("Customer1@gmail.com");
	}

	@Then("The user should stay on the sign-up page")
	public void theUserShouldStayOnTheSignUpPage() {
	    assertFalse(app.getIsSignedup());
	}

	@When("The user enters the email address {string} and leaves the password field empty")
	public void theUserEntersTheEmailAddressAndLeavesThePasswordFieldEmpty(String string) {
	    app.signupEmptyPassword("NewUser@gmail.com", "");
	}

	@When("The user enters a valid email address {string} and a weak password {string}")
	public void theUserEntersAValidEmailAddressAndAWeakPassword(String string, String string2) {
	    app.signupWeakPassword("NewUser@gmail.com", "Weak");
	}

	@When("The user enter an invalid email address {string} and password {string}")
	public void theUserEnterAnInvalidEmailAddressAndPassword(String string, String string2) {
	    app.invalidEmailType("user&name@domain.com");
	}
}