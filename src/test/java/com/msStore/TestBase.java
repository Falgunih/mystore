package com.msStore;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ms.Base.DriverScript;
import com.ms.pages.HomePage;
import com.ms.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;

public class TestBase extends DriverScript {
     HomePage mshp;
     LoginPage LP;
     
	@BeforeMethod
	public void preCondition()
	{
		report=new ExtentReports("./msReports/Automation.html",false);//true means every time the new file will be upload
		init();
		 mshp = new HomePage();
	     LP=new LoginPage();
	}
	
	@AfterMethod
	public void tearDown()
	{
		
		report.endTest(Logger);
		report.flush();
		driver.close();
	}
}
