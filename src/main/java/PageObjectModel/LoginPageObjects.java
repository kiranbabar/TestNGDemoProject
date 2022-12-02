package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
public WebDriver driver;
//this driver dont have scope ,there is need to give scope to this driver
//here we achieve encapsulation
private By username=By.xpath("//input[@id='username']");
private By password=By.xpath("//input[@id='password']");
private By LoginButton=By.xpath("//input[@id='Login']");
private By TryForFree=By.xpath("//a[@id='signup_link']");

public LoginPageObjects(WebDriver driver2) {
this.driver=driver2;
}

public WebElement EnterUsername() {
	
	return	driver.findElement(username);
	
}

public WebElement EnterPassword() {
	return driver.findElement(password);
}


public WebElement ClickLoginButton() {
	return driver.findElement(LoginButton);
}

public WebElement ClickTryforFree() {
	return driver.findElement(TryForFree);
}


}
