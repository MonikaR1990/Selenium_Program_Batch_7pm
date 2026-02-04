package org.newseleniumtopics;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementExample 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.manage().window().maximize();
		
		//WebElement firstName = driver.findElement(By.id("customer.firstName"));
		//firstName.sendKeys("Jegatheesh");
		
		
		//System.out.println(firstName);
		
		
		@Nullable
		//String attribute1 = firstName.getAttribute("value");
		
		//System.out.println(attribute1);
		
		
		
		
		WebElement lastName = driver.findElement(By.id("customer.lastName"));
		lastName.sendKeys("R");
		
		
		
		@Nullable
		String attribute2 = lastName.getAttribute("value");
		System.out.println(attribute2);
		
		
		
		WebElement Address1 = driver.findElement(By.id("customer.address.street"));
		Address1.sendKeys("No 1, tolgate");
		
		@Nullable
		String attribute3 = Address1.getAttribute("value");
		System.out.println(attribute3);
		
		WebElement city = driver.findElement(By.id("customer.address.city"));
		city.sendKeys("Trichy");
		
		WebElement state = driver.findElement(By.id("customer.address.state"));
		state.sendKeys("Tamilnadu");
		
		
		
		WebElement regBtn = driver.findElement(By.xpath("//input[@value='Register']"));
		//regBtn.click();
		
		WebElement fname = driver.findElement(By.xpath("//b[text()='First Name:']"));
		
		String text = fname.getText();
		
		System.out.println(text);
		
		
		WebElement firstName = driver.findElement(By.id("customer.firstName"));
		
		firstName.sendKeys("Bala");
		
		
		@Nullable
		String attribute = firstName.getAttribute("value");
		
		System.out.println(attribute);
	}
}
