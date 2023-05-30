package stepDefs.S05_POM;

import framework.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import stepDefs.SetupAndTearDown;

import static org.assertj.core.api.Assertions.assertThat;

public class SubscribeNewsletterTestStepdefs extends Base {
    private WebDriver driver = getDriver();
    HomePage homePage;

    public SubscribeNewsletterTestStepdefs(SetupAndTearDown driverManager){
        homePage = new HomePage(driver);
    }

    @When("I subscribe to the news letter with a valid email address")
    public void iSubscribeToTheNewsLetterWithAValidEmailAddress() {
    }

    @Then("I should be shown a successfully subscribed confirmation")
    public void iShouldBeShownASuccessfullySubscribedConfirmation() {
    }
}
