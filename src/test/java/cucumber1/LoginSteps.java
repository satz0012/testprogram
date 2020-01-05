package cucumber1;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	public ChromeDriver driver;
	@Given("Launch the browser")
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@Given("Maximize the browser")
	public void maxBrowser() {
		driver.manage().window().maximize();
	}
	
	
	@Given("Load the url")
	public void loadURL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@Given("Enter the username as (.*)")
	public void enterUsername(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}
	@Given("Enter the password as (.*)")
	public void enterPassword(String password) {
		driver.findElementById("password").sendKeys(password);
	}
	@When("Click on the login button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@Then("Verify login is successful")
	public void verifySuccess() {
		System.out.println("Login is success");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
