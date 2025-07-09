package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {
    private WebDriver driver;
    private By message = By.cssSelector("h1");

    public EmailSentPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getMessageObtained(){
        return driver.findElement(message).getText();
    }
}
