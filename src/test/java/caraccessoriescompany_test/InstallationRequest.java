package caraccessoriescompany_test;

import static org.junit.Assert.assertTrue;

import caraccessoriescompany_main.MyCarApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InstallationRequest {

    MyCarApplication app;


    public InstallationRequest(MyCarApplication obj) {
        super();
        this.app = obj;
    }
    @Given("the customer in installation services page")
    public void theCustomerInInstallationServicesPage() {
        assertTrue(app.getInServicePage());
    }
    
    @When("they provide the necessary details \\(e.g., car make\\/model, preferred date\\).")
    public void theyProvideTheNecessaryDetailsEGCarMakeModelPreferredDate() {
        app.request("Customer1", "Customer1@gmail.com", "BMW 2022", "Body Shell broken", "27/7/2023");
    }


    @Then("the installation request should be submitted successfully")
    public void theInstallationRequestShouldBeSubmittedSuccessfully() {
        assertTrue(app.getValidrequest());
    }


    @Given("the customer has submitted an installation request")
    public void theCustomerHasSubmittedAnInstallationRequest() {
        assertTrue(app.getValidrequest());
    }

    @When("the system checks installer availability")
    public void theSystemChecksInstallerAvailability() {
       app.instAvalibilty("Installer1");
    }

    @Then("the customer should be able to schedule an appointment with the installer")
    public void theCustomerShouldBeAbleToScheduleAnAppointmentWithTheInstaller() {
        assertTrue(app.getIsAvailable());
    }
}