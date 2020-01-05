package week4.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");

		// Set the property for ChromeDriver

		// Initiate the ChromeBroswer\'//; 
		ChromeDriver driver=new ChromeDriver();
		// Maximize the browser
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
Thread.sleep(1000);

driver.findElementByXPath("//input[@id='twotabsearchtextbox']").sendKeys("oneplus 7 pro mobiles");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElementByXPath("(//input[@class='nav-input'])[1]").click();
WebElement mobiles = driver.findElementByXPath("//div[@class='sg-col-20-of-24 sg-col-28-of-32 sg-col-16-of-20 sg-col s-right-column sg-col-32-of-36 sg-col-8-of-12 sg-col-12-of-16 sg-col-24-of-28']");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
List<WebElement> oneplus = mobiles.findElements(By.className("a-price-whole"));

List<Integer> output=new ArrayList<>();
for (WebElement eachElement : oneplus) {
	String price = eachElement.getText();
	
	String result =price.replaceAll("\\D","");
	int resultvalue=Integer.parseInt(result);//Converting string to int so that we can sort using arithmetic operator
	output.add(resultvalue);
		
}
Integer firstprice = output.get(0);
System.out.println("The price of the first resulting mobile is "+firstprice);
driver.findElementByXPath("//div[@class='a-section aok-relative s-image-fixed-height']").click();
Set<String> windowHandles = driver.getWindowHandles();
List<String> browsers = new ArrayList<>(windowHandles);
String newwindow = browsers.get(1);
WebDriver mobile = driver.switchTo().window(newwindow);
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.manage().window().maximize();
System.out.println(mobile.getTitle());

WebElement customerrating = driver.findElementById("acrCustomerReviewText");
String ratingslist = customerrating.getText();
System.out.println("The number of customer ratings is: "+ratingslist);
Thread.sleep(3000);
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElementById("add-to-cart-button").click();
Thread.sleep(3000);
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
String confirmmsg = driver.findElementById("huc-v2-order-row-messages").getText();
System.out.println("Validating the confirm msg:" +confirmmsg);
String msg="Added to Cart";
if(confirmmsg.equals(msg))
{
	System.out.println("The product is added to the cart");
	
}
else
{
	System.out.println("The product is not added to the cart");
}

driver.findElementByXPath("//a[@id='hlb-ptc-btn-native']").click();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
Thread.sleep(3000);
System.out.println(mobile.getTitle());
Thread.sleep(3000);
driver.findElementByXPath("//input[@id='continue']").click();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
String errorv = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
String errorcon="Enter your email or mobile phone number";
Thread.sleep(3000);
if(errorv.contentEquals(errorcon))
{
	System.out.println("The user should enter email or mobile phone number to login");
}
else
{
	System.out.println("No error message,User can login");
}
driver.quit();
}
}
