package FileUpload;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.pages.FileUploadPage;

public class FileUploadTest extends BaseTests {
    @Test
    public void uploadFileShowsCorrectText (){
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile();
        Assert.assertEquals("elemento.txt",fileUploadPage.getUploadedFiles());
    }
}
