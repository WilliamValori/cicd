package exercises;

import framework.Base;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LoginTest extends Base {

    /**
     * Opdracht 1: Een nieuw testframework
     */
    @Test
    void loginPageShouldOpen() {
        homePage.clickLoginLink();
    }

    /**
     * Opdracht 2: Geautomatiseerd inloggen
     */
    @Test
    void loginFormShouldAcceptCredentials() {
        homePage.clickLoginLink();

        loginPage.enterEmailAddress("dantester@jourrapide.com");
        loginPage.enterPassword("1qazxsw2");
        loginPage.clickSignIn();
    }

    /**
     * Opdracht 3: Resultaat verifieren van de inlogtest
     */
    @Test
    void loginFormShouldAcceptCredentialsWithAssertion() {
        homePage.clickLoginLink();

        loginPage.enterEmailAddress("dantester@jourrapide.com");
        loginPage.enterPassword("1qazxsw2");
        loginPage.clickSignIn();

        assertThat(myAccountPage.getPageHeadingText())
                .as("After clicking 'sign in', the page title doesn't indicate the 'my account page'")
                .isEqualTo("Your account");
    }

    /**
     * Opdracht 5: Foutpad voor inloggen
     */
    @Test
    void loginFormShouldNotAcceptWrongCredentials() {
        homePage.clickLoginLink();

        loginPage.enterEmailAddress("dantester@jourrapide.com");
        loginPage.enterPassword("zaq12wsx");
        loginPage.clickSignIn();

        assertThat(loginPage.getErrorMessageText())
                .as("After signing in with wrong credentials, the correct error message is not shown")
                .isEqualTo("Authentication failed.");
    }

}
