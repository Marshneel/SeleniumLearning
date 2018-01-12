package advanced_selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindows_Popups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://naukri.com");   
		driver.manage().window().maximize();
		
		String mainwindow = driver.getWindowHandle();
		Set<String> handler = driver.getWindowHandles();
		
		for(String currentwindow:handler){
			if(!currentwindow.equals(mainwindow)){
				driver.switchTo().window(currentwindow);
				System.out.println("Pop-up window name is "+driver.getTitle());
				driver.close();
			}
			driver.switchTo().window(mainwindow);
		}

		
	}

}
