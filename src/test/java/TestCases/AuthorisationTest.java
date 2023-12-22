package TestCases;

import Core.BaseTest;
import Core.TestsData;
import PageObjects.MainMenuPageObject;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;

public class AuthorisationTest extends BaseTest {

    @Test
    public void authorisation_positive() throws InterruptedException {
        try{
            var mainMenu = new MainMenuPageObject(webDriver);
            mainMenu.OpenLogIn();
            Thread.sleep(1500);
            var loginMenu = mainMenu.OpenLogIn();
            loginMenu.enterUsername(TestsData.authuserName);
            loginMenu.enterPassword(TestsData.authpassword);
            loginMenu.LogIn();
            Thread.sleep(1500);
            String actualUserName = mainMenu.GetUserName();
            System.out.println(actualUserName);
            String expectedUserName =TestsData.authuserName;
            Assert.assertEquals(expectedUserName, actualUserName);
            Thread.sleep(1500);
            mainMenu.logout();
            Thread.sleep(1500);
        } catch(NoSuchElementException ex){
            Assert.fail("Can not find element");
        }
    }

}
