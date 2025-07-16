package NestedFrames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.pages.NestedFramesPage;

public class NestedFramesTests extends BaseTests {
    @Test
    public void SwitchAndGetTexts (){
        NestedFramesPage nestedFrames = homePage.clickNestedFrames();
        nestedFrames.switchToLeft();
        Assert.assertEquals(nestedFrames.getText(),"LEFT");
        nestedFrames.switchToBottom();
        Assert.assertEquals(nestedFrames.getText(),"BOTTOM");
    }
}
