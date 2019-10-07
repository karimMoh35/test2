package Runner;

import cucumber.api.CucumberOptions;
import tests.TestBase;





@ CucumberOptions(features = "src/test/java/Features"                      // read the path of the feature file
, glue= {"Steps"}                                                       // read the steps file 
, plugin= {"pretty", "html:target/cucumber-html-report"})    
// control output report design in xml (nice design )
public class TestRunner extends TestBase
{
	

}
