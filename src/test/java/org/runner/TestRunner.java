package org.runner;

import org.stepdefinition.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
                  glue="org.stepdefinition",
                  monochrome = true,
                  dryRun=false,
                  plugin = {"pretty", "html:src/test/resources\\Reports",
                  		              "json:src/test/resources\\Reports\\jsonReport.json",
                  		              "junit:src/test/resources\\Reports\\junitReport.xml",
                  		              "rerun:src\\test\\resources\\Reports\\FailedScenaions\\failedScenario.txt"})
                  
                  //tags= {"@smoke"}
public class TestRunner {
	
	@AfterClass
	public static void report() {
		
		JVMReport.generateJVMReport("src\\test\\resources\\Reports\\jsonReport.json");
		System.out.println("------Done------");
		
	}
	
	
	

}
