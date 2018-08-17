package com.ms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ms.Base.DriverScript;

public class HomePage extends DriverScript {

	//1)identifying the object(POM MODEL)
	//adding the object,object repository or elements in this page or identifying the elements
	
	 @FindBy(xpath="//img[@class='logo img-responsive']")
	 private WebElement imglogo;
	 
	 @FindBy(linkText="Contact us")
	  private WebElement contactusLink;
	 
	 @FindBy(linkText="Women")
	 private WebElement womenTab;
	 
	 @FindBy(xpath=".//*[@id='block_top_menu']/ul/li[2]/a")
	 private WebElement DressesTab;
	 
	 @FindBy(xpath=".//*[@id='block_top_menu']/ul/li[3]/a")
	 private WebElement TshirtsTab;
	
	@FindBy(id="search_query_top")
	private WebElement searchTb;
	
	@FindBy(xpath="//a [@class='login' ]")
	private WebElement Signinbutton;
	 

	 
	 //2)initialize the element//inthis stage we call from the memories the method
	 public HomePage()
	 {
		 PageFactory.initElements(driver, this);//this is represt the current class 
		 
	 }
	 //3)Action on this page 
	 public boolean verifymsStoreLogo()
	 {
		 return imglogo.isDisplayed();
		 
		 
	 }
	 public String verifyMyStoreHomePageTitle()
	 {
		 return driver.getTitle();
		 
	 }
	 public boolean verifyWomenTab(){
		 return womenTab.isDisplayed();
	 }
	
	 public void clicktowomenlink()
	 {
		 womenTab.click();
	 
		 
	 }
	 public boolean  VerifyDressesLink()
	 {
		return DressesTab.isDisplayed();
	 }
	 
	 
	 public boolean verifyTshirtLink()
	 {
		 return TshirtsTab.isDisplayed();
	 }
	 public boolean verifySerchTB()
	 {
		return searchTb.isDisplayed();
	 }
	 
	public  void clickonSigninButton(){
		
		 Signinbutton.click();
	}
	
}
