package com.wd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MapsHomePageTest {
	WebDriver driver;
	MapsHomePage mapsHomePage;
	
	@BeforeClass
	public void classSetup() {
		driver = new FirefoxDriver();
	}

	@BeforeMethod
	public void beforeEachTest() {
		driver.get("http://maps.google.com");
		driver.manage().window().maximize();
		if (driver.getTitle().equals("Google Maps"))
			mapsHomePage = new MapsHomePage(driver);
		
	}

	@AfterMethod
	public void afterEachTest() {
	}
	
	@AfterClass
	public void classTearDown() {
		driver.quit();
	}

	@Test
	public void testHomePage() throws InterruptedException {
		mapsHomePage.findDirectionsByCar("Chicago", "New York");
		Thread.sleep(5000);
	}

	@Test
	public void testTransit() throws InterruptedException {
		mapsHomePage.enableTransit();
	}

}
