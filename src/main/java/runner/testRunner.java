package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,features="Features\\parameter.feature",glue= {"stefdef"},plugin= {"html:target/cucumber.html"},tags={"@Smoke","~@Sanity"})
public class testRunner {

}
