package stepDefs.S03_Runners;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RunnerStepdefs {
    @Given("the user is on the homepage")
    public void theUserIsOnTheHomepage() {
        System.out.println("Im here!");
    }

    @When("the user logs into his personal account")
    public void theUserLogsIntoHisPersonalAccount() {
        System.out.println("Logging in...");
    }

    @Then("the user should be taken to his profile page as a logged in user")
    public void theUserShouldBeTakenToHisProfilePageAsALoggedInUser() {
        System.out.println("Seeing my personal page, excellent!");
    }
}
