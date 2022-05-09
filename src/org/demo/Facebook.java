package org.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinotyh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		//WebElement btnclick = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		//btnclick.click();
		
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		//driver.findElement(By.xpath("//a[contains(text(),'pass')]")).click();
		
		//WebElement txt = driver.findElement(By.xpath("//h2[contains(text(),'helps')]"));
		//String text = txt.getText();
		
		//System.out.println(text);
		
		//System.out.println(txt.getText());
		
		WebElement txt = driver.findElement(By.id("email"));
		txt.sendKeys("Vinoth@gmail.com");
		
		//String a = txt.getAttribute("value");
		//System.out.println(a);
		
		Actions b=new Actions(driver);
		
		Thread.sleep(5000);
		//b.doubleClick(txt).perform();
		b.doubleClick(txt).doubleClick(txt).perform();
		
		Thread.sleep(5000);
		b.contextClick(txt).perform();
		
		
		Robot r=new Robot();
		
		for (int i = 0; i <=1; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		
				
	}

}
