package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthorisationPageObject {
    private final WebDriver webDriver;
    private final By loginBtn = By.xpath("//button[@type='submit']");
    private final By usernameField = By.xpath("//input[@name='username']");
    private final By passwordField = By.xpath("//input[@name='password']");

    public AuthorisationPageObject(WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }

    public void LogIn()
    {
        webDriver.findElement(loginBtn).click();
    }

    public void enterUsername(String keys){
        webDriver.findElement(usernameField).sendKeys(keys);
    }

    public void enterPassword(String keys){
        webDriver.findElement(passwordField).sendKeys(keys);
    }


}
