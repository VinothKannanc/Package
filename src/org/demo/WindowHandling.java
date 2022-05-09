package org.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinotyh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Mini (128GB) - Midnight']")).click();
		
		String parentwind = driver.getWindowHandle();
		System.out.println(parentwind);
		
		//Don't allow dublicates
		Set<String> eachId = driver.getWindowHandles();//method--->getwindowHandles
		System.out.println(eachId);
		
		//2-id
		for (String b : eachId) {
			if (!parentwind.equals(eachId)) {
				driver.switchTo().window(b);
				
			}
			
		}
		
		//allow dublicates
		//List<String> l=new ArrayList<String>();
		//l.addAll(eachId);
		
		//String s=l.get(0);
		//driver.switchTo().window(s);
		//       or
		//driver.switchTo().window(l.get(1));
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		
		
	
	
	
	
	
	
	
	
	
	
	
}	
	

}
