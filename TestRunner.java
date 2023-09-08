package RunnerSteps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/FeatureSteps/search.feature",
        glue = "StepsForFeatureFile",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {
}


