package com.OrangeHRM.common;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class TestListener implements IInvokedMethodListener{

	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		
		//System.out.println("Closing driver object");
		WebDriverFactory.getDriver().quit();
		//System.out.println("Driver object closed");
	
	}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		System.out.println("Creaating new driver");
		WebDriverFactory.setDriver();
	}

	
}
