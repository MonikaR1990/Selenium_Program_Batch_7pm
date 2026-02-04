package org.newseleniumtopics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Interface 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("accept")).click();
		
		
		Alert alt = driver.switchTo().alert();

		alt.accept();
		
		driver.findElement(By.id("confirm")).click();
		
		alt.dismiss();
		
		driver.findElement(By.id("prompt")).click();
		
		alt.sendKeys("Hello Alert");
		
		alt.accept();
		
		Thread.sleep(2000);
		
	}
}
