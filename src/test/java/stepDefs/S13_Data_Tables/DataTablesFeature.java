package stepDefs.S13_Data_Tables;

import framework.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.Products;
import pages.ShoppingCart;

import java.util.List;
import java.util.Map;

public class DataTablesFeature extends Base {

    private WebDriver driver = getDriver();

    public DataTablesFeature() {
        homePage = new HomePage(driver);
    }

    @Given("I open the {string} page")
    public void iOpenThePage(String page) {
        HomePage homePage = new HomePage(driver);
        homePage.clickAllProducts();
    }

    @When("I add these products to my shopping cart:")
    public void iAddTheseProductsToMyShoppingCart(DataTable dataTable) {
        Products product = new Products(driver);
        for (String s : dataTable.asList()) {
            product.openProduct(s).addProductToCart().continueShopping().goBack();
        }
    }

    @When("I add this amount of products to my shopping cart:")
    public void iAddTheseProductsToMyShoppingCartWithAmounts(DataTable dataTable) {
        Products product = new Products(driver);
        for (Map<String, String> item : dataTable.entries()) {
            product.openProduct(String.valueOf(item.get("Product")))
                    .changeQuantity(Integer.parseInt(item.get("Amount")))
                    .addProductToCart()
                    .continueShopping()
                    .goBack();
        }
    }

    @Then("I have these products in my shopping cart:")
    public void iHaveTheseProductsInMyShoppingCart(List<String> shoppingItems) {
        ShoppingCart shoppingCart = new ShoppingCart(driver).open();

        Products product = new Products(driver);
        for (String s : shoppingItems) {
            product.openProduct(s).addProductToCart().continueShopping().goBack();
        }
    }

    @Then("I have {int} products in my shopping cart")
    public void iHaveProductsInMyShoppingCart(int productCount) {
        ShoppingCart shoppingCart = new ShoppingCart(driver);
        Assertions.assertThat(shoppingCart.getProductCount()).isEqualTo(productCount);
    }
}
