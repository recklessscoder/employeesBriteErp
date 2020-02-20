package testExecution;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeFollowPage;
import utilities.Reusable;

public class PROQ_207 {
    @Test
    public void follow_unfollow_AnyEmployee() {
        Reusable.login_nav_to_employee_tab();
        EmployeeFollowPage followPage = new EmployeeFollowPage();
        if (followPage.following > 0) followPage.unfollowAll();
        Assert.assertEquals(followPage.following, 0);
        Reusable.pause(3);
        followPage.followAll();
        Assert.assertEquals(followPage.following, 40, "Test is not passed, user is unable to follow other employees!");


    }
}
