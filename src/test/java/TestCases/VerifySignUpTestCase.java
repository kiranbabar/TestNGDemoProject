package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.BaseClass;
import Resources.TestCaseData;
import Resources.commonUtilities;

public class VerifySignUpTestCase extends BaseClass {
@Test
public void SignUp() throws IOException, InterruptedException {
	
	
	LoginPageObjects lpo=new LoginPageObjects(driver);
	lpo.ClickTryforFree().click();
    Thread.sleep(2000);
	SignUpPageObjects spo=new SignUpPageObjects(driver);
	spo.EnterFirstName().sendKeys(TestCaseData.FirstName);
	spo.EnterLastName().sendKeys(TestCaseData.LastName);
	spo.EnterWorkEmail().sendKeys(TestCaseData.WorkEmail);
	spo.EnterCompanyName().sendKeys(TestCaseData.CompanyName);
	spo.EnterPhone().sendKeys(TestCaseData.Phone);
	
	commonUtilities.dropdownnhandle(spo.SelectJobTitle(),1);
	commonUtilities.dropdownnhandle(spo.SelectEmployees(),1);
	commonUtilities.dropdownnhandle(spo.SelectCountry(),26);
	//System.out.println(driver.getTitle());
    String actualtitle=driver.getTitle();
	String expectedtitle=TestCaseData.expectedtitle;
	
	commonUtilities.assserthandle(actualtitle, expectedtitle);

}
 


}
