package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import io.cucumber.java.en.*;

public class SigninSteps extends BaseClassFb {
	
	
	static PageObjectManager page = PageObjectManager.getManager();
	FbPom fp;
	RegistrationPom rp;
	LoginPom lp;
	
	@Given("The user should be in facebook page")
	public void the_user_should_be_in_facebook_page() {
	   }


	@When("The user has to fill username and password")
	public void the_user_has_to_fill_username_and_password() {
		
		
		fp = page.getfbPom();
		
	    fillText(fp.ema(),"charu");
	    fillText(fp.pass(),"123");
	}

	@When("Click the login button")
	public void click_the_login_button() {
	    
		btnClik(fp.login());
	}

	@Then("user should be in invalid page")
	public void user_should_be_in_invalid_page() {
	   
	//Assert.assertTrue(false);
	System.out.println("User in invalid page");
	}
	
	@When("The user has to fill firstname and lastname")
	public void the_user_has_to_fill_firstname_and_lastname() {
	    
		
		
		rp=page.getregistrationPom();
		btnClik(rp.createaccnt());
		fillText(rp.fname(),"charu");
		fillText(rp.lname(),"vijay");
	}

	@When("The user should click the signup button")
	public void the_user_should_click_the_signup_button() {
	
		btnClik(rp.signup());
	}
	
    @Then("The user successfully registered")
	public void the_user_successfully_registered() {
	    
	//Assert.assertTrue(true);
	System.out.println("User registered Successfully");
	
	
	}
	
	@When("The user has to fill username {string} and password {string}")
	public void the_user_has_to_fill_username_and_password(String user, String pass) {
		
		LoginPom lp = new LoginPom();
		fillText(lp.ema(),user);
	    fillText(lp.pass(),pass);
	    btnClik(lp.login());
	}

	

	@Then("user should be in invalid page again")
	public void user_should_be_in_invalid_page_again() {
	    System.out.println("User in Invalid Page");
	}
	
}
