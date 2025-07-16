package ContextMenu;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.pages.ContextMenuPage;

public class ContextMenuTests extends BaseTests {
    @Test
    public void PopUpMessageShows (){
        ContextMenuPage contextMenu = homePage.clickContextMenu();
        contextMenu.ClickHotSpot();
        Assert.assertEquals(contextMenu.GetAlertText(),"You selected a context menu");
        contextMenu.AcceptAlert();
    }
}
