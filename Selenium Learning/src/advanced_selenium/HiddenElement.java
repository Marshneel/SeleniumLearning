package advanced_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HiddenElement {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");   
		driver.manage().window().maximize();
		
		int x = driver.findElement(By.xpath(".//*[@id='male']")).getLocation().getX();
		int y = driver.findElement(By.xpath(".//*[@id='male']")).getLocation().getY();
		
		if((x==0)&(y==0)){
			System.out.println("This is hidden Element");
			
		}
	}

}
