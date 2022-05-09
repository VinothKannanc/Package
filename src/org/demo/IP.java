package org.demo;


import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IP {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinotyh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
		
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='p13n-sc-truncate-desktop-type2  p13n-sc-truncated']"));
		System.out.println("Total :"+products.size());
		
		for (int i = 0; i < products.size(); i++) {
			
			System.out.println(products.get(i).getText());
			
		}
		Set<WebElement> set=new LinkedHashSet<WebElement>();
		set.addAll(products);
		
		if (set.size()==products.size()) {
			System.out.println("No duplicates");
			
		}else {
			System.out.println("duplicates");
		}
		
		
	}

}
