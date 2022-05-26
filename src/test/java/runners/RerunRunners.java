package runners;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "@target/failed_script.txt",
		glue = {"stepDefs"}
		)
public class RerunRunners {

	
	}


