package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinotyh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe" );
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		WebElement txt = driver.findElement(By.xpath("//input[@type='text']"));
		txt.sendKeys("Greens Technology");
		
		Thread.sleep(5000);
		WebElement search = driver.findElement(By.xpath("(//input[@role='button'])[1]"));
		search.click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).clear();
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("facebook");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//h3[text()='Facebook - Log In or Sign Up']")).click();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Vinoth");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Kannan");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("kumar123@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("kumar123@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("kjdjdjgfj43");
		driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("12");
		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("12");
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1993");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		//driver.findElement(By.xpath("//label[contains(text(),'Cus')]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'Sign')])[1]")).click();
		
		
		
		
	}

}
