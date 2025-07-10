package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By retrieveButton = By.cssSelector("#form_submit");
    private By e_mailField = By.cssSelector("#email");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputEmailField (String input){
        driver.findElement(e_mailField).sendKeys(input);
    }

    public EmailSentPage clickRetrieve () {
        driver.findElement(retrieveButton).click();
        return new EmailSentPage (driver);
    }
}
