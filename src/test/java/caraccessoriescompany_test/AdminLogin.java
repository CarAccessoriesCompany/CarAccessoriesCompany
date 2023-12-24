package caraccessoriescompany_test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import caraccessoriescompany_main.MyCarApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class AdminLogin {

    MyCarApplication app;

    //h
    public AdminLogin(MyCarApplication obj) {
        super();
        this.app = obj;
    }

    @Given("The admin is on the sign-in page")
    public void theAdminIsOnTheSignInPage() {
       assertFalse(app.getIsLogedin());
    }

    @When("The admin entered a valid email {string} and a valid password {string}")
    public void theAdminEnteredAValidEmailAndAValidPassword(String string, String string2) {
       app.adminlogin("Ahmaddweikat@gmail.com", "Ahmad123");

    }

    @Then("The admin sign-in succeeded")
    public void theAdminSignInSucceeded() {
        assertTrue(app.getIsLogedin());
    }

    @When("The admin enters the invalid email {string}")
    public void theAdminEntersTheInvalidEmail(String string) {
        app.adminInvalidEmail("InvalidEmail@gmail.com");
    }

    @Then("The admin should stay on the sign-in page")
    public void theAdminShouldStayOnTheSignInPage() {
        assertFalse(app.getIsLogedin());
    }

    @When("The admin enters valid email {string} and incorrect password {string}")
    public void theAdminEntersValidEmailAndIncorrectPassword(String string, String string2) {
        app.adminIncorrectPassword("Ahmaddweikat@gmail.com", "IncorrectPassword");
    }

    @When("The admin enters the email {string} and leave the password field empty")
    public void theAdminEntersTheEmailAndLeaveThePasswordFieldEmpty(String string) {
       app.adminEmptyPassword("Ahmaddweikat@gmail.com", "");
    }

}