package com.OrangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.common.Utility;
import com.OrangeHRM.common.WebDriverFactory;

public class LoginPage 
{
	Utility util = new Utility();
	@FindBy(name="txtUsername")
	WebElement userName;
	@FindBy(id="txtPassword")
	WebElement password;
	@FindBy(id="btnLogin")
	WebElement loginBtn;
	@FindBy(id="welcome")
	WebElement VerifyText;
	@FindBy(xpath="//div[@id='footer']/div[2]/a[1]")
	WebElement linkedIn;
	@FindBy(xpath="//div[@id='footer']/div[2]/a[2]")
	WebElement faceBook;
	@FindBy(xpath="//div[@id='footer']/div[2]/a[3]")
	WebElement twitter;
	@FindBy(xpath="//div[@id='footer']/div[2]/a[4]")
	WebElement youTube;
	
	public LoginPage()
	{
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
		
	}

	public HomePage login()
	{	
		WebDriverFactory.getDriver().get("http://192.168.0.108/orangehrm-3.3.1/symfony/web/index.php/dashboard");
		userName.sendKeys("narendra");
		password.sendKeys("narendra");
		loginBtn.click();
		
		HomePage hp = new HomePage();
		if(hp.isPageLoaded())
			return hp;
		else
			return null;
		
	}
	
	public HomePage login(String strSserName, String strPassword)
	{	
		WebDriverFactory.getDriver().get("http://192.168.0.105/orangehrm-3.3.1/symfony/web/index.php/dashboard");
		userName.sendKeys(strSserName);
		password.sendKeys(strPassword);
		loginBtn.click();
		//return new HomePage();
		HomePage hp = new HomePage();
		if(hp.isPageLoaded())
			return hp;
		else
			return null;

		
	}
	public boolean isPageLoaded()
	{
		System.out.println(linkedIn);
		return util.waitFotPageElement("xpath","linkedIn");
	}

	public LoginPage navigateToYouTube()
	{
		
		youTube.click();
		return this;
		
	}
	public LoginPage navigateToLinkedIn()
	{
		linkedIn.click();
		return this;
	}
	public LoginPage navigateToFacebook()
	{
		faceBook.click();
		return this;
	}
	public LoginPage navigateToTwitter()
	{
		twitter.click();
		return this;
	}
	
	
}
