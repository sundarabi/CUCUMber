package com.test;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\sundar\\cucumber-workspace\\CucumberJavaPro\\Feature\\login.feature", // Path to the feature file
    glue = "stepDefinition" // Path to the step definition package
)
public class TestRunner {
}
