package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContentPage {
    private WebDriver driver;
    private By example1Link = By.partialLinkText("Example 1");

    public ShiftingContentPage(WebDriver driver) {
        this.driver = driver;
    }

    public Example1Page example1 () {
        driver.findElement(example1Link).click();
        return new Example1Page(driver);
    }
}
