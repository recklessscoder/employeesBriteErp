package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EmployeeBadgesPage {

    public EmployeeBadgesPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Locate 12  employee badges on Badges module under Employees tab

    @FindBy(xpath = "(//div[@class='o_kanban_gamification oe_kanban_global_click oe_kanban_color_white o_kanban_record'])[1]")
    public WebElement badge1;
    @FindBy(xpath = "(//div[@class='o_kanban_gamification oe_kanban_global_click oe_kanban_color_white o_kanban_record'])[2]")
    public WebElement badge2;
    @FindBy(xpath = "(//div[@class='o_kanban_gamification oe_kanban_global_click oe_kanban_color_white o_kanban_record'])[3]")
    public WebElement badge3;
    @FindBy(xpath = "(//div[@class='o_kanban_gamification oe_kanban_global_click oe_kanban_color_white o_kanban_record'])[4]")
    public WebElement badge4;
    @FindBy(xpath = "(//div[@class='o_kanban_gamification oe_kanban_global_click oe_kanban_color_white o_kanban_record'])[5]")
    public WebElement badge5;
    @FindBy(xpath = "(//div[@class='o_kanban_gamification oe_kanban_global_click oe_kanban_color_white o_kanban_record'])[6]")
    public WebElement badge6;
    @FindBy(xpath = "(//div[@class='o_kanban_gamification oe_kanban_global_click oe_kanban_color_white o_kanban_record'])[7]")
    public WebElement badge7;
    @FindBy(xpath = "(//div[@class='o_kanban_gamification oe_kanban_global_click oe_kanban_color_white o_kanban_record'])[8]")
    public WebElement badge8;
    @FindBy(xpath = "(//div[@class='o_kanban_gamification oe_kanban_global_click oe_kanban_color_white o_kanban_record'])[9]")
    public WebElement badge9;
    @FindBy(xpath = "(//div[@class='o_kanban_gamification oe_kanban_global_click oe_kanban_color_white o_kanban_record'])[10]")
    public WebElement badge10;
    @FindBy(xpath = "(//div[@class='o_kanban_gamification oe_kanban_global_click oe_kanban_color_white o_kanban_record'])[11]")
    public WebElement badge11;
    @FindBy(xpath = "(//div[@class='o_kanban_gamification oe_kanban_global_click oe_kanban_color_white o_kanban_record'])[12]")
    public WebElement badge12;

}
