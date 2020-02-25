package testExecution;

import cucumber.api.java.an.E;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeDetailPage;
import pages.EmployeeTabPage;
import utilities.Driver;
import utilities.Reusable;

public class PROQ_225 {

    //multiple_files_contains_on_EDP_Attachment_button_able_to_download_1_of_them
    @Test
    public void tc225(){
        //1. initiate driver to employee page (as a main module)
        Reusable.login_nav_to_employee_tab();


        EmployeeTabPage employeeTabPage =new EmployeeTabPage();
        EmployeeDetailPage employeeDetailPage = new EmployeeDetailPage();



        employeeTabPage.employeeProfileKanban.click();

        Reusable.waitForVisibility(employeeDetailPage.attachmentButton,10);

        employeeDetailPage.attachmentButton.click();


        Reusable.waitForVisibility(employeeDetailPage.latestUploadedFile,10);

        String file = Driver.getDriver().findElement(By.xpath("//a[@data-section = 'files']")).getText();
        employeeDetailPage.latestUploadedFile.click();

        Reusable.pause(5);
        Assert.assertTrue(Reusable.isFileDownloaded("/Users/aybukegorgulu/Downloads", file),file);

    }
}


