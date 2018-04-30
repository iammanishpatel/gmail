package com.qait.automation.Gmail_automation.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:target/Destination"},
		features={"src/feature/feature.feature"},
		glue = "com.qait.automation.Gmail_automation.stepdefination",
		monochrome = true
		)
public class Runner {

}
