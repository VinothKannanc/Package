package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinotyh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		Actions a=new Actions(driver);
		
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		a.moveToElement(course).perform();
		
		WebElement Data = driver.findElement(By.xpath("//span[text()='Data Science Training']"));
		a.moveToElement(Data).perform();
		
		WebElement Data1  = driver.findElement(By.xpath("(//span[contains(text(),'Data Science with R Training')])"));
		Data1.click();
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
