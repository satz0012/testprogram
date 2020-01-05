package day3.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editlead {
	
	

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
	Thread.sleep(1000);
	driver.findElementByClassName("decorativeSubmit").click();
	Thread.sleep(1000);
	driver.findElementByLinkText("CRM/SFA").click();
	Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElementByLinkText("Leads").click();
	Thread.sleep(1000);
	driver.findElementByXPath("//a[text()='Find Leads']").click();
	Thread.sleep(3000);
	
	driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("satish");
	Thread.sleep(1000);
	driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElementByXPath("//a[text()='satish']").click();
	
	String title = driver.getTitle();
	System.out.println(title);
	Thread.sleep(2000);
	driver.findElementByXPath("(//a[@class='subMenuButton'])[3]").click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.findElementById("updateLeadForm_companyName").clear();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElementById("updateLeadForm_companyName").sendKeys("FIS GLOBAL");
	Thread.sleep(3000);
	driver.findElementByXPath("(//input[@class='smallSubmit'])[1]").click();
	
	WebElement validation = driver.findElementById("viewLead_companyName_sp");
	String text = validation.getText();
	String texts="FIS GLOBAL (10052)";
	if(text.equals(texts))
	{
		System.out.println("Validation of update is successfull");
	}
	else
	{
		System.out.println("Validation failure");
	}
	
	
	
	Thread.sleep(5000);
	driver.close();
	
	

}
}
