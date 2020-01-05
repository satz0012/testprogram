package testNgannotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;



public class ProjectSpecificMethods {
	public ChromeDriver driver;
	@BeforeMethod
	@Parameters({"url","username","password"})
	public void login(String ul,String uname,String pswd)
	{
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(ul);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElementById("username").sendKeys(uname);
	driver.findElementById("password").sendKeys(pswd);
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
}
	@AfterMethod
	public void logout()
	{
		driver.close();	
	}


}
