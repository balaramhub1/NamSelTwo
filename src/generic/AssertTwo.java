package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertTwo {
	
	WebDriver d1;
  
  @BeforeTest
  public void beforeTest() {
	  d1=new FirefoxDriver();
	  d1.get("https://google.co.in/");
	  d1.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  d1.manage().window().maximize();
	  
  }
  
  @Test
  public void f() {
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
