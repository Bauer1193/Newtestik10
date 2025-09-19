package HW3;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class NextPage {

    private final SelenideElement password = $x("//input[contains(@id, 'password')]");

    public NextPage CheckNextPage () {
        password.shouldBe(Condition.visible);
        return this;
    }
}
