import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public By loginInput = By.name("username");
    public By passInput = By.name("password");
    public By loginButton = By.xpath("//button[@type='submit']");
    public By errorAlert = By.id("slfErrorAlert");

    public LoginPage open() {
        Selenide.open("/");
        return this;
    }

    public void setLogin(String login){

        $(loginInput).setValue(login);
    }

    public void setPassword(String pass){
        $(passInput).setValue(pass);
    }

    public void clickLoginButton(){
        $(loginButton).click();
    }

    public void loginWithLoginPass(LoginPage loginPage) {
        loginPage.setLogin("+79501960484");
        loginPage.setPassword("sK14Sat06dTVV0rK");
        loginPage.clickLoginButton();
    }

}