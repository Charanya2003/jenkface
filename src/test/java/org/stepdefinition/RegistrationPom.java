package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPom extends BaseClassFb {
	
public RegistrationPom() {
		
		PageFactory.initElements(driver, this);
		
	}

@FindBy (xpath = "//a[contains(text(),'Create New')]") private WebElement createaccnt;

public WebElement createaccnt() {
	return createaccnt;
}


@FindBy (name = "firstname") private WebElement fname;

public WebElement fname() {
	return fname;
}

@FindBy (name = "lastname") private WebElement lname;

public WebElement lname() {
	return lname;
}

@FindBy (name = "websubmit") private WebElement signup;

public WebElement signup() {
	return signup;
}


	

}
