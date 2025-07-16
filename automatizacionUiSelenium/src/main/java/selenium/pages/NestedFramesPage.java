package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToLeft(){
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
    }
    public void switchToMiddle (){
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
    }
    public void switchToRight (){
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-right");
    }
    public void switchToBottom (){
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
    }
    public String getText (){
        return driver.findElement(By.tagName("body")).getText();
    }
}
