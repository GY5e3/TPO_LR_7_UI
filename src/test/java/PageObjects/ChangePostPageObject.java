package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ChangePostPageObject {

    private final WebDriver webDriver;
    private final By postChangeTextField = By.xpath("//textarea[@name='text']");

    private final By savePostBtn = By.xpath("//button[@type='submit']");

    public ChangePostPageObject(WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }

    public void EnterChangeText(String keys)
    {
        webDriver.findElement(postChangeTextField).clear();
        webDriver.findElement(postChangeTextField).sendKeys(keys);
    }

    public void Join() throws InterruptedException {
        ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        Thread.sleep(1500);

        webDriver.findElement(savePostBtn).click();
    }
}
