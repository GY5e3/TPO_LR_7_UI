package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostPageObject {
    private final WebDriver webDriver;
    private final By changeBtn = By.xpath("//article//a");
    private final By commField = By.xpath("//textarea[@id='id_text']");
    private final By sendBtn = By.xpath("//form//button");

    private final By postCommLabel = By.xpath("//div[@class='media-body']//p");

    private final By postTextLabel = By.xpath("//main//p");

    public PostPageObject(WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }

    public void Send()
    {
        webDriver.findElement(sendBtn).click();
    }

    public void enterComm(String keys){
        webDriver.findElement(commField).sendKeys(keys);
    }

    public ChangePostPageObject clickOnChange()
    {
        webDriver.findElement(changeBtn).click();
        return new ChangePostPageObject(webDriver);
    }


    public String GetCommText() {
        return webDriver.findElement(postCommLabel).getText();
    }

    public String GetPostText() {
        return webDriver.findElement(postTextLabel).getText();
    }
}
