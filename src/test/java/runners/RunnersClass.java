package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

     //features = "src/test/resources/features/login.feature",
     features = "src/test/resources/features/",

     glue = "steps",
     dryRun = true,
     //dryRun = false,
     tags = "@smoke1"
)

public class RunnersClass {

}
