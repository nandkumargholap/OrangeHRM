package com.OrangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.common.Utility;
import com.OrangeHRM.common.WebDriverFactory;

public class HomePage 
{
	Utility util=new Utility();
	
	@FindBy(id="welcome")
	WebElement welcome;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement adminLink;
	
	WebDriver dr;
	
	public HomePage()
	{
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
		
	}
	public void verifyHomePage()
	{
		welcome.getText().contentEquals("Welcome");
		

	}
	public AdminPage navigateToAdminPage()
	{
		adminLink.click();
		AdminPage ap = new AdminPage();
		if(ap.isPageLoaded())
			return ap;
		else
			return null;

		
	}
	public boolean isPageLoaded()
	{
		System.out.println(welcome);
		return util.waitFotPageElement("id","welcome");
	}

}
