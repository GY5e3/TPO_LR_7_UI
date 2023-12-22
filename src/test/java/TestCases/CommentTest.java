package TestCases;

import Core.BaseTest;
import Core.TestsData;
import PageObjects.MainMenuPageObject;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;

public class CommentTest extends BaseTest {

    @Test
    public void comment_positive() throws InterruptedException {
        try{
            var mainMenu = new MainMenuPageObject(webDriver);
            authorise(mainMenu);
            var postInfo = mainMenu.OpenPostInfo();
            postInfo.enterComm(TestsData.expectedDescription);
            Thread.sleep(1500);
            postInfo.Send();
            Thread.sleep(1500);
            String actualCommText = postInfo.GetCommText();
            String expectedCommName =TestsData.expectedDescription;
            Assert.assertEquals(expectedCommName, actualCommText);
            Thread.sleep(1500);
            mainMenu.logout();

        } catch(NoSuchElementException ex){
            Assert.fail("Can not find element");
       }
    }

}
