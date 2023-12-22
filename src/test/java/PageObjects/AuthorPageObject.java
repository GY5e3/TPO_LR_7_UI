package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthorPageObject {

    private final WebDriver webDriver;

    private final By AddToFavBtn = By.xpath("//main//a");
    private final By Menu = By.xpath("//a[@class='navbar-brand']");

    public AuthorPageObject(WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }

    public void AddToFav()
    {
        webDriver.findElement(AddToFavBtn).click();
    }

    public MainMenuPageObject BackToMenu()
    {
        webDriver.findElement(Menu).click();
        return new MainMenuPageObject(webDriver);
    }



}
