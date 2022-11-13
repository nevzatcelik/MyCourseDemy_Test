package tests;

import pages.MyCourseDemyPages_HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import org.testng.annotations.Test;

public class Us_01 {

    @Test
    public void test01(){
        MyCourseDemyPages_HomePage myCourseDemyPages_homePage=new MyCourseDemyPages_HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));


    }

}
