package stepDefs.S09_Optional_Text;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OptionalTextFeature {

    @When("I purchase {int} mug(s)")
    public void iPurchaseMugs(int amount) {
        System.err.println("I really want " +amount +"mug(s)");
    }

    @Then("the receipt will show I have purchased {int} mug(s)")
    public void iWillHaveXMugsInMyBasket(int amount) {
        System.err.println("If only the receipt will show that I purchased " +amount +"mug(s)");
    }

}
