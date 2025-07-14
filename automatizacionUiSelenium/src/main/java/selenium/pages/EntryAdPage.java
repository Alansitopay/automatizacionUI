package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EntryAdPage {
    private WebDriver driver;
    private By locateModal = By.className("modal");

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean modalIsShowing (){
        WebElement modal = driver.findElement(locateModal);
        return modal.isDisplayed();
    }

    public void clickCloseButton (){
        WebElement close = driver.findElement(By.cssSelector(".modal-footer p"));
        //WebElement closeButton = close.findElement(By.tagName("button"));
        close.click();
    }

}
