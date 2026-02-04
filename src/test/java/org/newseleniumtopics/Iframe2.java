package org.newseleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe2 {
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
	
		driver.switchTo().frame("firstFr");
		
		WebElement fname = driver.findElement(By.name("fname"));
		
		WebElement lname = driver.findElement(By.name("lname"));
		
		fname.sendKeys("monika");
		lname.sendKeys("R");
		
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='innerframe']"));
		driver.switchTo().frame(innerFrame);
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("monika@123");
		
		driver.switchTo().parentFrame();
		
		fname.clear();
		lname.clear();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Contact' and @href='/contact']")).click();
	}

}
