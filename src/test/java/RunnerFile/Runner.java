package RunnerFile;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= "C:\\Users\\SathyaElangovan\\Desktop\\Selenium_Cucumber\\Feature\\Feature.Feature",
        glue="StepDefinition")

public class Runner {

}
