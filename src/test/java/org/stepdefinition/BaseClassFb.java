package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassFb {
	
	public static WebDriver driver;
	public static String gettext;
	public static String text;
	
	public static void launchBrow() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
	}
	
	public static void launchrl(String url)  {
		
		driver.get(url);
	}
	
	public static void fillText(WebElement e, String Value) {
		
		e.sendKeys(Value);
	}
	
   public static void btnClik(WebElement e) {
		
		e.click();
   }
   
   public static void browserquit() {
	   
	   driver.quit();
   }

}
