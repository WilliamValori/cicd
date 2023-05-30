package stepDefs.S08_Expressions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


public class ExpressionsFeature {

    @Given("I look at the clock")
    public void iLookAtTheClock() {
        System.err.println("Wow, nice clock you have there");
    }

    @And("the CE clock will show {int}:{int} PM/AM")
    public void theClockWillShowCE(int timeHours, int timeMinutes) {
        System.err.printf("And the not validated time is %d:%d AM/PM", timeHours, timeMinutes);
    }

    @And("^the RE clock will show (1[0-2]:[0-5][0-9] ?[AaPp][Mm])$")
    public void theClockWillShow(Object time) {
        System.err.println("And the valid time is " +time);
    }

    @Given("^I login as user (Piet|Klaas|Kees|Henk)$")
    public void iLoginAsUserX(String user) {
        System.err.println("I'm loggin in as user " + user);
    }

    @And("^I set my country code to ([A-Z][A-Z])$")
    public void iSetMyCountryCodeTo(String twoLetterCountryCode) {
        System.err.println("This user is from " + twoLetterCountryCode);
    }

    @And("^I change my cellphone number to (06[0-9]{8})$")
    public void iChangeMyCellphoneNumber(String phoneNr) {
        System.err.println("And the valid phone number is " +phoneNr);
    }

}
