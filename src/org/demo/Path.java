package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Path {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinotyh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		//Absolute Path
		WebElement box = driver.findElement(By.xpath("/html/body/div/header/div/div/div[2]/div/form/div[2]/div/input"));
		box.sendKeys("iphone 13");
		
		WebElement clck = driver.findElement(By.xpath("/html/body/div/header/div/div/div[2]/div/form/div[3]/div/span/input"));
		clck.click();
}
}
