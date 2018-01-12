package advanced_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");   
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		Actions act = new Actions(driver);
		WebElement drag = driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath(".//*[@id='droppable']"));
		
		act.dragAndDrop(drag,drop).perform();

	}

}
