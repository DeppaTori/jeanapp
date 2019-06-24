package com.deppatori.jeanapp;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "html:build/reports/cucumber" },
        glue = "com.deppatori.jeanapp",
        features = "jeanapp/"
)
public class AcceptanceTestsRunner {
}
