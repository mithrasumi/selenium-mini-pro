package com.pkg.selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\yuvas\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.youtube.com/");
			Thread.sleep(5000);
			driver.navigate().refresh();
			driver.close();
		
			
			
			

	   }

}
