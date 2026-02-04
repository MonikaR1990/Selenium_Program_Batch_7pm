package org.newseleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Mouse_Hover {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	
		WebElement signIn = driver.findElement(By.cssSelector("#nav-link-accountList"));
		
		Actions act = new Actions(driver); //syntax
		
		act.moveToElement(signIn).perform();
		
		
		
		//driver.close();
		
	}

}




/*
 * Given user is on login page
When user enters valid username and password
Then user should be logged in successfully

English Steps --> Java Code

Selenium, TestNG, Junit


 * 
 * 
 */


