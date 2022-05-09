package org.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinotyh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

//Simple Alert
		
		//driver.get("http://demo.automationtesting.in/Alerts.html");
		
		//driver.findElement(By.xpath("(//a[@data-toggle='tab'])[1]")).click();
		//driver.findElement(By.xpath("(//button[contains(text(),'cl')])[1]")).click();
		
		//Alert a=driver.switchTo().alert();
	
		//a.accept();
		
		//driver.findElement(By.xpath("//a[text()='Register']")).click();
		
//Confirm Alert
		
		//driver.get("http://demo.automationtesting.in/Alerts.html");
		//driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]")).click();
		//driver.findElement(By.xpath("(//button[contains(text(),'cl')])[2]")).click();
		
		//Alert a=driver.switchTo().alert();
		
		//String text = a.getText();
		//System.out.println(text);
		
		//Thread.sleep(5000);
		//a.dismiss();
		
		//driver.findElement(By.xpath("//a[text()='Register']")).click();
		
//Prompt Alert
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'cl')])[3]")).click();
		
		Alert a=driver.switchTo().alert();
		
		a.sendKeys("Vinoth");
		
		String text = a.getText();
		System.out.println(text);
		
		a.accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
