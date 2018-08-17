package com.msStore;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ms.Base.DriverScript;
import com.ms.pages.HomePage;
import com.relevantcodes.extentreports.LogStatus;

public class TestHomePage extends TestBase {
	
	public TestHomePage()
	{
		super();//super is getting all the constructor from parent class 
		
	}
	
	@Test
	public void testHomePage()
	{
		Logger=report.startTest("Test Home Page");
		String title = mshp.verifyMyStoreHomePageTitle();
		Assert.assertEquals(title, "My Store","Title does not match");
		Logger.log(LogStatus.PASS , "My Store home page Title is verified");
		boolean logoflag = mshp.verifymsStoreLogo();
		Assert.assertTrue(logoflag);
		Logger.log(LogStatus.PASS, "My Store logo is displayed");
		Assert.assertTrue(mshp.verifyWomenTab(),"Women tab is not displayed");
		Logger.log(LogStatus.PASS, "Women tab is verified");
		Assert.assertTrue(mshp.VerifyDressesLink(),"dresses tab is not displayed");
		Logger.log(LogStatus.PASS, "Dresss tab is verified");
		Assert.assertTrue(mshp.verifyTshirtLink(),"tshirt tab is not displayed");
		Logger.log(LogStatus.PASS, "Tshirt tab is verified");
		Assert.assertTrue(mshp.verifySerchTB(),"sert text box is not diaplayed");
		Logger.log(LogStatus.PASS, "Search text box is verified");
		
	}
}
