package caraccessoriescompany_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import caraccessoriescompany_main.Customer;
import caraccessoriescompany_main.Installer;
import caraccessoriescompany_main.MyCarApplication;
import caraccessoriescompany_main.Order;
import caraccessoriescompany_main.Product;
import caraccessoriescompany_main.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class coverage {

	MyCarApplication app;
	Order or;
	public String email;
	public boolean result;
    private User user;
    private Installer ins;
    private Customer customer;
    private Product prod;
    private String retrievedUsername;
    private String retrievedCustomerEmail;
    private String retrievedProductName;
    private String retrievedProductPrice;
    private String retrievedProductStatus;
    
    private String password;
    private boolean loginResult;
	
	 
	public coverage(MyCarApplication obj) {
		super();
        this.app = obj;
        
	}
	

	
	@Given("the user has a old email and password")
	public void theUserHasAOldEmailAndPassword() {
		user = new User("valid@email.com", "securepassword");
	    
	}

	@When("the user wants to edit his email and password")
	public void theUserWantsToEditHisEmailAndPassword() {
	   user.setEmail("newemail@gmail.com");
	   user.setPassword("newPass");
	}

	@Then("the user should be successfully edited his email and password")
	public void theUserShouldBeSuccessfullyEditedHisEmailAndPassword() {
	   assertEquals("newemail@gmail.com",user.getEmail());
	   assertEquals("newPass",user.getPassword());
	}

	@Given("the Installer has a old email, password, username and avalibilty")
	public void theInstallerHasAOldEmailPasswordUsernameAndAvalibilty() {
		ins = new Installer("Installer@gmail.com","Ahmad","ins","Ava");
	}

	@When("the Installer wants to edit his email, password, username and avalibilty")
	public void theInstallerHasAOldEmailPasswordUsernameAndAvalibilty1() {
	    ins.setEmail("newInstaller@gmail.com");
	    ins.setPassword("newPassword");
	    ins.setUsername("Installer33");
	    ins.setInstallerAvalibilty("Yes");
	}

	@Then("the Installer should be successfully edited his email, password, username and avalibilty")
	public void theInstallerShouldBeSuccessfullyEditedHisEmailPasswordUsernameAndAvalibilty() {
		   assertEquals("newInstaller@gmail.com",ins.getEmail());
		   assertEquals("newPassword",ins.getPassword());
		   assertEquals("Installer33",ins.getUsername());
		   assertEquals("Yes",ins.getInstallerAvalibilty());
	}

	@Given("the Customer has a old password and Phone number")
	public void theCustomerHasAOldPasswordAndPhoneNumber() {
		customer = new Customer("Email@gmail.com","asadasda123","Ahmad","059105388");
	}

	@When("the Customer wants to edit his password and Phone number")
	public void theCustomerWantsToEditHisPasswordAndPhoneNumber() {
	   customer.setPassword("Customer123");
	   customer.setPhoneNumber("0599105080");
	}

	@Then("the Customer should be successfully edited his password and Phone number")
	public void theCustomerShouldBeSuccessfullyEditedHisPasswordAndPhoneNumber() {
		assertEquals("Customer123",customer.getPassword());
		assertEquals("0599105080",customer.getPhoneNumber());
	}

	@Given("the admin in dashboard")
	public void theAdminInDashboard() {
		prod = new Product("Body Shell", "Protect the front shell", "120$", "Yes", "Interior");
	}

	@When("the admin wants to edit and get some information about product")
	public void theAdminWantsToEditAndGetSomeInformationAboutProduct() {
	    prod.getDescription();
	    prod.setPrice("120$");
	    prod.getAvailability();
	    prod.getReview();
	}

	@Then("the admin should be successfully edited information about product")
	public void theAdminShouldBeSuccessfullyEditedInformationAboutProduct() {
		assertEquals("120$",prod.getPrice());
	}

	@Given("a valid email address for an admin")
	public void aValidEmailAddressForAnAdmin() {
		this.email = "Hameedo@gmail.com";
	}


	@Given("a valid email address for a customer")
	public void aValidEmailAddressForACustomer() {
		this.email = "Customer1@gmail.com";
	}

	@Given("a valid email address for an installer")
	public void aValidEmailAddressForAnInstaller() {
		this.email = "Installer1@gmail.com";
	}

	@Given("an invalid email address")
	public void anInvalidEmailAddress() {
		this.email = "invalidemail";
	}

	@Then("an invalid email type exception should be raised")
	public void anInvalidEmailTypeExceptionShouldBeRaised() {
		app.invalidEmailType(email);
	}

	@Given("an email address that does not belong to an admin, customer, or installer")
	public void anEmailAddressThatDoesNotBelongToAnAdminCustomerOrInstaller() {
		this.email = "nonexistent@example.com";
	}



	@Given("a valid email address {string}")
	public void aValidEmailAddress(String validEmail) {
		 this.email = "Hameedo@gmail.com";
	}

	@Given("an invalid email address {string}")
	public void anInvalidEmailAddress(String invalidEmail) {
		this.email = "invalidemail";
	}

	@Given("the user ID is checked for a different email {string}")
	public void theUserIDIsCheckedForADifferentEmail(String differentEmail) {
		this.result = app.userID(differentEmail);
	}



	@Given("a valid customer email {string}")
	public void aValidCustomerEmail(String validCustomerEmail) {
		 this.email = "Customer1@gmail.com";
	}
	
	@Given("the customer password is {string}")
	public void theCustomerPasswordIs(String string) {
	   this.password="Customer123";
	}

	@When("the customer tries to log in")
	public void theCustomerTriesToLogIn() {
	   app.customerlogin("Customer1@gmail.com", "Custo");
	}
	
	@Given("a valid installer email {string}")
	public void aValidInstallerEmail(String validInstallerEmail) {
		this.email = "Installer1@gmail.com";
	}
	
	@When("the user ID is checked")
	public void theUserIDIsChecked() {
		 this.result = app.userID(email);
		 
	}

	@Then("the result should be true")
	public void theResultShouldBeTrue() {
		assertEquals(true, result);
		
		
	}
	
	

	@Given("an invalid customer email {string}")
	public void anInvalidCustomerEmail(String invalidCustomerEmail) {
		this.email = "Customer1";
	}


	@Given("an invalid installer email {string}")
	public void anInvalidInstallerEmail(String invalidInstallerEmail) {
		this.email = "Installer1";
	}


	@Then("the result should be false")
	public void theResultShouldBeFalse() {
		assertEquals(false, result);
	}




	@Given("a product with a username")
	public void aProductWithAUsername() {
	    this.or= new Order("sampleUsername", "customer@example.com", "ProductA", "50.00", "In Stock");
	}

	@When("I retrieve the username")
	public void iRetrieveTheUsername() {
		 this.retrievedUsername = or.getUsername();
	}

	@Then("the username should be the expected value")
	public void theUsernameShouldBeTheExpectedValue() {
		assertEquals("sampleUsername", retrievedUsername);
	}

	@Given("a product with a customer email")
	public void aProductWithACustomerEmail() {
		 this.or = new Order("usernameA", "sampleCustomerEmail@example.com", "ProductB", "75.00", "Out of Stock");
	}

	@When("I retrieve the customer email")
	public void iRetrieveTheCustomerEmail() {
		this.retrievedCustomerEmail = or.getCustomerEmail();
	}

	@Then("the customer email should be the expected value")
	public void theCustomerEmailShouldBeTheExpectedValue() {
		assertEquals("sampleCustomerEmail@example.com", retrievedCustomerEmail);
	}

	@Given("a product with a name")
	public void aProductWithAName() {
		this.or = new Order("usernameB", "customerB@example.com", "ProductC", "120.00", "In Stock");
	}

	@When("I retrieve the product name")
	public void iRetrieveTheProductName() {
		this.retrievedProductName = or.getProductName();
	}

	@Then("the product name should be the expected value")
	public void theProductNameShouldBeTheExpectedValue() {
		assertEquals("ProductC", retrievedProductName);
	}

	@Given("a product with a price")
	public void aProductWithAPrice() {
		this.or = new Order("usernameC", "customerC@example.com", "ProductD", "90.00", "In Stock");
	}

	@When("I retrieve the product price")
	public void iRetrieveTheProductPrice() {
		 this.retrievedProductPrice = or.getPrice();
	}

	@Then("the product price should be the expected value")
	public void theProductPriceShouldBeTheExpectedValue() {
		assertEquals("90.00", retrievedProductPrice);
	}

	@Given("a product with a status")
	public void aProductWithAStatus() {
		this.or = new Order("usernameD", "customerD@example.com", "ProductE", "60.00", "Out of Stock");
	}

	@When("the status is updated to {string}")
	public void theStatusIsUpdatedTo(String string) {
		 or.setStatus("newStatus");
	}

	@Then("the product status should be {string}")
	public void theProductStatusShouldBe(String string) {
		 assertEquals("newStatus", or.getStatus());
	}

	@When("the status is updated to an empty string")
	public void theStatusIsUpdatedToAnEmptyString() {
		 or.setStatus("");
	}

	@Then("the product status should be an empty string")
	public void theProductStatusShouldBeAnEmptyString() {
		 assertEquals("", or.getStatus());
	}

	@When("the status is updated to null")
	public void theStatusIsUpdatedToNull() {
		or.setStatus(null);
	}

	@Then("the product status should be null")
	public void theProductStatusShouldBeNull() {
		 assertEquals(null, or.getStatus());
	}








	@Given("a valid admin email {string}")
	public void aValidAdminEmail(String validAdminEmail) {
		 this.email = "Hameedo@gmail.com";
	}

	@Given("a valid admin password {string}")
	public void aValidAdminPassword(String validAdminPassword) {
		this.password = "Hameedo123";
	}



	@When("the user tries to log in")
	public void theUserTriesToLogIn() {
		 app.adminlogin(email, password);
	}

	@Then("the login should be successful")
	public void theLoginShouldBeSuccessful() {
		assertEquals(true, app.getIsLogedin());
	}

	@Given("an incorrect admin password {string}")
	public void anIncorrectAdminPassword(String incorrectAdminPassword) {
		 this.password = "incorrectAdminPassword";
	}


	@Given("an invalid admin email {string}")
	public void anInvalidAdminEmail(String invalidAdminEmail) {
		this.email = "Hameedo";
	}

	@Given("an empty admin password")
	public void anEmptyAdminPassword() {
		this.password = "";
	}

	@Given("the user tries to log in with a different email {string}")
	public void theUserTriesToLogInWithADifferentEmail(String differentEmail) {
		this.email = "Ahmaddweikat@gmailllllllllllll.com";
	}

	
	
	@Given("the admin password is {string}")
	public void theAdminPasswordIs(String string) {
		this.password = "Hameedo123";
	}

	@Given("the user tries to log in with an incorrect password {string}")
	public void theUserTriesToLogInWithAnIncorrectPassword(String string) {
		this.password = "Hhhhhhhhhhh";
	}

	@When("the admin tries to log in")
	public void theAdminTriesToLogIn() {
		app.adminlogin(this.email, password);
		
	}
	
	
	
	

	@Then("the login should fail")
	public void theLoginShouldFail() {
		assertEquals(false, app.getIsLogedin());
		
	}

	
	
	
	 
	
	
	
	@Given("a valid email {string}")
	public void aValidEmail(String validEmail) {
		this.email = "Ahmaddweikat@gmail.com";
	}

	@When("the system validates the email")
	public void theSystemValidatesTheEmail() {
	    app.invalidEmailType(this.email);
	}

	@Then("the email should be considered valid")
	public void theEmailShouldBeConsideredValid() {
		assertEquals(false, app.getInvalidEmail());
	}

	@Given("an invalid email {string}")
	public void anInvalidEmail(String invalidEmail) {
		this.email = "Ahmaddweikat";
	}

	@Given("an empty email {string}")
	public void anEmptyEmail(String string) {
		this.email = " ";
	}
	
	@Then("the email should be considered invalid")
	public void theEmailShouldBeConsideredInvalid() {
		
		assertEquals(true, app.invalidEmailType(this.email));
	}

	
	
	
	
	
	
	@Given("a validd customer email {string}")
	public void aValiddCustomerEmail(String string) {
	    email="Customer1@gmail.com";
	}

	@Given("the customerr password is {string}")
	public void theCustomerrPasswordIs(String string) {
	    password="Customer123";
	}

	@When("the customerr tries to log in")
	public void theCustomerrTriesToLogIn() {
	    app.customerlogin("Customer1@gmail.com", "Customer123");
	}

	@Then("the login should be successfulll")
	public void theLoginShouldBeSuccessfulll() {
	    assertTrue(app.getIsLogedin());
	}

	@Given("a valid customerrr email {string}")
	public void aValidCustomerrrEmail(String string) {
		email="Customer1@gmail.com";
	}

	@Given("the customer passwordd is {string}")
	public void theCustomerPassworddIs(String string) {
		password="Customer123";
	}

	@Given("the user tries to log in with an incorrect passworddd {string}")
	public void theUserTriesToLogInWithAnIncorrectPassworddd(String string) {
		password="Customerrrrrrr";
	}

	@When("the customer tries to log innn")
	public void theCustomerTriesToLogInnn() {
		 app.customerIncorrectPassword("Customer1@gmail.com", "Customerrrrrrr");
	}

	@Then("the login shoulddd fail")
	public void theLoginShouldddFail() {
		assertTrue(app.getIncorrectPassword());
		 assertFalse(app.getIsLogedin());
	}

	@Given("an invaliddd customer email {string}")
	public void anInvalidddCustomerEmail(String string) {
		email="Customer";
	}

	@When("the customeree tries to log in")
	public void theCustomereeTriesToLogIn() {
		app.customerInvalidEmail("Customer");
	}

	@Then("the loginnn should fail")
	public void theLoginnnShouldFail() {
		 assertFalse(app.getIsLogedin());
	}

	@Given("a valid customer emailll {string}")
	public void aValidCustomerEmailll(String string) {
		email="Customer1@gmail.com";
	}

	@Given("the customer password isss an empty string")
	public void theCustomerPasswordIsssAnEmptyString() {
	    password=" ";
	}

	@When("the customer triesss to log in")
	public void theCustomerTriesssToLogIn() {
		app.customerlogin("Customer", " ");
	}

	@Then("theee login should fail")
	public void theeeLoginShouldFail() {
		assertFalse(app.getIsLogedin());
	}
	
	
	
	
	
	
	
	
	
	
	
	@Given("a validd installer email {string}")
	public void aValiddInstallerEmail(String string) {
		email="Installer1@gmail.com";
	}

	@Given("the installerd password is {string}")
	public void theInstallerdPasswordIs(String string) {
	    password="Installer123";
	}

	@When("the installerd tries to log in")
	public void theInstallerdTriesToLogIn() {
	    app.installerlogin("Installer1@gmail.com", "Installer123");
	}

	@Then("the login shouldd be successful")
	public void theLoginShoulddBeSuccessful() {
		assertTrue(app.getIsLogedin());
	}

	@Given("the installerr password is {string}")
	public void theInstallerrPasswordIs(String string) {
		password="Installer123";
	}

	@Given("the user triess to log in with an incorrect password {string}")
	public void theUserTriessToLogInWithAnIncorrectPassword(String string) {
		password="Instttttttttttttt";
	}

	@When("the installerr tries to log in")
	public void theInstallerrTriesToLogIn() {
	    app.installerIncorrectPassword("Installer1@gmail.com", "Instttttttttttttt");
	}

	@Then("the loginn should fail")
	public void theLoginnShouldFail() {
		assertTrue(app.getIncorrectPassword());
		assertFalse(app.getIsLogedin());
	}

	@Given("aan invalid installer email {string}")
	public void aanInvalidInstallerEmail(String string) {
	    email="Installer1111";
	}

	@When("tthe installer tries to log in")
	public void ttheInstallerTriesToLogIn() {
	    app.installerInvalidEmail("Installer1111");
	}

	@Then("tthe login should fail")
	public void ttheLoginShouldFail() {
		assertFalse(app.getIsLogedin());
	}

	@Given("aa valid installer email {string}")
	public void aaValidInstallerEmail(String string) {
		email="Installer1@gmail.com";
	}

	@Given("tthee installer password is an empty string")
	public void ttheeInstallerPasswordIsAnEmptyString() {
	    password=" ";
	}

	@When("tthee installer tries to log in")
	public void ttheeInstallerTriesToLogIn() {
	    app.installerlogin("Installer1@gmail.com", " ");
	}

	@Then("tthee login should fail")
	public void ttheeLoginShouldFail() {
		assertFalse(app.getIsLogedin());
	}
	
	
	
	
	
	
	
	
	
	
	
	@Given("a username {string}")
	public void aUsername(String string) {
	    email="Customer1";
	}

	@When("the system checks if the username exists")
	public void theSystemChecksIfTheUsernameExists() {
	    app.existUsername("Customer1");
	}

	@Then("the Signedup should be false")
	public void theSignedupShouldBeFalse() {
	   assertFalse(app.getIsSignedup());
	}


	
	
	@Given("a phonenumber {string}")
	public void aPhonenumber(String string) {
		email="056-1234567";
	}

	@When("the system checks if the phonenumber exists")
	public void theSystemChecksIfThePhonenumberExists() {
	   app.existPhoneNumber("056-1234567");
	}

	@Then("the Signedupp should be false")
	public void theSigneduppShouldBeFalse() {
		assertFalse(app.getIsSignedup());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
}
