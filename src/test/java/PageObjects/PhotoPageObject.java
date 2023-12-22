package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhotoPageObject {
    private final WebDriver webDriver;
    private final By closeButton = By.xpath("//div[@class='YcKTH']//button[@class='fdrIK jpBZ0 cIVI_']");
    private final By descriptionLabel = By.xpath("//div[@class='eoX8Y IKU9M YBMqo']//p[@class='uuIGK oh0KJ wcwFj']");
    private final By likeBtn = By.xpath("//div[@class='EdCFo']//button[@title='Like']");
    private final By chooseSizeBtn = By.xpath("//button[@title='Choose your download size']");
    private final By smallSizeBtn = By.xpath("//span[text()='Small']/parent::a");
    private final By mediumSizeBtn = By.xpath("//span[text()='Medium']/parent::a");

    public PhotoPageObject(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void closePhoto(){
        webDriver.findElement(closeButton).click();
    }

    public String getDescriptionText(){
        return webDriver.findElement(descriptionLabel).getText();
    }

    public void like(){
        webDriver.findElement(likeBtn).click();
    }

    public void chooseSize(){
        webDriver.findElement(chooseSizeBtn).click();
    }

    public void selectSmallSize(){
        webDriver.findElement(smallSizeBtn).click();
    }

    public void selectMediumSize(){
        webDriver.findElement(mediumSizeBtn).click();
    }
}
