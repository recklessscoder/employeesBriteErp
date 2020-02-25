package testExecution;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;
import utilities.Driver;
import utilities.Reusable;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class miniSmoke {

    DeleteTimesheet deleteTimesheet = new DeleteTimesheet();

    @BeforeClass
    public void login() {
        Reusable.login_nav_to_employee_tab();
    }

    @AfterMethod //AfterMethod annotation - This method executes after every test execution
        public void tearDown(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
// Create refernce of TakesScreenshot
                TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
// Call method to capture screenshot
                File source = ts.getScreenshotAs(OutputType.FILE);
// Copy files to specific location here it will save all screenshot in our project home directory and
// result.getName() will return name of test case so that screenshot name will be same
                FileUtils.copyFile(source, new File("./Screenshots/" + result.getName() + ".png"));
                System.out.println("Screenshot taken");
            } catch (Exception e) {
                System.out.println("Exception while taking screenshot " + e.getMessage());
            }
            Reusable.return_to_employee_page();
            Reusable.pause(2);
        }
    }

    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }


    @Test(priority = 1)
    public void tc204() {
        DeleteTimesheet timesheet = new DeleteTimesheet();
        EmployeeProfile employeeProfile = new EmployeeProfile();

        employeeProfile.selectFirstEmployee.click();

        timesheet.btnTimesheets.click();

        timesheet.createButton.click();

        timesheet.inputEmployeeName.sendKeys("Antoine Langlais");

        timesheet.inputDescription.sendKeys("Test description");

        timesheet.inputProjectName.sendKeys("Internal - GAP Analysis");

        timesheet.inputTask.click();

        String message = timesheet.inputTask.getText();

        Assert.assertTrue(message.isEmpty());

        Reusable.return_to_employee_page();

        Reusable.waitForVisibility(timesheet.okButton,10);

        timesheet.okButton.click();

    }

    @Test (priority =  2)
    public void tc_209() {

        // user clicks on employee profile
        EmployeeTabPage employeeTabPage = new EmployeeTabPage();
        employeeTabPage.employeeArthurSam.click();


        // user should be able to see EDP (Employee Detailed Page)
        // user clicks on any employee in OC (Organization Chart)

        EmployeeDetailPage employeeDetailPage = new EmployeeDetailPage();
        String firstRelatedEmployeeNameText = employeeDetailPage.firstRelatedEmployeeName.getText().trim();

        employeeDetailPage.firstRelatedEmployee.click();

        // user should be able to see EDP of selected related employee

        Reusable.pause(3);
        String actualRelatedEmployeeHeaderName = employeeDetailPage.employeeNameInHeader.getText().trim();

        System.out.println(firstRelatedEmployeeNameText);
        System.out.println(actualRelatedEmployeeHeaderName);
        Assert.assertEquals(actualRelatedEmployeeHeaderName, firstRelatedEmployeeNameText);
    }



    @Test(priority = 3)
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

    Reusable.pause(15);
    Assert.assertTrue(Reusable.isFileDownloaded("/Users/aybukegorgulu/Downloads", file),file);

}


    @Test (priority = 4)
    public void tc202() {

        // clicking on an employee
        EmployeeTabPage employeeTabPage = new EmployeeTabPage();
        employeeTabPage.employeeProfileKanban.click();

        // finding out the name and printing out
        EmployeeDetailPage employeeDetailPage = new EmployeeDetailPage();
        String employeeName = employeeDetailPage.nameOfEmployeeInHeader.getText();
        System.out.println(employeeName);

        //returning to Employees tab
        Reusable.return_to_employee_page();
    }

    @Test (priority =  5)
    public void tc_194() {

        // click on an employee
        EmployeeTabPage employeeTabPage = new EmployeeTabPage();
        employeeTabPage.employeeProfileKanban.click();

        // click on Send Message
        EmployeeDetailPage employeeDetailPage = new EmployeeDetailPage();
        employeeDetailPage.sendMessageButton.click();

        // entering text into MessageBox
        String sendMessageText = "This is an automated test message";
        employeeDetailPage.messageBox.sendKeys(sendMessageText);

        // clicking on Send button
        employeeDetailPage.sendButtonFinal.click();


        // checking if the most recent message equals to entered text
        // locating most recent message (dynamic)
        Assert.assertEquals(sendMessageText,employeeDetailPage.getLastMessage.getText());

    }


}
