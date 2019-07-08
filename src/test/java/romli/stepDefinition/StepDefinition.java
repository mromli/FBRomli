package romli.stepDefinition;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import romli.eventConnector.ObjEvent;

public class StepDefinition extends ObjEvent{
	private Scenario myScenario;
	static Logger logger = Logger.getLogger(StepDefinition.class);
	@Before() 
	public void definedScenario(Scenario scenario) {
		myScenario = scenario;
	}
	
	@Given(".*?open.*?\"(.*?)\".*?browser$")
	public void openApps(String url){
		openBrowser(url);
	}
	
	@When(".*?input.*?\"(.*?)\" in \"(.*?)\".*?$")
	public void input(String value, String objectName){
		input(driver, value, objectName);
	}
	
	@When(".*?select.*?\"(.*?)\" in \"(.*?)\".*?$")
	public void select(String value, String objectName){
		input(driver, value, objectName);
	}
	
	@Given(".*?click.*?\"(.*?)\".*?$")
	public void click(String objectName) throws Exception {
		clickObject(objectName);
	}
	
	@After
	public void afterTest() throws Exception {
	
		logger.debug("After Hook ...............................................");

		if (myScenario.isFailed()) {
			myScenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
			myScenario.write("Scenario Fail");
		} else {
			myScenario.write("Scenario Pass");
		}

		logger.debug("Quit Session ..............................................." + driver);

		Thread.sleep(5000);
		
//		driver.quit();
		
	}
}
