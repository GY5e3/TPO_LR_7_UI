package PageObjects;

import Core.TestsData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePageObject {
    private final WebDriver webDriver;
    private final By fullNameLabel = By.xpath("//div[@class='iqGFX']//div[@class='dJnu9 j8AIa dvBHu oh0KJ Fu4vG']");
    private final By likesBtn = By.xpath("//li//a[@href='/@"+ TestsData.authuserName +"/likes']");
    private final By likedPhotos = By.xpath("//div[@class='MorZF']//img");

    public ProfilePageObject(WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }

    public String GetFullName()
    {
        return webDriver.findElement(fullNameLabel).getText();
    }

    public void likesClick(){
        webDriver.findElement(likesBtn).click();
    }

    public PhotoPageObject clickOnPhoto(int index)
    {
        webDriver.findElements(likedPhotos).get(index).click();
        return new PhotoPageObject(webDriver);
    }
}
