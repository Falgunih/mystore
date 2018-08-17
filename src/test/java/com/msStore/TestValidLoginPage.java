package com.msStore;

import org.testng.annotations.Test;

public class TestValidLoginPage extends TestBase

{
	public TestValidLoginPage(){
		super();
	}
	
@Test
public void validationLoginPage() {

	mshp.clickonSigninButton();
	//LP.validatesignin();
	
}
@Test
public void validationLoginPage1(){
	mshp.clickonSigninButton();
	//LP.validatesignin2("Username", "Password");
	LP.validatesignin2(prop.getProperty("Username"), prop.getProperty("Password"));
}
}
