package week4.project;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zoom {
	
		private static Arrays collections;

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");

			// Set the property for ChromeDriver

			// Initiate the ChromeBroswer\'//; 
			ChromeDriver driver=new ChromeDriver();
			// Maximize the browser
	driver.get("https://www.zoomcar.com/chennai/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElementByXPath("//a[text()='Start your wonderful journey']").click();
	Thread.sleep(500);
	driver.findElementByXPath("/html/body/div/div/div[2]/div[1]/div[2]/div[4]/div/div[4]").click();
	driver.findElementByXPath("//button[text()='Next']").click();
	
Date date = new Date();
DateFormat sdf = new SimpleDateFormat("dd");
String today = sdf.format(date);
int tomorrow = Integer.parseInt(today)+1;
System.out.println("Tomorrow date is "+tomorrow);
Thread.sleep(5000);
driver.findElementByXPath("//div[contains(text(),'"+tomorrow+"')]").click();//concatenation
Thread.sleep(5000);
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElementByXPath("//button[text()='Next']").click();
WebElement txt = driver.findElementByXPath("//div[@class='text'][1]");
String text1 = txt.getText();
System.out.println(text1);
driver.findElementByXPath("//button[text()='Done']").click();

WebElement cars = driver.findElementByXPath("//div[@class='car-list-layout']");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
List<WebElement> carslist = cars.findElements(By.className("price"));
int size = carslist.size();
System.out.println("The total number of results: " +size);


List<Integer> output=new ArrayList<>();
for (WebElement eachweb : carslist) {
	String text = eachweb.getText();
	String result =text.replaceAll("\\D","");
	int resultvalue=Integer.parseInt(result);//Converting string to int so that we can sort using arithmetic operator
	output.add(resultvalue);
	
	
}
List<Integer> outputs=new ArrayList<>(output);// creating another list using the using the list output
Collections.sort(outputs);
Collections.reverse(outputs);
System.out.println("Sorted list :"+output);
int largeval = outputs.get(0);// the new list is created to get the highest value
int indexn = output.indexOf(largeval);//to get the index of the largest value. so we use the old list
System.out.println("The highest price list is:"+largeval);

driver.findElementByXPath("(//button[text()='BOOK NOW'])["+indexn+"]").click(); 


Thread.sleep(3000);
driver.close();

//List<String> browsers = new ArrayList<>();


	
	
	
	
	

}
}
