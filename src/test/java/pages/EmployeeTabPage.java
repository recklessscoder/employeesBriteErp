package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EmployeeTabPage {

    public EmployeeTabPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "o_searchview_input")
    public WebElement searchBox;

    @FindBy(xpath = "(//span[@class = 'oe_menu_text'])[17]")
    public WebElement sideBarEmployeeButton;

    @FindBy(xpath = "(//*[contains(text(),'Badges')])[2]")
    public WebElement getSideBarBadgesButton;

    @FindBy (xpath = "//div[@class = 'oe_kanban_global_click o_kanban_record'][1]")
    public WebElement employeeProfileKanban;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[7]/ul/li/a/span")
    public  WebElement badges;

    @FindBy(xpath = "//button[@class=\"btn btn-icon fa fa-lg fa-th-large o_cp_switch_kanban active\"]")
    public WebElement gridButton;

    @FindBy(xpath = "//button[@class=\"btn btn-icon fa fa-lg fa-list-ul o_cp_switch_list\"]")
    public WebElement listButton;

}

