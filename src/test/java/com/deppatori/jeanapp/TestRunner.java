package com.deppatori.jeanapp;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty"},
        features = {"src/test/resources/jeanapp"}
)
public class TestRunner {
}
