package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactPage extends Page {

    // Elements:
    private final By subjectSelectBox = By.name("id_contact");
    private final By emailField = By.name("from");
    private final By messageField = By.name("message");
    private final By submitButton = By.name("submitMessage");
    private final By alertMessage = By.className("alert");

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    // Actions:
    public void selectCustomerServiceFromSelectBox() {
        Select subjectSelector = new Select(driver.findElement(subjectSelectBox));
        subjectSelector.selectByVisibleText("Customer service");
    }

    public void enterEmailAddress(String emailAddress) {
        driver.findElement(emailField).sendKeys(emailAddress);
    }

    public void enterMessage(String message) {
        driver.findElement(messageField).sendKeys(message);
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }

    public String getAlertMessageText() {
        return driver.findElement(alertMessage).getText();
    }
}
