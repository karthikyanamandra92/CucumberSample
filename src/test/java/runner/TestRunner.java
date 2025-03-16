package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/resources/features",
                    glue = "org.example.stepdefs",
                    plugin = {"pretty","html:target/cucumber-reports", "json:target/cucumber.json"},
//                    plugin = {"html:target/cucumber-reports"}, //, "pretty", "json:target/cucumber.json"
                    monochrome = true,
                    publish = true,
                    tags = "@Start")
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios(){
        return super.scenarios();
    }

}
