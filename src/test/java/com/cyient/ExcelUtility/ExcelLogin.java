package com.cyient.ExcelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLogin {
		
			public  String excelusername(int a) throws IOException {
				  
				  FileInputStream fil = new FileInputStream(new File("src/test/resources/testdata/testdata.xlsx"));
				  XSSFWorkbook workbook = new XSSFWorkbook(fil);
				  XSSFSheet sheet=workbook.getSheet("Sheet1");
				  int count=sheet.getLastRowNum();
				  System.out.println(count);
				    
					  XSSFRow row =sheet.getRow(a);
					  XSSFCell cell=row.getCell(0);
					  String un=cell.getStringCellValue();
		
				return un;
		}
			public  String excelpassword(int b) throws IOException {
				  
				  FileInputStream fil = new FileInputStream(new File("src/test/resources/testdata/testdata.xlsx"));
				  XSSFWorkbook workbook = new XSSFWorkbook(fil);
				  XSSFSheet sheet=workbook.getSheet("Sheet1");
				  int count=sheet.getLastRowNum();
				  System.out.println(count);
				  
					  XSSFRow row =sheet.getRow(b);
					  XSSFCell cell1=row.getCell(1);
					  String pwd=cell1.getStringCellValue();
		          
				return pwd;
		}
}