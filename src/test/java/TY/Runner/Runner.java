package TY.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/TY/Features", glue = "StepDefination", plugin = {
		"json:target/cucumberreport/cucumber.json" }, monochrome = true)
public class Runner {

}
