package com.rule14.Practice1;

import java.util.ArrayList;

import org.omg.CORBA.portable.IndirectionException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		WebDriver  driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert obj=driver.switchTo().alert();
		String str1=obj.getText();
		System.out.println(str1);
		Thread.sleep(1000);
		obj.accept();
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert obj2 =driver.switchTo().alert();
		System.out.println(obj2.getText());
		Thread.sleep(1000);
		obj2.dismiss();
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert obj3 =driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(obj3.getText());
		Thread.sleep(3000);
		obj3.sendKeys("Alert Handling");
		Thread.sleep(1000);
		obj3.accept();
		
		
      ArrayList<Object> obj4 = new ArrayList<Object>();
      obj4.add(1);
      obj4.add("vishal");
      ArrayList obj5 = new ArrayList();
      obj5.add(1);
      obj5.add("vishal");
      
	}

}
