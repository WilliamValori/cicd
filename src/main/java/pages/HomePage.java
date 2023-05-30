package pages;

import helpers.WaitAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends Page {

    // Elements:
    private final By loginLink = By.cssSelector(".user-info a");
    private final By contactLink = By.cssSelector("#contact-link");
    private final By logoutLink = By.cssSelector(".logout");
    private final By myAccountLink = By.cssSelector(".account");
    private final By searchBox = By.cssSelector("#search_widget input[name='s']");
    private final By searchButton = By.cssSelector("#search_widget button");
    private final By subscribeNewsLetterField = By.cssSelector("input[aria-labelledby='block-newsletter-label']");
    private final By subscribeNewsLetterButton = By.cssSelector("input[value='Subscribe']");
    private final By NewsLetterSubscriptionAlert = By.cssSelector("p.alert.block_newsletter_alert");
    private final By allProducts = By.xpath(".//a[starts-with(@class, 'all-product-link')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Actions:
    public void clickLoginLink() {
        driver.findElement(loginLink).click();
    }

    public void clickContactLink() {
        driver.findElement(contactLink).click();
    }

    public boolean logoutLinkIsDisplayed() {
        return driver.findElement(logoutLink).isDisplayed();
    }

    public String getLoggedInName() {
        return driver.findElement(myAccountLink).getText();
    }

    public void enterSearchTerm(String searchTerm) {
        driver.findElement(searchBox).sendKeys(searchTerm);
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    public void clickAllProducts() {
        WaitAction.waitForElement(driver, allProducts).click();
//        return new Products(driver);
    }
}
