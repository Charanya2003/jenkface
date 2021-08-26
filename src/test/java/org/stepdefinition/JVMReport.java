package org.stepdefinition;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport extends BaseClassFb {
	
	public static void generateJVMReport(String json) {
		
		File f1 = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReports");
		
		//configuration
		
		Configuration con = new Configuration(f1, "Facebook");
		con.addClassifications("BrowserName", "Chrome");
		con.addClassifications("Browser Version", "91");
		con.addClassifications("OS", "Windows");
		con.addClassifications("Sprint", "21");
		
		//Report Builder
		
		List<String> jsonFiles = new LinkedList<String>();
		jsonFiles.add(json);
		ReportBuilder r = new ReportBuilder(jsonFiles, con);
		r.generateReports();
		
		
	}
 

}
