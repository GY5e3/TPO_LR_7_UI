package TestCases;

import Core.BaseTest;
import Core.TestsData;
import PageObjects.MainMenuPageObject;
import org.junit.Assert;
import org.junit.Test;

public class FavoriteAuthorTest extends BaseTest {

    @Test
    public void favorite_positive() throws InterruptedException {
        /*//try{
            var mainMenu = new MainMenuPageObject(webDriver);
            authorise(mainMenu);
            *//*mainMenu.OpenLogIn();
            var loginMenu = mainMenu.OpenLogIn();
            loginMenu.enterUsername(TestsData.reguserName);
            loginMenu.enterPassword(TestsData.regpassword);
            loginMenu.LogIn();*//*
            Thread.sleep(10000);
            var author = mainMenu.OpenAuthor();
            Thread.sleep(10000);
            author.AddToFav();
            Thread.sleep(10000);
            author.BackToMenu();
            Thread.sleep(10000);
            mainMenu.OpenFavs();
            String actualPostAuthor = mainMenu.GetPostAuthor();
            String expectedAuthor = TestsData.authorName;
            Assert.assertEquals(actualPostAuthor, expectedAuthor);
            mainMenu.logout();

        //} catch(NoSuchElementException ex){
         //   Assert.fail("Can not find element");
        //}*/
    }
}