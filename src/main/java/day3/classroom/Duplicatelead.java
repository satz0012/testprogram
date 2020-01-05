package day3.classroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Duplicatelead {
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
Thread.sleep(3000);
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElementByXPath("//a[text()='satz@gmail.com']").click();

Thread.sleep(3000);
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebElement elesource = driver.findElementByXPath("//input[@id='subject']");
elesource.sendKeys("support",Keys.TAB);
Thread.sleep(3000);
driver.findElementByLinkText("Leads").click();		
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElementByXPath("//a[text()='Find Leads']").click();

WebElement firstname = driver.findElementByXPath("(//a[@class='linktext'])[6]");
String firstresult = firstname.getText();
System.out.println("First Resulting lead" +firstresult);
Thread.sleep(3000);

firstname.click();
Thread.sleep(3000);
driver.findElementByXPath("(//a[@class='subMenuButton'])[1]").click();
Thread.sleep(3000);
String title = driver.getTitle();
System.out.println("The title of the page is" +title);

driver.findElementByXPath("(//input[@name='primaryEmail'])[4]").sendKeys("koush1@gmail.com");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElementByXPath("//input[@value='Create Lead']").click();
Thread.sleep(3000);
WebElement dupdata = driver.findElementById("viewLead_firstName_sp");
String texts = dupdata.getText();
if(texts.equals(firstresult))
{
	System.out.println("The duplicated name is a same as captured name");
	
}
else
{
	System.out.println("The duplicated name is not a same as captured name");
}
driver.close();

	}
}



