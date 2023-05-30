package stepDefs.S07_Parameter_Types;

import framework.Base;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.time.LocalDate;

public class parameterTypesFeature extends Base {

    @Given("my destination for today is {}")
    public void myDestinationForTodayIs(Destination destination) {
        System.err.println("I'm driving to "+destination);
    }

    @And("my means of transportation is {transport}")
    public void myMeansOfTransportationIs(String transport) {
    }

    enum Destination {
        BAKERY,
        OFFICE,
        SCHOOL,
        SUPERMARKET,
        FAMILY
    }

    @ParameterType("BIKE|CAR|PUBLIC_TRANSPORT")
    public String transport(String transportName) {
        switch (transportName){
            case "BIKE":
                System.out.println("Tring tring");
                break;
            case "CAR":
                System.out.println("Toet toet");
                break;
            case "PUBLIC_TRANSPORT":
                System.out.println("Choo choo");
                break;
        }
        return transportName;
    }

    @ParameterType("([0-9]{2})-([0-9]{2})-([0-9]{4})")
    public LocalDate date(String day, String month, String year) {
        return LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
    }

    @Given("today is {date}")
    public void today_is(LocalDate date) {
        System.err.println("That would make today: " +date.getDayOfWeek());
    }
}
