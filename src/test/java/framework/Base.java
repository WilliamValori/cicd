package framework;

import org.openqa.selenium.WebDriver;
import pages.*;

import static stepDefs.SetupAndTearDown.getFinalDriver;
import static stepDefs.SetupAndTearDown.setupClass;

public class Base {

    private WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected MyAccountPage myAccountPage;
    protected ContactPage contactPage;
    protected RegistrationPage registrationPage;
    protected SearchPage searchPage;

    public WebDriver getDriver() {
        if (getFinalDriver() != null) {
            return getFinalDriver();
        }
        else{
            setupClass();
            return getFinalDriver();
        }
    }
}
