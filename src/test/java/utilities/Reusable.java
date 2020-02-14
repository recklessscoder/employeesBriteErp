package utilities;

import org.openqa.selenium.By;
import pages.LoginPage;

import java.util.Random;

public class Util {
    public static void login_nav_to_employee_tab(){

        LoginPage loginPage = new LoginPage();

        Driver.getDriver().get(Config.getProperty("briteUrl"));

        loginPage.usernameInput.sendKeys(Config.getProperty("managerUsername"));
        loginPage.passwordInput.sendKeys(Config.getProperty("managerPassword"));
        loginPage.loginButton.click();

        Pause.pause(2);
        Driver.getDriver().findElement(By.xpath("(//*[contains(text(),'Employees')])[1]")).click();


    }

    public static int randomEmployee(int maxEmployee){
        Random random = new Random();
        return random.nextInt(maxEmployee);
    }

    public static void pause (int seconds){

        try {
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
