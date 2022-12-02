package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class commonUtilities {
//this is common method                   //type             //parameter
public static void dropdownnhandle(WebElement dropdownxpath,int dropdownvalue) {
	Select s=new Select(dropdownxpath);
s.selectByIndex(dropdownvalue);
//s.selectByVisibleText( dropdownvalue);
}
public static void assserthandle(String expected,String actual) {
	SoftAssert assertion=new SoftAssert();
	assertion.assertEquals(expected,actual);
	
	assertion.assertAll();//this is mandatory line
}


}
