package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRmElementsPage {
    private WebDriver driver;

    private By addElement = By.cssSelector("button[onclick='addElement()']");
    private By rmElement = By.cssSelector("button[onclick='deleteElement()']");

    public AddRmElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void add (Integer times) {
        for(int i = 0; i<times; i++){
            driver.findElement(addElement).click();
        }
    }
    public void rm (Integer times) {
        for(int i = 0; i< times; i++){
            driver.findElement(rmElement).click();
        }
    }
}
