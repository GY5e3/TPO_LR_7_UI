package TestCases;

import Core.BaseTest;

public class DownloadTest extends BaseTest {

    /*Test
    public void download_positive() throws InterruptedException, IOException {
        var mainMenu = new MainMenuPageObject(webDriver);

        mainMenu.enterSearchString(TestsData.stringToSearch);
        mainMenu.searchClick();
        sleep(5000);
        var photoPage = mainMenu.clickOnPhoto(0);
        sleep(5000);

        photoPage.chooseSize();
        photoPage.selectSmallSize();

        sleep(3000);

        Path pathToDownloadFile = Paths.get(TestsData.pathToDownloadFile);
        Path pathToLocalFile = Paths.get(TestsData.pathToLocalFile);
        Assert.assertEquals(Files.size(pathToDownloadFile), Files.size(pathToLocalFile));

        Files.delete(pathToDownloadFile);
    }

    @Test
    public void download_negative() throws InterruptedException, IOException {
        var mainMenu = new MainMenuPageObject(webDriver);

        mainMenu.enterSearchString(TestsData.stringToSearch);
        mainMenu.searchClick();
        sleep(5000);
        var photoPage = mainMenu.clickOnPhoto(0);
        sleep(5000);

        photoPage.chooseSize();
        photoPage.selectMediumSize();

        sleep(3000);

        Path pathToDownloadFile = Paths.get(TestsData.pathToDownloadFile);
        Path pathToLocalFile = Paths.get(TestsData.pathToLocalFile);
        Assert.assertNotEquals(Files.size(pathToDownloadFile), Files.size(pathToLocalFile));

        Files.delete(pathToDownloadFile);
    }*/
}
