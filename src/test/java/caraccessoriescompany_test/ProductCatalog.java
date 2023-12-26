package caraccessoriescompany_test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import caraccessoriescompany_main.MyCarApplication;
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
     assertTrue(app.getInMenu());
    }

    @When("I enter the command {string}")
    public void iEnterTheCommand(String string) {
       app.category("Category");
    }

    @Then("I should be prompted to enter the category name")
    public void iShouldBePromptedToEnterTheCategoryName() {
        assertFalse(app.getValidCommand());
    }

    @When("I enter command {string}")
    public void iEnterCommand(String string) {
       app.categoryName("Exterior");
       app.categoryName("Interior");
       app.categoryName("Electronic");
    }

    @Then("I should see a list of products with details \\(product name,description, price, availability)")
    public void iShouldSeeAListOfProductsWithDetailsProductNameDescriptionPriceAvailability() {
    	assertTrue(app.getValidcategory());
    }
    

    @Then("I should be prompted to enter the product name")
    public void iShouldBePromptedToEnterTheProductName() {
        app.productName("Exterior", "Body Shell");
    }

    @Then("I should see a list of products containing the keyword")
    public void iShouldSeeAListOfProductsContainingTheKeyword() {
        assertTrue(app.getValidProduct());
    }
}