package Run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/featurefiles" ,glue = {"stefdefs"}
		//format={"pretty","html:target/reports/test-report"},
		
		//tags= "@smokeTest"
)
public class RunCukesTest {



}
