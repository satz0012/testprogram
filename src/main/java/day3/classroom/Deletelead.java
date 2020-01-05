package day3.classroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deletelead {
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
driver.findElementByXPath("//a[text()='Find Leads']").click();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
WebElement firstname = driver.findElementByXPath("(//a[@class='linktext'])[6]");
String firstresult = firstname.getText();
System.out.println("First Resulting lead" +firstresult);
firstname.click();
driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
Thread.sleep(2000);
driver.findElementByXPath("//a[text()='Find Leads']").click();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(firstresult);
Thread.sleep(1000);
driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
//WebElement Norecord = driver.findElementByXPath("//div[text()='No records to display']");
//String text = Norecord.getText();

driver.close();
}
}