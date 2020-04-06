import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    public By navBar = By.tagName("nav");
    public By contentBox = By.tagName("main");
    public By modalEnableNotifications = By.xpath("//div[@role='dialog']");
    public By modalButtonNotEnableNotify = By.className("HoLwm");
    //public By searchInput = By.xpath("//div[@role='dialog']")

    public MainPage open() {
        Selenide.open("/");
        return this;
    }


    public static class Article {
        public ElementsCollection articles = $$(By.tagName("article"));
        public SelenideElement article = articles.last();
        public SelenideElement articleHeader = article.$(By.tagName("header"));
        public SelenideElement articleHeaderIcon = article.find(By.xpath("//header/div/span/img"));
        public SelenideElement articleHeaderLink = articleHeader.find(By.tagName("a"));
        public String articleHeaderLinkText = articleHeaderLink.text();

        public SelenideElement getLastViewableArticle() {
            return articles.get(articles.size()-1);
        }

    }


    public void clickButton(By button){
        $(button).click();
    }

}
