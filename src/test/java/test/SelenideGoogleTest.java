package test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;


public class SelenideGoogleTest {

    @Test
    void justFindSelenideInGoogle() {
        open("https://www.google.com/");
        $(byName("q")).setValue("Selenide").pressEnter();
        // asssert
        $("#search").shouldHave(text("selenide.org"));
    }
}
