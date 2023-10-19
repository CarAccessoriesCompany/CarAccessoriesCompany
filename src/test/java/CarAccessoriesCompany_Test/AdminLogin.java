package CarAccessoriesCompany_Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import CarAccessoriesCompany_Main.MyCarApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class AdminLogin {
	
	MyCarApplication app;
	
	
	public AdminLogin(MyCarApplication obj) {
		super();
		this.app = obj;
	}
	
	@Given("The admin is on the sign-in page")
	public void theAdminIsOnTheSignInPage() {
	   assertFalse(app.isLogedin);
	}

	@When("The admin entered a valid email {string} and a valid password {string}")
	public void theAdminEnteredAValidEmailAndAValidPassword(String string, String string2) {
	   app.Adminlogin("Ahmaddweikat@gmail.com", "Ahmad123");
	   
	}

	@Then("The admin sign-in succeeded")
	public void theAdminSignInSucceeded() {
	    assertTrue(app.isLogedin);
	}
	
	@When("The admin enters the invalid email {string}")
	public void theAdminEntersTheInvalidEmail(String string) {
	    app.AdminInvalidEmail("InvalidEmail@gmail.com");
	}

	@Then("The admin should stay on the sign-in page")
	public void theAdminShouldStayOnTheSignInPage() {
	    assertFalse(app.isLogedin);
	}

	@When("The admin enters valid email {string} and incorrect password {string}")
	public void theAdminEntersValidEmailAndIncorrectPassword(String string, String string2) {
	    app.AdminIncorrectPassword("Ahmaddweikat@gmail.com", "IncorrectPassword");
	}

	@When("The admin enters the email {string} and leave the password field empty")
	public void theAdminEntersTheEmailAndLeaveThePasswordFieldEmpty(String string) {
	   app.AdminEmptyPassword("Ahmaddweikat@gmail.com", "");
	}
	
}
