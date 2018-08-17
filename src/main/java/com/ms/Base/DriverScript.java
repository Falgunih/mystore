
 package com.ms.Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class DriverScript {
	
	public static WebDriver driver;
	public static Properties prop;
	public static ExtentReports report;
	public static ExtentTest Logger;
	
	public DriverScript()
	{
		 
	try
	{
		 prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Framework\\com.msStore\\msConfguration\\config.properties");
		prop.load(fis);
		//we can write this way to avoid hard code to navigate
	}
		catch(Exception e)//try is follow by atleast  one catch and can be  multiple catch 
	{
			System.out.println("sorry no file found"+ e.getMessage());
			
		}
	}
	
	public static void init()
	{
	 String browser = prop.getProperty("Browser");
	 if (browser.equalsIgnoreCase("Firefox"))
	 {
		driver=new FirefoxDriver(); 
	 }
	 else if (browser.equalsIgnoreCase("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver","./msBrowser/chromedriver.exe");
		 driver=new ChromeDriver();
	 }
	 else if (browser.equalsIgnoreCase("ie"))
	 {
		 System.setProperty("webdriver.ie.driver", "./msBrowser/IEDriverServer.exe");
		 driver=new InternetExplorerDriver();
	 }
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.get(prop.getProperty("TURL"));
	}
	{
		
	}
		
	}


