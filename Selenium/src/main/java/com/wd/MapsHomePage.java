package com.wd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MapsHomePage {
	WebDriver driver;
	
	public MapsHomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void findDirectionsByCar(final String from, String to){
		WebElement element = driver.findElement(By.cssSelector("#d_launch"));
		element.click();
		
		element = driver.findElement(By.cssSelector("#d_d"));
		element.sendKeys(from);
		
		element = driver.findElement(By.cssSelector("#d_daddr"));
		element.sendKeys(to);
		
		/*element = driver.findElement(By.xpath("//button[@id='d_sub']"));
		System.out.println(element.isDisplayed());*/
		//button.click();
		element.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains(from));
		
		//driver.getTitle().toLowerCase().contains(from.toLowerCase());
		
		/*(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getTitle().toLowerCase().startsWith(from);
			}
		});*/
		
		System.out.println("reached here");
	}
	
	private void findDirectionsByTransit(){
		
	}
	
	private void findDirectionsByFoot(){
		
	}
	
	private void findDirectionsByBicycle(){
		
	}
	
	

}
