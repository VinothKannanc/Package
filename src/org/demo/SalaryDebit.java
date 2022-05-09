package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SalaryDebit {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinotyh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		
		
		WebElement credit = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement Amount = driver.findElement(By.xpath("//ol[@id='amt8']"));
		
		WebElement credit1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		
		WebElement Amount1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		WebElement credit3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		WebElement Amount3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		WebElement credit2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		
		WebElement Amount2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		
		
		Actions c=new Actions(driver);
		c.dragAndDrop(credit,Amount ).perform();
		c.dragAndDrop(credit1,Amount1 ).perform();
		c.dragAndDrop(credit2,Amount2 ).perform();
		c.dragAndDrop(credit3,Amount3 ).perform();
		
		
		
		
		
	}

}
