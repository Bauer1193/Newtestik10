package HW3;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class NextPage {

    private final SelenideElement lenta = $x("//h3[contains(@id,'10003')]");
    private final SelenideElement testproject = $x ("//a[contains(@id,'admin_main_proj_link_lnk')]");
    private final SelenideElement project = $x("//a[contains(@rel,'195341')]");

    public NextPage CheckThisPage () {
        lenta.shouldBe(Condition.visible);
        $(byText("Проекты")).click();
        testproject.click();
        project.click();
        return this;
    }
}
