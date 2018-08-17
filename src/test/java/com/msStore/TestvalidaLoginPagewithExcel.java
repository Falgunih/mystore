package com.msStore;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ms.Support.ExcelData;

public class TestvalidaLoginPagewithExcel extends TestBase 
{
	public TestvalidaLoginPagewithExcel()
	{
		super();
	}

 
 @Test(dataProvider="MSLogin")
 
	 public void Validlogin(String username,String password){
	 
	mshp.clickonSigninButton();
	   
	 	//LP.validatesignin2("Username", "Password");
	 	//LP.validatesignin2(prop.getProperty("Username"), prop.getProperty("Password"));
	 	LP.validatesignin2(username, password);
	 }
 @DataProvider(name= "MSLogin")
     public  Object[][]  mstestData()
      {
		ExcelData xldata = new ExcelData("C:\\Framework\\com.msStore\\msTestdata\\msdatasheet.xlsx");
		int row = xldata.getrowNum(0);
		 Object[] []obj = new Object[row] [2];
		for(int i=0;i<row;i++){
			 obj[i][0]=xldata.getCellData(0, i, 0);
			 obj[i][1]=xldata.getCellData(0, i, 1);
			 
		 }
		 return obj;
		
		
		
    	  
    	  

    	  
}
} 
