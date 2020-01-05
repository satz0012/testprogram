package week3class2;


import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		    //Loading a url
		    driver.get("https://erail.in/");
		    driver.manage().window().maximize();
		    WebElement elesource = driver.findElementById("txtStationFrom");
		    elesource.clear();
		    elesource.sendKeys("MAS",Keys.TAB);
		    WebElement eledestiny = driver.findElementById("txtStationTo");
		    eledestiny.clear();
		    eledestiny.sendKeys("SBC",Keys.TAB);
		    Thread.sleep(3000);
		    driver.findElementById("chkSelectDateOnly").click();
		    WebElement eletable = driver
		    		.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		    List<WebElement> row = eletable.findElements(By.tagName("tr"));
		    
		    List <String> coldata1 = new ArrayList<String>();
		    for (int i = 0; i < row.size(); i++) {
		    	List<WebElement> coldata = row.get(i).findElements(By.tagName("td"));
		    	
		    	coldata1.add(coldata.get(1).getText());
		    	//System.out.println(coldata.get(1).getText());
		    	
				
			}
		    
		   System.out.println(coldata1);
		   Set<String> coldata2 = new HashSet<String>();
	}

}