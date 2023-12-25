package caraccessoriescompany_test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import caraccessoriescompany_main.MyCarApplication;
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
        assertFalse(app.getIsLogedin());
    }

    @When("The customer entered a valid email {string} and a valid password {string}")
    public void theCustomerEnteredAValidEmailAndAValidPassword(String string, String string2) {
        app.customerlogin("Customer1@gmail.com", "Customer123");
    }

    @Then("The customer sign-in succeeded")
    public void theCustomerSignInSucceeded() {
        assertTrue(app.getIsLogedin());
    }

    @When("The customer enters the invalid email {string}")
    public void theCustomerEntersTheInvalidEmail(String string) {
        app.customerInvalidEmail("InvalidEmail@gmail.com");
    }

    @Then("The customer should stay on the sign-in page")
    public void theCustomerShouldStayOnTheSignInPage() {
        assertFalse(app.getIsLogedin());
    }

    @When("The customer enters valid email {string} and incorrect password {string}")
    public void theCustomerEntersValidEmailAndIncorrectPassword(String string, String string2) {
        app.customerIncorrectPassword("Customer1@gmail.com", "IncorrectPassword");
    }

    

}