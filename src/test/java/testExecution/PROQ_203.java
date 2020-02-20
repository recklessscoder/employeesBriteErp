package testExecution;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeBadgesPage;
import pages.EmployeeDetailPage;
import pages.EmployeeTabPage;
import utilities.Reusable;

public class PROQ_203 {

  // Navigate to Badges page under Employees page
   @Test
    public void employeeBadgesLink() {
      Reusable.login_nav_to_employee_tab();

      EmployeeBadgesPage employeeBadgesPage = new EmployeeBadgesPage();
      EmployeeTabPage employeeTabPage = new EmployeeTabPage();
      EmployeeDetailPage employeeDetailPage = new EmployeeDetailPage();
      employeeTabPage.badgesTab.click();
      Reusable.pause(3);

// 12 Employee Badges are displayed
      Assert.assertTrue(employeeBadgesPage.badge1.isDisplayed(), "Sorry, the badge is not displayed");
      Assert.assertTrue(employeeBadgesPage.badge2.isDisplayed(), "Sorry, the badge is not displayed");
      Assert.assertTrue(employeeBadgesPage.badge3.isDisplayed(), "Sorry, the badge is not displayed");
      Assert.assertTrue(employeeBadgesPage.badge4.isDisplayed(), "Sorry, the badge is not displayed");
      Assert.assertTrue(employeeBadgesPage.badge5.isDisplayed(), "Sorry, the badge is not displayed");
      Assert.assertTrue(employeeBadgesPage.badge6.isDisplayed(), "Sorry, the badge is not displayed");
      Assert.assertTrue(employeeBadgesPage.badge7.isDisplayed(), "Sorry, the badge is not displayed");
      Assert.assertTrue(employeeBadgesPage.badge8.isDisplayed(), "Sorry, the badge is not displayed");
      Assert.assertTrue(employeeBadgesPage.badge9.isDisplayed(), "Sorry, the badge is not displayed");
      Assert.assertTrue(employeeBadgesPage.badge10.isDisplayed(), "Sorry, the badge is not displayed");
      Assert.assertTrue(employeeBadgesPage.badge11.isDisplayed(), "Sorry, the badge is not displayed");
      Assert.assertTrue(employeeBadgesPage.badge12.isDisplayed(), "Sorry, the badge is not displayed");

      Reusable.pause(3);

      Reusable.return_to_employee_page();
   }
}
