package TestCases;

import Core.BaseTest;

public class SearchTest extends BaseTest {
/*
    @Test
    public void search() throws InterruptedException {
        try{
            var mainMenu = new MainMenuPageObject(webDriver);

            mainMenu.enterSearchString(TestsData.stringToSearch);
            mainMenu.searchClick();
            sleep(5000);
            var photoPage = mainMenu.clickOnPhoto(0);
            sleep(5000);

            String actualDescription = photoPage.getDescriptionText();

            Assert.assertEquals(TestsData.expectedDescription, actualDescription);

            photoPage.closePhoto();
        } catch(
        NoSuchElementException ex){
            Assert.fail("Can not find element");
        }
    }

    @Test
    public void noResultsSearch() throws InterruptedException {
        try{
            var mainMenu = new MainMenuPageObject(webDriver);

            mainMenu.enterSearchString(TestsData.longText);
            mainMenu.searchClick();
            sleep(2000);

            Assert.assertTrue(mainMenu.isNoContent());
        } catch(NoSuchElementException ex){
            Assert.fail("Can not find element");
        }
    }*/
}
