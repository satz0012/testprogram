package learndynamicdata;
//used testmg.xml

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods {
	@BeforeClass
	public void setDate()
	{
		excelFileName ="createLead";
	
	}
@Test(dataProvider="getdata")
	public  void rubCreatelead(String cname,String fname,String lname) {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		driver.findElementByName("submitButton").click();
		
}
}






