package stepDefs.S05_POM;

import framework.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import stepDefs.SetupAndTearDown;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginTestStepdefs extends Base {

    private WebDriver driver = getDriver();
    HomePage homePage;
    LoginPage loginPage;

    public LoginTestStepdefs() {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
    }

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
                driver.manage().window().maximize();
        driver.get("https://webshop.mobiletestautomation.nl");
        assertThat(homePage.getPageTitle())
                .isEqualTo("Valori Automation Practice Shop");
    }

    @When("I log into my personal account")
    public void iLogIntoMyPersonalAccount() {
    }

    @Then("I should be taken to my profile page")
    public void iShouldBeTakenToMyProfilePage() {
    }
}
