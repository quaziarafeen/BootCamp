package cucumberrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepdefinition"},
        strict = true,
        monochrome = true,
        tags = {}

)

public class GoogleRunner extends AbstractTestNGCucumberTests {
}
