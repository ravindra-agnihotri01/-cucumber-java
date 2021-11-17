package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/first.feature"},
        glue = "/steps",
        dryRun = false,
        tags = "@tagged1"
)
public class FirstRunner {
}
