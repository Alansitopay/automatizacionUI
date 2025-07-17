package forgotPassword;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.pages.EmailSentPage;
import selenium.pages.ForgotPasswordPage;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void forgotPasswordReturnsEmailSent (){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.inputEmailField("hola@hola.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrieve();
        Assert.assertEquals(emailSentPage.getMessageObtained(),"Internal Server Error");
    }
}
