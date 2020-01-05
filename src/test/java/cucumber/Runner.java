package cucumber;

import cucumber.api.CucumberOptions;
//import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/cucumber/createlead.feature",glue="cucumber",monochrome=true/*,dryRun=true/*,snippets=SnippetType.CAMELCASE*/)
public class Runner extends AbstractTestNGCucumberTests {

}
