package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page {

    // Elements:
    private final By pageHeading = By.cssSelector(".page-header");

    protected final WebDriver driver;
    protected final WebDriverWait wait;

    Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Actions:
    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getPageHeadingText() {
        return driver.findElement(pageHeading).getText();
    }
}
