package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;
import Resources.TestCaseData;
import Resources.commonUtilities;

public class VerifyLoginTestCase extends BaseClass {

//here we achieve inheritance	
	@Test
	public void login() throws IOException {
	
LoginPageObjects lpo=new LoginPageObjects(driver);
lpo.EnterUsername().sendKeys(TestCaseData.username);
lpo.EnterPassword().sendKeys(TestCaseData.password);
lpo.ClickLoginButton().click();
	
	String actualstring =driver.findElement(By.xpath("//div[@id='error']")).getText();
    String expectedstring=TestCaseData.expectedstring;
  commonUtilities.assserthandle(actualstring,expectedstring);
	
	}
	
	}

