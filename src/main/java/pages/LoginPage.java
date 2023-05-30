package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends Page {

    // Elements:
    private final By emailField = By.name("email");
    private final By passwordField = By.name("password");
    private final By submitButton = By.cssSelector("#submit-login");
    private final By alertBox = By.cssSelector(".alert");
    private final By createAccountLink = By.cssSelector(".no-account a");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Actions:
    public void enterEmailAddress(String emailAddress) {
        driver.findElement(emailField).sendKeys(emailAddress);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignIn() {
        driver.findElement(submitButton).click();
    }

    public String getErrorMessageText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(alertBox)).getText();
    }

    public void clickCreateAccount() {
        driver.findElement(createAccountLink).click();
    }
}
