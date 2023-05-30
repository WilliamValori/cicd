package stepDefs.S11_Overloading;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OverloadingFeature {

    @Given("You are happy and you know it")
    @And("I'm happy and I know it")
    @When("I really want to show it")
    @Then("we're happy and we know it")
    public void everybodyIsHappy() {
        System.err.println("Clap your hands");
    }

    @Given("you clap your hands {int} time(s)")
    @And("I clap {int} hands {int} time(s)")
    @When("{string} more people with all {int} hand(s) clap {int} time(s)")
    public void morePeopleWithAllHandsClapTimes() {
    }
}
