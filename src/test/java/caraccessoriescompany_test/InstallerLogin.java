package caraccessoriescompany_test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import caraccessoriescompany_main.MyCarApplication;
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
        assertFalse(app.getIsLogedin());
    }

    @When("The installer entered a valid email {string} and a valid password {string}")
    public void theInstallerEnteredAValidEmailAndAValidPassword(String string, String string2) {
        app.installerlogin("Installer1@gmail.com", "Installer123");
    }
    //h
    @Then("The installer sign-in succeeded")
    public void theInstallerSignInSucceeded() {
        assertTrue(app.getIsLogedin());
    }

    @When("The installer enters the invalid email {string}")
    public void theInstallerEntersTheInvalidEmail(String string) {
        app.installerInvalidEmail("InvalidEmail@gmail.com");
    }

    @Then("The installer should stay on the sign-in page")
    public void theInstallerShouldStayOnTheSignInPage() {
        assertFalse(app.getIsLogedin());
    }

    @When("The installer enters valid email {string} and incorrect password {string}")
    public void theInstallerEntersValidEmailAndIncorrectPassword(String string, String string2) {
        app.installerIncorrectPassword("Installer1@gmail.com", "IncorrectPassword");
    }

}