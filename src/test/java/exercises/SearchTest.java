package exercises;

import framework.Base;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SearchTest extends Base {

    /**
     * Opdracht 7: De zoekfunctie raakt vervuild
     */
    @Test
    void shouldListOnlyProperProducts() {
        homePage.enterSearchTerm("mug");
        homePage.clickSearchButton();

        List<String> productNames = searchPage.getProductNames();

        for (String productName : productNames) {
            System.out.println(productName);
        }

        for (String productName : productNames) {
            assertThat(productName)
                    .as("One or more product names did not contain the word 'mug")
                    .containsIgnoringCase("mug");
        }
    }
}
