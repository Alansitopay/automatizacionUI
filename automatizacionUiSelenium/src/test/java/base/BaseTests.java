package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import selenium.pages.HomePage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTests {
    protected WebDriver driver;
    protected HomePage homePage;

    ////////////////////DRIVERS/////////////////////
    /*public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        //driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        //Dimension dimension = new Dimension(1080,1920);
        //driver.manage().window().setSize(dimension);
        //System.out.println(driver.getTitle());
        //driver.close();
    }*/

    ////////////////////ELEMENTOS/////////////////////
    /*public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");*/

        //driver.findElement(By.linkText("Inputs")).click();
        //LO SIGUIENTE ES LO MISMO QUE LA LINEA DE ARRIBA
        //WebElement input = driver.findElement(By.linkText("Inputs"));
        //input.click();

        ///////////LO SIGUIENTE IMPRIME EN CONSOLA UNA LISTA DE TODOS LOS ELEMENTOS CON EL TAG "a"/////////
        //List<WebElement> lista = driver.findElements(By.tagName("a"));
        //for(WebElement elemento : lista){
          //  System.out.println(elemento.getText());
        //}

        //System.out.println(driver.getTitle());

        @BeforeClass
        public void setUp(){
            driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/");
            //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            homePage = new HomePage(driver);
        }
        @AfterMethod
        public void recordFailure(ITestResult result){
            var camera = (TakesScreenshot)driver;
            if(!result.isSuccess()){
                try{
                    File screenshot = camera.getScreenshotAs(OutputType.FILE);
                    System.out.println("Screenshot taken: " + screenshot.getAbsolutePath());
                    Files.move(screenshot.toPath(), new File("src/test/java/resources/screenshots/" + result.getName() + ".png").toPath());
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }

        @AfterClass
        public void tearDown (){
            //driver.quit();
        }
}