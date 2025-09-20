package HW3;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {

    private final SelenideElement login = $x ("//input[contains(@id,'username')]");
    private final SelenideElement password = $x("//input[contains(@id, 'password')]");
    private final SelenideElement button = $x("//input[contains(@value, 'Войти')]");

    public NextPage goToNextPage() {
        login.append("AT14");
        password.append("Qwerty123");
        button.click();
        return Selenide.page(NextPage.class);
    }
}

