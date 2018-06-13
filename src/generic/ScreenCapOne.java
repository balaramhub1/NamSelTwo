package generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenCapOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d1;		
		d1=new FirefoxDriver();
		
		d1.get("http://html5demos.com/drag");
		d1.manage().window().maximize();
		
		TakesScreenshot scs=((TakesScreenshot)d1);
		File f1=scs.getScreenshotAs(OutputType.FILE);
		
		try{
			FileUtils.copyFile(f1, new File("D:\\Programming\\workspaceJAVA\\NamSelTwo\\img.png"));
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		d1.close();
		d1.quit();

	}

}
