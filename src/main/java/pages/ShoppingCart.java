package pages;

import helpers.WaitAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart extends Page {

    public ShoppingCart(WebDriver driver) {
        super(driver);
    }

    public ShoppingCart open() {
        WaitAction.waitForElement(driver, By.xpath(".//div[@id='_desktop_cart']")).click();
        return new ShoppingCart(driver);
    }

    public int getProductCount() {
        String s = WaitAction.waitForElement(driver, By.xpath(".//span[@class='cart-products-count']")).getText();
        return Integer.parseInt(s.substring(1, s.length()-1));
    }
}
