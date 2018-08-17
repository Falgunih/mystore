package com.ms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ms.Base.DriverScript;

public class FSTQuickViewPage  extends DriverScript{
	

	@FindBy(xpath=".//*[@id='add_to_cart']")
	private WebElement submit;
	
	
	public FSTQuickViewPage(){
		PageFactory.initElements(driver, this);
	}
	public void addtocartbutton(){
		driver.switchTo().frame(submit);
		submit.click();
		
		
		
	}
}
