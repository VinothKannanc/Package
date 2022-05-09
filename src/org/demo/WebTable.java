package org.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinotyh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	//tablesize
	
	//List<WebElement> tables = driver.findElements(By.tagName("table"));//findelements
	
	//System.out.println(tables.size());
	
	//------------------x----------------------x----------------------------x-------------------
	
	//output----Austria
	//WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
	
	//List<WebElement> rows = driver.findElements(By.tagName("tr"));
	
	//WebElement row = rows.get(3);
	
	//List<WebElement> datas = row.findElements(By.tagName("td"));
	
	//WebElement data = datas.get(2);
	
	//System.out.println(data.getText());
	
	//----------------x--------------------------x------------------------------x----------------
	
	//WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
	
	//List<WebElement> rows = driver.findElements(By.tagName("tr"));
	
	//WebElement row = rows.get(3);
	
	//List<WebElement> alldatas = row.findElements(By.tagName("td"));
	
	//System.out.println(row.getText());
	
	
	//for (int i = 0; i < alldatas.size(); i++) {
		
	//	WebElement data = alldatas.get(i);
		
	//	System.out.println(data.getText());
	
	//}
	
	
	//for (int i = 0; i < alldatas.size(); i=i+1) {
		
	//	if (i==0 || i==1) {
	
	//		WebElement data = alldatas.get(i);
			
	//		System.out.println(data.getText());	
	
	//}
	
	
	//---------------------------------------------------------------------------------------
	
	//getAlltext
	//WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
	
	//System.out.println(table.getText());
	
	//--------------------------------------------------------------------------------------
	
	//WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
	
	//List<WebElement> rows = table.findElements(By.tagName("tr"));
	
	//for (WebElement alldata : rows) {
	//	List<WebElement> tableheading = alldata.findElements(By.tagName("th"));
		
	//	for (WebElement heading : tableheading) {
	//		System.out.println(heading.getText());
			
	//	}
		
	//	List<WebElement> data = alldata.findElements(By.tagName("td"));
	//	for (WebElement d : data) {
			
	//		System.out.println(d.getText());
			
	//	}
	
	//-------------------------------------------------------------------------------------
			
	WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
	
	List<WebElement> rows = table.findElements(By.tagName("tr"));
	
	for (int i = 0; i < rows.size(); i++) {
		
		WebElement row = rows.get(i);
		List<WebElement> alldatas = row.findElements(By.tagName("td"));
		for (int j = 0; j < alldatas.size(); j++) {
			
			System.out.println(alldatas.get(j).getText());
			
		}
		
	}
	
		
		
		
	}
	
	
	}
	
	

