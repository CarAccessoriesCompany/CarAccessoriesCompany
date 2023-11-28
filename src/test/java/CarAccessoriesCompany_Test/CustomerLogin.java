package CarAccessoriesCompany_Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import CarAccessoriesCompany_Main.MyCarApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerLogin {
	

	MyCarApplication app;
	
	//h
	public CustomerLogin(MyCarApplication obj) {
		super();
		this.app = obj;
	}

	@Given("The customer is on the sign-in page")
	public void theCustomerIsOnTheSignInPage() {
	    assertFalse(app.isLogedin);
	}

	@When("The customer entered a valid email {string} and a valid password {string}")
	public void theCustomerEnteredAValidEmailAndAValidPassword(String string, String string2) {
		app.Customerlogin("Customer1@gmail.com", "Customer123");
	}

	@Then("The customer sign-in succeeded")
	public void theCustomerSignInSucceeded() {
	    assertTrue(app.isLogedin);
	}

	@When("The customer enters the invalid email {string}")
	public void theCustomerEntersTheInvalidEmail(String string) {
	    app.CustomerInvalidEmail("InvalidEmail@gmail.com");
	}

	@Then("The customer should stay on the sign-in page")
	public void theCustomerShouldStayOnTheSignInPage() {
		assertFalse(app.isLogedin);
	}

	@When("The customer enters valid email {string} and incorrect password {string}")
	public void theCustomerEntersValidEmailAndIncorrectPassword(String string, String string2) {
	    app.CustomerIncorrectPassword("Customer1@gmail.com", "IncorrectPassword");
	}

	@When("The customer enters the email {string} and leave the password field empty")
	public void theCustomerEntersTheEmailAndLeaveThePasswordFieldEmpty(String string) {
	    app.CustomerEmptyPassword("Customer1@gmail.com", "");
	}

}
