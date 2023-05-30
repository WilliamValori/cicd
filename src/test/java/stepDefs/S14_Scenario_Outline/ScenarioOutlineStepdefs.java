package stepDefs.S14_Scenario_Outline;

import framework.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SearchPage;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ScenarioOutlineStepdefs extends Base {
    private WebDriver driver = getDriver();
    SearchPage searchPage;

    @When("I search a product called {string}")
    public void iSearchAProductCalled(String productName) {
        if(productName.equals("Mug")){
            // do action 1
        }
        else if(productName.equals("T-shirt")){
            // do action 2
        }
        else if(productName.equals("Orange")){
            //do action 3
        }
        else{
            //do action 4
        }
    }

    @When("I search a product called Mug")
    public void iSearchAProductCalledMug() {
        // do action 1
    }

    @When("I search a product called T-shirt")
    public void iSearchAProductCalledTShirt() {
        // do action 2
    }

    @When("I search a product called Orange")
    public void iSearchAProductCalledOrange() {
        // do action 3
    }


    @Then("at least one {string} should appear in the results")
    public void atLeastOneShouldAppearInTheResults(String productName) {
                searchPage = new SearchPage(driver);
        List<String> productNames = searchPage.getProductNames();

        for (String nameOfProduct : productNames) {
            assertThat(nameOfProduct)
                    .as("One or more product names did not contain the word " + productName)
                    .containsIgnoringCase(productName);
        }
    }
}
