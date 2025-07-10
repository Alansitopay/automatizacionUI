package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        String option = "Option 1";
        var dropDownPage = homePage.clickDropDownPage();
        dropDownPage.selectFromDropDown("Option 1");
        var selectedOptions = dropDownPage.getSelectedOption();
        //Me asegure completamente que las validaciones controlan todo lo que espero que suceda
        Assert.assertEquals(selectedOptions.size(),1);
        Assert.assertTrue(selectedOptions.contains(option));
    }

}
