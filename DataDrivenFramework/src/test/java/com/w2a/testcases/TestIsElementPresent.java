package com.w2a.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIsElementPresent {
	
	public static WebDriver driver;
	
	public static boolean isElementPresent(By by) {
		
		/*try {
		driver.findElement(By.xpath(locator));
		return true;
		}catch(Throwable t) {
			return false;
		}*/
		
		int size = driver.findElements(by).size();
		if(size==0) {
			return false;
		}else {
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https:www.wikipedia.org");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//System.out.println(driver.findElement(By.xpath("//*[@id=\'js-link-box-en\']/strong")).isDisplayed());
		System.out.println(isElementPresent(By.id("searchLanguage")));


	}

}
