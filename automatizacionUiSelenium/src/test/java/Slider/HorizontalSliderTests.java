package Slider;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderTests extends BaseTests {
    @Test
    public void testSlider4 (){
        var sliderPage = homePage.clickSlider();
        sliderPage.clickOnSlider(8);
        Assert.assertEquals(sliderPage.getCaption(),"4");
    }
}
