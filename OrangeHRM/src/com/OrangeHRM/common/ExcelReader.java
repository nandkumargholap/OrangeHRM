package com.OrangeHRM.common;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReader {

	public static String [][] getExcelTable(String filePath,String sheetName)
	{
		System.out.println("Excel file path is "+filePath+" sheet path is "+sheetName);
		try {	
		FileInputStream  stream= new FileInputStream(filePath);
		HSSFWorkbook wb = new HSSFWorkbook(stream);
		HSSFSheet sh= wb.getSheet(sheetName);
		int lastRow=sh.getLastRowNum();
		int lastCol = sh.getRow(0).getLastCellNum();
		String [][] Strarr= new String [lastRow+1][lastCol];	
		for (int i=0;i<=lastRow;i++)
		{
			for (int j=0;j<lastCol;j++)
			{
				Strarr[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
		
			}
		}
		return Strarr;
			}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
