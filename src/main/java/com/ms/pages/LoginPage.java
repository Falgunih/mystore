package com.ms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ms.Base.DriverScript;

public class LoginPage extends DriverScript{
	
	@FindBy(id="email")
	private WebElement Emailaddtextbox;
	@FindBy(name="passwd")
	private WebElement passwordtextbox;
	@FindBy( id="SubmitLogin")
	private WebElement loginsigninbutton; 
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//public void validatesignin(){
		
		//Emailaddtextbox.sendKeys("dummytest@gmail.com");
		//passwordtextbox.sendKeys("pass@123");
		//loginsigninbutton.click();
	//}
public void validatesignin2(String Username,String Password){
		
		Emailaddtextbox.sendKeys("Username");
		passwordtextbox.sendKeys("Password");
		loginsigninbutton.click();
	}
}

