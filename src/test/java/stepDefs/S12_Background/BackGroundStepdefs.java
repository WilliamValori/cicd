package stepDefs.S12_Background;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackGroundStepdefs {
    @And("My account is activated")
    public void myAccountIsActivated() {
    }

    @And("I am currently not logged into the site")
    public void iAmCurrentlyNotLoggedIntoTheSite() {
    }

    @When("I log into my personal account with faulty credentials")
    public void iLogIntoMyPersonalAccountWithFaultyCredentials() {
    }

    @Then("I should get an credentials not valid prompt")
    public void iShouldGetAnCredentialsNotValidPrompt() {
    }

    @When("I log into my personal account with expired credentials")
    public void iLogIntoMyPersonalAccountWithExpiredCredentials() {
    }

    @Then("I should be taken to a reset password page")
    public void iShouldBeTakenToAResetPasswordPage() {
    }
}
