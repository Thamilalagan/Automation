package com.w2a.listeners;

import java.io.IOException;

import org.testng.ITestContext;
//import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;
import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class CustomListeners extends TestBase implements ITestListener {

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		
		try {
			TestUtil.captureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.log(LogStatus.FAIL, result.getName().toUpperCase()+"Failed with exception"+result.getThrowable());
		test.log(LogStatus.FAIL, test.addScreenCapture(TestUtil.screenshotName));

		rep.endTest(test);
		rep.flush();
		Reporter.log("Click to see Screenshot");
		Reporter.log("<a target = \"_blank\" href ="+TestUtil.screenshotName+"> Screenshot </a>");
		Reporter.log("<br>");
		Reporter.log("<a target = \"_blank\" href ="+TestUtil.screenshotName+"> <img src="+TestUtil.screenshotName+" height=100 width=100> </img> </a>");

	}

	public void onStart(ITestContext context) {
		
		test = rep.startTest(context.getName().toUpperCase());
	}

	public void onTestSuccess(ITestResult result) {
		
		test.log(LogStatus.PASS, result.getName().toUpperCase()+"PASS");
		rep.endTest(test);
		rep.flush();
	}
	

	

}