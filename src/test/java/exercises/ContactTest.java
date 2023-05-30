package exercises;

import framework.Base;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContactTest extends Base {

    /**
     * Opdracht 4: Het contactformulier werkt niet
     */
    @Test
    void contactFormShouldSendMessages() {
        homePage.clickContactLink();

        contactPage.selectCustomerServiceFromSelectBox();
        contactPage.enterEmailAddress("dantester@jourrapide.com");
        contactPage.enterMessage("Hi! I'd like some help with my test automation!");
        contactPage.clickSubmitButton();

        assertThat(contactPage.getAlertMessageText())
                .as("The message that is displayed after submitting is not a success message.")
                .contains("successfully");
    }
}
