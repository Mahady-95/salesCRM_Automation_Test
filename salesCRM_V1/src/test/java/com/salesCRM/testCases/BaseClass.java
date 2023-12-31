package com.salesCRM.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
	
	protected WebDriver driver;
	
	@BeforeClass
	public void setUp() 
	{
        
    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

	@AfterClass
	public void tearDown() 
	{
		
        if (driver != null) 
        {
            driver.quit();
        }
    }

}
