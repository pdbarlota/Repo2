package com.banctec.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {
	
public void Launchbrowser(String url) {
	System.setProperty("webdriver.ie.driver", ".\\resources\\IEDriverServer.exe");
	WebDriver driver = new InternetExplorerDriver();
	driver.get(url);
}
}
