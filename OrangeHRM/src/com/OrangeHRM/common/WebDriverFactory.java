package com.OrangeHRM.common;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverFactory {
	//public static WebDriver dr;
	// Thread Local This is done for parallel execution through testNG. Thus we do not get browser may have died
	public static ThreadLocal<WebDriver> tdl = new ThreadLocal<WebDriver>(); 
	
	public static void setDriver()
	{
		try{
		//dr =new FirefoxDriver();
		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setBrowserName(System.getenv("browserName"));
		cap.setBrowserName("chrome");
		cap.setVersion("55");
		//tdl.set(new FirefoxDriver());
		tdl.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap));
		WebDriverFactory.getDriver().get("http://192.168.0.105/orangehrm-3.3.1/symfony/web/index.php/dashboard");
		//dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		tdl.get().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}
	}
	
	public static WebDriver getDriver()
	{
		//return dr;
		return tdl.get();
	}
}
