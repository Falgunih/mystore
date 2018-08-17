package com.ms.Support;


import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ms.Base.DriverScript;

public class ExcelData extends DriverScript {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	FileInputStream fis;
	
	public ExcelData(String xlpath){
		try {
			File src= new File(xlpath);
			fis=new FileInputStream(src);
			wb =new	XSSFWorkbook(fis);
		} 
		catch (Exception e) {
			System.out.println("Filenot found"+ e.getMessage());
		
		}	
	}
		public int getrowNum(int sheetindex){
			int rows = wb.getSheetAt(sheetindex).getLastRowNum();
			rows=rows+1;
			return rows;
			
		}
        public String getCellData(int sheetNum,int row,int col ){
       
			
			sheet=wb.getSheetAt(sheetNum);
			
			String data = sheet.getRow(row).getCell(col).toString();
			
			return data;
			
        }
	}
