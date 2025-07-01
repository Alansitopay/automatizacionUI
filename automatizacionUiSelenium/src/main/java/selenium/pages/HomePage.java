package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private WebDriver driver;

    private By formAuthLink = By.linkText("Form Authentication");
    private By shiftingContentLink = By.linkText("Shifting Content");

    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthLink(){
        driver.findElement(formAuthLink).click();
        return new LoginPage(driver);
    }

    public ShiftingContentPage clickShiftingContent (){
        driver.findElement(shiftingContentLink).click();
        return new ShiftingContentPage(driver);
    }

}
