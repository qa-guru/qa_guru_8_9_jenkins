package tests.demoqa;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void setup() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

    }
}
