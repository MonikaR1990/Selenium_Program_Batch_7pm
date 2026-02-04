package org.newseleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLogin {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("monica@123");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.id("email")).clear();
		
		driver.findElement(By.name("login")).click();
		
		
		
		
		
		
		
		

	}

}
