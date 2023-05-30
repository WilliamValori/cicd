package stepDefs.S00_Smoke;

import framework.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SmokeFeature extends Base {

    private WebDriver driver = getDriver();

    @Given("I go to the webshop")
    public void iGoToTheWebshop() {
        driver.get("https://webshop.mobiletestautomation.nl/");
    }

    @When("I go to the fruit page")
    public void iGoToTheFruitPage() {
        driver.findElement(By.xpath(".//a[(@class='dropdown-item') and (contains(text(), 'Fruit'))]")).click();
    }

    @Then("there is a banana for scale")
    public void thereIsABananaForScale() {
        Assertions.assertThat(driver.findElement(By.xpath(".//a[contains(text(), 'Banana')]")).getText()).isEqualTo("Banana");
    }
}
