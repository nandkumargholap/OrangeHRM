package com.OrangeHRM.test;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import com.OrangeHRM.common.DataProviderFactory;
import com.OrangeHRM.common.ExcelReader;

public class abstractTest {
 

 @DataProvider(name="excelData")
 public String [][] getDataProvider(Method m)
 {
	 System.out.println(getTestMethodName(m));
	 System.out.println(getClassName(m));
	 return ExcelReader.getExcelTable(getClassName(m),getTestMethodName(m));
 }
 private String getTestMethodName(Method m)
 {
	 String mName=m.getName();
	 return mName;
 }
 private String getClassName(Method m)
 {
	 Class<?> cls = m.getDeclaringClass();
	 String className = cls.getResource(cls.getSimpleName()+".class").getPath();
	 String strClassName = (className.replace(".class",".xls").replace("%20"," ")).substring(1).replace("/", "\\");
	// String strClssName = strClassName.substring(1);
	 
	 return strClassName;
 }
 
}
