package HW3;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.lang.module.Configuration;

public class WebHooks {

    @BeforeEach
    public void initBrowser() {

        Selenide.open("https://edujira.ifellow.ru/secure/Dashboard.jspa");
    }

    @AfterEach
    public void afterTest() {Selenide.closeWebDriver();}
}
