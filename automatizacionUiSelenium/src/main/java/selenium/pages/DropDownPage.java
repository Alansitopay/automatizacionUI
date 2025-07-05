package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropDownPage {

    private WebDriver driver;
    private By dropdown = By.id("Dropdown");
    private WebElement dropDownElement = driver.findElement(dropdown);

    public DropDownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromDropDown(String option){
        findDropdownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOption(){
        List<WebElement> selectedSelection = findDropdownElement().getAllSelectedOptions();
        List<String>selectedStrings = new ArrayList<>();
        for(WebElement element : selectedSelection){

            selectedStrings.add(element.getText());

        }
        return selectedStrings;
    }

    private Select findDropdownElement(){
        return new Select (driver.findElement(dropdown));
    }



}
