package org.newseleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeExample {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));
		
		Actions act = new Actions(driver);	
		
		act.clickAndHold(slider).moveByOffset(100, 0).release().perform();
		
		
		
	}

}
