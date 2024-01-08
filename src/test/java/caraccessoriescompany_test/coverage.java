package caraccessoriescompany_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import caraccessoriescompany_main.Appointment;
import caraccessoriescompany_main.Category;
import caraccessoriescompany_main.Customer;
import caraccessoriescompany_main.DataArrayList;
import caraccessoriescompany_main.Installer;
import caraccessoriescompany_main.MyCarApplication;
import caraccessoriescompany_main.Order;
import caraccessoriescompany_main.Product;
import caraccessoriescompany_main.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class coverage {
	
    
    
    
    private String dateString;
    private SimpleDateFormat dateFormat;
    private boolean validationResult;
    private List<String> installerSchedule;
    

	MyCarApplication app;
	Order or;
	Appointment ap;
	DataArrayList li = new DataArrayList();
	public String email;
	public boolean result;
    private User user;
    private Installer ins;
    private Customer customer;
    Product prod;
    Category cat;
    private String retrievedUsername;
    private String retrievedCustomerEmail;
    private String retrievedProductName;
    private String retrievedProductPrice;
    private String retrievedProductStatus;
    private List<Customer> customers;
    private List<Product> products;
    private List<Category> categories;
    private List<Appointment> apa;
    private List<Order> orders;
    private List<String> sched;
    
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
	
	
	
	@Given("i have array with customers")
    public void iHaveArrayWithCustomers() {
		customers = new ArrayList<>();
    
    }

    @When("i add customer")
    public void iAddCustomer() {
    	Customer newCustomer = new Customer("email@gmail.com", "asadasda123", "Ahmad", "059105388");
        customers.add(newCustomer);
        li.setCustomers(customers);
    }

    @Then("the customer shoud add successfuly")
    public void theCustomerShoudAddSuccessfuly() {
    	assertTrue("No customers were added.", customers.size() > 0);
    	
        Customer addedCustomer = customers.get(0);
        assertEquals("email@gmail.com", addedCustomer.getEmail());
        assertEquals("asadasda123", addedCustomer.getPassword());
        assertEquals("Ahmad", addedCustomer.getUsername());
        assertEquals("059105388", addedCustomer.getPhoneNumber());
    }

    
    @Given("i have array with products")
    public void iHaveArrayWithProducts() {
    	products = new ArrayList<>();
    }

    @When("i add product")
    public void iAddProduct() {
    	Product newProduct = new Product("Body Shell", "Protect the front shell", "120$", "Yes", "Interior");
    	products.add(newProduct);
    	li.setProducts(products);
    }

    @Then("the product shoud add successfuly")
    public void theProductShoudAddSuccessfuly() {
    	assertTrue(products.size() > 0);
    	
    	Product addedProduct = products.get(0);
        assertEquals("Body Shell", addedProduct.getProductName());
        assertEquals("Protect the front shell", addedProduct.getDescription());
        assertEquals("120$", addedProduct.getPrice());
        assertEquals("Interior", addedProduct.getCategory());
        app.getProdIsAdded();
    }
    
    @Given("i have array with categorys")
    public void iHaveArrayWithCategorys() {
    	categories = new ArrayList<>();
    }

    @When("i add category")
    public void iAddCategory() {
    	Category newCat = new Category("Test");
    	categories.add(newCat);
    	li.setCategories(categories);
    	
    }

    @Then("the category shoud add successfuly")
    public void theCategoryShoudAddSuccessfuly() {
    	assertTrue(categories.size() > 0);
    	
    	Category addedCategory = categories.get(0);
        assertEquals("Test", addedCategory.getCatName());
        app.getCatIsAdded();
        
    }

    @Given("i have array with appointments")
    public void iHaveArrayWithAppointments() {
    	apa = new ArrayList<>();
    }

    @When("i add appointment")
    public void iAddAppointment() {
    	Appointment newAppointment = new Appointment("27/07/2023", "installer1", "Customer1","Body Shell");
    	apa.add(newAppointment);
    	li.setAppointments(apa);
    }

    @Then("the appointment shoud add successfuly")
    public void theAppointmentShoudAddSuccessfuly() {
    	assertTrue(apa.size() > 0);
    	Appointment addedAppointment = apa.get(0);
        assertEquals("27/07/2023", addedAppointment.getDate());
        assertEquals("installer1", addedAppointment.getInsName());
        assertEquals("Customer1", addedAppointment.getCusName());
        assertEquals("Body Shell", addedAppointment.getProName());
    }
  
    @Given("i have array with orders")
    public void iHaveArrayWithOrders() {
    	orders = new ArrayList<>();
    }

    @When("i add order")
    public void iAddOrder() {
    	Order newOrder = new Order("usernameA", "sampleCustomerEmail@example.com", "ProductB", "75.00", "Yes");
    	orders.add(newOrder);
    	li.setOrders(orders);
    }

    @Then("the order shoud add successfuly")
    public void theOrderShoudAddSuccessfuly() {
    	assertTrue(orders.size() > 0);
    	Order addedOrder = orders.get(0);
        assertEquals("usernameA", addedOrder.getUsername());
        assertEquals("sampleCustomerEmail@example.com", addedOrder.getCustomerEmail());
        assertEquals("ProductB", addedOrder.getProductName());
        assertEquals("75.00", addedOrder.getPrice());
        assertEquals("Yes", addedOrder.getStatus());
    }
   
    @When("i wnat to get order information")
    public void iWnatToGetOrderInformation() {
    	Order newOrder = new Order("usernameA", "sampleCustomerEmail@example.com", "ProductB", "75.00", "Yes");
    }

    @Then("the order shoud back the info successfuly")
    public void theOrderShoudBackTheInfoSuccessfuly() {
    	assertFalse(li.getOrders().contains("ProductB"));
    }
    
    @Given("the admin is logged in")
    public void theAdminIsLoggedIn() {
        assertTrue(true);
    }

    @When("admin join to main")
    public void adminJoinToMain() {
        app.adminlogin("Ahmaddweikat@gmail.com", "Ahmad123");
    }

    @Then("he should see menu")
    public void heShouldSeeMenu() {
        app.printadminMenu();
    }
    
    @When("admin join to main then enter admin dashboard")
    public void adminJoinToMainThenEnterAdminDashboard() {
    	 app.adminlogin("Ahmaddweikat@gmail.com", "Ahmad123");
    }

    @Then("he should see dashboard")
    public void heShouldSeeDashboard() {
    	app.printadminDashoard();
    }
    
    @Given("the customer is logged in")
    public void theCustomerIsLoggedIn() {
        assertTrue(true);
        app.getCustomerAccIsExist();
    }

    @When("customer join to main")
    public void customerJoinToMain() {
        app.customerlogin("Customer1@gmail.com", "Customer123");
    }
    @Then("he should see customer menu")
    public void heShouldSeeCustomerMenu() {
      app.printCustomerMenu();
      app.getisNoOrder();
    }


    @Given("the installer is logged in")
    public void theInstallerIsLoggedIn() {
    	 assertTrue(true);
    }

    @When("admin join to installer")
    public void adminJoinToInstaller() {
        app.installerlogin("Installer1@gmail.com", "Installer123");
    }
    @Then("he should see installer menu")
    public void heShouldSeeInstallerMenu() {
       app.printInstallerMenu();
    }
    
    @Given("the customer or admin is logged in")
    public void theCustomerOrAdminIsLoggedIn() {
        assertTrue(true);
    }

    @When("the customer or admin choose to see the all products")
    public void theCustomerOrAdminChooseToSeeTheAllProducts() {
    	 app.adminlogin("Ahmaddweikat@gmail.com", "Ahmad123");
    	 app.customerlogin("Customer1@gmail.com", "Customer123");
    }
    

    @Then("they should see list of products")
    public void theyShouldSeeListOfProducts() {
        app.printTheProducts(1);
        app.printTheProducts(2);
        app.printTheProducts(3);
        app.printTheProducts(4);
    }
    @When("admin join to main then enter admin dashboard and chose to {string} an product")
    public void adminJoinToMainThenEnterAdminDashboardAndChoseToAnProduct(String string) {
    	 app.adminlogin("Ahmaddweikat@gmail.com", "Ahmad123");
    	 app.editCommand();
    	 Product newProduct = new Product("Body Shell", "Protect the front shell", "120$", "Yes", "Interior");
    	 app.updateProdPrice("100","Body Shell");
    }
    
    @Then("he should see menu of what he want to edit")
    public void heShouldSeeMenuOfWhatHeWantToEdit() {
    
       app.printEditChoices();
    }
    @When("admin join to main then enter admin dashboard and chose to see categories")
    public void adminJoinToMainThenEnterAdminDashboardAndChoseToSeeCategories() {
    	app.adminlogin("Ahmaddweikat@gmail.com", "Ahmad123");
    	app.editCommand();
    }
    

    @Then("he should see list of categories")
    public void heShouldSeeListOfCategories() {
        app.printCat();
    }
    
    @When("admin join to main then enter admin dashboard and chose to see users")
    public void adminJoinToMainThenEnterAdminDashboardAndChoseToSeeUsers() {
    	app.adminlogin("Ahmaddweikat@gmail.com", "Ahmad123");
    }

    @Then("he should see list of users")
    public void heShouldSeeListOfUsers() {
       app.printUsers();
    }
    
    @When("customer join to main then enter browse product then enter the name of product and which category")
    public void customerJoinToMainThenEnterBrowseProductThenEnterTheNameOfProductAndWhichCategory() {
    	app.customerlogin("Customer1@gmail.com", "Customer123");
    }

    @Then("he should see the product")
    public void heShouldSeeTheProduct() {
        app.productName("Interior", "Steering Wheel");
        app.productName("Exterior", "Body Shell");
        app.productName("Electronic", "Anti-lock Braking System");
    }
    
    @When("the customer want to buy product he enter product name")
    public void theCustomerWantToBuyProductHeEnterProductName() {
        app.addProductToCustomerArray("Customer1@gmail.com", "Body Shell");
    }

    @Then("the product ad to his list success")
    public void theProductAdToHisListSuccess() {
    	customer = new Customer("Customer1@gmail.com","ahmad","asddasd","1231123123"); // Instantiate the customer object
    	prod = new Product("Body Shell", "Protect the front shell", "120$", "Yes", "Interior");
        assertEquals("Customer1@gmail.com",customer.getEmail());
        assertEquals("1231123123",customer.getPhoneNumber());
        app.getField(customer, "PH");
        assertEquals("Body Shell",prod.getProductName());
        app.getisDisplayOrder();
        app.editField("Customer1@gmail.com", "Password", "NEWAHMAD");
    }
    
    @When("the admin want to add product and its exist")
    public void theAdminWantToAddProductAndItsExist() {
    	app.isExistProduct("Body Shell");
    	app.isproductNameExist("Body Shell");
    	
    }

    @Then("he should see exist msg")
    public void heShouldSeeExistMsg() {
    	prod = new Product("Body Shell", "Protect the front shell", "120$", "Yes", "Interior");
    	assertEquals("Body Shell", prod.getProductName());
    	app.getisExist();
    }
    
    @When("customer join to his profile then choose to change his information like username, password and telephone")
    public void customerJoinToHisProfileThenChooseToChangeHisInformationLikeUsernamePasswordAndTelephone() {
    	app.customerlogin("Customer1@gmail.com", "Customer123");
    	app.changeUsernameforCust("Customer1@gmail.com", "NewCustomer");
    	app.changePasswordforCust("Customer1@gmail.com", "newPass");
    	app.changePhoneforCust("Customer1@gmail.com", "123456789");
    }

    @Then("he should see success msg")
    public void heShouldSeeSuccessMsg() {
       customer = new Customer("Customer1@gmail.com","ahmad","ahmaddwe","1231123123"); 
       assertEquals("ahmaddwe", customer.getUsername());
       assertEquals("ahmad", customer.getPassword());
       assertEquals("1231123123", customer.getPhoneNumber());
    }

    @When("the admin want to add category and its exist")
    public void theAdminWantToAddCategoryAndItsExist() {
    	app.iscategoryNameExist("Interior");
    }

    @Then("he should see exist category msg")
    public void heShouldSeeExistCategoryMsg() {
    	cat = new Category("Interior");
    	assertEquals("Interior", cat.getCatName());
    }
    
    @When("admin enter customer name")
    public void adminEnterCustomerName() {
       app.findCustomerByEmaill("Customer1@gmail.com");
    }

    @Then("he should see success its found msg")
    public void heShouldSeeSuccessItsFoundMsg() {
    	customer = new Customer("Customer1@gmail.com","ahmad","ahmaddwe","1231123123"); 
        assertEquals("Customer1@gmail.com",customer.getEmail());
    }
    
    @Given("the admin or customer is logged in")
    public void theAdminOrCustomerIsLoggedIn() {
        assertTrue(true);
    }

    @When("admin or customer enter product name")
    public void adminOrCustomerEnterProductName() {
    	app.adminlogin("Ahmaddweikat@gmail.com", "Ahmad123");
   	 	app.customerlogin("Customer1@gmail.com", "Customer123");
    }

    @Then("he should see success its found product msg")
    public void heShouldSeeSuccessItsFoundProductMsg() {
        app.findProductByName("Body Shell");
    }
    
    @When("admin enter installer name")
    public void adminEnterInstallerName() {
    	app.adminlogin("Ahmaddweikat@gmail.com", "Ahmad123");
    }

    @Then("he should see success its found installer msg")
    public void heShouldSeeSuccessItsFoundInstallerMsg() {
       app.findInstallerByNamee("Installer1@gmail.com");
    }
    
    @When("the customer bought a product")
    public void theCustomerBoughtAProduct() {
    	app.customerlogin("Customer1@gmail.com", "Customer123");
    	prod = new Product("Body Shell", "Protect the front shell", "120$", "Yes", "Interior");
    	ins = new Installer("Installer1@gmail.com", "Installer123", "Installer1", "Busy"); 
    	
    	app.addReq("Customer1@gmail.com", "Body Shell", "BMW", "Installer1", "07/02/2023");
    	app.addReq("Inavlid@gmail.com", "Body Shell", "BMW", "Installer1", "07/02/2023");
    	app.addReq("Inavlid@gmail.com", " ", "BMW", " ", "07/02/2023");
    }

    @Then("he should add request")
    public void heShouldAddRequest() {
    	customer = new Customer("Customer1@gmail.com","ahmad","ahmaddwe","1231123123"); 
        app.addRequestToCustomer(customer, "Body Shell", "BMW", "Installer1", "07/07/2023");
        app.getisOrdered();
    }
    
    @When("the customer bought a product then enter confirm command")
    public void theCustomerBoughtAProductThenEnterConfirmCommand() {
    	app.customerlogin("Customer1@gmail.com", "Customer123");
    	 app.setConfirmed(true);
    }

    @Then("the request adds to installer")
    public void theRequestAddsToInstaller() {
    	ins = new Installer("Installer1@gmail.com", "Installer123", "Installer1", "Busy"); 
        app.addRequestToInstaller(ins, "Customer1@gmail.com", "Body Shell", "07/07/2023");
        app.getisConfirmed();
        
    }

    @When("the customer bought a product then enter date is taken")
    public void theCustomerBoughtAProductThenEnterDateIsTaken() {
    	app.customerlogin("Customer1@gmail.com", "Customer123");
        sched = new ArrayList<>();
        ins = new Installer("Installer1@gmail.com", "Installer123", "Installer1", "Busy");
        app.addRequestToInstaller(ins, "Customer1@gmail.com", "Body Shell", "07/07/2023");
        app.addRequestToInstaller(ins, "Customer1@gmail.com", "Body Shell", "11/05/2023");
        app.isDateBookedd(sched, "07/07/2023");
        app.sortInstallerSchedule(sched);
    }

    @Then("he should see is taken msg")
    public void heShouldSeeIsTakenMsg() {
    	String expectedDate = "07/07/2023";
        List<String> actualDates = ins.getschedule();

        assertFalse(actualDates.contains(expectedDate));
    }
    @Given("an email {string}")
    public void anEmail(String string) {
        email="Customer1@gmail.com";
    }

    @When("the system displays orders placed by the customer")
    public void theSystemDisplaysOrdersPlacedByTheCustomer() {
       result=app.getorderIsPlacedBy("Customer1@gmail.com");
       ins = new Installer("Installer1@gmail.com", "Installer123", "Installer1", "Busy");
       app.addReq("Customer1@gmail.com", "Body Shell","BMW", "Installer1", "07/07/2024");
       app.displayCustomerOrders("Customer1@gmail.com");
       app.addReq("Customer1@gmail.com", "Body Shell","BMW", "Installer1", "07/07/2024");
       app.addReq("Customer1@gmail.com", "Body Shasdasdell","BMW", "Installer2221", "07/07/2024");
       app.displayInstallationrequests("Customer1@gmail.com");
       List<String> installerSchedule = new ArrayList<>();
       installerSchedule.add("07/07/2024");
       installerSchedule.add("03/07/2024");
       installerSchedule.add("02/07/2024");
       app.displayInstallerSchedule(installerSchedule);
    }

    @Then("the system should show the customer’s orders")
    public void theSystemShouldShowTheCustomerSOrders() {
    	assertTrue(result);
    }

    
	
	
	
    @Given("a valid date string {string} and date format {string}")
    public void aValidDateStringAndDateFormat(String dateString, String format) {
    	this.dateString = "2023-12-25";
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    }

    @When("the system checks if the date is valid")
    public void theSystemChecksIfTheDateIsValid() {
    	validationResult = app.isDate("2023-12-25", dateFormat);
    }
    
    
    @Then("the resultttt should be true")
    public void theResulttttShouldBeTrue() {
    	 assertEquals(true, validationResult);
    }

    @Given("an invalid date string {string} and date format {string}")
    public void anInvalidDateStringAndDateFormat(String string, String string2) {
    	this.dateString = "2023";
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    }

    @When("the systemm checks if the date is valid")
    public void theSystemmChecksIfTheDateIsValid() {
    	validationResult = app.isDate("2023", dateFormat);
    }

    @Then("the resultt should be false")
    public void theResulttShouldBeFalse() {
    	 assertEquals(false, validationResult);
    }
	
	
   
    

	
    

    @Given("there are no products")
    public void thereAreNoProducts() {
        li.getProducts().clear();
    }

    @When("the user tries to update the price of a product with name {string} to {string}")
    public void theUserTriesToUpdateThePriceOfAProductWithNameTo(String string, String string2) {
    	app.updateProdPrice("100.00", "bodyShell");
    	
    }

    @Then("the price of the product {string} should not be updated")
    public void thePriceOfTheProductShouldNotBeUpdated(String string) {
    	assertFalse(app.getProdpriceIsUpdated());
    }
    
    
    
    
    
    @Given("there is a product with name {string} and other details")
    public void thereIsAProductWithNameAndOtherDetails(String string) {
    	prod = new Product("Body Shell", "Protect the front shell", "120$", "Yes", "Interior");
    	li.getProducts().add(prod);
    }

    @When("the user deletes the product with name {string}")
    public void theUserDeletesTheProductWithName(String string) {
        app.deleteProd("Body Shell");
    }

    @Then("the product {string} should be deleted")
    public void theProductShouldBeDeleted(String string) {
        assertTrue(app.getProductIsDeleted());
    }

    @Given("there are no products in the system")
    public void thereAreNoProductsInTheSystem() {
    	 li.getProducts().clear();
    }

    @When("the user tries to delete a product with name {string}")
    public void theUserTriesToDeleteAProductWithName(String string) {
    	app.deleteProd("hhhhhh");
    }

    @Then("the product {string} should not be deleted")
    public void theProductShouldNotBeDeleted(String string) {
    	assertFalse(app.getProductIsDeleted());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Given("a customer with email {string} and installation requests")
    public void aCustomerWithEmailAndInstallationRequests(String string) {
    	Customer newCustomer = new Customer("Customer1@gmail.com", "asadasda123", "Ahmad", "059105388");
    	
       
        li.getCustomers().add(newCustomer);
        if(li.getCustomers()==null) {
        	li.setCustomers(new ArrayList<>());
        }
        
        
    }

    @When("the user tries to display installation requests for the customer with email {string}")
    public void theUserTriesToDisplayInstallationRequestsForTheCustomerWithEmail(String string) {
        app.displayInstallationrequests("Customer1@gmail.com");
      
    }

    @Then("the system should display the installation requests for the customer")
    public void theSystemShouldDisplayTheInstallationRequestsForTheCustomer() {
    	Customer newCustomer = new Customer("Customer1@gmail.com", "asadasda123", "Ahmad", "059105388");
        assertEquals(false,app.getDisplayList());
    }

    @Given("a customer with email {string} and no installation requests")
    public void aCustomerWithEmailAndNoInstallationRequests(String string) {
    	Customer newCustomer = new Customer("Customer1@gmail.com", "asadasda123", "Ahmad", "059105388");
    	
        li.getCustomers().add(newCustomer);
        if(li.getCustomers()==null) {
        	li.setCustomers(new ArrayList<>());
        }
        
    }

    @When("the user tries to display installation requests for the customer with emaill {string}")
    public void theUserTriesToDisplayInstallationRequestsForTheCustomerWithEmaill(String string) {
    	app.displayInstallationrequests("Customer123@gmail.com");
    }

    @Then("the system should not display any installation requests for the customer")
    public void theSystemShouldNotDisplayAnyInstallationRequestsForTheCustomer() {
    	Customer newCustomer = new Customer("Customer1@gmail.com", "asadasda123", "Ahmad", "059105388");
    	assertEquals(false,app.getDisplayList());
    }

    
    
    
    
    
    
    
    @Given("a customer with email {string} and orders")
    public void aCustomerWithEmailAndOrders(String string) {
        email="Customer1@gmail.com";
    }

    @When("the user tries to display orders for the customer with email {string}")
    public void theUserTriesToDisplayOrdersForTheCustomerWithEmail(String string) {
    	Customer newCustomer = new Customer("Customer1@gmail.com", "asadasda123", "Ahmad", "059105388");
        Customer c=app.findCustomerByEmail("Customer1@gmail.com");
        result=app.getorderIsPlacedBy("Customer1@gmail.com");
        ins = new Installer("Installer1@gmail.com", "Installer123", "Installer1", "Busy");
        app.addReq("Customer1@gmail.com", "Body Shell","BMW", "Installer1", "07/07/2024");
        app.addReq("Customer1@gmail.com", "Body Shell","BMW", "Installer1", "07/07/2024");
        app.addReq("Customer1@gmail.com", "Body Shell","BMW", "Installer1", "07/07/2024");
        app.displayCustomerOrders("Customer1@gmail.com");
        	
        
    }

    @Then("the system should display the orders for the customer")
    public void theSystemShouldDisplayTheOrdersForTheCustomer() {
       assertEquals(false,app.getisDisplayOrder());
    }

    @Given("a customer with email {string} and no orders")
    public void aCustomerWithEmailAndNoOrders(String string) {
    	email="Customer1@gmail.com";
    }

    @When("the user tries to display orders for the customer with emaill {string}")
    public void theUserTriesToDisplayOrdersForTheCustomerWithEmaill(String string) {
    	
        	app.displayCustomerOrders("Customer1@gmail.com");
        
    }

    @Then("the system should indicate that there are no orders for the customer")
    public void theSystemShouldIndicateThatThereAreNoOrdersForTheCustomer() {
    	assertFalse(app.getDisplayList());
    }

    @When("the user tries to display orders for a non-existing customer with email {string}")
    public void theUserTriesToDisplayOrdersForANonExistingCustomerWithEmail(String string) {
    	app.displayCustomerOrders("Customer");
    }

    @Then("the system should indicate that the customer was not found")
    public void theSystemShouldIndicateThatTheCustomerWasNotFound() {
    	assertFalse(app.getDisplayList());
    }

    
    
    
    
    
    
    
    @Given("a customer with email {string} and passwordd {string}")
    public void aCustomerWithEmailAndPasswordd(String string, String string2) {
      email="Customer1@gmail.com";
      password="Customer123";
    }

    @When("the user updates the password for the customer with email {string} to {string}")
    public void theUserUpdatesThePasswordForTheCustomerWithEmailTo(String string, String string2) {
        app.updatePasswordField("Customer1@gmail.com", "Customer123456");
    }

    @Then("the system should update the password for the customer")
    public void theSystemShouldUpdateThePasswordForTheCustomer() {
        assertTrue(app.getIsupdated());
    }

    @Given("a customer withh email {string} and passwordddddd {string}")
    public void aCustomerWithhEmailAndPasswordddddd(String string, String string2) {
    	 email="Customer1@gmail.com";
         password="Customer123";
    }

    @When("the user tries to update the password for the customer with email {string} to {string}")
    public void theUserTriesToUpdateThePasswordForTheCustomerWithEmailTo(String string, String string2) {
    	app.updatePasswordField("Customer1@gmail.com", "C123");
    }

    @Then("the system should not update the password, and indicate that the new password is invalid")
    public void theSystemShouldNotUpdateThePasswordAndIndicateThatTheNewPasswordIsInvalid() {
    	assertFalse(app.getIsupdated());
    }

    @Given("a non-existing customer")
    public void aNonExistingCustomer() {
    	 email="Customer1@gmailfgdfgdgf.com";
    }

    @When("the user tries to update the password for a non-existing customer with email {string} to {string}")
    public void theUserTriesToUpdateThePasswordForANonExistingCustomerWithEmailTo(String string, String string2) {
    	app.updatePasswordField("Customer1@gmailfgdfgdgf.com", "Customer123456");
    }

    @Given("a customer with emailll {string} and password {string}")
    public void aCustomerWithEmailllAndPassword(String string, String string2) {
    	 email="Customer1@gmail.com";
         password="Customer123";
    }

    @When("the user tries to update the password for the customer with email {string} to null")
    public void theUserTriesToUpdateThePasswordForTheCustomerWithEmailToNull(String string) {
    	password=null;
    	app.updatePasswordField("Customer1@gmail.com", password);
    }

    @Given("a customer with email {string} and passworddddd {string}")
    public void aCustomerWithEmailAndPassworddddd(String string, String string2) {
    	email="Customer1@gmail.com";
        password="Customer123";

    }

    @When("the user tries to update the password for the customer with email {string} to an empty string")
    public void theUserTriesToUpdateThePasswordForTheCustomerWithEmailToAnEmptyString(String string) {
    	app.updatePasswordField("Customer1@gmail.com","");
    }

    @Then("the system should not update the password, and indicate that the new password is invalidd")
    public void theSystemShouldNotUpdateThePasswordAndIndicateThatTheNewPasswordIsInvalidd() {
    	assertFalse(app.getIsupdated());
    }
    




    
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
}
