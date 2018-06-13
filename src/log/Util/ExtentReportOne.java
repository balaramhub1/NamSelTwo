package log.Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportOne {
	
	// java docs for Extent Report : http://extentreports.com/docs/versions/2/java/doc/
	// download community edition from : http://extentreports.com/community/
  
	WebDriver d1;
	ExtentReports eR;
	ExtentTest eT;
	
  @BeforeTest
  public void beforeTest() {
	  d1=new FirefoxDriver();
	  d1.get("http://www.calculator.net/");
	  
  }
  
  @Test
  public void TestCaseOne() {
	  d1.findElement(By.xpath("//*[@id='hl1']/li[1]/a")).click();

	  eR=new ExtentReports("Report1.html",false);
	  eT=eR.startTest("Launch Application","Description");
	  eT.log(LogStatus.INFO, "Application launched successfully");
	  eT.log(LogStatus.PASS, "Navigated to Mortgage Calculator");
	  d1.navigate().back();
  }
  
  @Test
  public void TestCaseTwo() throws InterruptedException{
	  Thread.sleep(3000);
	  d1.findElement(By.xpath("//*[@id='hl2']/li[1]/a")).click();
	  eT.log(LogStatus.INFO, "Clicked into BMI Calculator");
	  eT.log(LogStatus.FAIL, "BMI Calcalculator is still Open");
	  eT.log(LogStatus.ERROR, "BMI Calculator is not accurate.");
	  
  }

  @AfterTest
  public void afterTest() {
	  eR.endTest(eT);
	  eR.flush();
	  d1.close();
	  d1.quit();
  }

}
