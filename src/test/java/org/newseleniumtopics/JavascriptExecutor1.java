package org.newseleniumtopics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutor1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement searchTxt = driver.findElement(By.id("twotabsearchtextbox"));
		
		//click();
		//sendKeys();
		//getText();  //Sometime not able to in normal selenium method
		
		//May the elements
		//Hidden element
		//Disabled element
		//scrolling issues
		//complex UI (ReactJS, Angular)
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver; //TypeCast driver
		
		//sendkeys using Javascript
		
		js.executeScript("arguments[0].value='Laptop';", searchTxt);
		
 		
		//click
		
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		//searchBtn.click(); //Webdriver click
		
		js.executeScript("arguments[0].click();", searchBtn);
		
		//scroll to bottom:
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		Thread.sleep(2000);
		
		//scroll to top
		
		js.executeScript("window.scrollTo(0,0);");
		
		Thread.sleep(2000);
		
		
		js.executeScript("window.scrollBy(0, 2000);");
		
		js.executeScript("window.scrollBy(-2000, 0);");
		
		Thread.sleep(2000);
		
		//scroll untill element is visible
		
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign in']//parent::a[@class='a-button-text']"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", signIn);
		
		
		//Generate alert
		js.executeScript("alert('Testing');");
		
		
		
		
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		
		js.executeScript("window.scrollTo(0,0);");
		
		
		//Highlight the element (signIn)
		
		js.executeScript("arguments[0].style.border='5px solid red'", signIn);
		
		//driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
	}

}
