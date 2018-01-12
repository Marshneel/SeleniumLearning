package advanced_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.co.uk/2016/08/how-to-perform-mouse-hover-in-selenium.html");   
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//button[text()='Automation Tools']"))).perform();
		driver.findElement(By.xpath("//a[text()='TestNG']")).click();

	}

}
