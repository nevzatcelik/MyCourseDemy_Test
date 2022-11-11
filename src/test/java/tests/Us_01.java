package tests;

import utilities.ConfigReader;
import utilities.Driver;
import org.testng.annotations.Test;

public class Us_01 {

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

    }

}
