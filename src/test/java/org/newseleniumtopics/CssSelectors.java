package org.newseleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectors {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); //object create 
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
	/*	//Id
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user"); //Locator
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user"); //xpath
		
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user"); //cssSelector
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce"); //cssSelector
		
		
		//#id
		//tagname#id */
		
		//class name
		
		driver.findElement(By.className("input_error form_input")).sendKeys("Monika");
		
		//driver.findElement(By.xpath("//input[@class='input_error form_input']")).sendKeys("MOnika");
		
		driver.findElement(By.cssSelector(".input_error.form_input")).sendKeys("Monika");
		
		//name
		
		driver.findElement(By.name("user-name")).sendKeys("Monika");
		
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("Monika");
		
		driver.findElement(By.cssSelector("input[name='user-name']")).sendKeys("Monika");
		
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Leo");
		
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Leo");
		
		
		//Contains
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'First')]")).sendKeys("Leo");
		
		driver.findElement(By.cssSelector("input[placeholder*='First']")).sendKeys("Leo");
		
		//Starts-with
		
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'First')]")).sendKeys("Leo");
		
		driver.findElement(By.cssSelector("input[placeholder^='First']")).sendKeys("Leo");
		
		//End-with
		
		driver.findElement(By.cssSelector("input[placeholder$='Name']")).sendKeys("Monika");
		
		//Multiple Arritbutes
		
		driver.findElement(By.xpath("//input[@id='user-name' ][@name='user-name']")).sendKeys("Leo");
		
		driver.findElement(By.cssSelector("input[id='user-name' ][name='user-name']")).sendKeys("Leo");

		
		//Child
		
		//div[@class='form_group']//child::input[@id='user-name'] //Xpath
		
		//    div[class='form_group']>input[id='user-name'] //cssSelector
		
		
		//Descendant (space)
		
		//form//descendant::input[@id='user-name']
		
//		 form input[id='user-name']
		
		//option[normalize-space(text())='Red'][2]
		
		
		
		
		
		
	}

}
