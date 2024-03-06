package Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "C:\\Users\\upend\\eclipse-workspace\\tutorialsninja\\src\\test\\java\\featurefiles"
		,glue = "stepdefinitions"
		,tags = "@All"
		,plugin = { "pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json"}
		,monochrome = true		
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	

}
