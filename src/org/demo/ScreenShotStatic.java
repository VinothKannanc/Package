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

public class ScreenShotStatic {
	
	public static WebDriver driver;//static variable
	
	public static void screenshot(String name) throws IOException {
		
		TakesScreenshot c=(TakesScreenshot)driver;
		File src = c.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Vinotyh\\eclipse-workspace\\Selenium\\lib1\\"+name+".jpeg");
		FileUtils.copyFile(src,des);

		}

	
		public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinotyh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe" );
		
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		WebElement txtusr = driver.findElement(By.id("email"));
		txtusr.sendKeys("Vinoth");
		screenshot("username");
		
		WebElement txtpass= driver.findElement(By.id("pass"));
		txtpass.sendKeys("455666");
		screenshot("passwod");
		
		
		WebElement btnclick= driver.findElement(By.name("login"));
		btnclick.click();
		screenshot("login");
		
		
		

}

}
