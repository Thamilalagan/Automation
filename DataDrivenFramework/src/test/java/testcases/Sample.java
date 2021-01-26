package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup(); 
			driver = new ChromeDriver();			
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup(); 
			driver = new FirefoxDriver();			
		}
		//WebDriverManager.chromedriver().setup(); 
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com");
		String title = driver.getTitle();
		System.out.println(title.length());
		System.out.println(title);
		WebElement ele = driver.findElement(By.id("identifierId"));
		ele.sendKeys("alagan.tamil@gmail.com");
		//driver.close(); // Close current browser
		//driver.quit(); // Close current and any previous instances of the browser



	}

}
