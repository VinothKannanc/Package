package org.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinotyh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		WebElement txtusr = driver.findElement(By.id("email"));
		txtusr.sendKeys("Vinoth");
		
		WebElement txtpass= driver.findElement(By.id("pass"));
		txtpass.sendKeys("455666");
		
		WebElement btnclick= driver.findElement(By.name("login"));
		btnclick.click();
		//Step 1
		//downcasting
		TakesScreenshot a=(TakesScreenshot)driver;
		//Step 2
		//take screenshot
		File src=a.getScreenshotAs(OutputType.FILE);
		//step 3 new file path
		
		File des=new File("C:\\Users\\Vinotyh\\eclipse-workspace\\Selenium\\lib1\\login1.jpeg");
		
		FileUtils.copyFile(src, des);
		
		
	}
	
	
	
	
	
	
}
