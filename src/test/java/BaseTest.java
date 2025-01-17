import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeEach
    public void setUp(){

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        open("http://chatty.telran-edu.de:8089/login");
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }

    LoginPage loginPage = new LoginPage();
    HeaderPage headerPage = new HeaderPage();
    ContactUsPage contactUsPage = new ContactUsPage();
    DraftPage draftPage = new DraftPage();
    CreatePostPage createPostPage = new CreatePostPage();
    AdminPage adminPage = new AdminPage();
    HomePage homePage = new HomePage();
    CreateAccountPage createAccountPage = new CreateAccountPage();
    UserProfileEditPage userProfileEditPage = new UserProfileEditPage();

}
