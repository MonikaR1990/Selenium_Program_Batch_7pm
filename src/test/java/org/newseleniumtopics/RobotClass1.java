package org.newseleniumtopics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass1 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
	
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.SHIFT).sendKeys(email, "monika").keyUp(Keys.SHIFT)
				.doubleClick().contextClick().perform();
		
		Thread.sleep(2000);
		
		Robot robot = new Robot();
		
		for(int i = 0; i<4; i++)
		{
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
		
		}
		
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
		
			//password.click();
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			
		//action.contextClick(password).perform();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		
		
		
		
		
			
		
		
	}

}
