package advanced_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://dev16230.service-now.com/navpage.do");   
		driver.manage().window().maximize();
		
		driver.switchTo().frame("gsft_main");                          //by frame name
		driver.findElement(By.id("user_name")).sendKeys("admin123");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);                                     //by frame id
		driver.findElement(By.id("user_password")).sendKeys("pass123");
		driver.switchTo().defaultContent();


	}

}
