package com.OrangeHRM.common;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	WebDriverWait wt;
	
	//Explicit wait
	/*public void waitForElement(WebElement element)
	{
		wt = new WebDriverWait(WebDriverFactory.getDriver(),10);
		wt.until(ExpectedConditions.visibilityOf(element));
		
	}*/
	
	public boolean waitFotPageElement(String locator,String locatorDescription)
	{
		
		int counter=0;
		try{
			while(counter<=20)
			switch (locator)
			{
				case "id":WebDriverFactory.getDriver().findElement(By.id(locatorDescription));
				return true;
				
				case "xpath":WebDriverFactory.getDriver().findElement(By.xpath(locatorDescription));
				return true;
				
				case "name":WebDriverFactory.getDriver().findElement(By.name(locatorDescription));
				return true;
			}
		}
		catch(Exception e)
		{
			try {
				Thread.sleep(1000);
				System.out.println("The Element "+locatorDescription+" not found by "+locator+" in "+counter+" sec ");
				counter++;
			} catch (InterruptedException e1) {
				
				e1.printStackTrace();
			}
			
		}
		return false;
	}
	private void getElementDescription()
	{
		
	}
}
