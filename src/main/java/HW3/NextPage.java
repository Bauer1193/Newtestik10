package HW3;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class NextPage {

    private final SelenideElement lenta = $x("//h3[contains(@id,'10003')]");

    public NextPage CheckNextPage () {
        lenta.shouldBe(Condition.visible);
        return this;
    }
}
