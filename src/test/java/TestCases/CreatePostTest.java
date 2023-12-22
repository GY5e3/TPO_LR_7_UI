package TestCases;

import Core.BaseTest;
import Core.TestsData;
import PageObjects.MainMenuPageObject;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;

public class CreatePostTest extends BaseTest {

    @Test
    public void creation_positive() throws InterruptedException {
        try{
            var mainMenu = new MainMenuPageObject(webDriver);
            authorise(mainMenu);
            var createmenu = mainMenu.CreatePost();
            createmenu.EnterPostText(TestsData.textPost);
            Thread.sleep(5000);
            createmenu.CreatePost();
            Thread.sleep(1500);
            String actualPostText = mainMenu.GetPostText();
            String expectedUserName =TestsData.textPost;
            Assert.assertEquals(expectedUserName, actualPostText);
            Thread.sleep(1500);
            mainMenu.logout();

        } catch(NoSuchElementException ex){
            Assert.fail("Can not find element");
        }
    }
}
