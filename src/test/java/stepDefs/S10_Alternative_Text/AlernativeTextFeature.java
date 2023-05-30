package stepDefs.S10_Alternative_Text;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlernativeTextFeature {


    @When("I go to the homepage/frontpage/entrypage")
    public void iGoToTheHomepage() {
        System.err.println("Welcome to the homepage");
    }

    @Then("^the sale (carrousel|slideshow) is displayed$")
    public void theSaleCarrouselIsDisplayed(String advertisementType) {
        System.err.println("The chosen advertisement type is " +advertisementType);
    }
}
