package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"utility","StepDefinitions"},
        plugin = {
                "pretty",
                "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"
        },
        monochrome = true,
        publish = true
)
public class TestRunner {
}
