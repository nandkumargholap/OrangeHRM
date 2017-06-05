package com.OrangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.common.Utility;
import com.OrangeHRM.common.WebDriverFactory;

public class AdminPage 
{
	Utility util=new Utility();
	@FindBy(id="btnAdd")
	WebElement addbtn;
	
	public AdminPage()
	{
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
		
	}
	
	public AddUserPage navigateToAddUserPage()
	{
		addbtn.click();
		AddUserPage aup = new AddUserPage();
		if(aup.isPageLoaded())
			return aup;
		else
			return null;
	}
	public boolean isPageLoaded()
	{
		
		System.out.println(addbtn);
		return util.waitFotPageElement("id","addbtn");
	}
	
}
