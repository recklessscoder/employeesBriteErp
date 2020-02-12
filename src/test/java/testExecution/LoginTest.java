package testExecution;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.*;

public class LoginTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void loginTest(){

        Util.login_nav_to_employee_tab();
    }
}
