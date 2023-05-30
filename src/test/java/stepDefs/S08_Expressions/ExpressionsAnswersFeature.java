package stepDefs.S08_Expressions;

import framework.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class ExpressionsAnswersFeature extends Base {


    @Given("^I live in (Utrecht|Amsterdam|Hilversum)$")
    public void iLiveInUtrecht(String woonplaats) {
    }

    @Then("^my zipcode is ([0-9]{4}[A-Z]{2})$")
    public void myZipcodeIsAB(Object zipNumbers) {
        System.err.printf("My zipcode is %d%s", zipNumbers);
    }


    @Then("the temperature is {float}°C")
    public void theTemperatureIsC(float temp) {
        System.err.println("The current temperature is "+temp);
    }

    @Given("I look at the thermostat")
    public void iLookAtTheThermostat() {
        System.err.println("Should that thermostat be so high?");
    }
}
