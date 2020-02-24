package testExecution;

import org.testng.Assert;
import pages.EmployeeTabPage;
import utilities.Reusable;
import org.testng.annotations.Test;
import pages.EmployeeDetailPage;


public class PROQ_209 {


    @Test
    public void tc_209() {
        // user is on employee tab
        Reusable.login_nav_to_employee_tab();

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
        Assert.assertTrue(firstRelatedEmployeeNameText.equals(actualRelatedEmployeeHeaderName));
    }
}
