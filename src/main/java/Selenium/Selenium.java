package Selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {
	@Test

	public void testSearch()
	{
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Nilmie\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
		
		
		//driver.findElement(By.linkText("Selenium - Web Browser Automation"));
		//driver.findElement(By.xpath("//h3[@class='LC20lb']")).click();
		//driver.findElement(By.xpath("//a[contains(@href='register.php')]")).click();
		driver.findElement(By.xpath("//a[@href='register.php']")).click();
		
		//String webTitle = driver.getTitle();
		
		
		//driver.close();
		//driver.quit();
		
	}
}
