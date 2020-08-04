package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "E:\\workspace2\\CucumberProject(Java)\\src\\Features\\Taghooks.feature",
 glue={"stepDefinitions"},
 format={"pretty","html:test_output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
 monochrome=true,
 strict=true,
 dryRun=false
 //tags={"~@SmokeTest","~@RegressionTest","~@End2End"}
 
 
 )

public class TestRun {

}
