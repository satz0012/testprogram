package learndynamicdata;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week5.classroom.Exce;

//used testng1.xml

public class ProjectSpecificMethods {
	public ChromeDriver driver;
	public String excelFileName;
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

	@DataProvider
public String[][] getdata() throws IOException
{
//String[][] data=new String[2][3];
//data[0][0]="testleaf";
//data[0][1]="sam";
//data[0][2]="kuran";
//
//data[1][0]="testleaf";
//data[1][1]="ram";
//data[1][2]="kumar";
Exce data = new Exce();//getting the excel data
return data.exce(excelFileName);	
	
}
}
