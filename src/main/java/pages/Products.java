package pages;

import helpers.WaitAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products extends Page {


    public Products(WebDriver driver) {
        super(driver);
    }

    public Products openProduct(String productName) {
        WaitAction.waitForElement(driver, By.xpath(".//a[text()='" + productName + "']")).click();
        return new Products(driver);
    }

    public Products changeQuantity(int quantity) {
        WaitAction.waitForElement(driver, By.xpath(".//input[@name='qty']")).clear();
        WaitAction.waitForElement(driver, By.xpath(".//input[@name='qty']")).sendKeys(String.valueOf(quantity));
        return new Products(driver);
    }

    public Products addProductToCart() {
        WaitAction.waitForElement(driver, By.xpath(".//button[@data-button-action='add-to-cart']")).click();
        return new Products(driver);
    }

    public Products goBack() {
        driver.navigate().back();
        return new Products(driver);
    }

    public Products continueShopping() {
        WaitAction.waitForElement(driver, By.xpath(".//button[text()='Continue shopping']")).click();
        return new Products(driver);
    }

    public ShoppingCart proceedToCheckout() {
        WaitAction.waitForElement(driver, By.xpath(".//a[text()='Proceed to checkout']")).click();
        return new ShoppingCart(driver);
    }
}

