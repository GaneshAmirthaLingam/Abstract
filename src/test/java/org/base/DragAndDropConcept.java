package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	WebDriver driver;
	
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	
	WebElement s = driver.findElement(By.id("credit2"));
	WebElement d = driver.findElement(By.id("bank"));
	Actions actions = new Actions(driver);
	
	WebElement s1 = driver.findElement(By.id("fourth"));
	WebElement d1 = driver.findElement(By.id("amt7"));
	
	WebElement btnDonotconsentClick = driver.findElement(By.xpath("//button[@class='fc-button fc-cta-do-not-consent fc-secondary-button']"));
	btnDonotconsentClick.click();
	
	actions.dragAndDrop(s, d).perform();
	actions.dragAndDrop(s1, d1).perform();
	
	
	
	
	
	
	
		
		
		
		
		
		
	}
}
