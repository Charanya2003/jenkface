package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\Reports\\FailedScenaions\\failedScenario.txt",
                 glue="org.stepdefinition")
public class TestRerunner {

}
