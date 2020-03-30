import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
    private WebDriver driver;
    private By imgLogin = By.className("V64Sp");
    public String login;
    public String pass;

    public By loginInput = By.name("username");
    public By passInput = By.name("password");
    private By loginButton = By.xpath("//button[@type='submit']");

    public LoginPage open() {
        Selenide.open("/");
        return this;
    }

    public void setLogin(String login){
        driver.findElement(loginInput).sendKeys(login);
    }

    public void setPassword(String pass){
        driver.findElement(passInput).sendKeys(pass);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();

    }
}