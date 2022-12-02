package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v107.runtime.model.WebDriverValue;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public WebDriver driver;
public Properties prop;
public WebDriver browserLaunch() throws IOException {
		//this will help us to read data.properties file
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
	//this will help to access the data.properties file
	 prop=new Properties();
	
	prop.load(fis);
	
	 String browserName=prop.getProperty("browser");
	if(browserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();//this will run with latest chrome browser in your system
	    //WebDriverManager.chromeDriver.version("103.1.0").setup(); //this will run with any other chrome version
		
		driver =new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox")) {
		//firefoxcode
	}
	else if(browserName.equalsIgnoreCase("Edge")) {
		//Edgecode
	}
	else {
		System.out.println("please select valid browser");  
	}
	return driver;
	}
	@BeforeMethod
	public void launchBrowser() throws IOException {
		browserLaunch();
	    //this driver has scope
		driver.get(prop.getProperty("url"));

	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}

