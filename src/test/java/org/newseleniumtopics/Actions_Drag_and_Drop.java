package org.newseleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Drag_and_Drop {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/droppable");
		driver.manage().window().maximize();
		
		WebElement src = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		//act.dragAndDrop(src, target).perform();
		
		//act.clickAndHold(src).moveToElement(target).release().perform();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script =
		"const source = arguments[0];" +
		"const target = arguments[1];" +

		"const dataTransfer = new DataTransfer();" +

		"source.dispatchEvent(new DragEvent('dragstart', { dataTransfer }));" +
		"target.dispatchEvent(new DragEvent('dragover', { dataTransfer }));" +
		"target.dispatchEvent(new DragEvent('drop', { dataTransfer }));" +
		"source.dispatchEvent(new DragEvent('dragend', { dataTransfer }));";

		js.executeScript(script, src, target);
		

	}

}
