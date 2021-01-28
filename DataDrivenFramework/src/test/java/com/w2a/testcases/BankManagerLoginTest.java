package com.w2a.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import com.w2a.base.TestBase;


public class BankManagerLoginTest extends TestBase {
	

	@Test
	public void loginAsBankManager() throws InterruptedException {
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn"))),"Login not successful");
		
	}

}
