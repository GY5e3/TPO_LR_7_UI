package TestCases;

import Core.BaseTest;
import Core.TestsData;
import PageObjects.MainMenuPageObject;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;

public class ChangePostTest extends BaseTest {

    @Test
    public void creation_positive() throws InterruptedException {
        try{
            var mainMenu = new MainMenuPageObject(webDriver);
            authorise(mainMenu);
            var postmenu = mainMenu.OpenPostInfo();
            Thread.sleep(3000);
            var changemenu = postmenu.clickOnChange();
            Thread.sleep(3000);
            changemenu.EnterChangeText(TestsData.changeTextPost);
            Thread.sleep(3000);
            changemenu.Join();
            String actualPostText = postmenu.GetPostText();
            String expectedPostText = TestsData.changeTextPost;
            //Assert.assertEquals(expectedPostText, actualPostText);
            Assert.assertTrue(actualPostText.equals(expectedPostText));
            Thread.sleep(3000);
            mainMenu.logout();

        } catch(NoSuchElementException ex){
            Assert.fail("Can not find element");
        }
    }
}
