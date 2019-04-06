import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class launchbrowser {
  static WebDriver driver;
 static String browser;
 public  void method1(String browser) {
	 if (browser=="chrome") {
	 System.setProperty("webdriver.chrome.driver", ".\\resources\\IEDriverServer.exe");
	  driver = new ChromeDriver();
	 }
	 else if (browser=="firefox") {
		 System.setProperty("webdriver.gecko.driver", ".\\resources\\IEDriverServer.exe");
		  driver = new FirefoxDriver();
	 }
	 else if (browser=="ie") {
		 System.setProperty("webdriver.ie.driver", ".\\resources\\IEDriverServer.exe");
		  driver = new InternetExplorerDriver();
		  
		
	}
		driver.get("");
	}
	
	 
	 
	 
 }
  
	 
	 
	
	 
		
	 
	 
	 
	 
 

