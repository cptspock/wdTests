package com.wd;

/**
 * @param args
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium2Example {
	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the Firefox driver
		// Notice that the remainder of the code relies on the interface,
		// not the implementation.
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();		

		// And now use this to visit Google
		driver.get("http://maps.google.com");
		// Alternatively the same thing can be done like this
		// driver.navigate().to("http://www.google.com");

		// Find the text input element by its name
		//WebElement element = driver.findElement(By.className("mv-primary-preview-lens"));
		WebElement element = driver.findElement(By.id("d_launch"));
		element.click();
		
		element = driver.findElement(By.id("d_close"));
		element.click();
		
		element = driver.findElement(By.xpath("//div[@title='Zoom In']"));
		element.click();
		element.click();
		element.click();
		element.click();
		
		
		element = driver.findElement(By.xpath("//div[@title='Zoom Out']"));
		element.click();
		element.click();
		element.click();
		element.click();
		element.click();
		
		
	    Thread.sleep(5000);
		
		//builder.moveToElement(element).build().perform();
		/*
		// Enter something to search for
		element.sendKeys("Cheese!");

		// Now submit the form. WebDriver will find the form for us from the
		// element
		element.submit();

		// Check the title of the page
		System.out.println("Page title is: " + driver.getTitle());

		// Google's search is rendered dynamically with JavaScript.
		// Wait for the page to load, timeout after 10 seconds
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getTitle().toLowerCase().startsWith("cheese!");
			}
		});

		// Should see: "cheese! - Google Search"
		System.out.println("Page title is: " + driver.getTitle());
*/
		// Close the browser
		driver.quit();
	}
}
