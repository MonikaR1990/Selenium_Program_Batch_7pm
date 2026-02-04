package org.newseleniumtopics;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLunch {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		@Nullable
		String title = driver.getTitle();	
		System.out.println(title); 
		
		@Nullable
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		@Nullable
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		//driver.quit();
		
		//driver.close();
		
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		
	}

}
