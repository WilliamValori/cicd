package exercises;

import framework.Base;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SmokeTest extends Base {

    @Test
    void shouldOpenPage() {
        assertThat(homePage.getPageTitle())
                .isEqualTo("Valori Automation Practice Shop");
    }
}
