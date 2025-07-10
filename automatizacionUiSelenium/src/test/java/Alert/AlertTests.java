package Alert;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.pages.AlertsPage;

public class AlertTests extends BaseTests {
    @Test
    public void ClickAlertDisplaysMessage (){
        var alerts = homePage.clickAlerts();
        alerts.clickAlertJS();
        alerts.acceptAlert();
        Assert.assertEquals(alerts.getResultText(),"You successfully clicked an alert");
    }

    @Test
    public void ClickConfirmAlertMessage (){
        var alerts = homePage.clickAlerts();
        alerts.clickConfirmJS();
        String text = alerts.getAlertText();
        alerts.dismissAlert();
        Assert.assertEquals(text,"I am a JS Confirm");
    }

    @Test
    public void ClickPromptAndComplete (){
        var alerts = homePage.clickAlerts();
        alerts.clickPromptInput("Esto es una alerta!");
        alerts.acceptAlert();
        Assert.assertEquals(alerts.getResultText(),"You entered: Esto es una alerta!");
    }
}
