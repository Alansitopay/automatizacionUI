package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword () {
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public HoversPage clickHovers (){
        clickLink("Hovers");
        return new HoversPage (driver);
    }

    public HorizontalSlider clickSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSlider (driver);
    }

    public AlertsPage clickAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public EntryAdPage clickEntryAd (){
        clickLink("Entry Ad");
        WebDriverWait wait = new WebDriverWait(driver,1);
        wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(
                        By.className("modal"))));
        return new EntryAdPage(driver);
    }

    public ContextMenuPage clickContextMenu (){
        clickLink("Context Menu");
        return new ContextMenuPage (driver);
    }
}
