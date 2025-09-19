package HW3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

    public class HW3Test extends WebHooks {
        private final HomePage HomePage = new HomePage();
        private final NextPage NextPage = new NextPage();

        @Test
        @DisplayName("Авторизация на сайте")
        public void Autorisations() {
            HomePage
                    .goToNextPage()
                    .CheckNextPage();
        }
    }
