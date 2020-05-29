package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/htmlreport",
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@getcellvalue",
        dryRun = false
)

public class runner {
}
