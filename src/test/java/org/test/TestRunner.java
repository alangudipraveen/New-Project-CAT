package org.test;


import org.BaseClass.ReportingClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\prave\\eclipse-workspace\\Project5\\src\\test\\resources\\log.feature"},
glue = "org.stepdef",
monochrome = true,
tags = {"@Task"},
plugin = {"pretty","html:C:\\Users\\prave\\eclipse-workspace\\Project5\\target\\cucumber-report.html",
		            "json:C:\\Users\\prave\\eclipse-workspace\\Project5\\target\\cucumber-report1.json"})
public class TestRunner {

	
	@AfterClass
	public static void afterclass() {
		ReportingClass.generatingJVMReport("C:\\\\Users\\\\prave\\\\eclipse-workspace\\\\Project5\\\\target\\\\cucumber-report1.json");

	}
	
	
	
}
