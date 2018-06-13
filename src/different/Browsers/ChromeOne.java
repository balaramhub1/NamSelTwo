package different.Browsers;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ChromeOne {
	
	WebDriver d1;
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Programming\\SeleniumJars\\chromedriver_2_27_win32\\chromedriver.exe");
	  d1=new ChromeDriver();
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
