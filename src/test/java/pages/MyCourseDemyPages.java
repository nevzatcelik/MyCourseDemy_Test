package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCourseDemyPages {

  public  MyCourseDemyPages(){
      PageFactory.initElements(Driver.getDriver(),this);
    }


}
