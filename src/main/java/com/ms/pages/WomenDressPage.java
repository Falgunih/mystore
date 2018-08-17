package com.ms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ms.Base.DriverScript;

public class WomenDressPage extends DriverScript {
	
//identification	
	@FindBy(xpath=".//*[@id='categories_block_left']/div/ul/li[1]/a")
	private WebElement womendress;
	
//initialization
	public WomenDressPage()
	{
		PageFactory.initElements(driver, this);
	}
//Action
	public   void clicktoToptab()
	
	{
		 womendress.click();
		
	}
	
	
}
