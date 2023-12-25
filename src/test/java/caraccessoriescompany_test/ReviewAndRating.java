package caraccessoriescompany_test;

import static org.junit.Assert.assertTrue;

import caraccessoriescompany_main.MyCarApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReviewAndRating {

    MyCarApplication app;


    public ReviewAndRating(MyCarApplication obj) {
        super();
        this.app = obj;
    }

    @Given("customer in products page")
    public void customerInProductsPage() {
        assertTrue(app.getInproductPage());
    }

    @When("cutomer enters {string} then enter {string}")
    public void cutomerEntersThenEnter(String string, String string2) {
        app.review("Body Shell", "Good Product");
    }

    @Then("cutomer should enter review for the product {string}")
    public void cutomerShouldEnterReviewForTheProduct(String string) {
        assertTrue(app.getIsreviewed());
    }
    //h

    @When("cutomer enters {string} then enter {string} to rating the product")
    public void cutomerEntersThenEnterToRatingTheProduct(String string, String string2) {
        app.rated("Body Shell", 4);
    }

    @Then("cutomer should enter rating for the product {string}")
    public void cutomerShouldEnterRatingForTheProduct(String string) {
        assertTrue(app.getIsrated());
    }

    @When("cutomer enters {string}")
    public void cutomerEnters(String string) {
       app.dispalyreview("Body Shell");
    }

    @Then("cutomer should see the review for the product")
    public void cutomerShouldSeeTheReviewForTheProduct() {
       assertTrue(app.getDisplayreview());
    }

    @When("cutomer enters {string} to display rating")
    public void cutomerEntersToDisplayRating(String string) {
        app.dispalyRate("Body Shell");
    }

    @Then("cutomer should see the rating for the product")
    public void cutomerShouldSeeTheRatingForTheProduct() {
        assertTrue(app.getDisplayRate());

    }

}