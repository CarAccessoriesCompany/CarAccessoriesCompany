package CarAccessoriesCompany_Test;

import static org.junit.Assert.assertTrue;

import CarAccessoriesCompany_Main.MyCarApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductCatalog {
		
	MyCarApplication app;
	
	public ProductCatalog(MyCarApplication obj) {
		super();
		this.app = obj;
	}
	
	
	@Given("I am in the main menu")
	public void iAmInTheMainMenu() {
	 assertTrue(app.inMenu);
	}

	@When("I enter the command {string}")
	public void iEnterTheCommand(String string) {
	   app.Category("Category");
	}

	@Then("I should be prompted to enter the category name")
	public void iShouldBePromptedToEnterTheCategoryName() {
	    assertTrue(app.validCommand);
	}

	@When("I enter command {string}")
	public void iEnterCommand(String string) {
	   app.CategoryName("Exterior");
	}

	@Then("I should see a list of products with details \\(product name,description, price, availability)")
	public void iShouldSeeAListOfProductsWithDetailsProductNameDescriptionPriceAvailability() {
	   assertTrue(app.validCategory);
	}
	@Then("I should be prompted to enter the product name")
	public void iShouldBePromptedToEnterTheProductName() {
	    app.ProductName("Exterior", "Body Shell");
	}

	@Then("I should see a list of products containing the keyword")
	public void iShouldSeeAListOfProductsContainingTheKeyword() {
		assertTrue(app.validProduct);
	}
}
