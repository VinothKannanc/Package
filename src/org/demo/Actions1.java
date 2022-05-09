package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinotyh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		WebElement txt = driver.findElement(By.id("email"));
		txt.sendKeys("Vinoth@gmail.com");
		
		Actions b=new Actions(driver);
		
		Thread.sleep(5000);
		//b.doubleClick(txt).perform();
		b.doubleClick(txt).doubleClick(txt).perform();
		
		Thread.sleep(5000);
		b.contextClick(txt).perform();
		
		
		
		b.keyDown(Keys.DOWN).perform();
		b.keyUp(Keys.UP).perform();
		b.keyDown(Keys.DOWN).perform();
		b.keyUp(Keys.UP).perform();
		b.keyDown(Keys.DOWN).perform();
		b.keyUp(Keys.UP).perform();
		
		b.keyDown(Keys.ENTER).perform();
		b.keyUp(Keys.ENTER).perform();
		b.keyDown(Keys.TAB).perform();
		b.keyUp(Keys.TAB).perform();
		
		
		
		
		
		
	}

}
