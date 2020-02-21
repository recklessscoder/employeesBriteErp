package testExecution;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeDetailPage;
import pages.EmployeePage;
import pages.EmployeeTabPage;
import utilities.Reusable;

public class PROQ_196 {
//    Add Employees module to Dashboard, name it by any name and have it present in Dashboard
EmployeePage employeePage=new EmployeePage();

    @Test
    public void  tc196(){
        Reusable.login_nav_to_employee_tab();

        // click on Search box
        employeePage.search.click();

        // click on Favorites button
        employeePage.favoriteBox.click();

        // adding to Dashboard
        employeePage.addDashboard.click();

        // clearing default name
        employeePage.employeeBox.clear();

        Reusable.pause(2);

        // setting the name
        String nameForEmployeeTab= "pumbik";
        employeePage.employeeBox.sendKeys(nameForEmployeeTab+ Keys.ENTER);

        // adding to Dashboard
        employeePage.addEmployee.click();

        // verifying pop-up window
        Assert.assertTrue(employeePage.addEmployee.isEnabled(),"pumbik is displayed");

        //navigating to Dashboard
        employeePage.dashboardTab.click();

        // verifying name is displayed for added Employee module
        Assert.assertTrue(employeePage.nameOfEmployeeModuleOnDashboard.getText().equals(nameForEmployeeTab));
        



    }
}

//Assert.assertTrue(loginPage.errorMessage.isDisplayed(), "Error message is NOT displayed!");