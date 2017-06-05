package com.OrangeHRM.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.OrangeHRM.common.WebDriverFactory;
import com.OrangeHRM.pages.HomePage;
import com.OrangeHRM.pages.LoginPage;

public class LoginTest extends abstractTest {
	

	@Test(dataProvider="excelData")
	public void successfullLoginTest(String username, String password) {
	
		LoginPage lp=new LoginPage();
		lp.login();
		HomePage hp=new HomePage();
		hp.verifyHomePage();
		//LoginPage lp=new LoginPage();
		lp.login(username,password)
			.verifyHomePage();
		}

	@Test(priority=2)
	public void unsuccessfullLoginTest() {
		
		WebDriverFactory.getDriver().manage().window().maximize();
		WebDriverFactory.getDriver().get("http://192.168.0.105/orangehrm-3.3.1/symfony/web/index.php/dashboard");
		// dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");
		login("narendarB","narendra");

				
		WebElement invalidCredentialsCheck = WebDriverFactory.getDriver().findElement(By.id("spanMessage"));
		if (invalidCredentialsCheck.getText().contentEquals("Invalid credentials"))
				{
					System.out.println("Test Case passed !");
				}
		
	}
	@Test(priority=3)
	public void unsuccessfullLoginTestWithBlankCredentials() {
		
		WebDriverFactory.getDriver().manage().window().maximize();
		WebDriverFactory.getDriver().get("http://192.168.0.105/orangehrm-3.3.1/symfony/web/index.php/dashboard");
		// dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");

		WebElement loginBtn = WebDriverFactory.getDriver().findElement(By.id("btnLogin"));
		loginBtn.click();
		
		WebElement invalidCredentialsCheck = WebDriverFactory.getDriver().findElement(By.id("spanMessage"));
		if (invalidCredentialsCheck.getText().contentEquals("Invalid credentials"))
				{
					System.out.println("Test Case passed !");
				}
		
	}
	private void login(String username,String pword)
	{
		
		WebElement userName = WebDriverFactory.getDriver().findElement(By.name("txtUsername"));
		userName.sendKeys(username);

		WebElement password = WebDriverFactory.getDriver().findElement(By.id("txtPassword"));
		password.sendKeys(pword);

		WebElement loginBtn = WebDriverFactory.getDriver().findElement(By.id("btnLogin"));
		loginBtn.click();
	}
	
	@Test
	public void externalLinkTest()
	{
		LoginPage lp = new LoginPage();
		//lp.isPageLoaded();
		lp.navigateToFacebook();
		
		lp.navigateToLinkedIn();
		lp.navigateToTwitter();
		lp.navigateToYouTube();
		String parentWindow = WebDriverFactory.getDriver().getWindowHandle();
		Object[] childWindows = WebDriverFactory.getDriver().getWindowHandles().toArray();
		
		for(Object window : childWindows)
		{
			//TO Close the parent window in the end
			if(!window.equals(parentWindow))
			{
				System.out.println("This is the window handle for "+window.toString());
				WebDriverFactory.getDriver().switchTo().window((String)window);
				System.out.println(WebDriverFactory.getDriver().getTitle());
				WebDriverFactory.getDriver().close();
				
			}
		}
		
	}

}