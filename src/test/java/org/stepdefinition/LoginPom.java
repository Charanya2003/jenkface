package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom extends BaseClassFb {
	
public LoginPom() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (id = "email") private WebElement ema;
	
	public WebElement ema() {
		return ema;
	}
	
@FindBy (id = "pass") private WebElement pass;
	
	public WebElement pass() {
		return pass;
	}
	
@FindBy (xpath = "//button[@name='login']") private WebElement login;
	
	public WebElement login() {
		return login;
	}

}
