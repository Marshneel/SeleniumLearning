package Sample;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException {
//........Taking Dynamic Inputs during Execution		
		
      WebDriver driver = new FirefoxDriver();
      driver.get("https://www.irctc.co.in");
      driver.findElement(By.id("usernameId")).sendKeys("gcreddy7");
      driver.findElement(By.className("loginPassword")).sendKeys("gld938");
      
      System.out.println("Enter value for Captcha displayed on the webpage");
      Scanner scan = new Scanner(System.in);
	  String input =  scan.nextLine();
	  driver.findElement(By.className("loginCaptcha")).sendKeys(input);
      
     
      driver.findElement(By.id("loginbutton")).click();
      System.out.println(driver.getCurrentUrl());
    
	}
    
}
