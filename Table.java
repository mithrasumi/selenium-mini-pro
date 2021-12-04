package com.pkg.selinium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\yuvas\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/table.html");
	Thread.sleep(5000);
	System.out.println("........table header.....");
	List<WebElement> header = driver.findElements(By.xpath("//table/tbody/tr/th"));
	for (WebElement webElement : header) {
		System.out.println(webElement.getText());
		
	}
	System.out.println(".......column data.....");
	List<WebElement> column_data = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
	for (WebElement CD :column_data) {
		System.out.println(CD.getText());
		
	}
	System.out.println("........row data.......");
	List<WebElement> row_data = driver.findElements(By.xpath("//table/tbody/tr[2]"));
	for (WebElement RD : row_data) {
		System.out.println(RD.getText());
		
	}
	System.out.println("........particular data......");
	WebElement particular_data = driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]"));
	System.out.println(particular_data.getText());
	
	
	
	}


}
