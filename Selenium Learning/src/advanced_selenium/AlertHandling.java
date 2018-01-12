package advanced_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandling {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://ksrtc.in/oprs-web/");   
		driver.manage().window().maximize();
		driver.findElement(By.id("searchBtn")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
	}

}
