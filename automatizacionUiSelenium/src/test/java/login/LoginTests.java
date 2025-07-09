package login;

import base.BaseTests;
import org.testng.annotations.Test;
import selenium.pages.HomePage;
import selenium.pages.LoginPage;
import selenium.pages.SecureAreaPage;
import org.testng.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin (){
        LoginPage login = homePage.clickFormAuthLink();
        login.setUsername("tomsmith");
        login.setPassword("SuperSecretPassword!");
        SecureAreaPage secureArea = login.clickLoginButton();
        Assert.assertTrue(secureArea.getAlertText().contains("You logged into a secure area!"));
    }

}
