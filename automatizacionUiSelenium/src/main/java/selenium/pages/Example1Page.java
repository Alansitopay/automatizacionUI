package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Example1Page {
    private WebDriver driver;

    public Example1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void findLiElements(){
        List<WebElement>lista = driver.findElements(By.tagName("li"));
        for(WebElement elemento : lista){
            System.out.println(elemento.getText());
        }
    }
}
