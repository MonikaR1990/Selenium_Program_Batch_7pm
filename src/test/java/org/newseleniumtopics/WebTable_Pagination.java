package org.newseleniumtopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_Pagination 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/advancedtable");
        
        while(true)
        {
        
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='advancedtable']//tbody//tr"));
      
      
        for(WebElement row:rows)
        {
        	List<WebElement> cols = row.findElements(By.tagName("td"));
        	
        	for(WebElement col:cols)
        	{
        		String data = col.getText();
        		System.out.println(data);
        	}
        	System.out.println();
        }
        
        WebElement nextBtn = driver.findElement(By.xpath("//button[text()='›']"));
        
        if(nextBtn.getAttribute("class").contains("disabled"))
        {
        	System.out.println("All data Extracted");
        	break;
        }
        
        nextBtn.click();
        
        Thread.sleep(2000);
        
       }
	}
	
}
