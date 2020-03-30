import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;


public class LoginTest {
    @BeforeClass
    public static void setup() {
        Configuration.baseUrl = "https://www.instagram.com";
    }

    @Test
    public void submitLoginForm() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.open();
        loginPage.setLogin("123456789");

        loginPage.wait(10000);
        loginPage.setPassword("58865");

    }
 /*   public void userCanSearch() {
        open("https://google.com/ncr");
        new LoginPage().searchFor("selenide");

        SearchResultsPage results = new SearchResultsPage();
        results.getResults().shouldHave(sizeGreaterThan(1));
        results.getResult(0).shouldHave(text("Selenide: concise UI tests in Java"));
    }

  */
}
