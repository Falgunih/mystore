package com.ms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ms.Base.DriverScript;

public class TopsPage extends DriverScript {
	
	@FindBy(xpath=".//*[@id='subcategories']/ul/li[1]/div[1]/a")
	private WebElement imgTshirt;
	
	public TopsPage(){
		
		PageFactory.initElements(driver, this);
	}
     public void clicktoTshirttab(){
    	 imgTshirt.click();
     }
}
