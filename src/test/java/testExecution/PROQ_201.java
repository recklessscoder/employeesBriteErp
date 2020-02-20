package testExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeGrantingPage;
import pages.EmployeeTabPage;
import utilities.Driver;
import utilities.Reusable;

public class PROQ_201 {

    @Test (priority = 1 )
    public void grandBadgesToTheEmployees() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 120);

        Reusable.login_nav_to_employee_tab();
        EmployeeTabPage employeeTabPage = new EmployeeTabPage();
        employeeTabPage.badges.click();
        EmployeeGrantingPage employeeGrantingPage = new EmployeeGrantingPage();//Reusable.pause(2);
        employeeGrantingPage.grantTo("good job", "snoop dog");
        employeeGrantingPage.grantTo("good job", "kristen bell");
        employeeGrantingPage.grantTo("problem solver","emma stone");


  }
}
