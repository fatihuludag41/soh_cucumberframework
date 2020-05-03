package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        Path of the features folder
  features ="src/test/resources/features",
//  step definitions folder
  glue = "stepdefinitions"

)
public class Runner {
}
