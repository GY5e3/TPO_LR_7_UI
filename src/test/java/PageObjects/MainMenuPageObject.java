package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainMenuPageObject {
    private final WebDriver webDriver;
    private final By btnLogIn = By.xpath("//li//a[@href='/auth/login/']");//rd
    private final By btnReg = By.xpath("//li//a[@href='/auth/signup/']");//rd

    private final By aboutAuthor = By.xpath("//li//a[@href='/about/author/']");//rd

    private final By Author = By.xpath("//article//a");//rd

    private final By userNameLabel = By.xpath("//li[@id='username1']");

    private final By postTextLabel = By.xpath("//article//p");

    private final By aboutTech = By.xpath("//li//a[@href='/about/tech/']");//rd
    private final By moreInfoBtn = By.xpath("//article//a[normalize-space() = 'подробная информация']");//rd

    ///profile/nickname1234567/follow/  "//a[@href='/follow/']"
    private final By favs = By.xpath("//a[@href='/follow/']");//rd

    private final By newPost = By.xpath("//a[@href='/create/']");//rd

    private final By AuthorTextLabel = By.xpath("//article//a");//rd
    private final By logoutBtn = By.xpath("//li//a[@href='/auth/logout/']");//rd



    public MainMenuPageObject(WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }

    public AuthorisationPageObject OpenLogIn()
    {
        webDriver.findElement(btnLogIn).click();
        return new AuthorisationPageObject(webDriver);
    }

    public RegistrationPageObject OpenRegister()
    {
        webDriver.findElement(btnReg).click();
        return new RegistrationPageObject(webDriver);
    }

    public AuthorPageObject OpenAuthor()
    {
        webDriver.findElement(Author).click();
        return new AuthorPageObject(webDriver);
    }

    public void logout(){
        webDriver.findElement(logoutBtn).click();
    }


    public PostPageObject OpenPostInfo()
    {
        webDriver.findElement(moreInfoBtn).click();
        return new PostPageObject(webDriver);
    }

    public PostPageObject OpenFavs() throws InterruptedException {
        ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, 0);");

        Thread.sleep(3000);

        webDriver.findElement(favs).click();
        return new PostPageObject(webDriver);
    }

    public PostCreatePageObject CreatePost()
    {
        webDriver.findElement(newPost).click();
        return new PostCreatePageObject(webDriver);
    }

    public ProfilePageObject OpenAuthorInfo()
    {
        webDriver.findElement(aboutAuthor).click();
        return new ProfilePageObject(webDriver);
    }

    public String GetUserName()
    {
        return webDriver.findElement(userNameLabel).getText();
    }

    public ProfilePageObject OpenTechInfo()
    {
        webDriver.findElement(aboutTech).click();
        return new ProfilePageObject(webDriver);
    }

    public String GetPostText() {
        return webDriver.findElement(postTextLabel).getText();
    }

    public String GetPostAuthor() {
        return webDriver.findElement(AuthorTextLabel).getText();
    }
}
