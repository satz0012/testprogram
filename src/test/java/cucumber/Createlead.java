package cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Createlead {
	@Before
public void prescenario(Scenario sc)
{
		System.out.println("testName:"+sc.getName());
		System.out.println("testline number:" +sc.getId());
		
}
	@After
	public void postscenario(Scenario sc)
	{
			System.out.println("teststatus:" +sc.getStatus()); 
		
			
	}
	ChromeDriver driver;
	@Given("Launch the browser")
	public void launchTheBrowser() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		
driver.get("http://leaftaps.com/opentaps/control/main");

	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("maximize the browser")
	public void maximizeTheBrowser() {
		driver.manage().window().maximize();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("Load the url")
	public void loadTheUrl() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("The URL will be loaded");
	    
	}

	@Given("Enter the username")
	public void enterTheUsername() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	    
	}

	@Given("Enter the password")
	public void enterThePassword() {
		driver.findElementById("password").sendKeys("crmsfa");
	    
	}

	@When("user clicks on the login button")
	public void userClicksOnTheLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	    
	}

	@Then("verify login is successfull")
	public void verifyLoginIsSuccessfull() {
	  System.out.println("The login is successfull");
	    
	}

	@When("user clicks on crm\\/sfa button")
	public void userClicksOnCrmSfaButton() {
		driver.findElementByLinkText("CRM/SFA").click();
	   
	}

	@When("user clicks on lead button")
	public void userClicksOnLeadButton() throws InterruptedException {
		driver.findElementByLinkText("Leads").click();
		Thread.sleep(3000);
	    
	}

	@When("user clicks on creadlead button")
	public void userClicksOnCreadleadButton() {
		driver.findElementByXPath("//a[text()='Create Lead']").click();
	    
	}

	@When("user enters the mandatory fields")
	public void userEntersTheMandatoryFields() {
		driver.findElementById("createLeadForm_companyName").sendKeys("FIS");
		// Enter First Name
driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("satish");
		// Enter Last Name
driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("satz");
driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("770855");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElementByXPath("(//input[@name='primaryEmail'])[4]").sendKeys("satz@gmail.com");
		// Select 'Source' as 'Other' (Handling DropDown)

WebElement dropdown = driver.findElementById("createLeadForm_dataSourceId");
Select fs=new Select(dropdown);
fs.selectByIndex(3);
		// Select 'Preferred Currency' as 'INR'
WebElement drdw = driver.findElementById("createLeadForm_currencyUomId");
Select fa=new Select(drdw);
fa.selectByVisibleText("INR - Indian Rupee");
	    
	}

	@When("user clicks on creadlead submit button")
	public void userClicksOnCreadleadSubmitButton() {
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		
	}
	@When("close the browser")
	public void closedthebrowser() {
		driver.close();
		
		
	}
	
}
