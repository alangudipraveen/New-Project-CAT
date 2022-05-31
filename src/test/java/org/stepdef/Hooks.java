package org.stepdef;

import org.BaseClass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks extends BaseClass {

	@Before
	public void beforeExecution() {
		getDriver();
		maximize();
		implicitWait(30);
		geturl("https://admin-demo.nopcommerce.com/login");

	}
	@After
	public void afterExecution(Scenario s) {
		System.out.println("trail1");
		System.out.println("trail2");
		System.out.println("trail3");
		System.out.println("trail4");
		System.out.println("trail5");
		System.out.println("trail6");
		System.out.println("trail7");
		System.out.println("trail8");
		System.out.println("trail9");
		System.out.println("trail10");
		System.out.println("trail11");
		System.out.println("trail12");
		
		
		if (s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs,s.getName()+".png");	
		}
		close(); 
	}
}
