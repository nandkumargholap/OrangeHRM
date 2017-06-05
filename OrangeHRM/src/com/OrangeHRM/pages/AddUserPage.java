package com.OrangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.common.Utility;
import com.OrangeHRM.common.WebDriverFactory;

public class AddUserPage 
{

	Utility util=new Utility();
	@FindBy(id="systemUser_employeeName_empName")
	WebElement EmpName;
	@FindBy(id="systemUser_userName")
	WebElement UsrName;
	@FindBy(id="systemUser_password")
	WebElement Pswd;
	@FindBy(id="systemUser_confirmPassword")
	WebElement Confirm_pswd;
	@FindBy(id="btnSave")
	WebElement savebtn;
	
	WebDriver dr;
	
	public AddUserPage()
	{
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
		
	}
	public void addusersuccess()
	{
		EmpName.sendKeys("narendra");
		UsrName.sendKeys("04Mar2017_usr1");
		Pswd.sendKeys("Testuser");
		Confirm_pswd.sendKeys("Testuser");
		savebtn.click();
	}
	public boolean isPageLoaded()
	{
		System.out.println(EmpName);
		return util.waitFotPageElement("id","EmpName");
	}
}
