package com.w2a.javaExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver , 5000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		WebElement agree = driver.findElement(By.id("introAgreeButton")); agree.click();
		
		
		driver.findElement(By.name("q")).sendKeys("way2automation");
		driver.findElement(By.name("q")).sendKeys(Keys.TAB);
		WebDriverWait waits = new WebDriverWait(driver, 5);
		
		waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]"))).click();
		
		driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[9]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/a/h3/span")).click();
		
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"navbar-collapse-1\"]/ul/li[8]/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		
		driver.findElement(By.linkText("Practice site 1")).click();

	}

}
