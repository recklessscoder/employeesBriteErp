package testExecution;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeDetailPage;
import pages.EmployeeTabPage;
import utilities.Reusable;

public class PROQ_247 {

    @Test
    public void tc247 () {
        // login in and nav to Employee tab
        Reusable.login_nav_to_employee_tab();

        EmployeeTabPage employeeTabPage =new EmployeeTabPage();
        EmployeeDetailPage employeeDetailPage = new EmployeeDetailPage();

        // opening EDP
        employeeTabPage.employeeProfileKanban.click();

        //verifying elements are present

        Assert.assertTrue(employeeDetailPage.workInformation_tab.isDisplayed(), "Work Information tab is NOT displayed");
        Assert.assertTrue(employeeDetailPage.contactInformation.isDisplayed(), "Contact Information is NOT displayed");
        Assert.assertTrue(employeeDetailPage.workAddress.isDisplayed(), "Work Address is NOT displayed");
        Assert.assertTrue(employeeDetailPage.workLocation.isDisplayed(), "Work Location is NOT displayed");
        Assert.assertTrue(employeeDetailPage.workEmail.isDisplayed(), "Work Email is NOT displayed");
        Assert.assertTrue(employeeDetailPage.workMobile.isDisplayed(), "Work Mobile is NOT displayed");
        Assert.assertTrue(employeeDetailPage.workPhone.isDisplayed(), "Work Phone is NOT displayed");
        Assert.assertTrue(employeeDetailPage.position.isDisplayed(), "Position tab is NOT displayed");
        Assert.assertTrue(employeeDetailPage.department.isDisplayed(), "Department is NOT displayed");
        Assert.assertTrue(employeeDetailPage.jobPosition.isDisplayed(), "Job Position is NOT displayed");
        Assert.assertTrue(employeeDetailPage.manager.isDisplayed(), "Manager is NOT displayed");
        Assert.assertTrue(employeeDetailPage.coach.isDisplayed(), "Coach is NOT displayed");
        Assert.assertTrue(employeeDetailPage.workingHours.isDisplayed(), "Working Hours is NOT displayed");

    }
}
