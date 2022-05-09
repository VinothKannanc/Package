package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinotyh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		//id
		//driver.switchTo().frame("a077aa5e");
		//name
		
		driver.switchTo().frame("a077aa5e");
		
		WebElement btnclic = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		btnclic.click();
		
		driver.switchTo().defaultContent();
		
		WebElement txtusr = driver.findElement(By.xpath("//input[@type='text']"));
		txtusr.sendKeys("Vinoth Kannan");
	
	
	
	
}	

}
