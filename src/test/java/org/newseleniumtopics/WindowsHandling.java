package org.newseleniumtopics;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow); //ID -532D44E130CB60A265F6383A52276B8F
		
		
		driver.findElement(By.xpath("//a//button")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows); // [532D44E130CB60A265F6383A52276B8F, 06981DE6F7DBA3FA0C5A94334A6DF986]


		for(String window:allWindows)
		{		
			if(!window.equals(parentWindow))
			{
				driver.switchTo().window(window);
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());	
				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
		
		
		//1 532D44E130CB60A265F6383A52276B8F=532D44E130CB60A265F6383A52276B8F TRUE
		//2 06981DE6F7DBA3FA0C5A94334A6DF986=532D44E130CB60A265F6383A52276B8F fALSE
		
	/*	@Nullable
		String title = driver.getTitle();
		System.out.println(title); */
		
		
	}
}
