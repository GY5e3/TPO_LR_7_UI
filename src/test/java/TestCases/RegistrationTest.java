package TestCases;

import Core.BaseTest;
import Core.TestsData;
import PageObjects.MainMenuPageObject;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;

public class RegistrationTest extends BaseTest {

    @Test
    public void registration_positive() throws InterruptedException {
        try{
            var mainMenu = new MainMenuPageObject(webDriver);
            mainMenu.OpenRegister();
            Thread.sleep(5000);
            var regMenu = mainMenu.OpenRegister();
            regMenu.EnterEmail(TestsData.email);
            regMenu.EnterFirstName(TestsData.firstName);
            regMenu.EnterLastName(TestsData.lastName);
            regMenu.EnterUserName(TestsData.reguserName);
            regMenu.EnterPassword(TestsData.regpassword);
            regMenu.ConfirmPassword(TestsData.regpassword);
            regMenu.Join();
            Thread.sleep(1500);
            var loginMenu = mainMenu.OpenLogIn();
            loginMenu.enterUsername(TestsData.reguserName);
            loginMenu.enterPassword(TestsData.regpassword);
            Thread.sleep(1500);
            loginMenu.LogIn();
            Thread.sleep(1500);
            String actualUserName = mainMenu.GetUserName();
            String expectedUserName =TestsData.reguserName;
            Assert.assertEquals(expectedUserName, actualUserName);
            Thread.sleep(1500);
            mainMenu.logout();
            Thread.sleep(1500);
        } catch(NoSuchElementException ex){
            Assert.fail("Can not find element");
        }
    }

}
