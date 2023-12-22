package TestCases;

import Core.BaseTest;

public class LikePhotoTest extends BaseTest {
    /*@Test
    public void like_positive() throws InterruptedException {
        var mainMenu = new MainMenuPageObject(webDriver);

        authorise(mainMenu);

        mainMenu.enterSearchString(TestsData.stringToSearch);
        mainMenu.searchClick();
        sleep(5000);
        var photoPage = mainMenu.clickOnPhoto(0);
        sleep(5000);
        photoPage.like();
        String expectedDescription = photoPage.getDescriptionText();
        photoPage.closePhoto();

        mainMenu.OpenProfilePopMenu();
        var profilePage = mainMenu.OpenProfilePage();
        Thread.sleep(3000);

        webDriver.navigate().refresh();
        Thread.sleep(1000);

        profilePage.likesClick();
        Thread.sleep(2000);
        photoPage = profilePage.clickOnPhoto(0);
        sleep(2000);
        String actualDescription = photoPage.getDescriptionText();

        Assert.assertEquals(expectedDescription, actualDescription);

        photoPage.like();
        photoPage.closePhoto();
        webDriver.navigate().back();
        mainMenu.OpenProfilePopMenu();
        mainMenu.logout();
    }*/
}
