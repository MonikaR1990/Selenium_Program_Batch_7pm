package org.newseleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Click_Hold {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		
		WebElement slide = driver.findElement(By.xpath("//span[contains(@class,'slider-handle')]"));
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(slide).moveByOffset(50, 0).release().perform();
		
		
	}

}
