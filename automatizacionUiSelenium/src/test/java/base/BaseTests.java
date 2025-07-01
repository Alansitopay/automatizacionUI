package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.pages.HomePage;

import java.util.List;

public class BaseTests {
    private WebDriver driver;
    private HomePage homePage;

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
        public void setUp(){
            driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/");
            homePage = new HomePage(driver);
            homePage.clickFormAuthLink();
        }
    }

public static void main(String[] args) {
    BaseTests baseTests = new BaseTests();
    baseTests.setUp();
}