package com.banctec.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAnddrop {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("//*[@id='credit2']//a"));
		WebElement target = driver.findElement(By.xpath("//*[@id='bank']//li"));
		
		
		Actions act = new Actions(driver);
		
//		act.dragAndDrop(source, target).build().perform();
		
		
		act.clickAndHold(source).moveToElement(target).release().build().perform();
		
//		System.out.println("Drag and drop performed");
		
//		driver.close();
			

	}

}
