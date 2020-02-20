package testExecution;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DeleteTimesheet;
import pages.EmployeeProfile;
import pages.EmployeeTabPage;
import utilities.Reusable;

public class PROQ_204 {

    @Test
    public void tc204(){

        Reusable.login_nav_to_employee_tab();

        DeleteTimesheet timesheet = new DeleteTimesheet();
        EmployeeProfile employeeProfile = new EmployeeProfile();

        employeeProfile.selectFirstEmployee.click();

       timesheet.btnTimesheets.click();

        timesheet.createButton.click();

        timesheet.inputEmployeeName.sendKeys("Abuzer Kadayif");

        timesheet.inputDescription.sendKeys("Test description");

        timesheet.inputProjectName.sendKeys("Internal - GAP Analysis");

        timesheet.inputTask.click();

        String message = timesheet.inputTask.getText();

        Assert.assertTrue(message.isEmpty());


    }
}
