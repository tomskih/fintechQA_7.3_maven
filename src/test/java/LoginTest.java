import com.codeborne.selenide.Configuration;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class LoginTest {
    LoginPage loginPage = new LoginPage();

    @BeforeClass
    public static void setUp() {
        Configuration.baseUrl = "https://www.instagram.com";
        LoginPage loginPage = new LoginPage();
        loginPage.open();
    }

//    @Test
//    public void checkAvailElementsOnPage() { //проверка наличия всех необходимых элементов на странице
//        Assert.assertNotNull(loginPage.imgLogin);
//        Assert.assertNotNull(loginPage.loginInput);
//        Assert.assertNotNull(loginPage.passInput);
//        Assert.assertNotNull(loginPage.loginButton);
//    }


    @Test
    public void submitLoginFormWithIncorrectLoginPass() { // Авторизация по логину-паролю с некорректными данными
        loginPage.setLogin("51563");
        loginPage.setPassword("bveregfdgrrgw");
        loginPage.clickLoginButton();
        Assert.assertNotNull(loginPage.errorAlert);
    }

    @Test
    public void submitLoginFormWithCorrectLoginPass() { // Авторизация по логину-паролю с корректными данными
        loginPage.setLogin("change_me");
        loginPage.setPassword("change_me");
        loginPage.clickLoginButton();
      //  Assert.assertNull(loginPage.errorAlert);
        Assert.assertEquals("https://www.instagram.com/", getWebDriver().getCurrentUrl());
    }


}
