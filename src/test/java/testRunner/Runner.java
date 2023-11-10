package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = {"src\\test\\java\\features\\login.feature"},
		dryRun = !true,
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		glue = "Steps",
		plugin =  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		
		)
public class Runner extends AbstractTestNGCucumberTests {

}
