package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends Page {

    // Elements:
    private final By femaleTitleRadioButton = By.cssSelector("[name='id_gender'][value='2']");
    private final By firstNameField = By.name("firstname");
    private final By lastNameField = By.name("lastname");
    private final By emailField = By.cssSelector(".register-form [name='email']");
    private final By passwordField = By.name("password");
    private final By birthDateField = By.name("birthday");
    private final By partnerOfferCheckBox = By.name("optin");
    private final By newsletterCheckBox = By.name("newsletter");
    private final By saveButton = By.cssSelector("[data-link-action='save-customer']");

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    // Actions:
    public void clickFemaleTitle() {
        driver.findElement(femaleTitleRadioButton).click();
    }

    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void enterBirthDate(String birthDate) {
        driver.findElement(birthDateField).sendKeys(birthDate);
    }

    public void clickReceivePartnerOffers() {
        driver.findElement(partnerOfferCheckBox).click();
    }

    public void clickNewsLetter() {
        driver.findElement(newsletterCheckBox).click();
    }

    public void clickSaveButton() {
        driver.findElement(saveButton).click();
    }

}
