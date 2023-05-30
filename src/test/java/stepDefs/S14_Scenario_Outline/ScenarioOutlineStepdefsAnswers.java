package stepDefs.S14_Scenario_Outline;

import framework.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SearchPage;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ScenarioOutlineStepdefsAnswers extends Base {
//    private WebDriver driver = getDriver();
//    SearchPage searchPage;
//
//    @When("I search a product called {string}")
//    public void iSearchAProductCalled(String productName) {
//        HomePage homePage = new HomePage(driver);
//        homePage.enterSearchTerm(productName);
//        homePage.clickSearchButton();
//    }
//
//    @Then("at least one {string} should appear in the results")
//    public void atLeastOneShouldAppearInTheResults(String productName) {
//        searchPage = new SearchPage(driver);
//        List<String> productNames = searchPage.getProductNames();
//
//        for (String nameOfProduct : productNames) {
//            assertThat(nameOfProduct)
//                    .as("One or more product names did not contain the word " + productName)
//                    .containsIgnoringCase(productName);
//        }
//    }
}
