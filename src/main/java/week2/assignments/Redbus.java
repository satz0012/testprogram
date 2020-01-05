package week2.assignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");

		// Set the property for ChromeDriver

		// Initiate the ChromeBroswer\'//; 
		ChromeDriver driver=new ChromeDriver();
		// Maximize the browser
driver.get("https://www.redbus.in/");
driver.manage().window().maximize();
Thread.sleep(1000);
		// Enter the UserName
WebElement frmsource = driver.findElementById("src");
frmsource.clear();
frmsource.sendKeys("chennai");
Thread.sleep(1000);
frmsource.sendKeys(Keys.TAB);
WebElement tosource = driver.findElementById("dest");
tosource.clear();
tosource.sendKeys("bangalore");
Thread.sleep(1000);
frmsource.sendKeys(Keys.TAB);

driver.findElementByXPath("//label[text()='Onward Date']").click();
Thread.sleep(1000);
driver.findElementByXPath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[3]").click();
driver.findElementByXPath("//label[text()='Return Date']").click();
Thread.sleep(1000);
driver.findElementByXPath("/html/body/div[6]/table/tbody/tr[5]/td[6]").click();
Thread.sleep(1000);
driver.findElementById("search_btn").click();
Thread.sleep(1000);
driver.findElementByXPath("/html/body/section/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/ul[2]/li[4]/label[1]");







}
}
