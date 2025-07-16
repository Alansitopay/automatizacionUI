package InfiniteScroll;

import base.BaseTests;
import org.testng.annotations.Test;
import selenium.pages.HomePage;
import selenium.pages.InfiniteScroll;

public class InfiniteScrollTest extends BaseTests {
    @Test
    public void infiniteScrollTest (){
        InfiniteScroll infiniteScroll = homePage.clickInfiniteScroll();
        infiniteScroll.scrollToParagraph(5);
    }
}
