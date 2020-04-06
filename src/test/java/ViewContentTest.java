import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static com.codeborne.selenide.Configuration.baseUrl;

public class ViewContentTest {
    MainPage mainPage = new MainPage();
    MainPage.Article article = new MainPage.Article();


    @BeforeClass
    public static void setUp() {
        baseUrl = "https://www.instagram.com/";
        LoginPage loginPage = new LoginPage();
        loginPage.open()
                 .loginWithLoginPass(loginPage);
        MainPage mainPage = new MainPage();
        mainPage.clickButton(mainPage.modalButtonNotEnableNotify);

    }

    @Test
    public void checkPageContent() { //проверяем, что на странице есть необходимые основные блоки
        MainPage mainPage = new MainPage();
        Assert.assertNotNull(mainPage.navBar);
        Assert.assertNotNull(mainPage.contentBox);

     }
     @Test
    public void checkArticlesViewAndScroll() { //проверяем, что на странице есть элементы и они подгружаются при прокрутке страницы
        int size1 = article.articles.size();
        article.getLastViewableArticle().scrollIntoView(true);

        int size2 = article.articles.size();
        Assert.assertTrue(size2 > size1);
    }


    @Test
    public void clickHeaderLink() { //проверяем, что при клике на ссылку в заголовке мы попадаем на нужный профиль
        article.articleHeaderLink.click();
        Assert.assertTrue(article.articleHeaderLink.toString().contains(article.articleHeaderLinkText));
        mainPage.open();
    }

    @Test
    public void search() { //проверяем, что при клике на ссылку в заголовке мы попадаем на нужный профиль
        article.articleHeaderLink.click();
        Assert.assertTrue(article.articleHeaderLink.toString().contains(article.articleHeaderLinkText));
    }


    }
