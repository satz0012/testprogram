package week7.classroom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waittime {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//To open a Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		//Loading a url
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//h5[text()='Wait for Text Change']").click();
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Click ME!']"))).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String text1 = alert.getText();
		System.out.println(text1);
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
		driver.close();
}
}

