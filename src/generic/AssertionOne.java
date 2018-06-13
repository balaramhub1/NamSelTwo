package generic;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AssertionOne {
	
	WebDriver d1;
	
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "D:\\Programming\\SeleniumJars\\geckodriver.exe");
	  d1=new FirefoxDriver();
	  d1.get("https://easemytrip.com/");
	  d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
  }
  
  
  @Test(priority=1)
  public void TestCase1() {
	  String expTitle="Book Flight Tickets, Air Tickets, Airfare - EaseMyTrip.c";
	  String actTitle=d1.getTitle();
	  System.out.println("Actual Title : "+actTitle);
	  Assert.assertEquals(actTitle, expTitle);
	  System.out.println("Title Matched.!!!!");
	  
	  /*try{
		  Assert.assertEquals(actTitle, expTitle);
		  System.out.println("Title Matched.!!!!");
		  
	  }catch(Throwable t){
		  System.out.println("Title did not match....");
	  }*/
	    
  }
  
  @Test(priority=2)
  public void TestCase3(){
	  // Soft assertions.
	  String expTitle="Book Flight Tickets, Air Tickets, Airfare - EaseMyTrip.com";
	  String actTitle=d1.getTitle();
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals(actTitle, expTitle);
	  System.out.println("Within TestCase 3 !!!");
	  System.err.println(actTitle);
  }
  
  @Test(priority=3)
  public void TestCase2(){
	  
	  String actTitle1=d1.getTitle();
	  String expTitle1="Book Flight Tickets, Air Tickets, Airfare - EaseMyTrip.com";
	  
	  if(actTitle1.equals(expTitle1)){
		  System.out.println("Title Matched");
	  }else{
		  System.out.println("Title mis Match...");
	  }
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  d1.quit();
  }

}
