package pages;

import org.apache.commons.io.TaggedIOException;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;
import utilities.Reusable;

import java.util.List;

public class EmployeeGrantingPage {
    public WebDriverWait wait;

    public EmployeeGrantingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
        wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".o_kanban_view.o_kanban_badge.o_kanban_ungrouped .o_kanban_record")));
    }

    @FindBy(xpath = "//button[@name=\"action_grant_badge\"]")
    public  WebElement grantButton;

    @FindBy(css = "body > div.o_main > div.o_main_content > div.o_content > div > div > div > div:nth-child(1) > div.oe_kanban_details > div.o_kanban_button > button")
    public WebElement GoodJobGrant;

    String grantRecordsCss = ".o_kanban_view.o_kanban_badge.o_kanban_ungrouped .o_kanban_record";
    @FindBy(css = ".o_kanban_view.o_kanban_badge.o_kanban_ungrouped .o_kanban_record")
    List<WebElement> grantsRecords;

    String numOfBadgesCss = ".o_kanban_record div:nth-child(3) strong";

    @FindBy(css = "body > div.o_main > div.o_main_content > div.o_content > div > div > div > div:nth-child(2) > div.oe_kanban_details > div.o_kanban_button > button")
    public  WebElement ProblemSolverGrant;

    @FindBy (css =".o_group.o_inner_group input")
    public WebElement grantBadgeInputField;

    @FindBy(xpath = "//div[@name=\"employee_id\"]")
    public WebElement EmmaStone;

    @FindBy(css = "body > div.o_main > div.o_main_content > div.o_content > div > div > div > div:nth-child(3) > div.oe_kanban_details > div.o_kanban_button > button")
    public  WebElement BrilliantGrant;

    @FindBy(css = ".ui-menu-item")
    public List<WebElement> employeesFromDropDown;



    public void grantTo(String grant, String employee){

     int prevNumOfBadges = 0;
     for(WebElement el : grantsRecords) {
         if (el.getText().toLowerCase().contains(grant.toLowerCase())){
             el.findElement(By.tagName("button")).click();
             prevNumOfBadges =  Integer.valueOf(el.findElement(By.cssSelector(numOfBadgesCss)).getText());

         }
     }

     Reusable.waitForVisibility(grantBadgeInputField, 5);
     grantBadgeInputField.click();

     wait.until(ExpectedConditions.visibilityOfAllElements(employeesFromDropDown));

     for(WebElement el : employeesFromDropDown)
         if(el.getText().toLowerCase().contains(employee)) el.click();

     grantButton.click();
     Reusable.waitForVisibility(grantsRecords.get(0), 3);
     Driver.getDriver().navigate().refresh();

     int newNumOfBadges = 0;
     for(WebElement el : Driver.getDriver().findElements(By.cssSelector(grantRecordsCss))){
         if(el.getText().toLowerCase().contains(grant.toLowerCase())){
         wait.until(ExpectedConditions.textToBePresentInElement(el.findElement(By.cssSelector(numOfBadgesCss)), ""+(prevNumOfBadges+1)));
         newNumOfBadges = Integer.valueOf(el.findElement(By.cssSelector(numOfBadgesCss)).getText());
        }
     }

     Assert.assertEquals(prevNumOfBadges, newNumOfBadges-1);
    }


}
