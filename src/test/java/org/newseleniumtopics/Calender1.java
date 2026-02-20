package org.newseleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("datepicker2")).sendKeys("06/18/2026");
		
		WebElement datePick = driver.findElement(By.id("datepicker1"));
		
		datePick.click();
		
		while(true)
		{
		String month = driver.findElement(By.className("ui-datepicker-month")).getText();
		
		System.out.println(month); //May
		
		if(month.equals("May"))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			Thread.sleep(2000);
		}
		
		}
		
		driver.findElement(By.xpath("//a[text()='26']")).click();
		
		
		String date1 = datePick.getAttribute("value");
		
		System.out.println(date1);
		
		
	}

}
