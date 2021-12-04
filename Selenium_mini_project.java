package com.pkg.selinium;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Selenium_mini_project {

	public static void main(String[] args) throws InterruptedException,IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yuvas\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(900);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("seleniumproject234@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("applecherry");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,580);");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")).click();
		Thread.sleep(5000);
		WebElement addtocart = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(addtocart);
		Thread.sleep(6000);
		
		WebElement clickcart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
		Actions act =new Actions(driver);
		act.moveToElement(clickcart).build().perform();
		act.click(clickcart).build().perform();
		Thread.sleep(5000);
		
		WebDriverWait wait=new WebDriverWait(driver,70);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")));
		WebElement clickproceed = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		act.moveToElement(clickproceed).build().perform();
		act.click(clickproceed).build().perform();
		js.executeScript("window.scrollBy(0,700);");
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
		js.executeScript("window.scrollBy(0,650);");
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
		driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,650);");
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
		js.executeScript("window.scrollBy(0,600);");
		driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")).click();
		js.executeScript("window.scrollBy(0,600);");
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
		js.executeScript("window.scrollBy(0,400);");
		Thread.sleep(1000);
		TakesScreenshot pic =(TakesScreenshot) driver;
		File sr = pic.getScreenshotAs(OutputType.FILE);
		File ds =new File("C:\\Users\\yuvas\\eclipse-workspace\\Selenium\\Screenshot\\pic1.png");
		FileUtils.copyFile(sr,ds);
     
		

	}

}
