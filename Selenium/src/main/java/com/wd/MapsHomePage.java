package com.wd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MapsHomePage {
	WebDriver driver;

	public MapsHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void findDirectionsByCar(final String from, String to) {
		WebElement element = driver.findElement(By.cssSelector("#d_launch"));
		element.click();

		element = driver.findElement(By.cssSelector("#d_d"));
		element.sendKeys(from);

		element = driver.findElement(By.cssSelector("#d_daddr"));
		element.sendKeys(to);

		/*
		 * element = driver.findElement(By.xpath("//button[@id='d_sub']"));
		 * System.out.println(element.isDisplayed());
		 */
		element.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains(from));

		/*
		 * (new WebDriverWait(driver, 10)).until(new
		 * ExpectedCondition<Boolean>() { public Boolean apply(WebDriver d) {
		 * return d.getTitle().toLowerCase().startsWith(from); } });
		 */

	}

	private void findDirectionsByTransit() {

	}

	private void findDirectionsByFoot() {

	}

	private void findDirectionsByBicycle() {

	}

	public void enableTransit() throws InterruptedException {
		// mouse hover over Satellite card
		// WebElement element =
		// driver.findElement(By.xpath("//div[@class='mv-primary-label-text' and text()='Satellite']"));
		/*WebElement element = driver
				.findElement(By
						.cssSelector("div[class='mv-primary-label-text'][contains('Satellite')]"));
						
						"div.noearth div div.mv-primary-label div.mv-primary-label-text"
*/
		WebElement element = driver
				.findElement(By
						.cssSelector("div.mv-primary-label-text"));
		Actions builder = new Actions(driver);		
		builder.moveToElement(element).build().perform();
		
		(new WebDriverWait(driver, 10)).until(new
				 ExpectedCondition<Boolean>() { public Boolean apply(WebDriver d) {
				 return d.findElement(By.cssSelector("div#mv-secondary-container > div > div > div:nth-child(4)")).isDisplayed() ;} });
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		
		Thread.sleep(5000);
		//new WebDriverWait(driver, 5);

		// Transit card should now be visible so click it
		//element = driver.findElement(By.xpath("//span[text()='Weather']"));
		//element = driver.findElement(By.cssSelector("div#mv-secondary-container div:nth-child(4)"));
		/*element = driver.findElement(By.cssSelector("div#mv-secondary-container > div > div > div:nth-child(5)"));
		element.click();*/
		//Thread.sleep(5000);
		
		element = driver.findElement(By.cssSelector("img.mv-dropdown"));
		//wait.until(ExpectedConditions.visibilityOf(element));
		
		element.click();
		(new WebDriverWait(driver, 10)).until(new
				 ExpectedCondition<Boolean>() { public Boolean apply(WebDriver d) {
				 return d.findElement(By.cssSelector("div#mv-secondary-container > div > div > div:nth-child(2)")).isDisplayed() ;} });
		
		element = driver.findElement(By.cssSelector("div#mv-secondary-container > div > div > div:nth-child(2)"));
		//element = driver.findElement(By.cssSelector("span:contains('Weather')"));
		element.click();
		
		Thread.sleep(2000);
		
	}
	
	public void enableTraffic() throws InterruptedException{
		WebElement element = driver
				.findElement(By
						.cssSelector("div.mv-primary-label-text"));
		Actions builder = new Actions(driver);		
		builder.moveToElement(element).build().perform();
		
		(new WebDriverWait(driver, 10)).until(new
				 ExpectedCondition<Boolean>() { public Boolean apply(WebDriver d) {
				 return d.findElement(By.cssSelector("div#mv-secondary-container > div > div > div:nth-child(4)")).isDisplayed() ;} });
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		
		Thread.sleep(5000);
		

		// Transit card should now be visible so click it
		//element = driver.findElement(By.xpath("//span[text()='Weather']"));
		//element = driver.findElement(By.cssSelector("div#mv-secondary-container div:nth-child(4)"));
		/*element = driver.findElement(By.cssSelector("div#mv-secondary-container > div > div > div:nth-child(5)"));
		element.click();*/
		//Thread.sleep(5000);
		
		element = driver.findElement(By.cssSelector("img.mv-dropdown"));
		//wait.until(ExpectedConditions.visibilityOf(element));
		
		element.click();
		(new WebDriverWait(driver, 10)).until(new
				 ExpectedCondition<Boolean>() { public Boolean apply(WebDriver d) {
				 return d.findElement(By.cssSelector("div#mv-secondary-container > div > div > div:nth-child(4)")).isDisplayed() ;} });
		
		element = driver.findElement(By.xpath("//span[text()='Traffic']"));
		//element = driver.findElement(By.cssSelector("span:contains('Weather')"));
		element.click();
		
		Thread.sleep(2000);
	}
}
