package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		/*features= "C:\\Users\\ammulu123\\Jan2020\\OrangeHRMBDDFramework\\src\\main\\java\\Features",*/
		 format = {"pretty", "html:target/Destination"} ,
		features="src\\main\\java\\Features\\login.feature",
		glue= {"stepDefinitions"},
		tags= "@test"
		)
public class TestRunner {

	
	
	
}

