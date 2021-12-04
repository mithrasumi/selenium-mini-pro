package com.pkg.selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drag_and_Drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yuvas\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/table.html");
		

	}

}
