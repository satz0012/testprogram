package day3.classroom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadWithSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");

		// Set the property for ChromeDriver

		// Initiate the ChromeBroswer\'//; 
		ChromeDriver driver=new ChromeDriver();
		// Maximize the browser
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();

		// Enter the UserName
driver.findElementById("username").sendKeys("DemoSalesManager");
driver.findElementById("password").sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();
		// Enter the Password

		// Click on Login Button

		// Click on crm/sfa button
driver.findElementByLinkText("CRM/SFA").click();
		// Click on Leads
driver.findElementByLinkText("Leads").click();
Thread.sleep(3000);
		// Click on Create Lead button
driver.findElementByXPath("//a[text()='Create Lead']").click();
		// Enter Company Name
driver.findElementById("createLeadForm_companyName").sendKeys("FIS");
		// Enter First Name
driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("satish");
		// Enter Last Name
driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("satz");
driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("770855");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElementByXPath("(//input[@name='primaryEmail'])[4]").sendKeys("satz@gmail.com");
		// Select 'Source' as 'Other' (Handling DropDown)

WebElement dropdown = driver.findElementById("createLeadForm_dataSourceId");
Select fs=new Select(dropdown);
fs.selectByIndex(3);
		// Select 'Preferred Currency' as 'INR'
WebElement drdw = driver.findElementById("createLeadForm_currencyUomId");
Select fa=new Select(drdw);
fa.selectByVisibleText("INR - Indian Rupee");
		// Click on Create Lead (Submit) button
driver.findElementByXPath("//input[@value='Create Lead']").click();

		// Verify the Lead is created by checking the Company or First Name


driver.close();
	}

}
