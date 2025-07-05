package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private WebDriver driver;

    private By formAuthLink = By.linkText("Form Authentication");
    private By shiftingContentLink = By.linkText("Shifting Content");
    private By add_remove_elements_link = By.linkText("Add/Remove Elements");
    private By dropdownLink = By.linkText("Dropdown");

    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
    public LoginPage clickFormAuthLink(){
        driver.findElement(formAuthLink).click();
        return new LoginPage(driver);
    }

    public ShiftingContentPage clickShiftingContent (){
        driver.findElement(shiftingContentLink).click();
        return new ShiftingContentPage(driver);
    }

    public AddRmElementsPage clickElementsPage (){
        driver.findElement(add_remove_elements_link).click();
        return new AddRmElementsPage(driver);
    }

    public DropDownPage clickDropDownPage (){
        driver.findElement(dropdownLink).click();
        return new DropDownPage(driver);
    }

}
