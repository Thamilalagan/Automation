package com.w2a.javaExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestKeyboardEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("identifierId")).sendKeys("alagan.tamil@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]")).click();
		
		
		
		Actions action = new Actions(driver);
		action.keyDown( Keys.CONTROL ).sendKeys( "a" ).keyUp( Keys.CONTROL ).build().perform();
		action.keyDown( Keys.CONTROL ).sendKeys( "c" ).keyUp( Keys.CONTROL ).build().perform();
		 
		driver.findElement(By.id("identifierId")).click();
		action.keyDown( Keys.CONTROL ).sendKeys( "v" ).keyUp( Keys.CONTROL ).build().perform();
		 
		
	}

}
