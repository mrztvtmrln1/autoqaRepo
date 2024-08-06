import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTest {
    //открыть гугл и проверить есть ли там ютуб
    @Test
    void successfulSearchTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("YouTube").pressEnter();
        $("[id=search]").shouldHave(text("https://m.youtube.com"));
    }
    //чекаем работает ли push and commit в мою ветку
    @Test
    void shouldOpen() {
        String date = "01.08.2024";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
    }

}
