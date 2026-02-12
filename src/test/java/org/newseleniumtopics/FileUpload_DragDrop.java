package org.newseleniumtopics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_DragDrop 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.id("file-upload")).sendKeys("E:\\Data.txt");
		
		
		
		driver.findElement(By.id("drag-drop-upload")).click();
		
		Thread.sleep(2000);
		
		Robot r = new Robot();
		
		r.setAutoDelay(500);
		
		String filePath = "E:\\Data.txt";
		
		//Copy file Path to Clipboard
		StringSelection selection = new StringSelection(filePath);
		
			Toolkit.getDefaultToolkit() //current computer environment access
					.getSystemClipboard() //ctrl + c
					.setContents(selection, null); //system level resource accsess it will use
		
		Thread.sleep(2000);
		
		
		//Ctrl + V (Paste file Path)
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		//Ctrl + Enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		
	}
}
