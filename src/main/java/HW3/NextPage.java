package HW3;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.ScrollTo;
import com.codeborne.selenide.conditions.Text;
import org.openqa.selenium.devtools.v137.css.model.SelectorList;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class NextPage {

    private final SelenideElement lenta = $x ("//h3[contains(@id,'10003')]");
    private final SelenideElement testproject = $x ("//a[contains(@id,'admin_main_proj_link_lnk')]");
    private final SelenideElement project = $x ("//a[contains(@rel,'195341')]");
    private final SelenideElement create = $x ("//a[contains(@title,'Создать')]");
    private final SelenideElement newcreate = $x ("//h2[contains(@title,'задачи')]");
    private final SelenideElement newtaskselector = $x ("//div[contains(@id,'issuetype-single-select')]");


    public NextPage CheckThisPage () {
        lenta.shouldBe(Condition.visible);
        $(byText("Проекты")).click();
        testproject.click();
        project.shouldBe(Condition.visible);
        create.shouldBe(Condition.visible, Duration.ofSeconds(60)).click();
        newcreate.shouldBe(Condition.visible, Duration.ofSeconds(60));
        newtaskselector.click();
        return this;
    }
}
