package week4.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class winhand {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");

		// Set the property for ChromeDriver

		// Initiate the ChromeBroswer\'//; 
		ChromeDriver driver=new ChromeDriver();
		// Maximize the browser
driver.get("http://leafground.com/pages/Window.html");
driver.manage().window().maximize();
//click on "open mulitple windows"
driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
//Now handling multiple windows
Set<String> windowHandles = driver.getWindowHandles();
//Converting to list since set does'nt support get() method.
List<String> browsers = new ArrayList<>(windowHandles);
//printing the number of browsers
System.out.println("Total number of browsers is " +browsers.size());

//getting the last window 
String Thirdwindow=browsers.get(2);
//Switching to last window
driver.switchTo().window(Thirdwindow);
driver.manage().window().maximize();
//getting the title of the last window
String title=driver.getTitle();
System.out.println(title);
Thread.sleep(5000);
driver.quit();

	}
}
