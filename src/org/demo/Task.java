package org.demo;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinotyh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
		
		WebElement txt1 = driver.findElement(By.xpath("//a[starts-with(text(),'Today')]"));
		j.executeScript("arguments[0].setAttribute('style','background:green; border:2px solid red')",txt1);
		
		WebElement txt2 = driver.findElement(By.xpath("//div[@id='nav-xshop-container']//child::div//following::a[5]"));
		j.executeScript("arguments[0].setAttribute('style','background:blue; border: 2px solid red')",txt2);
		
		Actions a=new Actions(driver);
		
		WebElement move = driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]//child::div//following::span[(text()='Account & Lists')]"));
		a.moveToElement(move).perform();
		
		WebElement head1 = driver.findElement(By.xpath("//div[@id='nav-al-wishlist']//child::div"));
		System.out.println(head1.getText());
		
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']//child::a"));
		
		for (WebElement y : list1) {
			
			System.out.println(y.getText());
		}
			
		WebElement head2 = driver.findElement(By.xpath("//div[@id='nav-al-your-account']//child::div"));
		System.out.println(head2.getText());
		
		List<WebElement> list2 = driver.findElements(By.xpath("//div[@id='nav-al-your-account']//child::a"));
		
		for (WebElement y : list2) {
			
			System.out.println(y.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}

}
