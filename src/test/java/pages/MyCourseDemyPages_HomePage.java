package pages;

import utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class MyCourseDemyPages_HomePage {

  public MyCourseDemyPages_HomePage(){
      PageFactory.initElements(Driver.getDriver(),this);
    }


}
