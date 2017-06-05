package com.OrangeHRM.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.OrangeHRM.pages.AddUserPage;
import com.OrangeHRM.pages.AdminPage;
import com.OrangeHRM.pages.HomePage;
import com.OrangeHRM.pages.LoginPage;

public class AddUserTest extends abstractTest{
	
	@Test
	public void addUserSuccess()
	{		
		LoginPage lp = new LoginPage();
		
		lp.login().navigateToAdminPage().navigateToAddUserPage().addusersuccess();
	}
	
/*		LoginTest lt=new LoginTest();
		lt.successfullLoginTest();*/
		
/*		dr.get("http://192.168.0.105/orangehrm-3.3.1/symfony/web/index.php/dashboard");
		WebElement userName = dr.findElement(By.name("txtUsername"));
		userName.sendKeys("narendra");

		WebElement password = dr.findElement(By.id("txtPassword"));
		password.sendKeys("narendra");
		WebElement loginBtn = dr.findElement(By.id("btnLogin"));
		loginBtn.click();
		WebElement admin_menu=dr.findElement(By.id("menu_admin_viewAdminModule"));
		admin_menu.click();
		WebElement Add_btn=dr.findElement(By.id("btnAdd"));
		Add_btn.click();
		WebElement add_usr=dr.findElement(By.id("UserHeading"));
		add_usr.isDisplayed();
		WebElement empname=dr.findElement(By.id("systemUser_employeeName_empName"));
		empname.sendKeys("narendra");
		WebElement usrname=dr.findElement(By.id("systemUser_userName"));
		usrname.sendKeys("11Feb2017_Usr1");
		WebElement pswd=dr.findElement(By.id("systemUser_password"));
		pswd.sendKeys("Orangehrm");
		WebElement conf_pswd=dr.findElement(By.id("systemUser_confirmPassword"));
		conf_pswd.sendKeys("Orangehrm");
		WebElement savebtn=dr.findElement(By.id("btnSave"));
		savebtn.click();
		}
*/	

}
