package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features we use to provide the path of all the feature files
        features = "src/test/resources/features/",
        glue = "APISteps",
        //when we set dry run to true, it stops actual execution
        //it will quickly scan all the gherkin steps whether they are implemented or not
        //when we set dry run to false, it starts execution again
        dryRun = false,
        tags = "@apidynamic",
        //to remove irrelavant information from console, you need to set monochrome to true
        monochrome = true,
        //to generate the reports we need plugin of runner class
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json",
                //this failed.txt file holds all the scenarios which are failed during the execution
                "rerun:target/failed.txt"}
)
public class APIRunner {

}
