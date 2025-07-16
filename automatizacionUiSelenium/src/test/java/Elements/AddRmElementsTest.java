package Elements;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.pages.AddRmElementsPage;

import java.util.List;

public class AddRmElementsTest extends BaseTests {

    @Test
    public void add3Times_Delete (){
        AddRmElementsPage elementsPage = homePage.clickElementsPage();
        elementsPage.add(3);
        List<WebElement> botones3 = driver.findElements(By.cssSelector("button[onclick='deleteElement()']"));
        Assert.assertEquals(botones3.size(),3);
        elementsPage.rm(1);
        List<WebElement> botones2 = driver.findElements(By.cssSelector("button[onclick='deleteElement()']"));
        Assert.assertEquals(botones2.size(),2);
        elementsPage.rm(1);
        List<WebElement> botones1 = driver.findElements(By.cssSelector("button[onclick='deleteElement()']"));
        Assert.assertEquals(botones1.size(),1);
    }
}
