package CarAccessoriesCompany_Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import CarAccessoriesCompany_Main.MyCarApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InstallerLogin {

	MyCarApplication app;
	
	
	public InstallerLogin(MyCarApplication obj) {
		super();
		this.app = obj;
	}
	
	@Given("The installer is on the sign-in page")
	public void theInstallerIsOnTheSignInPage() {
	    assertFalse(app.isLogedin);
	}

	@When("The installer entered a valid email {string} and a valid password {string}")
	public void theInstallerEnteredAValidEmailAndAValidPassword(String string, String string2) {
	    app.Installerlogin("Installer1@gmail.com", "Installer123");
	}
	//h
	@Then("The installer sign-in succeeded")
	public void theInstallerSignInSucceeded() {
	    assertTrue(app.isLogedin);
	}

	@When("The installer enters the invalid email {string}")
	public void theInstallerEntersTheInvalidEmail(String string) {
	    app.InstallerInvalidEmail("InvalidEmail@gmail.com");
	}

	@Then("The installer should stay on the sign-in page")
	public void theInstallerShouldStayOnTheSignInPage() {
		assertFalse(app.isLogedin);
	}

	@When("The installer enters valid email {string} and incorrect password {string}")
	public void theInstallerEntersValidEmailAndIncorrectPassword(String string, String string2) {
	    app.InstallerIncorrectPassword("Installer1@gmail.com", "IncorrectPassword");
	}

	@When("The installer enters the email {string} and leave the password field empty")
	public void theInstallerEntersTheEmailAndLeaveThePasswordFieldEmpty(String string) {
	    app.InstallerEmptyPassword("Installer1@gmail.com", "");
	}
}
