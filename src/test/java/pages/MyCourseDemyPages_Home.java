package pages;

import utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class MyCourseDemyPages_Home {

  public MyCourseDemyPages_Home(){
      PageFactory.initElements(Driver.getDriver(),this);
    }


}
