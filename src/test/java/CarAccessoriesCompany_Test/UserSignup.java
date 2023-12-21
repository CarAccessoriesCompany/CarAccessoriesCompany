package CarAccessoriesCompany_Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import CarAccessoriesCompany_Main.MyCarApplication;
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
	   assertFalse(app.isSignedup);
	}

	@When("The user their valid email address {string} and password {string}")
	public void theUserTheirValidEmailAddressAndPassword(String string, String string2) {
	    app.UserSignUp("NewUser@gmail.com", "NewUser123","NewUser","059-1102030");
	}

	@Then("The user signs up success")
	public void theUserSignsUpSuccess() {
	   assertTrue(app.isSignedup);
	}
	//h

	@When("The user enters an existing email address {string}")
	public void theUserEntersAnExistingEmailAddressAndPassword(String string) {
		app.ExistEmail("Customer1@gmail.com");
	}

	@Then("The user should stay on the sign-up page")
	public void theUserShouldStayOnTheSignUpPage() {
	    assertFalse(app.isSignedup);
	}

	@When("The user enters the email address {string} and leaves the password field empty")
	public void theUserEntersTheEmailAddressAndLeavesThePasswordFieldEmpty(String string) {
	    app.SignupEmptyPassword("NewUser@gmail.com", "");
	}

	@When("The user enters a valid email address {string} and a weak password {string}")
	public void theUserEntersAValidEmailAddressAndAWeakPassword(String string, String string2) {
	    app.SignupWeakPassword("NewUser@gmail.com", "Weak");
	}

	@When("The user enter an invalid email address {string} and password {string}")
	public void theUserEnterAnInvalidEmailAddressAndPassword(String string, String string2) {
	    app.InvalidEmailType("user&name@domain.com");
	}
}
