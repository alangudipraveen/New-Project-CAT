package org.BaseClass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class ReportingClass extends BaseClass{

	public static void generatingJVMReport(String json) {
		File file= new File("C:\\Users\\prave\\eclipse-workspace\\Project5\\target");
		Configuration config = new Configuration(file,"Project5");
		config.addClassifications("platform","win-11");
		config.addClassifications("Browser","chrome");
		
		List<String> l= new ArrayList<String>();
		l.add(json);
		ReportBuilder builder= new ReportBuilder(l, config);
		builder.generateReports();

	}
}
