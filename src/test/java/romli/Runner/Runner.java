package romli.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "json:cucumber.json","html:result/cucumber-html-reports","pretty" }, 
		features = { "Features" },
	    tags = { "@Registration" },
		glue = { "romli.stepDefinition"},
		monochrome=true)

public class Runner {

}
