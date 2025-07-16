package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSlider {
    private WebDriver driver;
    private By findSlider = By.cssSelector("input[type='range']");
    private By findCaption = By.id("range");

    public HorizontalSlider(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnSlider (Integer input){
        WebElement slider = driver.findElement(findSlider);
        Actions actions = new Actions(driver);
        actions.moveToElement(slider).click().perform();
        for(int i=0 ; i <= 10; i++){
            actions.sendKeys(Keys.ARROW_LEFT).perform();
        }
        for(int i=0 ; i < input ; i++){
            actions.sendKeys(Keys.ARROW_RIGHT).perform();
        }
    }
    public String getCaption (){
        WebElement caption = driver.findElement(findCaption);
        return caption.getText();
    }

}
