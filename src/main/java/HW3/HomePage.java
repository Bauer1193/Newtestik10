package HW3;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {

    private final SelenideElement login = $x ("//input[contains(@id,'username')]");

    public NextPage goToNextPage() {
        login.shouldBe(Condition.visible).click();
        return Selenide.page(NextPage.class);
    }
}

