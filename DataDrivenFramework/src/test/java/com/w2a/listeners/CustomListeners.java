package com.w2a.listeners;

//import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListeners implements ITestListener {

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		
		Reporter.log("Capturing Screenshot");
		Reporter.log("<a target = \"_blank\" href =\"C:\\old\\Aston.png\"> Screenshot </a>");
		Reporter.log("<br>");
		Reporter.log("<a target = \"_blank\" href =\"C:\\old\\Aston.png\"> <img src=\"C:\\old\\Aston.png\" height=100 width=100> </img> </a>");

	}
	

	

}