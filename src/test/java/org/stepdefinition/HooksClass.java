package org.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClassFb {
	
	@Before
	public void beforeScenario() {
		
		System.out.println("----Before Scenario----");
		launchBrow();
		launchrl("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	
	

@After
public void afterScenario(Scenario sc) throws IOException {
	
	System.out.println("----After Scenario----");
	boolean failed = sc.isFailed();
	if(failed) {
	TakesScreenshot tk = (TakesScreenshot)driver;
	/*File src = tk.getScreenshotAs(OutputType.FILE);
	String name = sc.getName();
	File des = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\Screenshots\\"+name+".png");
	FileUtils.copyFile(src, des);*/
	
	byte[] b = tk.getScreenshotAs(OutputType.BYTES);
	sc.embed(b, "image/png");
	}
	browserquit();
}

}


