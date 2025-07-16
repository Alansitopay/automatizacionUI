package EntryAd;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.pages.EntryAdPage;
import selenium.pages.HomePage;

public class EntryAdTests extends BaseTests {
    @Test
    public void modalNotShowingWhenClickingClose (){
        EntryAdPage entryAd = homePage.clickEntryAd();
        Assert.assertTrue(entryAd.modalIsShowing());
        entryAd.clickCloseButton();
        Assert.assertFalse(entryAd.modalIsShowing());
    }
}
