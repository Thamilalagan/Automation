package com.w2a.javaExamples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.wikipedia.org");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.name("country")).sendKeys("Germany");
		
		WebElement dp = driver.findElement(By.id("searchLanguage"));
		Select select = new Select(dp);
		//select.selectByVisibleText("Eesti");
		select.selectByValue("ta");
		List<WebElement> values = driver.findElements(By.tagName("option"));
		System.out.println(values.size());
		System.out.println(values.get(7).getText());
		
		for(int i=0; i<values.size(); i++) {
			System.out.println(values.get(i).getAttribute("lang"));
		}
		
		//WebElement block = driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[7]/div[3]"));
		
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are "+ links.size());
		for(WebElement link: links) {
			System.out.println(link.getText()+ "- - URL IS- -"+ link.getAttribute("href"));
		}

		

	}

}
