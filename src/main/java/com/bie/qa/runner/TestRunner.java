package com.bie.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;  // May need to import manually

@RunWith(Cucumber.class)   // Google Cucumber RunnerClass
@CucumberOptions(
		features = "C:\\Dev\\Eclipse\\BddBieAutomation\\src\\main\\java\\com\\bie\\qa\\features\\umbrella.feature"  // Path of Feature file
		,glue = {"com/bie/qa/stepDefinitions"}  // Path of Step Definition file
		,plugin = {"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}  // Output folder and HTML file.
		,monochrome = true  // Display the Console output in a proper readable format. Brackets and all will be gone.
		,strict = true // Will execute test case. If a step is not defined, it will show in console. 
		,dryRun = false // Just show the mapping. Won't execute. We can identify if some steps are not defined.
		)

public class TestRunner {

}
