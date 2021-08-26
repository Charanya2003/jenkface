package org.stepdefinition;
		
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.remote.DesiredCapabilities;
		import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
        import java.net.URL;
		
		public class BrowserStack {
			
          public static WebDriver driver;
		  public static final String AUTOMATE_USERNAME = "charusubramanian_Sf5uco";
		  public static final String AUTOMATE_ACCESS_KEY = "ztrTsfsH5qLyj38wqfrm";
		  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
		  
		 public void launchbrowserstack() throws MalformedURLException {
			  
		    DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("os_version", "10");
		    caps.setCapability("resolution", "1920x1080");
		    caps.setCapability("browser", "Chrome");
		    caps.setCapability("browser_version", "latest-beta");
		    caps.setCapability("os", "Windows");
		    caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
		    caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
		     driver = new RemoteWebDriver(new URL(URL), caps);
		     WebDriverWait wait = new WebDriverWait(driver, 5);
		 }    
		    
		}

