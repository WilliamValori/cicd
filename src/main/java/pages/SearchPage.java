package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends Page {

    // Elements:
    private final By productNameTextBox = By.cssSelector(".product-title a");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    // Actions:
    public List<String> getProductNames() {
        List<WebElement> productNameTextBoxes = driver.findElements(this.productNameTextBox);
        List<String> productNames = new ArrayList<>();

        for (WebElement textBox : productNameTextBoxes) {
            productNames.add(textBox.getText());
        }

        return productNames;
    }
}
