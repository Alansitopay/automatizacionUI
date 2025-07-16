package selenium.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By locateHotSpot = By.id("hot-spot");


    public ContextMenuPage(WebDriver driver) {
        this.driver=driver;
    }

    public void ClickHotSpot (){
        Actions actions = new Actions(driver);
        WebElement hotSpot = driver.findElement(locateHotSpot);
        actions.contextClick(hotSpot).perform();
    }
    public void AcceptAlert (){
        driver.switchTo().alert().accept();
    }
    public void DismissAlert(){
        driver.switchTo().alert().dismiss();
    }
    public String GetAlertText(){
        return driver.switchTo().alert().getText();
    }
}
