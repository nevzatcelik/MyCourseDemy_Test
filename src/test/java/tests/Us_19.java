package tests;

import org.testng.annotations.Test;
import pages.MyCourseDemyPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Us_19 {

    @Test
    public void US19test(){

        // go to the MycourseDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        MyCourseDemyPages myCourseDemyPages= new MyCourseDemyPages();
        myCourseDemyPages.loginLink.click();
        myCourseDemyPages.emailBox.sendKeys(ConfigReader.getProperty("FatihValidInstructorEmail2"));
        myCourseDemyPages.passwordBox.sendKeys(ConfigReader.getProperty("FatihValidInstructorPassword2"));
        ReusableMethods.bekle(2);
        myCourseDemyPages.cookies.click();
        ReusableMethods.bekle(2);
        myCourseDemyPages.loginButton.click();

        // Click to the Instructor link
        myCourseDemyPages.instructorLink.click();

        // Click to the Course Manager link
        myCourseDemyPages.courseManagerLink.click();

        // The functions of the Course manager page should work correctly //////////////////////////////////////
        // When the appropriate values are selected from the filter and the filter button is pressed,
        // the relevant course should appear in the list.
        myCourseDemyPages.categoriesLink.click();
        myCourseDemyPages.categoryChoosing.click();
        myCourseDemyPages.statusLink.click();
        myCourseDemyPages.statusChoosing.click();


    }
}
