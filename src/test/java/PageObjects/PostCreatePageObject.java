package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PostCreatePageObject {

    private final WebDriver webDriver;
    private final By postTextField = By.xpath("//textarea[@name='text']");

    private final By createPostBtn = By.xpath("//button[@type='submit']");



    public PostCreatePageObject(WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }

    public void EnterPostText(String keys)
    {
        webDriver.findElement(postTextField).sendKeys(keys);
    }

    public void CreatePost() throws InterruptedException {
        /*JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].scrollIntoView();", createPostBtn);*/


        ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        Thread.sleep(1500);

        webDriver.findElement(createPostBtn).click();
    }
}
