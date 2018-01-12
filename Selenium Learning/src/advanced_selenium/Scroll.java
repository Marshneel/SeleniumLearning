package advanced_selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com");   
		driver.manage().window().maximize();
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0,600)");
		((JavascriptExecutor)driver).executeScript("scroll(600,0)");
	}

}
