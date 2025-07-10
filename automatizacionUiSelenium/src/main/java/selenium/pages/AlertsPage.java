package selenium.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPage {
    private WebDriver driver;
    private By alertJS = By.cssSelector("button[onclick='jsAlert()']");
    private By confirmJS = By.cssSelector("button[onclick='jsConfirm()']");
    private By promptJS = By.cssSelector("button[onclick='jsPrompt()']");
    private By result = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getAlertText(){
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }
    public String getResultText(){
        WebElement resultado = driver.findElement(result);
        return resultado.getText();
    }
    public void acceptAlert (){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void dismissAlert(){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void clickAlertJS(){
        driver.findElement(alertJS).click();
    }
    public void clickConfirmJS (){
        driver.findElement(confirmJS).click();
    }
    public void clickPromptInput (String input){
        driver.findElement(promptJS).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(input);
    }

}
