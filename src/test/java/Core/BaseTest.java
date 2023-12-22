package Core;

import PageObjects.MainMenuPageObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected static WebDriver webDriver;

    @BeforeClass
    public static void BeforeAll() throws Exception {
        WebDriverContext.initWebDriver();
        webDriver = WebDriverContext.getWebDriver();
    }

    @Before
    public void Setup()
    {
        webDriver.manage().getCookies().clear();
        webDriver.navigate().to(TestsData.url);
        webDriver.manage().window().maximize();
    }

    @After
    public void TearDown()
    {
    }

    @AfterClass
    public static void AfterAll()
    {
        webDriver.quit();
    }

    protected void authorise(MainMenuPageObject mainMenu) throws InterruptedException {
        var loginMenu = mainMenu.OpenLogIn();

        loginMenu.enterUsername(TestsData.reguserName);
        loginMenu.enterPassword(TestsData.regpassword);
        loginMenu.LogIn();
        Thread.sleep(300);
    }
}
