package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "src//test//resources//taggedFeatures//",
		glue = {"stepDefs"},
		monochrome = true,
//		tags = "@RegressionTest and @SmokeTest"
//		tags = "@SmokeTest and not @RegressionTest"
		tags = "@PhaseOne"
//		tags = "@PhaseTwo and (@RegressionTest and not @SmokeTest)"
		)

public class CRMRunner {

}
