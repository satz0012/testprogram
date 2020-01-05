package cucumber1;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class LearnHooks {
	@Before
	public void preScenario(Scenario sc) {
		System.out.println("Test Name: "+sc.getName());
		System.out.println("Test line number: "+sc.getId());
		System.out.println("Test status: "+sc.getStatus());

	}
	
	@After
	public void postScenario(Scenario sc) {
		System.out.println("Test status: "+sc.getStatus());
	}
	
	
	
	
	
	

}
