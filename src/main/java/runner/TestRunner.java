package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		         features="C:\\Users\\HP\\eclipse-workspace\\CucumberBDDFramework\\src\\main\\java\\Features\\signup_page.feature",//the path of feature file
                 glue= {"stepDefination"},// the path of step defination
                 plugin= {"pretty","html:src/target/cucumber.html"},
                 monochrome=true,//display the output in readable format
                 dryRun =false
//                 strict =true
		         )

public class TestRunner {

}
