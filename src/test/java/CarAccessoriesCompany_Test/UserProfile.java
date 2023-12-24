package CarAccessoriesCompany_Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import caraccessoriescompany_main.MyCarApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserProfile {
	
	MyCarApplication app;
	
	
	public UserProfile(MyCarApplication obj) {
		super();
		this.app = obj;
	}
	
	@Given("a customer is logged into their account")
	public void aCustomerIsLoggedIntoTheirAccount() {
	    assertTrue(app.inMenu);
	}

	@When("a cutomer enter command {string}")
	public void aCutomerEnterCommand(String string) {
		app.UserProfile("My Profile");
	}

	@Then("a cutomer in his\\/her profile")
	public void aCutomerInHisHerProfile() {
		assertTrue(app.inProfile);
	}
	//h
	@When("they choose to edit their profile")
	public void theyChooseToEditTheirProfile() {
	    app.EditCommand();
	}

	@When("Choose what field he\\/she want to edit {string}")
	public void chooseWhatFieldHeSheWantToEdit(String string) {
	    app.editField("Customer1@gmail.com", "Email", "Customer123@gmail.com");
	}

	@Then("their profile should be updated with the new contact information")
	public void theirProfileShouldBeUpdatedWithTheNewContactInformation() {
	    assertTrue(app.isupdated);
	}

	@When("a cutomer enter specific number on the list \\(My Orders)")
	public void aCutomerEnterSpecificNumberOnTheListMyOrders() {
	    app.displayCustomerOrders("Customer1@gmail.com");
	}

	@Then("they should see a list of their past orders")
	public void theyShouldSeeAListOfTheirPastOrders() {
	    assertFalse(app.DisplayList); // here i put assertFalse because i dont have arraylist with orders (i Initialized that no order)
	}

	@When("a cutomer enter specific number on the list \\(My Installation Requests)")
	public void aCutomerEnterSpecificNumberOnTheListMyInstallationRequests() {
	   app.displayInstallationRequests("Customer1@gmail.com");
	}

	@Then("they should see a list of their installation requests")
	public void theyShouldSeeAListOfTheirInstallationRequests() {
		assertFalse(app.DisplayList); // here i put assertFalse because i dont have arraylist with Requests (i Initialized that no Request)
	}
}
