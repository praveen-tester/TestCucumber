package RunnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;







@RunWith(Cucumber.class)
@CucumberOptions(features=".//FeatureFiles/test1.feature",
                 glue={"Sd","Hooks"},
                 dryRun = false,
                 plugin = {"pretty","html:target/cucumber-reports"},
                 monochrome = true)
public class Runnerforlogin {
	
	
	
	

}
