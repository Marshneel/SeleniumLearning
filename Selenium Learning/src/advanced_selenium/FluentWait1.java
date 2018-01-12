package advanced_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;



public class FluentWait1 {
 public void fluentwait(){
	 WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.co.uk/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		

Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
         .withTimeout(30, TimeUnit.SECONDS)
         .pollingEvery(2, TimeUnit.SECONDS)
         .ignoring(NoSuchElementException.class);
 
WebElement element = wait.until(new Function<WebDriver, WebElement>() 
 {
     public WebElement apply(WebDriver driver) 
     {
       return driver.findElement(By.xpath("//p[text()='WebDriver']"));
     }
 
 });
 }
}
