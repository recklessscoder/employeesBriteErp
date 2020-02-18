package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;
import utilities.Reusable;

import java.util.List;

public class EmployeeFollowPage {
    public WebDriverWait wait;
    public int following;


    public EmployeeFollowPage(){
        PageFactory.initElements(Driver.getDriver(), this);
        wait = new WebDriverWait(Driver.getDriver(), 10);
        following = unFollowButton.size();

    }

    @FindBy(xpath = "//span[@class=\"o_following\"]")
    public List<WebElement> unFollowButton;

    @FindBy(css = ".oe_kanban_global_click.o_kanban_record")
    public List<WebElement> employees;

    @FindBy (xpath = "//button[@class=\"o_follow_btn o_follow btn btn-sm btn-primary oe_kanban_action oe_kanban_action_button\"]")
     public List<WebElement> followButton;

    String employeeNameCss = "strong:nth-child(2)";
    String buttonCss = "button";

    public String getName(int i){
        return employees.get(i).findElement(By.cssSelector(employeeNameCss)).getText();
    }


    public void follow(String name){
        for(int i = 0; i < employees.size(); i++){
            if(employees.get(i).findElement(By.cssSelector(employeeNameCss)).getText().equalsIgnoreCase(name)){
                if(employees.get(i).findElement(By.cssSelector(buttonCss)).getText().contains("Follow")){
                   follow(i);
                }
            }
        }
    }

    public String follow(int i){
        if(!employees.get(i).findElement(By.cssSelector(buttonCss)).getText().contains("Follow")) return null;
        employees.get(i).findElement(By.cssSelector(buttonCss)).click();
        following++;
        Reusable.pause(1);
        System.out.println("You followed " + getName(i));
        return employees.get(i).findElement(By.cssSelector(employeeNameCss)).getText();
    }

    public void unfollow(String name){
        for(int i = 0; i < employees.size(); i++) {
            if (employees.get(i).findElement(By.cssSelector(employeeNameCss)).getText().equalsIgnoreCase(name)) {
                unfollow(i);
            }
        }
    }

    public String unfollow(int i){
        if(!employees.get(i).findElement(By.cssSelector(buttonCss)).getText().contains("Following")) return null;

        employees.get(i).findElement(By.cssSelector(buttonCss)).click();
        Reusable.pause(1);
        wait.until(ExpectedConditions.textToBePresentInElement(employees.get(i).findElement(By.cssSelector("button")), "Follow"));
        following--;
        return getName(i);
    }

    public void unfollowAll(){
        for(int i = 0 ; i < employees.size(); i++) {
                if(unfollow(i) != null) System.out.println("You unfollowed " + getName(i));
            }
        }
        public void followAll(){
        for(int i =0; i<employees.size();i++){
            if(follow(i) != null)   System.out.println("You followed" +getName(i));

        }
        }
    }
