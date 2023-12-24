package CarAccessoriesCompany_Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import caraccessoriescompany_main.MyCarApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminDashborad {

	MyCarApplication app;
	
	public AdminDashborad(MyCarApplication obj) {
		super();
		this.app = obj;
	}
	


@Given("the admin is on the product categories management page")
public void theUserIsOnTheProductCategoriesManagementPage() {
    assertTrue(app.inDashboard);
    
}

@When("the admin adds a new product category named {string}")
public void theUserAddsANewProductCategoryNamed(String string) {
    app.AddCategory("Ectrical");
    
}

@Then("the system should create a new product category {string}")
public void theSystemShouldCreateANewProductCategory(String string) {
    assertFalse(app.catIsExist);
    
}

@When("the admin edits the product category {string} and changes its name to {string}")
public void theAdminEditsTheProductCategoryAndChangesItsNameTo(String string, String string2) {
   app.editCat("Interior", "Electrical");
}

@Then("the system should update the product category to {string}")
public void theSystemShouldUpdateTheProductCategoryTo(String string) {
    assertTrue(app.catIsEdited);
}


@When("the admin deletes an exsiting product category {string}")
public void theAdminDeletesAnExsitingProductCategory(String string) {
    app.deleteCat("Interior");
}

@Then("the system should remove the product category {string}")
public void theSystemShouldRemoveTheProductCategory(String string) {
	 assertFalse(app.catIsDeleted);
}











@Given("the Admin is on the product listings management page")
public void theAdminIsOnTheProductListingsManagementPage() {
	assertTrue(app.inDashboard);
}

@When("the Admin adds a new product with name {string},Description {string} ,price {string},Availability {string} ,category {string},")
public void theAdminAddsANewProductWithNameDescriptionPriceAvailabilityCategory(String string, String string2, String string3, String string4, String string5) {
    app.addProduct("Internal mirror", "the mirror that the driver can see what is behinde him through it", "$20", "yes", "Interior");
}

@Then("the product {string} should be added to the product listings")
public void theProductShouldBeAddedToTheProductListings(String string) {
    assertFalse(app.prodIsExist);
}

@When("the Admin attempts to add a new product with name {string},Description {string} ,price {string},Availability {string} and category {string}")
public void theAdminAttemptsToAddANewProductWithNameDescriptionPriceAvailabilityAndCategory(String string, String string2, String string3, String string4, String string5) {
    app.isValidProductData("", "", "100", "true", "Interior");
}

@Then("the product should not be added to the product listings")
public void theProductShouldNotBeAddedToTheProductListings() {
    assertFalse(app.prodIsValid);
}

@When("the Admin updates the product name to {string}, which the name of the product is {string}")
public void theAdminUpdatesTheProductNameToWhichTheNameOfTheProductIs(String string, String string2) {
    app.updateProdName("Steering Wheel","Steering");
}

@Then("the product name should be updated to {string} in the product listings")
public void theProductNameShouldBeUpdatedToInTheProductListings(String string) {
	assertTrue(app.prodnameIsUpdated);
}

@When("the Admin updates the product price to {string}, which the name of the product is {string}")
public void theAdminUpdatesTheProductPriceToWhichTheNameOfTheProductIs(String string, String string2) {
    app.updateProdPrice("120", "Steering Wheel");
}

@Then("the product  price of {string} should be updated to {string} in the product listings")
public void theProductPriceOfShouldBeUpdatedToInTheProductListings(String string, String string2) {
	assertFalse(app.prodpriceIsUpdated);
}

@When("the Admin updates the product Description to {string}, which the name of the product is {string}")
public void theAdminUpdatesTheProductDescriptionToWhichTheNameOfTheProductIs(String string, String string2) {
    app.updateProdDescription("hello its me", "Steering Wheel");
}

@Then("the product Description of {string} should be updated to {string} in the product listings")
public void theProductDescriptionOfShouldBeUpdatedToInTheProductListings(String string, String string2) {
	assertTrue(app.proddescriptionIsUpdated);
}

@When("the Admin updates the product Availability to {string}, which the name of the product is {string}")
public void theAdminUpdatesTheProductAvailabilityToWhichTheNameOfTheProductIs(String string, String string2) {
    app.updateProdAvailability("no", "Steering Wheel");
}

@Then("the product Availability of {string} should be updated to {string} in the product listings")
public void theProductAvailabilityOfShouldBeUpdatedToInTheProductListings(String string, String string2) {
	assertTrue(app.prodavlIsUpdated);
}

@When("the Admin updates the product Category to {string}, which the name of the product is {string}")
public void theAdminUpdatesTheProductCategoryToWhichTheNameOfTheProductIs(String string, String string2) {
   app.updateProdCategory("Interior", "Steering Wheel");
}

@Then("the product Category of {string} should be updated to {string} in the product listings")
public void theProductCategoryOfShouldBeUpdatedToInTheProductListings(String string, String string2) {
	assertTrue(app.prodcatIsUpdated);
}
























@Given("the Admin is on the customer accounts management page")
public void theAdminIsOnTheCustomerAccountsManagementPage() {
	assertTrue(app.inDashboard);
}

@When("the Admin selects a customer account with username {string}")
public void theAdminSelectsACustomerAccountWithUsername(String string) {
    app.selectCustomerAcc("Customer1");
}

@Then("the Admin should see the details of the customer account, including name, email, and contact information")
public void theAdminShouldSeeTheDetailsOfTheCustomerAccountIncludingNameEmailAndContactInformation() {
    assertTrue(app.displayCustomerInfo);
}



@When("the Admin updates the customer username {string} to a new username {string}")
public void theAdminUpdatesTheCustomerUsernameToANewUsername(String string, String string2) {
   app.changeCustomerUsername("Customer1", "Customernew");
}

@Then("the customer account’s should be updated with the new username")
public void theCustomerAccountSShouldBeUpdatedWithTheNewUsername() {
    assertTrue(app.customerNameUpdated);
}



@When("the Admin deletes the customer account with username {string}")
public void theAdminDeletesTheCustomerAccountWithUsername(String string) {
    app.deleteCustomerAcc("Customer1");
}

@Then("the customer account {string} should be deleted")
public void theCustomerAccountShouldBeDeleted(String string) {
    assertTrue(app.customerIsDeleted);
}

@When("the Admin attempts to delete a customer account with username {string}")
public void theAdminAttemptsToDeleteACustomerAccountWithUsername(String string) {
	app.deleteCustomerAcc("Customer1dddddd");
}

@Then("the customer account should not be deleted")
public void theCustomerAccountShouldNotBeDeleted() {
	assertFalse(app.customerIsDeleted);
}


//h


@Given("the Admin is on the appointment page")
public void theAdminIsOnTheAppointmentPage(){
	assertTrue(app.inDashboard);
}





@When("the Admin schedules a new installation appointment in {string} with technician {string} for customer {string} with product name {string}")
public void theAdminSchedulesANewInstallationAppointmentInWithTechnicianForCustomerWithProductName(String string, String string2, String string3, String string4) {
	app.appointmentSchedule("October 25, 2023, 10:00 AM","Installer3","Customer3","Steering Wheel");
}


@Then("the appointment in {string} on {string} with technician {string} and with product name {string} should be scheduled")
public void theAppointmentInOnWithTechnicianAndWithProductNameShouldBeScheduled(String string, String string2, String string3, String string4) {
	assertTrue(app.appIsSechduled);
}








@When("the Admin selects the option to view scheduled appointments for {string}")
public void theAdminSelectsTheOptionToViewScheduledAppointmentsFor(String string) {
	app.appointmentView("October 20, 2023, 10:00 AM");
}

@Then("the Admin should see a list of all scheduled appointments for {string}")
public void theAdminShouldSeeAListOfAllScheduledAppointmentsFor(String string) {
	assertTrue(app.viewAppointment);
}

@Then("each appointment entry should display customer name, appointment time, assigned technician and prodcut name")
public void eachAppointmentEntryShouldDisplayCustomerNameAppointmentTimeAssignedTechnicianAndProdcutName() {
	assertTrue(app.viewAppointment);
}



@When("the Admin reschedules the appointment date for {string} with technician {string} for customer {string} to a new date {string}")
public void theAdminReschedulesTheAppointmentDateForWithTechnicianForCustomerToANewDate(String string, String string2, String string3, String string4) {
	app.appReschdule("October 20, 2023, 10:00 AM", "Installer1", "Customer1", "October 30, 2023, 10:00 AM");

}

@Then("the appointment for {string} on {string} with technician {string} should be updated to {string}")
public void theAppointmentForOnWithTechnicianShouldBeUpdatedTo(String string, String string2, String string3, String string4) {
	assertTrue(app.appReschduled);
}





@When("the Admin cancels the appointment for {string} on {string} with technician {string}")
public void theAdminCancelsTheAppointmentForOnWithTechnician(String string, String string2, String string3) {
	app.appCancel("Customer1", "October 20, 2023, 10:00 AM", "Installer1");
}

@Then("the appointment for {string} on {string} with technician {string} should be canceled")
public void theAppointmentForOnWithTechnicianShouldBeCanceled(String string, String string2, String string3) {
	assertTrue(app.appCanceled);
}



@When("the Admin selects to view {string}’s schedule")
public void theAdminSelectsToViewSSchedule(String string){
	app.ViewInstallerSchedule("Installer1");
}

@Then("the Admin should see a list of all appointments assigned to {string}")
public void theAdminShouldSeeAListOfAllAppointmentsAssignedTo(String string) {
	 assertFalse(app.InstallerScheduleViewd);
}













	
	
}