package com.Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features"
        , glue = {"com.StepDefinition", "com.Hooks"}
        , tags = "@SmokeTest or @RegressionTest"
        , monochrome = true

        , plugin = {"pretty", "html:target/HTML_Reports/report.html"
                    , "pretty", "json:target/JSON_Reports/report.json"
                    , "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                    }
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
