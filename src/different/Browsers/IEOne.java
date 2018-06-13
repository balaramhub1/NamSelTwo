package different.Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IEOne {
	WebDriver d1;
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.ie.driver","D:\\Programming\\SeleniumJars\\IEDriverServer_Win32_3.0.0\\IEDriverServer.exe");
		  d1=new InternetExplorerDriver();
		  d1.get("https://google.co.in");
	  }
	  
	  
	  @Test
	  public void f() {
		  
		  d1.manage().window().maximize();
		  
		  
	  }

	  @AfterTest
	  public void afterTest() {
		  
		  d1.close();
		  d1.quit();
	  }

	}
