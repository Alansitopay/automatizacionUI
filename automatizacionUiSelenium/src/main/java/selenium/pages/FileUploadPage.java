package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadPage {
    private WebDriver driver;

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(){
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Usuario\\Desktop\\Facu\\elemento.txt");
    }
    public String getUploadedFiles(){
        driver.findElement(By.id("file-submit")).click();
        return driver.findElement(By.id("uploaded-files")).getText();
    }
}
