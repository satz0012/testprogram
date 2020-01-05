package cucumber1;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/cucumber1/Login.feature",
				  glue="cucumber1",
				  monochrome=true
				  /*,
				  dryRun=true,
				  snippets=SnippetType.CAMELCASE*/
				  )
public class RunTest extends AbstractTestNGCucumberTests{

}
