package stepDefs.S05_POM;

import framework.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginTestStepdefsAnswers extends Base {

//    private WebDriver driver = getDriver();
//    HomePage homePage;
//    LoginPage loginPage;
//    MyAccountPage myAccountPage;
//
//    public LoginTestStepdefsAnswers() {
//        homePage = new HomePage(driver);
//        loginPage = new LoginPage(driver);
//    }
//
//    @Given("I am on the homepage")
//    public void iAmOnTheHomepage() {
//        driver.manage().window().maximize();
//        driver.get("https://webshop.mobiletestautomation.nl");
//        assertThat(homePage.getPageTitle())
//                .isEqualTo("Valori Automation Practice Shop");
//    }
//
//    @When("I log into my personal account")
//    public void iLogIntoMyPersonalAccount() {
//        homePage.clickLoginLink();
//        loginPage.enterEmailAddress("dantester@jourrapide.com");
//        loginPage.enterPassword("1qazxsw2");
//        loginPage.clickSignIn();
//    }
//
//    @Then("I should be taken to my profile page")
//    public void iShouldBeTakenToMyProfilePage() {
//        myAccountPage = new MyAccountPage(driver);
//        assertThat(myAccountPage.getPageHeadingText())
//                .as("After clicking 'sign in', the page title doesn't indicate the 'my account page'")
//                .isEqualTo("Your account");
//        driver.quit();
//    }
}

