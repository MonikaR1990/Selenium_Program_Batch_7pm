package org.newseleniumtopics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Double_Click {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement doubleClickBtn = driver.findElement(By.tagName("button"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(doubleClickBtn).perform();
		
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		alt.accept();

	}

}
