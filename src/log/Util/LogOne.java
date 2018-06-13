package log.Util;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogOne {
	
	WebDriver d1;
	Logger log1;
   
  @BeforeTest
  public void beforeTest() {
	  log1=Logger.getLogger(LogOne.class);
	  d1=new FirefoxDriver();
	  d1.get("http://calculator.net/");
	  //BasicConfigurator.configure();
  }
  
  @Test
  public void f() throws InterruptedException {
	  
	  // click on Mortgage calculator link
	  d1.findElement(By.xpath("//*[@id='hl1']/li[1]/a")).click();
	  log1.info("clicked on Mortgage claculator link");
	  
	  //enter data into Home Price field
	  d1.findElement(By.id("chouseprice")).clear();
	  d1.findElement(By.id("chouseprice")).sendKeys("212121");
	  log1.debug("entered data into home price");
	  
	  //enter data into Down Payment field in %
	  d1.findElement(By.id("cdownpayment")).clear();
	  log1.warn("entered data into home price");
	  d1.findElement(By.id("cdownpayment")).sendKeys("19");
	  
	  
      //enter data into Loan Term field in Years
	  d1.findElement(By.id("cloanterm")).clear();
	  d1.findElement(By.id("cloanterm")).sendKeys("6");
	  
	  
	  
	//enter data into Interest Rate field in %
	  d1.findElement(By.id("cinterestrate")).clear();
	  d1.findElement(By.id("cinterestrate")).sendKeys("5.9");
	  
	  d1.findElement(By.xpath("//*[@id='content']/table[1]/tbody/tr/td[1]/table/tbody/tr[13]/td[1]/input[2]")).click();
	  
	  goHomeScreen();
	  
  }
  
 public void goHomeScreen() throws InterruptedException{
	  
	  Thread.sleep(2000);
	  d1.navigate().to("http://www.calculator.net/");
	  Thread.sleep(2000);
	  
 }

  @AfterTest
  public void afterTest() {
	  
	  d1.close();
	  d1.quit();
  }

}
