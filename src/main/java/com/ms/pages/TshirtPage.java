package com.ms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ms.Base.DriverScript;

public class TshirtPage extends DriverScript {
	@FindBy(xpath=".//*[@id='center_column']/ul/li/div/div[1]/div")
	private WebElement imagTshirtProduct;
	
	
	
	
	public TshirtPage(){
		PageFactory.initElements(driver, this);
	}
	public void clicktoqickview(){
		imagTshirtProduct.click();
		
		
	}

}
