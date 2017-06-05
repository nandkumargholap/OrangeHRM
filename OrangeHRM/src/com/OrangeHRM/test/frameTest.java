package com.OrangeHRM.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.OrangeHRM.common.WebDriverFactory;

public class frameTest {

	@Test
	public void getTextFrame()
	{
		WebDriverFactory.getDriver().navigate().to("http://192.168.0.105:8080/selenium-test/Inner.html");
		//System.out.println(WebDriverFactory.getDriver().findElement(By.xpath("/html/body/div")).getText());
		
		System.out.println("Using Frame Index");
		//System.out.println(WebDriverFactory.getDriver().switchTo().frame(0).findElement(By.xpath("/html/body/div")).getText());
		
		System.out.println("Using Frame WebElement");
		WebDriverFactory.getDriver().switchTo().frame(WebDriverFactory.getDriver().findElement(By.id("2")));
		System.out.println(WebDriverFactory.getDriver().findElement(By.xpath("/html/body/div")).getText());
		
		
		
	//	System.out.println(WebDriverFactory.getDriver().switchTo().frame(arg0));
		
	}
}
