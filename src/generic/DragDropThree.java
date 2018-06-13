package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragDropThree {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d1;		
		d1=new FirefoxDriver();
		
		d1.get("http://only-testing-blog.blogspot.in/2014/09/drag-and-drop.html");
		d1.manage().window().maximize();
		WebElement source1=d1.findElement(By.id("dragdiv"));
		WebElement target1 = d1.findElement(By.id("dropdiv"));
		
		Actions build1=new Actions(d1);
		Action act1=build1.clickAndHold(source1)
	            .moveToElement(target1)
	            .release(target1)
	            .build();
		act1.perform();
		
		Thread.sleep(3000);
		
		d1.close();
		d1.quit();

	}

}
