package week4.classroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testfram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");

		// Set the property for ChromeDriver

		// Initiate the ChromeBroswer\'//; 
		ChromeDriver driver=new ChromeDriver();
		// Maximize the browser
driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
driver.manage().window().maximize();
driver.switchTo().frame("iframeResult");// using id got the frame
driver.findElementByXPath("//button[text()='Try it']").click();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
Alert alert = driver.switchTo().alert();
alert.sendKeys("satish");
alert.accept();

WebElement text3 = driver.findElementByXPath("//p[text()='Hello satish! How are you today?']");
if (text3.getText().contains("09yth")){//get the text from webelement text3 and check the character "satish"
	System.out.println("This is my name");
	
}
else
{
	System.out.println("This is not my name");	
}





}
}
