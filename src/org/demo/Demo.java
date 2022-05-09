package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	
	public static void main(String[] args)  {
		
			//driver path ----to fetch the chrome driver path
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinotyh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
				
				//list refname=new Arraylist();
				//upcasting
				WebDriver driver=new ChromeDriver();
				
				//to pass the url
				driver.get("https://www.instagram.com/");
				
				//using xpath---->ctrl+f
				//Thread.sleep(8000);
				
				//{//tagname [@attributename='attributevalue']------(//tag[@an='av'])[1]         
				WebElement textuser = driver.findElement(By.xpath("(//input[@value])[1]"));
				textuser.sendKeys("Vinoth");
				
				WebElement textpass = driver.findElement(By.xpath("(//input[@value])[2]"));
				textpass.sendKeys("Kannan");
				
				WebElement btnclik = driver.findElement(By.xpath("//button[@type='submit']"));
				btnclik.click();				
		
	}

}
