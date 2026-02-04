package org.newseleniumtopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown1 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		
		Select select = new Select(fruits);
		//select.selectByVisibleText("Banana");
		//select.selectByIndex(1);
		select.selectByValue("2");
		
		
		WebElement fruitSelect = select.getFirstSelectedOption();
		
		String selFruit = fruitSelect.getText();
		
		System.out.println(selFruit);
		
		
		WebElement superHeros = driver.findElement(By.id("superheros"));
		
		Select select1 = new Select(superHeros);
		
		select1.selectByVisibleText("Iron Man");
		select1.selectByVisibleText("Captain America");
		select1.selectByVisibleText("Hellboy");
		select1.selectByVisibleText("Thor");
		select1.selectByVisibleText("Superman");
		
		WebElement language = driver.findElement(By.id("lang"));
		
		Select select2 = new Select(language);
		
		select2.selectByVisibleText("C#");
		
		List<WebElement> allLang = select2.getOptions();
		
		for(WebElement lang:allLang)
		{
			System.out.println(lang.getText());
		}
		
		WebElement countries = driver.findElement(By.id("country"));
		
		Select select3 = new Select(countries);
		
		select3.selectByValue("India");
		
		WebElement selectCountry = select3.getFirstSelectedOption();
		
		System.out.println(selectCountry.getText());
		
		
		
		
		
	}

}
