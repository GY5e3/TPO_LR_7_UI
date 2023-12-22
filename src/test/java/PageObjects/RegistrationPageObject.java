package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class RegistrationPageObject {

    private final WebDriver webDriver;
    private final By firstNameField = By.xpath("//input[@name='first_name']");
    private final By lastNameField = By.xpath("//input[@name='last_name']");
    private final By emailField = By.xpath("//input[@name='email']");
    private final By userNameField = By.xpath("//input[@name='username']");
    private final By passwordField = By.xpath("//input[@name='password1']");

    private final By confirmPasswordField = By.xpath("//input[@name='password2']");

    private final By regBtn = By.xpath("//button[@type='submit']");

    public RegistrationPageObject(WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }

    public void EnterFirstName(String keys)
    {
        webDriver.findElement(firstNameField).sendKeys(keys);
    }

    public void EnterLastName(String keys)
    {
        webDriver.findElement(lastNameField).sendKeys(keys);
    }

    public void EnterEmail(String keys)
    {
        webDriver.findElement(emailField).sendKeys(keys);
    }

    public void EnterUserName(String keys)
    {
        webDriver.findElement(userNameField).sendKeys(keys);
    }

    public void EnterPassword(String keys)
    {
        webDriver.findElement(passwordField).sendKeys(keys);
    }
    public void ConfirmPassword(String keys)
    {
        webDriver.findElement(confirmPasswordField).sendKeys(keys);
    }

    public void Join() throws InterruptedException {
        ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        Thread.sleep(3000);

        webDriver.findElement(regBtn).click();
    }
}
