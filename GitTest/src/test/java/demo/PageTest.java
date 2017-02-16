package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PageTest 
{
	private WebDriver driver;
	
	@Test
	public void checkTitle()
	{
		//hello I am trying to push
		driver.get("http://www.guru99.com");
		String actualTitle = "Meet Guru99";
		String pageTitle = driver.getTitle();
		System.out.println("Page Title = "+pageTitle);
		if(pageTitle.contains(actualTitle))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
	}	
	
	@BeforeTest
	public void beforeTest()
	{	
		    driver = new FirefoxDriver(); 
		    driver.manage().window().maximize();
	}		
	
	@AfterTest
	public void afterTest()
	{
		driver.quit();			
	}		
}
