package com.juaracoding.pageobject.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
				features = "src/test/resources/features/01.Login.feature",
				glue = "com.juaracoding.pageobject.step_definitions",
				plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
