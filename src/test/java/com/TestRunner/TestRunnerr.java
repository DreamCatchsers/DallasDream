package com.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.test.utill.TestBase;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Features"} , format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
glue = "StepDeff",
tags= {"@Today"})
public class TestRunnerr extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void setUP() {
		
		TestBase test = new TestBase();
		test.init();
	}
	
	@AfterTest
	public void close() {
		TestBase test = new TestBase();
		test.driver.quit();
		
	}

}
