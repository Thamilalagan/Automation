package com.w2a.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement slide = driver.findElement(By.xpath("//*[@id=\"slider\"]"));
		int width = slide.getSize().width/2;
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		new Actions(driver).dragAndDropBy(slider, width, 0).perform();

	}

}
