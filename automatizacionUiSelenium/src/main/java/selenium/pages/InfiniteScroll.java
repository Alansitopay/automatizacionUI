package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InfiniteScroll {
    private WebDriver driver;

    public InfiniteScroll(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToParagraph (int numParagraph){
        Boolean booleano=true;
        while (booleano){
            List<WebElement> paragraphs = driver.findElements(By.className("jscroll-added"));
            if (paragraphs.size()==numParagraph){
                booleano=false;
            }
            String script = "window.scrollTo(0, document.body.scrollHeight)";
            ((JavascriptExecutor)driver).executeScript(script);
        }
    }
}
