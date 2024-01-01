package executor;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src\\test\\resources\\Ecommerce Product Ordering\\" }, 
		glue = { "stepdefinition","hooks"}, 
		plugin = { "pretty",
				"rerun:target/failedcases.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}
				
		)
public class Testexecutor {

}
