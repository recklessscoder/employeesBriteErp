package testExecution;

import cucumber.api.java.an.E;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeDetailPage;
import utilities.Driver;
import utilities.Reusable;

public class PROQ_226 {

//EDP has no attachment files, shows no Attachment(s) web element (-)
    @Test
    public void tc226(){

        Reusable.login_nav_to_employee_tab();

        EmployeeDetailPage employeeDetailPage = new EmployeeDetailPage();

        // create web element of employee which has no attachment file on its EDP.
        WebElement emp_with_no_attachment_file = Driver.getDriver().findElement(By.xpath("//div[@class = 'oe_kanban_global_click o_kanban_record'][3]"));
        // click on employee tab
        emp_with_no_attachment_file.click();
        // check if attachment button is not displayed
        Assert.assertFalse(employeeDetailPage.attachmentButton.isDisplayed());

    }
}
