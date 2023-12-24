package CarAccessoriesCompany_Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import caraccessoriescompany_main.MyCarApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Notification {
	MyCarApplication app;
	
	public Notification(MyCarApplication obj) {
		super();
		this.app = obj;
	}
	
	
	
	@Given("a customer in produt page and wants to order")
	public void aCustomerInProdutPageAndWantsToOrder() {
	    assertTrue(app.isInproductPage);
	}

	@When("an order is placed by a customer and his email is {string}")
	public void anOrderIsPlacedByACustomerAndHisEmailIs(String string) {
	   app.orderIsPlacedBy("Customer1@gmail.com","Body Shell","Confirm");
	}

	@Then("the customer should receive an email with the subject {string}")
	public void theCustomerShouldReceiveAnEmailWithTheSubject(String string) {
	    assertFalse(app.sendEmail);
	}
	
	
	

	@Given("a customer has submitted an installation request")
	public void aCustomerHasSubmittedAnInstallationRequest() {
		assertTrue(app.ValidRequest);
	}

	@When("a new installation request is sent to the installer with username {string}")
	public void aNewInstallationRequestIsSentToTheInstallerWithUsername(String string) {
	    app.getAnInsallationReqFot("Installer1");
	}

	@Then("the installer with username {string} should be notified")
	public void theInstallerWithUsernameShouldBeNotified(String string) {
	   assertTrue(app.InstallationReqReceived);
	}
}
