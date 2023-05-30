package exercises;

import framework.Base;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class RegistrationTest extends Base {

    /**
     * Opdracht 6: Goedpad voor het registratieproces
     */
    @Test
    void shouldCompleteRegistrationForm() {
        homePage.clickLoginLink();

        loginPage.clickCreateAccount();

        registrationPage.clickFemaleTitle();
        registrationPage.enterFirstName("Donna");
        registrationPage.enterLastName("Tester");
//        registrationPage.enterEmail("donnatester@jourrapide.com"); // FAILS AFTER THE FIRST TIME!
        registrationPage.enterEmail("donna" + UUID.randomUUID().toString().substring(0, 7) + "@jourrapide.com"); // ALWAYS WORKS!
        registrationPage.enterPassword("1qazxsw2");
        registrationPage.enterBirthDate("01/01/1970");
        registrationPage.clickReceivePartnerOffers();
        registrationPage.clickNewsLetter();
        registrationPage.clickSaveButton();

        assertThat(homePage.logoutLinkIsDisplayed())
                .as("Logout link was not displayed after registering.")
                .isTrue();

        assertThat(homePage.getLoggedInName())
                .as("Logged in name is not correct!")
                .isEqualTo("Donna Tester");
    }
}
