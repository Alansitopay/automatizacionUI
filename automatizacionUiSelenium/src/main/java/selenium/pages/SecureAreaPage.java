package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver driver;

    //se le pone "flash" ya que el cartel de que se logeo correcatmente tiene un id de "flash"
    private By statusAlert = By.id("flash");

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getAlertText() {
        return driver.findElement(statusAlert).getText();
    }

}
