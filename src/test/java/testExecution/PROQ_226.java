package testExecution;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeDetailPage;
import pages.EmployeeProfile;
import utilities.Reusable;

public class PROQ_226 {

    @Test
    public void tc226(){
        Reusable.login_nav_to_employee_tab();

        EmployeeProfile employeeProfile = new EmployeeProfile();
        EmployeeDetailPage employeeDetailPage = new EmployeeDetailPage();

        employeeProfile.selectEmployeeEmptAttachment.click();

        Assert.assertTrue(employeeDetailPage.attachmentButton.isDisplayed());

    }
}
