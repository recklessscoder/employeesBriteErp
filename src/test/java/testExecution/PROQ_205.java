package testExecution;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeDetailPage;
import pages.EmployeeTabPage;
import utilities.Reusable;

public class PROQ_205 {

    @Test
    public void tc_205 () {
        // logging in using re-usable class -- login_nav_to_employee_tab() method
        Reusable.login_nav_to_employee_tab();

        // clicking on an employee
        EmployeeTabPage employeeTabPage = new EmployeeTabPage();
        employeeTabPage.employeeProfileKanban.click();

        //checking if Organization chart is displayed
        EmployeeDetailPage employeeDetailPage = new EmployeeDetailPage();
        Assert.assertTrue(employeeDetailPage.organizationChart.isDisplayed(),
                "Organization Chart is NOT displayed!!");



}
}
