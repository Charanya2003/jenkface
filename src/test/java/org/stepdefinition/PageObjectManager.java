package org.stepdefinition;

public class PageObjectManager {
	
	private PageObjectManager() {
		
	}
	
	private static PageObjectManager manager;
	private FbPom fbPom;
	private RegistrationPom registrationPom;
	
	
	public static PageObjectManager getManager() {
		return manager == null? manager = new PageObjectManager(): manager;
		
		
	}
	
	public FbPom getfbPom() {
		
		return fbPom == null? fbPom = new FbPom() : fbPom;
	}
	
    public RegistrationPom getregistrationPom() {
		
		return registrationPom == null? registrationPom = new RegistrationPom() : registrationPom;
	}

}
