package hellocucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/itsFriday", glue="stepDefinitions2", plugin = {"pretty"})
public class RunCucumberTest2 {
}
