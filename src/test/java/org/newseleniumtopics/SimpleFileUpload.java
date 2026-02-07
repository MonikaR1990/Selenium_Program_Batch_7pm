package org.newseleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleFileUpload {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement upload1 = driver.findElement(By.id("singleFileInput"));
		
		upload1.sendKeys("E:\\Data.txt");
		
		System.out.println("File Uploaded sucessfully");
		
		driver.findElement(By.xpath("//form[@id='singleFileForm']//button[1]")).click();
		
		WebElement upload2 = driver.findElement(By.id("multipleFilesInput"));
		
		String file1 = "E:\\Data.txt";
		
		String file2 = "E:\\Data1.txt";
		
		String file3 = "E:\\output.txt";
		
		upload2.sendKeys(file1 + "\n" + file2 + "\n" + file3);
		
		driver.findElement(By.xpath("//form[@id='multipleFilesForm']//button[1]")).click();

	}

}
