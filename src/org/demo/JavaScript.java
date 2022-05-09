package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinotyh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//downcasting
		JavascriptExecutor j=(JavascriptExecutor) driver;
		
		WebElement txtusr = driver.findElement(By.id("email"));
		j.executeScript("arguments[0].setAttribute('value','greens')", txtusr);
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		j.executeScript("arguments[0].setAttribute('value','123456')", txtpass,txtusr);
		
		WebElement btnclik = driver.findElement(By.name("login"));
		j.executeScript("arguments[2].click()",txtpass,txtusr,btnclik);
		
		//j.executeScript("arguments[0].setAttribute('style','background:blue; border: 6px solid green')",txtusr);
		
		
		
		
	//------------------x------------------------------x------------------------x---------------	
		//scroll
		
		//driver.get("https://www.greenstech.in/selenium-course-content.html");
		
		//JavascriptExecutor j=(JavascriptExecutor) driver;
		
		//WebElement view = driver.findElement(By.xpath("//button[text()='View more']"));
		//j.executeScript("arguments[0].scrollIntoView(false)", view);    //bottom of the page
	  //j.executeScript("arguments[0].scrollIntoView(true)", view);     //top of the page
		
		
		
		
		
		
		
	}

}
