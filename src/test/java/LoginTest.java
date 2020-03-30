import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest {
    @Test
    public void openPage(){
        open("https://www.instagram.com/");
    }
}
