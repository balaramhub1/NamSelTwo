package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropOne {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d1;		
		d1=new FirefoxDriver();
		
		d1.get("http://jqueryui.com/resources/demos/droppable/default.html");
		d1.manage().window().maximize();
		WebElement source1=d1.findElement(By.id("draggable"));
		WebElement target1 = d1.findElement(By.id("droppable"));
		
		Actions build1=new Actions(d1);
		build1.dragAndDrop(source1, target1).build().perform();
		
		Thread.sleep(3000);
		
		d1.close();
		d1.quit();

	}

}
