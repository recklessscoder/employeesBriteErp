package testExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeDetailPage;
import pages.EmployeeTabPage;
import pages.TimesheetPage;
import utilities.Driver;
import utilities.Reusable;

public class PROQ_204 {

    @Test
    public void tc204(){
        Reusable.login_nav_to_employee_tab();

        EmployeeTabPage employeeTabPage = new EmployeeTabPage();
        EmployeeDetailPage employeeDetailPage = new EmployeeDetailPage();
        TimesheetPage timesheetPage = new TimesheetPage();
        // click first employee tab
        employeeTabPage.employeeProfileKanban.click();

        // click timesheet button
//        employeeDetailPage.timesheetButton.click();

        //click on create button
        timesheetPage.createButton.click();

        //type 1 of the employee
        timesheetPage.employeeDropDownButton.sendKeys("Abuzer Kadayif");
        // fill up any message on description field
        timesheetPage.descriptionField.sendKeys("test");
        //choose internal - GAP Analysis
        timesheetPage.projectField.sendKeys("internal - GAP Analysis");
        //get "task" web element
        WebElement emptyField = Driver.getDriver().findElement(By.xpath("(//input[@class = 'o_input ui-autocomplete-input'])[3]") );
        //get the text
        String verify = emptyField.getText();

        Assert.assertTrue(verify.isEmpty());







    }
}
