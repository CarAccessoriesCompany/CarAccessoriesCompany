package CarAccessoriesCompany_Test;

import static org.junit.Assert.assertTrue;

import CarAccessoriesCompany_Main.MyCarApplication;
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
	    assertTrue(app.isInproductPage);
	}

	@When("cutomer enters {string} then enter {string}")
	public void cutomerEntersThenEnter(String string, String string2) {
	    app.Review("Body Shell", "Good Product");
	}

	@Then("cutomer should enter review for the product {string}")
	public void cutomerShouldEnterReviewForTheProduct(String string) {
		assertTrue(app.isReviewed);
	}
	//h

	@When("cutomer enters {string} then enter {string} to rating the product")
	public void cutomerEntersThenEnterToRatingTheProduct(String string, String string2) {
	    app.Rated("Body Shell", 4);
	}
	
	@Then("cutomer should enter rating for the product {string}")
	public void cutomerShouldEnterRatingForTheProduct(String string) {
		assertTrue(app.isRated);
	}
	
	@When("cutomer enters {string}")
	public void cutomerEnters(String string) {
	   app.DispalyReview("Body Shell");
	}

	@Then("cutomer should see the review for the product")
	public void cutomerShouldSeeTheReviewForTheProduct() {
	   assertTrue(app.DisplayReview);
	}
	
	@When("cutomer enters {string} to display rating")
	public void cutomerEntersToDisplayRating(String string) {
		app.DispalyRate("Body Shell");
	}

	@Then("cutomer should see the rating for the product")
	public void cutomerShouldSeeTheRatingForTheProduct() {
		assertTrue(app.DisplayRate);
	    
	}

}
