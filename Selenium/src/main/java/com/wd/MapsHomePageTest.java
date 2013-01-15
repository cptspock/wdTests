package com.wd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MapsHomePageTest {
	WebDriver driver;
	
	
	@BeforeTest
	public void setup(){
		
	}
	
	@AfterTest
	public void tearDown(){
		
	}
	
	@BeforeClass
	public void classSetup(){
		driver = new FirefoxDriver();
		driver.get("http://maps.google.com");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void classTearDown(){
		driver.quit();
	}
	
	@Test
	public void testHomePage() throws InterruptedException{
		new MapsHomePage(driver).findDirectionsByCar("Chicago", "New York");
		Thread.sleep(10000);
	}
	
	

}
