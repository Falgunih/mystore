package com.msStore;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ms.Base.DriverScript;
import com.ms.pages.FSTQuickViewPage;
import com.ms.pages.HomePage;
import com.ms.pages.TopsPage;
import com.ms.pages.TshirtPage;
import com.ms.pages.WomenDressPage;




public class TestAddProductToCart extends DriverScript {
	 	 HomePage hp;
	 	WomenDressPage wd;
	 	TopsPage tp;
	 	TshirtPage tshp;
	 	FSTQuickViewPage qv;
	 	
	public TestAddProductToCart()
	{
		super();
	}
	
@BeforeMethod
public void prerequisite(){
	init();
	 hp = new HomePage();
     wd = new WomenDressPage();
     tp = new TopsPage();
     tshp = new TshirtPage();
     qv = new  FSTQuickViewPage();
}

@Test
public void AddtoCarttest(){
	
	hp.clicktowomenlink();
	wd.clicktoToptab();
	tp.clicktoTshirttab();
	tshp.clicktoqickview();
	
	//qv.addtocartbutton();
}
@AfterMethod
public void tearout(){
	driver.close();
}

	
}

